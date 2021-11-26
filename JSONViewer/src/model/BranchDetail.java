package model;

import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import net.sf.json.JSONArray;

/**
 * BranchDetail
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class BranchDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@JsonProperty("code")
	private String code = null;

	@JsonProperty("descEn")
	private Object descEn = null;

	@JsonProperty("descTC")
	private Object descTC = null;
	
	@JsonProperty("descSC")
	private Object descSC = null;

	@JsonProperty("map")
	private JSONArray map = null;

	public BranchDetail code(String code) {
		this.code = code;
		return this;
	}

	/**
	 * code of Branch
	 * 
	 * @return BranchDetail
	 **/
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public BranchDetail descEn(Object descEn) {
		this.descEn = descEn;
		return this;
	}

	/**
	 * descEn of Branch
	 * 
	 * @return descEn
	 **/
	public Object getDescEn() {
		return descEn;
	}

	public void setDescEn(Object descEn) {
		this.descEn = descEn;
	}

	public BranchDetail descTC(Object descTC) {
		this.descTC = descTC;
		return this;
	}

	/**
	 * descTC of Branch
	 * 
	 * @return descTC
	 **/
	public Object getDescTC() {
		return descTC;
	}

	public void setDescTC(Object descTC) {
		this.descTC = descTC;
	}

	public BranchDetail descSC(Object descSC) {
		this.descSC = descSC;
		return this;
	}

	/**
	 * descSC of Branch
	 * 
	 * @return descSC
	 **/
	public Object getDescSC() {
		return descSC;
	}

	public void setDescSC(Object descSC) {
		this.descSC = descSC;
	}

	public BranchDetail map(JSONArray map) {
		this.map = map;
		return this;
	}

	/**
	 * map of Branch
	 * 
	 * @return map
	 **/
	public JSONArray getMap() {
		return map;
	}

	public void setMap(JSONArray map) {
		this.map = map;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		BranchDetail BranchDetail = (BranchDetail) o;
		return Objects.equals(this.code, BranchDetail.code)
				&& Objects.equals(this.descEn, BranchDetail.descEn)
				&& Objects.equals(this.descTC, BranchDetail.descTC)
				&& Objects.equals(this.descSC, BranchDetail.descSC)
				&& Objects.equals(this.map, BranchDetail.map);
	}

	@Override
	public int hashCode() {
		return Objects.hash(code, descEn, descTC, descSC, map);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ApplicationAddress {\n");

		sb.append("    code: ").append(toIndentedString(code)).append("\n");
		sb.append("    descEn: ").append(toIndentedString(descEn)).append("\n");
		sb.append("    descTC: ").append(toIndentedString(descTC)).append("\n");
		sb.append("    descSC: ").append(toIndentedString(descSC)).append("\n");
		sb.append("    map: ").append(toIndentedString(map)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	/**
	 * Convert the given object to string with each line indented by 4 spaces
	 * (except the first line).
	 */
	private String toIndentedString(java.lang.Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}

}

