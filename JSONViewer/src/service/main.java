package service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.Reader;
import java.net.URL;
import java.nio.charset.Charset;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Properties;

import javax.net.ssl.HttpsURLConnection;

import org.json.JSONException;
import org.json.JSONObject;

import model.ApplicationFormData;
import model.MasterExcelBean;

//import com.hkbea.db_housekeep.batch.DB_Housekeep;

import object.EmailObject; 

import setting.EmailUtil;
import setting.LogController;
import util.CommonUtil;
import util.HttpsUtil;
import util.JsonUtil;
import util.Utility;

public class main {	
	public static final Integer CONN_WAIT_TIME = 30000; // 30 sec
	
	static {
		LogController.createLogFile();
	}
	public static void main(String[] args){
		//sendNotifyEmail("Start");
		LogController.writeMessage(LogController.DEBUG, "Start AOP Backup Support Program");
		LogController.writeMessage(LogController.DEBUG, "Start time: " + new Timestamp(new Date().getTime()));
		ArrayList<MasterExcelBean> datas = null;
		
		try{
			datas = new ArrayList<>();
		    JSONObject json = readJsonFromUrl(args);
		    int JSONLength = json.getJSONArray("dataList").length();
		    LogController.writeMessage(LogController.DEBUG, "json length: " + JSONLength);
		    MasterExcelBean meb = null;
		    for (int i = 0; i < JSONLength; i++) {
		    	String appDataJson = json.getJSONArray("dataList").getJSONObject(i).getString("appDataJson");
		    	meb = CheckApplication.collectMaterBean(appDataJson, "success");
		    	datas.add(meb);
		    }
		    
	    	StringBuilder sb = new StringBuilder();
	    	String[] colHeaderList = null;
	    	colHeaderList = new String[]{"New Arrival Date/Time","Batch","Run","Reference ID","Customer Name","HKID","Mobile Phone","Email Address","Referral Code","Language","IDV Rejected (if Yes \"Y\")","Completion Date","Status","Reject Reason"
	    			,"Account No.","eCARA Ref. No.","eCARA Form Status","eCARA Reason Code","Product Type","Securities A/C","Linked Deposit A/C","DK video","Use of deposit Information","MAO value","AIO Open Date","Securities A/C Open Date","Linked Deposit A/C Open Date"};
	    	String colHeaderString = "";
	    	for(String headerItem : colHeaderList){
				colHeaderString = String.valueOf(colHeaderString) + headerItem + ",";
			}
	    	colHeaderString = String.valueOf(colHeaderString) + "\n";
	    	sb.append(colHeaderString);
	    	final int colNamesList_sb_length = sb.length();
	    	boolean split = false;
	    	for(MasterExcelBean data :datas){
				String colValue = "";
				colValue += data.getCompletedDate()+",";
				colValue += data.getBatch()+",";
				colValue += data.getRunTime()+",";
				colValue += data.getReferenceID()+",";
				colValue += data.getCustomerName()+",";
				colValue += data.getHkid()+",";
				colValue += data.getMobilePhone()+",";
				colValue += data.getEmailAddress()+",";
				colValue += data.getReferralCode()+",";
				colValue += data.getLanguage()+",";
				colValue += data.getIdvResult()+",";
				colValue += data.getCompletedDate()+",";
				colValue += data.getStatus()+",";
				colValue += data.getRejectReason()+",";
				colValue += data.getAccountNo()+",";
				colValue += ","; //ecara1
				colValue += ","; //ecara2
				colValue += ","; //ecara3
				colValue += data.getProductType()+",";
				colValue += data.getIsSecuritiesAC()+",";
				colValue += data.getIsLinkedDepositAC()+",";
				colValue += data.getDkVideo()+",";
				colValue += data.getUseOfDepositInfo()+",";
				colValue += data.getIsMao()+",";
				colValue += ","; //tbc
				colValue += ","; //tbc
				colValue += ","; //tbc
				
				sb.append(String.valueOf(colValue) + "\n");
				
				if (sb.length() > Integer.parseInt(getConfigProperty("file_size"))) {
					split=true;
	                createCSVFile(sb, getConfigProperty("file_name")+"_1");
	                sb = new StringBuilder();
	                sb.append(colHeaderString);
	            }
			
			}
			LogController.writeMessage(LogController.DEBUG, "Start the file' loop - time: "+ new Timestamp(new Date().getTime()));
			
			if (sb.length() >= colNamesList_sb_length) {
			    String splitName = split?"_2":"_1";
	            createCSVFile(sb, getConfigProperty("file_name")+splitName);
	        }
			LogController.writeMessage(LogController.DEBUG, "End the file' loop  total file time: "+ new Timestamp(new Date().getTime()));
			
		} catch(Exception e){
			LogController.writeExceptionMessage(LogController.ERROR, e);
		} finally{
			
		}
		
		//sendNotifyEmail("End");
		LogController.writeMessage(LogController.DEBUG, "Finish AOP Backup Support Program");
		LogController.writeMessage(LogController.DEBUG, "End time: " + new Timestamp(new Date().getTime()));
		
	}

