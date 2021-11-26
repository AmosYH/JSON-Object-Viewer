package util;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import setting.LogController;

public class JsonUtil {

	public static String toJsonString(Object obj) {
		ObjectMapper mapper = new ObjectMapper();

		try {
			return mapper.writeValueAsString(obj);
		} catch (JsonProcessingException e) {
			LogController.writeMessage(LogController.ERROR, e.getMessage());
			return null;
		}
	}

	public static <T> Object toObject(String jsonStr, Class<T> clazz) {
		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

		try {
			return mapper.readValue(jsonStr, clazz);
		} catch (IOException e) {
			return null;
		}
	}

	public static <T> Object convertObj(Object fromObj, Class<T> clazz) {
		String jsonStr = toJsonString(fromObj);
		return toObject(jsonStr, clazz);
	}

}
