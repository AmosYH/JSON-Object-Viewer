package util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesUtils {

	private static Properties config = new Properties();
	private static String configPath;

	public static Properties loadProperties(String path) {
		configPath = path;
		File file = new File(path);
		try {
			config.load(new FileInputStream(file));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return config;
	}

	public static String getConfigPath() {
		return configPath;
	}

	public static Properties getConfig() {
		return config;
	}

}