	private static void sendNotifyEmail(String status){
		EmailObject email  = new EmailObject();
		String subject = email.getSubject();
		if("Start".equals(status))
			subject += " Start";
		else {
			subject += " End";
			//email.setSbText(email.getSbText().append());
		}
		email.setSubject(subject);
		EmailUtil.sendEmail(email);
	}
	
    private static void createCSVFile(final StringBuilder stringBuilder, final String fileName) throws FileNotFoundException {
        final Date date = new Date();
        final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
        final String path_bak = String.valueOf(getConfigProperty("backup_path")) + fileName.replace(".", "_") + "_" + simpleDateFormat.format(date) + ".csv";
        LogController.writeMessage("DEBUG", "Create File Start");
        final PrintWriter pw = new PrintWriter(new File(path_bak));
        pw.write(stringBuilder.toString());
        pw.close();
        LogController.writeMessage("DEBUG", "Create File Success");
        LogController.writeMessage("DEBUG", "Path : " + path_bak);
    }
    
  //Get property    
    private static String getConfigProperty(final String key) {
        final String tmepVal = Utility.getProperty(key);
        if ("".equals(tmepVal) && tmepVal.length() < 0) {
            LogController.writeMessage("ERROR", "GetConfigProperty Fail  : " + key);
            return null;
        }
        return tmepVal;
    }
	
    private static JSONObject readJsonFromUrl(String[] args) throws IOException, JSONException {
		 int count = 1;
		 int maxRetryCount = 4;
		 String fromDate = args[0];
		 String toDate = args[1];
		 String jsonInputString = "{" + 
		 		"    \"pazzPhase\": \"UPUPDOWNDOWNAABB\"," + 
		 		"    \"productType\": null," + 
		 		"    \"fromDate\": \" " + fromDate + " \"," + 
		 		"    \"toDate\": \" " + toDate + " \"" + 
		 		"}";

		 HttpsUtil.getNoCertTrustManager();
		 while (true) {
			 try {
				URL url = new URL("https://hkgaopvt-01/aop/backupSupport/getNewRecords");
				 
				LogController.writeMessage(LogController.INFO, "", "main", "readJsonFromUrl", "url:"+url);
				 
				HttpsURLConnection con = (HttpsURLConnection) url.openConnection();
				con.setRequestMethod("POST");
				con.setConnectTimeout(CONN_WAIT_TIME);
				con.setReadTimeout(CONN_WAIT_TIME);
				con.setDoOutput(true);

				con.setRequestProperty("Content-Type", "application/json; charset=utf-8");
				con.connect();
				
				OutputStream output = con.getOutputStream();
				byte[] byteOut = jsonInputString.getBytes("utf-8");
				output.write(byteOut, 0, byteOut.length);
				 
				if (con.getResponseCode() == 200) {
					LogController.writeMessage(LogController.INFO, "", "main", "response 200");
					BufferedReader rd = new BufferedReader(new InputStreamReader(con.getInputStream(), Charset.forName("UTF-8")));
					String jsonText = readAll(rd);
					JSONObject json = new JSONObject(jsonText);
					return json;
				} else {
					LogController.writeMessage(LogController.INFO, "", "main", "response not 200");
					return new JSONObject("{}");
				}
				 
			 } catch (Exception e) {
				count++;
				if (count == maxRetryCount) {
					LogController.writeMessage(LogController.ERROR, "main", "readJsonFromUrl", "exception thrown: " + e.toString());
					LogController.writeMessage(LogController.INFO, "", "main", "readJsonFromUrl", "response not 200 occurred max count, JSON empty");
					return new JSONObject("{}");
				} else {
					LogController.writeMessage(LogController.ERROR, "main", "readJsonFromUrl", "exception thrown: " + e.toString());
					LogController.writeMessage(LogController.INFO, "", "main", "readJsonFromUrl", "response not 200 retry #" + count);
				}
			}
		 }		 
	}

	 private static String readAll(Reader rd) throws IOException {
		StringBuilder sb = new StringBuilder();
		int cp;
		while ((cp = rd.read()) != -1) {
			sb.append((char) cp);
		}
		return sb.toString();
	}
}
