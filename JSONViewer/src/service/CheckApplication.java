package service;

import java.io.File;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

import constant.CodConstant;
import net.sf.json.JSONObject;
import setting.LogController;
import model.ApplicationAddress;
import model.ApplicationDetail;
import model.ApplicationFormData;
import model.BranchDetail;
import model.MasterExcelBean;
import model.PinSetting;
import model.ProductSpecificInformation;

public class CheckApplication {
	public static String idvRejectedReason ="IDV Verification Results Failed";
	public static String idvPendingReason ="IDV Verification Results Pending";
	
	public static MasterExcelBean collectMaterBean(String appDataJson, String status)
			throws Exception {

		int statusCode = getStatusCode(status);
		JSONObject jsonobject = JSONObject.fromObject(appDataJson);
		LogController.writeMessage(LogController.DEBUG, "jsonobject: " + appDataJson);
		Map<String, Class<?>> classMap = new HashMap<>();
		classMap.put("pinSetting", PinSetting.class);
		classMap.put("applicationDetail", ApplicationDetail.class);
		classMap.put("residentialAddress", ApplicationAddress.class);
		classMap.put("correspondenceAddress", ApplicationAddress.class);
		classMap.put("chinaBranch", BranchDetail.class);
		classMap.put("hkBranch", BranchDetail.class);
		ApplicationFormData appData = (ApplicationFormData) JSONObject.toBean(jsonobject, ApplicationFormData.class,
				classMap);
		MasterExcelBean masterExcelBean = new MasterExcelBean();
		masterExcelBean.setNewArrivalDateTime(appData.getSubmissionTimestamp());
		masterExcelBean.setBatch(appData.getExportTimestamp());
		masterExcelBean.setRunTime(CodConstant.FORMATTER.format(LocalDateTime.now()));
		masterExcelBean.setReferenceID(appData.getApplicationReference());
		masterExcelBean.setIdvResult(getIDVResult(statusCode));
		masterExcelBean.setCustomerName(appData.getFullNameEng());
		masterExcelBean.setHkid(appData.getHkIdCardNumber());
		masterExcelBean.setMobilePhone(appData.getMobileNumber());
		masterExcelBean.setEmailAddress(appData.getEmail());
		masterExcelBean.setReferralCode(appData.getApplicationDetail().getPromotionCode());
		masterExcelBean.setLanguage(appData.getLanguage());
		masterExcelBean.setStatus(appData.getApplicationStatus());
		masterExcelBean.setRejectReason(getReason(statusCode));
		//new
		masterExcelBean.setAccountNo(appData.getAccountNumber());
		masterExcelBean.setIsWmc("WMCSB".equals(appData.getApplicationDetail().getProductType()) ? "Y" : "N"); //changed from "MAO" to "WMCSB"
		masterExcelBean.setIsSecuritiesAC(Boolean.TRUE.equals(appData.getApplicationDetail().getOpenSecuritiesAccount()) ? "Y" : "N");
		masterExcelBean.setIsLinkedDepositAC(Boolean.TRUE.equals(appData.getApplicationDetail().getOpenLDAccount())? "Y" : "N");
		masterExcelBean.setLoginAccountType(appData.getLoginAccountType());
		
		//new new
		//masterExcelBean.setReferrerCode(appData.getApplicationDetail().getReferrerCode());
		
		String productType = appData.getApplicationDetail().getProductType();
		String dkVideoFlagDisplay = "";
		String useOfDepositInfoDisplay = "";

		// These fields do not exist in MAO
		boolean dkVideoFlag = (!Boolean.TRUE.equals(appData.getDerivative033Flag())
				&& !Boolean.TRUE.equals(appData.getDerivative034Flag()) && !Boolean.TRUE.equals(appData.getDerivative035Flag()))
				|| (Boolean.TRUE.equals(appData.getApplicationDetail().getDkDeclaration1()
						&& Boolean.TRUE.equals(appData.getApplicationDetail().getDkDeclaration2())));

		dkVideoFlagDisplay = (dkVideoFlag ? "Y" : "N");
		useOfDepositInfoDisplay = Boolean.TRUE.equals(appData.getApplicationDetail().getTradingConsentAgree()) ? "Agree" : "Disagree";

		masterExcelBean.setProductType(productType);
		masterExcelBean.setDkVideo(dkVideoFlagDisplay);
		masterExcelBean.setUseOfDepositInfo(useOfDepositInfoDisplay);
		
		//changed from "MAO" to "WMCSB"
		if ("WMCSB".equals(appData.getApplicationDetail().getProductType())) {// set completed date with all account opened
			if ("Y".equals(masterExcelBean.getIsWmc())) {
				masterExcelBean.setOpenDateMao((statusCode == 1) ? DateTimeFormatter.ofPattern("yyyy-MM-dd").format(LocalDate.now()) : "");
			}

			if ("Y".equals(masterExcelBean.getIsLinkedDepositAC())) {
				masterExcelBean.setOpenDateLinkedDepositAC(
						(statusCode == 1) ? DateTimeFormatter.ofPattern("yyyy-MM-dd").format(LocalDate.now()) : "");
			}

			if ("Y".equals(masterExcelBean.getIsSecuritiesAC())) {
				masterExcelBean.setOpenDateSecuritiesAC(
						(statusCode == 1) ? DateTimeFormatter.ofPattern("yyyy-MM-dd").format(LocalDate.now()) : "");
			}
		} else {
			masterExcelBean.setCompletedDate( // set completed date with non mao account
					(statusCode == 1) ? DateTimeFormatter.ofPattern("yyyy-MM-dd").format(LocalDate.now()) : "");
		}
		// new end

		return masterExcelBean;
	}
	
	private static int getStatusCode(String status) {
		if ("success".equals(status)) {
			return 0;
		} else if ("failed".equals(status)) {
			return 1;
		} else if ("pending".equals(status)) {
			return 2;
		}
		return -1;
	}
	
	private static String getIDVResult(int statusCode) {
		if (statusCode == 0) {
			return CodConstant.PASS;
		} else if (statusCode == 1) {
			return CodConstant.FAILED;
		} else if (statusCode == 2) {
			return CodConstant.PENDING;
		} else {
			return CodConstant.FAILED;
		}
	}
	
	private static String getReason(int statusCode) {
		if (statusCode == 0) {
			return "";
		} else if (statusCode == 1) {
			return CheckApplication.idvRejectedReason;
		} else if (statusCode == 2) {
			return CheckApplication.idvPendingReason;
		} else {
			return "";
		}
	}

}
