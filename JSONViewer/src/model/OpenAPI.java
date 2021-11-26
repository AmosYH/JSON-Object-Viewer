package model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class OpenAPI implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@JsonProperty("applicationId")
	private String applicationId;
	@JsonProperty("tspId")
	private String tspId;
	@JsonProperty("timestamp")
	private String timestamp;
	
	public String getApplicationId() {
		return applicationId;
	}
	public void setApplicationId(String applicationId) {
		this.applicationId = applicationId;
	}
	public String getTspId() {
		return tspId;
	}
	public void setTspId(String tspId) {
		this.tspId = tspId;
	}
	public String getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	@Override
	public String toString() {
		return "OpenAPI [applicationId=" + applicationId + ", tspId=" + tspId + ", timestamp=" + timestamp + "]";
	}
	

}
