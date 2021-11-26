
package model;

import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ProductSpecificInformation
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductSpecificInformation implements Serializable {
	private static final long serialVersionUID = 1L;

	@JsonProperty("custKey")
	private String custKey = null;

	@JsonProperty("custValue")
	private String custValue = null;

	public ProductSpecificInformation custKey(String custKey) {
		this.custKey = custKey;
		return this;
	}

	/**
	 * Custom Key
	 * 
	 * @return custKey
	 **/
	public String getCustKey() {
		return custKey;
	}

	public void setCustKey(String custKey) {
		this.custKey = custKey;
	}

	public ProductSpecificInformation custValue(String custValue) {
		this.custValue = custValue;
		return this;
	}

	/**
	 * Custom Value
	 * 
	 * @return custValue
	 **/
	public String getCustValue() {
		return custValue;
	}

	public void setCustValue(String custValue) {
		this.custValue = custValue;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ProductSpecificInformation productSpecificInformation = (ProductSpecificInformation) o;
		return Objects.equals(this.custKey, productSpecificInformation.custKey)
				&& Objects.equals(this.custValue, productSpecificInformation.custValue);
	}

	@Override
	public int hashCode() {
		return Objects.hash(custKey, custValue);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ProductSpecificInformation {\n");

		sb.append("    custKey: ").append(toIndentedString(custKey)).append("\n");
		sb.append("    custValue: ").append(toIndentedString(custValue)).append("\n");
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
