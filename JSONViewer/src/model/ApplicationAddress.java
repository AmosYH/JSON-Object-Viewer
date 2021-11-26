
package model;

import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ApplicationAddress
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ApplicationAddress implements Serializable {
	private static final long serialVersionUID = 1L;

	@JsonProperty("addressType")
	private String addressType = null;

	@JsonProperty("country")
	private String country = null;

	@JsonProperty("area")
	private String area = null;
	
	@JsonProperty("areaEn")
	private String areaEn = null;
	
	@JsonProperty("areaTc")
	private String areaTc = null;
	
	@JsonProperty("areaSc")
	private String areaSc = null;

	@JsonProperty("district")
	private String district = null;
	
	@JsonProperty("districtEn")
	private String districtEn = null;
	
	@JsonProperty("districtTc")
	private String districtTc = null;
	
	@JsonProperty("districtSc")
	private String districtSc = null;

	@JsonProperty("flat")
	private String flat = null;

	@JsonProperty("floor")
	private String floor = null;

	@JsonProperty("block")
	private String block = null;

	@JsonProperty("buildingLine1")
	private String buildingLine1 = null;

	@JsonProperty("buildingLine2")
	private String buildingLine2 = null;

	@JsonProperty("street")
	private String street = null;
	
	@JsonProperty("building")
	private String building = null;
	
	@JsonProperty("addressLanguageInd")
	private String addressLanguageInd = null;
	
	@JsonProperty("provinceCode")
	private String provinceCode = null;
	
	@JsonProperty("province")
	private String province = null;
	
	@JsonProperty("city")
	private String city = null;
	
	@JsonProperty("postCode")
	private String postCode = null;
	
	@JsonProperty("formattedAddress")
	private String formattedAddress = null;

	public ApplicationAddress addressType(String addressType) {
		this.addressType = addressType;
		return this;
	}

	/**
	 * type of Residential Address of Applicant
	 * 
	 * @return addressType
	 **/
	public String getAddressType() {
		return addressType;
	}

	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}

	public ApplicationAddress country(String country) {
		this.country = country;
		return this;
	}

	/**
	 * country of Residential Address of Applicant
	 * 
	 * @return country
	 **/
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public ApplicationAddress area(String area) {
		this.area = area;
		return this;
	}

	/**
	 * area of Residential Address of Applicant
	 * 
	 * @return area
	 **/
	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public ApplicationAddress district(String district) {
		this.district = district;
		return this;
	}

	/**
	 * district of Residential Address of Applicant
	 * 
	 * @return district
	 **/
	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public ApplicationAddress flat(String flat) {
		this.flat = flat;
		return this;
	}

	/**
	 * flat of Residential Address of Applicant
	 * 
	 * @return flat
	 **/
	public String getFlat() {
		return flat;
	}

	public void setFlat(String flat) {
		this.flat = flat;
	}

	public ApplicationAddress floor(String floor) {
		this.floor = floor;
		return this;
	}

	/**
	 * floor of Residential Address of Applicant
	 * 
	 * @return floor
	 **/
	public String getFloor() {
		return floor;
	}

	public void setFloor(String floor) {
		this.floor = floor;
	}

	public ApplicationAddress block(String block) {
		this.block = block;
		return this;
	}

	/**
	 * block of Residential Address of Applicant
	 * 
	 * @return block
	 **/
	public String getBlock() {
		return block;
	}

	public void setBlock(String block) {
		this.block = block;
	}

	public ApplicationAddress buildingLine1(String buildingLine1) {
		this.buildingLine1 = buildingLine1;
		return this;
	}

	/**
	 * Building Line1 of Residential Address of Applicant
	 * 
	 * @return buildingLine1
	 **/
	public String getBuildingLine1() {
		return buildingLine1;
	}

	public void setBuildingLine1(String buildingLine1) {
		this.buildingLine1 = buildingLine1;
	}

	public ApplicationAddress buildingLine2(String buildingLine2) {
		this.buildingLine2 = buildingLine2;
		return this;
	}

	/**
	 * Building Line2 of Residential Address of Applicant
	 * 
	 * @return buildingLine2
	 **/
	public String getBuildingLine2() {
		return buildingLine2;
	}

	public void setBuildingLine2(String buildingLine2) {
		this.buildingLine2 = buildingLine2;
	}

	public ApplicationAddress street(String street) {
		this.street = street;
		return this;
	}

	/**
	 * street of Residential Address of Applicant
	 * 
	 * @return street
	 **/
	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}
	
	public ApplicationAddress building(String building) {
		this.building = building;
		return this;
	}

	/**
	 * building of Residential Address of Applicant
	 * 
	 * @return building
	 **/
	public String getBuilding() {
		return building;
	}

	public void setBuilding(String building) {
		this.building = building;
	}
	
	public ApplicationAddress addressLanguageInd(String addressLanguageInd) {
		this.addressLanguageInd = addressLanguageInd;
		return this;
	}

	/**
	 * addressLanguageInd of Residential Address of Applicant
	 * 
	 * @return addressLanguageInd
	 **/
	public String getAddressLanguageInd() {
		return addressLanguageInd;
	}

	public void setAddressLanguageInd(String addressLanguageInd) {
		this.addressLanguageInd = addressLanguageInd;
	}
	
	public ApplicationAddress provinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
		return this;
	}

	/**
	 * provinceCode of Residential Address of Applicant
	 * 
	 * @return provinceCode
	 **/
	public String getProvinceCode() {
		return provinceCode;
	}

	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}
	
	public ApplicationAddress province(String province) {
		this.province = province;
		return this;
	}

	/**
	 * province of Residential Address of Applicant
	 * 
	 * @return province
	 **/
	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}
	
	public ApplicationAddress city(String city) {
		this.city = city;
		return this;
	}

	/**
	 * city of Residential Address of Applicant
	 * 
	 * @return city
	 **/
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	public ApplicationAddress postCode(String postCode) {
		this.postCode = postCode;
		return this;
	}

	/**
	 * postCode of Residential Address of Applicant
	 * 
	 * @return postCode
	 **/
	public String getPostCode() {
		return postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}
	
	public ApplicationAddress formattedAddress(String formattedAddress) {
		this.formattedAddress = formattedAddress;
		return this;
	}

	/**
	 * formattedAddress of Residential Address of Applicant
	 * 
	 * @return formattedAddress
	 **/
	public String getFormattedAddress() {
		return formattedAddress;
	}

	public void setFormattedAddress(String formattedAddress) {
		this.formattedAddress = formattedAddress;
	}
	

	public String getAreaEn() {
		return areaEn;
	}

	public void setAreaEn(String areaEn) {
		this.areaEn = areaEn;
	}

	public String getAreaTc() {
		return areaTc;
	}

	public void setAreaTc(String areaTc) {
		this.areaTc = areaTc;
	}

	public String getAreaSc() {
		return areaSc;
	}

	public void setAreaSc(String areaSc) {
		this.areaSc = areaSc;
	}

	public String getDistrictEn() {
		return districtEn;
	}

	public void setDistrictEn(String districtEn) {
		this.districtEn = districtEn;
	}

	public String getDistrictTc() {
		return districtTc;
	}

	public void setDistrictTc(String districtTc) {
		this.districtTc = districtTc;
	}

	public String getDistrictSc() {
		return districtSc;
	}

	public void setDistrictSc(String districtSc) {
		this.districtSc = districtSc;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ApplicationAddress applicationAddress = (ApplicationAddress) o;
		return Objects.equals(this.addressType, applicationAddress.addressType)
				&& Objects.equals(this.country, applicationAddress.country)
				&& Objects.equals(this.area, applicationAddress.area)
				&& Objects.equals(this.district, applicationAddress.district)
				&& Objects.equals(this.flat, applicationAddress.flat)
				&& Objects.equals(this.floor, applicationAddress.floor)
				&& Objects.equals(this.block, applicationAddress.block)
				&& Objects.equals(this.buildingLine1, applicationAddress.buildingLine1)
				&& Objects.equals(this.buildingLine2, applicationAddress.buildingLine2)
				&& Objects.equals(this.street, applicationAddress.street)
				&& Objects.equals(this.district, applicationAddress.building)
				&& Objects.equals(this.flat, applicationAddress.addressLanguageInd)
				&& Objects.equals(this.floor, applicationAddress.provinceCode)
				&& Objects.equals(this.block, applicationAddress.province)
				&& Objects.equals(this.buildingLine1, applicationAddress.city)
				&& Objects.equals(this.buildingLine2, applicationAddress.postCode)
				&& Objects.equals(this.street, applicationAddress.formattedAddress);
	}

	@Override
	public int hashCode() {
		return Objects.hash(addressType, country, area, district, flat, floor, block, buildingLine1, buildingLine2,
				street, building, addressLanguageInd, provinceCode, province, city, postCode, formattedAddress);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ApplicationAddress {\n");

		sb.append("    addressType: ").append(toIndentedString(addressType)).append("\n");
		sb.append("    country: ").append(toIndentedString(country)).append("\n");
		sb.append("    area: ").append(toIndentedString(area)).append("\n");
		sb.append("    district: ").append(toIndentedString(district)).append("\n");
		sb.append("    flat: ").append(toIndentedString(flat)).append("\n");
		sb.append("    floor: ").append(toIndentedString(floor)).append("\n");
		sb.append("    block: ").append(toIndentedString(block)).append("\n");
		sb.append("    buildingLine1: ").append(toIndentedString(buildingLine1)).append("\n");
		sb.append("    buildingLine2: ").append(toIndentedString(buildingLine2)).append("\n");
		sb.append("    street: ").append(toIndentedString(street)).append("\n");
		sb.append("    building: ").append(toIndentedString(building)).append("\n");
		sb.append("    addressLanguageInd: ").append(toIndentedString(addressLanguageInd)).append("\n");
		sb.append("    provinceCode: ").append(toIndentedString(provinceCode)).append("\n");
		sb.append("    province: ").append(toIndentedString(province)).append("\n");
		sb.append("    city: ").append(toIndentedString(city)).append("\n");
		sb.append("    postCode: ").append(toIndentedString(postCode)).append("\n");
		sb.append("    formattedAddress: ").append(toIndentedString(formattedAddress)).append("\n");
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
