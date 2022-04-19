package setting;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import util.CommonUtil;

public class EmailStaff {

	private static Properties emailStaffProperties = new Properties();
	
	static
	{
		try
		{
			File emailStaffFile = new File("resource/config/email_staff.properties");
			emailStaffProperties.load(new FileInputStream(emailStaffFile));
		}
		catch (Exception ex)
		{
			LogController.writeExceptionMessage(LogController.ERROR, ex);
		}
	}
	
	public static String getEmailStaff(String gId) {	
		return CommonUtil.getProperty(emailStaffProperties, gId + "_Staff", "");
	}

}
