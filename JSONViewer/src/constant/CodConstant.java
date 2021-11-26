package constant;

import java.time.format.DateTimeFormatter;

import util.PropertiesUtils;

public class CodConstant {
	public static final String WORKING_FOLDER_PATH = PropertiesUtils.getConfig().getProperty("cod.folder.path.working");
	public static final String SUCCESS_FOLDER_PATH = PropertiesUtils.getConfig().getProperty("cod.folder.path.master");
	public static final String SUCCESS_SUBFOLDER_IAO_PATH = PropertiesUtils.getConfig().getProperty("cod.folder.path.master.iao");

	public static final String COMPLETED_FOLDER_PATH = PropertiesUtils.getConfig().getProperty("cod.folder.path.completed");
	public static final String FAILED_FOLDER_PATH = PropertiesUtils.getConfig().getProperty("cod.folder.path.failed");
	public static final String PENDING_FOLDER_PATH = PropertiesUtils.getConfig().getProperty("cod.folder.path.pending");
	public static final String APPROVED_FOLDER_PATH = PropertiesUtils.getConfig().getProperty("cod.folder.path.approved");
	public static final String REJECTED_FOLDER_PATH = PropertiesUtils.getConfig().getProperty("cod.folder.path.rejected");

	public static final String METADATE_FOLDER_PATH = PropertiesUtils.getConfig().getProperty("cod.folder.path.metadata");
	public static final String TEMP_FOLDER_PATH = PropertiesUtils.getConfig().getProperty("cod.folder.path.temp");

	public static final String SFTP_TARGET_FOLDER = PropertiesUtils.getConfig().getProperty("sftp.root.path");
	public static final String DOWNLOAD_TARGET_FOLDER = PropertiesUtils.getConfig().getProperty("cod.folder.path.working");

	public static final String DEFAULT_TIME = "2019-01-01 23:59:59";
	public static final String MASTER_EXCEL_NAME = "MAO_master_application_list.xlsx";
	public static final String WORKING_EXCEL_NAME = "MAO_working_application_list.xlsm";
	public static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSS");
	public static final DateTimeFormatter FOLDER_SUFFIX_TIME_FORMATTER = DateTimeFormatter.ofPattern("yyyyMMddHHmmssSSS");
	public static final String EXCEL_RUN_TIME_FORMATTER = "yyyy-MM-dd'T'HH:mm:ss.SSS";
	public static final String FILE_RUN_TIME_FORMATTER = "yyyyMMddHHmmssSSS";
	public static final String PASS = "N";
	public static final String FAILED = "Y";
	public static final String PENDING = "P";
	public static final int TIME_LIMIT = 6;

	public static final String APPLICATION_DETAIL_PRODUCT_TYPE_MAO = "AIO";
	public static final String APPLICATION_DETAIL_PRODUCT_TYPE_IAO = "ETB";

}
