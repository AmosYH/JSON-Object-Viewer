
package model;

import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PinSettingResponse
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class PinSetting implements Serializable {
	private static final long serialVersionUID = 1L;

	@JsonProperty("pbkReference")
	private String pbkReference = null;

	@JsonProperty("atmInstructionLanguage")
	private String atmInstructionLanguage = null;

	public PinSetting pbkReference(String pbkReference) {
		this.pbkReference = pbkReference;
		return this;
	}

	/**
	 * PBK Reference for call PBK
	 * 
	 * @return pbkReference
	 **/
	public String getPbkReference() {
		return pbkReference;
	}

	public void setPbkReference(String pbkReference) {
		this.pbkReference = pbkReference;
	}

	public PinSetting atmInstructionLanguage(String atmInstructionLanguage) {
		this.atmInstructionLanguage = atmInstructionLanguage;
		return this;
	}

	/**
	 * ATM instruction language
	 * 
	 * @return atmInstructionLanguage
	 **/
	public String getAtmInstructionLanguage() {
		return atmInstructionLanguage;
	}

	public void setAtmInstructionLanguage(String atmInstructionLanguage) {
		this.atmInstructionLanguage = atmInstructionLanguage;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		PinSetting pinSettingResponse = (PinSetting) o;
		return Objects.equals(this.pbkReference, pinSettingResponse.pbkReference)
				&& Objects.equals(this.atmInstructionLanguage, pinSettingResponse.atmInstructionLanguage);
	}

	@Override
	public int hashCode() {
		return Objects.hash(pbkReference, atmInstructionLanguage);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class PinSettingResponse {\n");

		sb.append("    pbkReference: ").append(toIndentedString(pbkReference)).append("\n");
		sb.append("    atmInstructionLanguage: ").append(toIndentedString(atmInstructionLanguage)).append("\n");
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
