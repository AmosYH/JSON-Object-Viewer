
package model;

import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ApplicationFormResponseData
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ApplicationFormData implements Serializable {

	private static final long serialVersionUID = -8839152729927912611L;

	@JsonProperty("applicationReference")
	private String applicationReference = null;

	@JsonProperty("deviceId")
	private String deviceId = null;

	@JsonProperty("applicationStatus")
	private String applicationStatus = null;

	@JsonProperty("idvStatus")
	private String idvStatus = null;

	@JsonProperty("language")
	private String language = null;

	@JsonProperty("verificationReferenceNumber")
	private String verificationReferenceNumber = null;

	@JsonProperty("fullNameEng")
	private String fullNameEng = null;

	@JsonProperty("fullNameChi")
	private String fullNameChi = null;

	@JsonProperty("dateOfBirth")
	private String dateOfBirth = null;

	@JsonProperty("hkIdCardNumber")
	private String hkIdCardNumber = null;

	@JsonProperty("hkPermanentResident")
	private Boolean hkPermanentResident = null;

	@JsonProperty("email")
	private String email = null;
	
	@JsonProperty("countryNumber")
	private String countryNumber = null;

	@JsonProperty("mobileNumber")
	private String mobileNumber = null;

	@JsonProperty("lastSubmitPageId")
	private String lastSubmitPageId = null;

	@JsonProperty("applicationDetail")
	private ApplicationDetail applicationDetail = null;

	@JsonProperty("pinSetting")
	private PinSetting pinSetting = null;

	@JsonProperty("creationTimestamp")
	private String creationTimestamp = null;

	@JsonProperty("lastUpdateTimestamp")
	private String lastUpdateTimestamp = null;

	@JsonProperty("submissionTimestamp")
	private String submissionTimestamp = null;

	@JsonProperty("exportTimestamp")
	private String exportTimestamp = null;

	@JsonProperty("idvSubmissionRef")
	private String idvSubmissionRef = null;

	@JsonProperty("gpsLocation")
	private String gpsLocation = null;

	@JsonProperty("gpsLatitude")
	private String gpsLatitude = null;

	@JsonProperty("gpsLongitude")
	private String gpsLongitude = null;

	@JsonProperty("gpsEnabled")
	private Boolean gpsEnabled;

	@JsonProperty("devicePlatform")
	private String devicePlatform;

	@JsonProperty("deviceModel")
	private String deviceModel;

	@JsonProperty("deviceOSVersion")
	private String deviceOSVersion;

	@JsonProperty("ipAddress")
	private String ipAddress;

	@JsonProperty("sessionId")
	private String sessionId;

	@JsonProperty("sessionUpdateTimestamp")
	private String sessionUpdateTimestamp;

	@JsonProperty("hkIdCardType")
	private String hkIdCardType;

	@JsonProperty("appVersion")
	private String appVersion;

	@JsonProperty("exported")
	private Boolean exported = null;
	// new
	@JsonProperty("accountNumber")
	public String accountNumber;

	@JsonProperty("productType")
	public String productType;
	
	@JsonProperty("loginAccountType")
	public String loginAccountType;
	
	@JsonProperty("derivative033Flag")
	public Boolean derivative033Flag;
	
	@JsonProperty("derivative034Flag")
	public Boolean derivative034Flag;
	
	@JsonProperty("derivative035Flag")
	public Boolean derivative035Flag;
	
	@JsonProperty("normalRiskFlag")
	public Boolean normalRiskFlag;
	
	@JsonProperty("needUploadAddressProof")
	public Boolean needUploadAddressProof;
	
	@JsonProperty("needUploadSignature")
	public Boolean needUploadSignature;
	
	@JsonProperty("maoKey01")
	public String maoKey01;
	
	@JsonProperty("maoKey02")
	public String maoKey02;
	
	@JsonProperty("maoKey03")
	public String maoKey03;
	
	@JsonProperty("maoKey04")
	public String maoKey04;
	
	@JsonProperty("maoKey05")
	public String maoKey05;
	
	@JsonProperty("maoKey06")
	public String maoKey06;
	
	@JsonProperty("maoKey07")
	public String maoKey07;
	
	@JsonProperty("maoKey08")
	public String maoKey08;
	
	@JsonProperty("chinaID")
	public String chinaID;
	
	@JsonProperty("chinaIDExpiryDate")
	public String chinaIDExpiryDate;
	
	@JsonProperty("passport")
	public String passport;
	
	@JsonProperty("passportIssueCountry")
	public String passportIssueCountry;
	
	@JsonProperty("passportExpiryDate")
	public String passportExpiryDate;
	
	@JsonProperty("ctpNumber")
	public String ctpNumber;
	
	@JsonProperty("ctpIssueCountry")
	public String ctpIssueCountry;
	
	@JsonProperty("ctpExpiryDate")
	public String ctpExpiryDate;
	
	@JsonProperty("givenNameChi")
	public String givenNameChi;
	
	@JsonProperty("surNameChi")
	public String surNameChi;
	
	@JsonProperty("givenNameEng")
	public String givenNameEng;
	
	@JsonProperty("surNameEng")
	public String surNameEng;
	
	@JsonProperty("nickname")
	public String nickname;
	
	@JsonProperty("securitiesAccountFlag")
	public Boolean securitiesAccountFlag;

	@JsonProperty("ldAccountFlag")
	public Boolean ldAccountFlag;

	@JsonProperty("isBEAStaff")
	public Boolean isBEAStaff;

	@JsonProperty("highRiskIndustryFlag")
	public Boolean highRiskIndustryFlag;


	public ApplicationFormData accountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
		return this;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public ApplicationFormData productType(String productType) {
		this.productType = productType;
		return this;
	}

	/**
	 * IsMao of Applicant
	 * 
	 * @return isMao
	 **/
	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	// new end

	public ApplicationFormData applicationReference(String applicationReference) {
		this.applicationReference = applicationReference;
		return this;
	}

	/**
	 * refNo Of Applicant
	 * 
	 * @return applicationReference
	 **/
	public String getApplicationReference() {
		return applicationReference;
	}

	public void setApplicationReference(String applicationReference) {
		this.applicationReference = applicationReference;
	}

	public ApplicationFormData deviceId(String deviceId) {
		this.deviceId = deviceId;
		return this;
	}

	/**
	 * Device unique identifier
	 * 
	 * @return deviceId
	 **/
	public String getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public ApplicationFormData applicationStatus(String applicationStatus) {
		this.applicationStatus = applicationStatus;
		return this;
	}

	/**
	 * Status of Application
	 * 
	 * @return applicationStatus
	 **/
	public String getApplicationStatus() {
		return applicationStatus;
	}

	public void setApplicationStatus(String applicationStatus) {
		this.applicationStatus = applicationStatus;
	}

	public ApplicationFormData idvStatus(String idvStatus) {
		this.idvStatus = idvStatus;
		return this;
	}

	/**
	 * Status of IDV
	 * 
	 * @return idvStatus
	 **/
	public String getIdvStatus() {
		return idvStatus;
	}

	public void setIdvStatus(String idvStatus) {
		this.idvStatus = idvStatus;
	}

	public ApplicationFormData language(String language) {
		this.language = language;
		return this;
	}

	/**
	 * App Language Set by Applicant
	 * 
	 * @return language
	 **/
	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public ApplicationFormData verificationReferenceNumber(String verificationReferenceNumber) {
		this.verificationReferenceNumber = verificationReferenceNumber;
		return this;
	}

	/**
	 * Id of IDV Image
	 * 
	 * @return verificationReferenceNumber
	 **/
	public String getVerificationReferenceNumber() {
		return verificationReferenceNumber;
	}

	public void setVerificationReferenceNumber(String verificationReferenceNumber) {
		this.verificationReferenceNumber = verificationReferenceNumber;
	}

	public ApplicationFormData fullNameEng(String fullNameEng) {
		this.fullNameEng = fullNameEng;
		return this;
	}

	/**
	 * English Name of Applicant
	 * 
	 * @return fullNameEng
	 **/
	public String getFullNameEng() {
		return fullNameEng;
	}

	public void setFullNameEng(String fullNameEng) {
		this.fullNameEng = fullNameEng;
	}

	public ApplicationFormData fullNameChi(String fullNameChi) {
		this.fullNameChi = fullNameChi;
		return this;
	}

	/**
	 * Chinese Name of Applicant
	 * 
	 * @return fullNameChi
	 **/
	public String getFullNameChi() {
		return fullNameChi;
	}

	public void setFullNameChi(String fullNameChi) {
		this.fullNameChi = fullNameChi;
	}

	public ApplicationFormData dateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
		return this;
	}

	/**
	 * Date of Birth of Applicant
	 * 
	 * @return dateOfBirth
	 **/
	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public ApplicationFormData hkIdCardNumber(String hkIdCardNumber) {
		this.hkIdCardNumber = hkIdCardNumber;
		return this;
	}

	/**
	 * HKID of Applicant
	 * 
	 * @return hkIdCardNumber
	 **/
	public String getHkIdCardNumber() {
		return hkIdCardNumber;
	}

	public void setHkIdCardNumber(String hkIdCardNumber) {
		this.hkIdCardNumber = hkIdCardNumber;
	}

	public ApplicationFormData hkPermanentResident(Boolean hkPermanentResident) {
		this.hkPermanentResident = hkPermanentResident;
		return this;
	}

	/**
	 * HK Permanent Resident of Applicant
	 * 
	 * @return hkPermanentResident
	 **/
	public Boolean getHkPermanentResident() {
		return hkPermanentResident;
	}

	public void setHkPermanentResident(Boolean hkPermanentResident) {
		this.hkPermanentResident = hkPermanentResident;
	}

	public ApplicationFormData email(String email) {
		this.email = email;
		return this;
	}

	/**
	 * email of Applicant
	 * 
	 * @return email
	 **/
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	

	public String getCountryNumber() {
		return countryNumber;
	}

	public void setCountryNumber(String countryNumber) {
		this.countryNumber = countryNumber;
	}

	public ApplicationFormData mobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
		return this;
	}

	/**
	 * Mobile Number of Applicant
	 * 
	 * @return mobileNumber
	 **/
	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public ApplicationFormData lastSubmitPageId(String lastSubmitPageId) {
		this.lastSubmitPageId = lastSubmitPageId;
		return this;
	}

	/**
	 * Last Page submitted by Applicant
	 * 
	 * @return lastSubmitPageId
	 **/
	public String getLastSubmitPageId() {
		return lastSubmitPageId;
	}

	public void setLastSubmitPageId(String lastSubmitPageId) {
		this.lastSubmitPageId = lastSubmitPageId;
	}

	public ApplicationFormData applicationDetail(ApplicationDetail applicationDetail) {
		this.applicationDetail = applicationDetail;
		return this;
	}

	/**
	 * Get applicationDetail
	 * 
	 * @return applicationDetail
	 **/
	public ApplicationDetail getApplicationDetail() {
		return applicationDetail;
	}

	public void setApplicationDetail(ApplicationDetail applicationDetail) {
		this.applicationDetail = applicationDetail;
	}

	public ApplicationFormData pinSetting(PinSetting pinSetting) {
		this.pinSetting = pinSetting;
		return this;
	}

	/**
	 * Get pinSetting
	 * 
	 * @return pinSetting
	 **/
	public PinSetting getPinSetting() {
		return pinSetting;
	}

	public void setPinSetting(PinSetting pinSetting) {
		this.pinSetting = pinSetting;
	}

	public ApplicationFormData creationTimestamp(String creationTimestamp) {
		this.creationTimestamp = creationTimestamp;
		return this;
	}

	/**
	 * Creation Timestamp of Application
	 * 
	 * @return creationTimestamp
	 **/
	public String getCreationTimestamp() {
		return creationTimestamp;
	}

	public void setCreationTimestamp(String creationTimestamp) {
		this.creationTimestamp = creationTimestamp;
	}

	public ApplicationFormData lastUpdateTimestamp(String lastUpdateTimestamp) {
		this.lastUpdateTimestamp = lastUpdateTimestamp;
		return this;
	}

	/**
	 * Last Update Timestamp of Application
	 * 
	 * @return lastUpdateTimestamp
	 **/
	public String getLastUpdateTimestamp() {
		return lastUpdateTimestamp;
	}

	public void setLastUpdateTimestamp(String lastUpdateTimestamp) {
		this.lastUpdateTimestamp = lastUpdateTimestamp;
	}

	public ApplicationFormData submissionTimestamp(String submissionTimestamp) {
		this.submissionTimestamp = submissionTimestamp;
		return this;
	}

	/**
	 * Submission Timestamp of Application
	 * 
	 * @return submissionTimestamp
	 **/
	public String getSubmissionTimestamp() {
		return submissionTimestamp;
	}

	public void setSubmissionTimestamp(String submissionTimestamp) {
		this.submissionTimestamp = submissionTimestamp;
	}

	/**
	 * Export Timestamp of Application
	 * 
	 * @return exportTimestamp
	 **/
	public String getExportTimestamp() {
		return exportTimestamp;
	}

	public void setExportTimestamp(String exportTimestamp) {
		this.exportTimestamp = exportTimestamp;
	}

	public String getIdvSubmissionRef() {
		return idvSubmissionRef;
	}

	public void setIdvSubmissionRef(String idvSubmissionRef) {
		this.idvSubmissionRef = idvSubmissionRef;
	}

	public String getGpsLocation() {
		return gpsLocation;
	}

	public void setGpsLocation(String gpsLocation) {
		this.gpsLocation = gpsLocation;
	}

	public String getGpsLatitude() {
		return gpsLatitude;
	}

	public void setGpsLatitude(String gpsLatitude) {
		this.gpsLatitude = gpsLatitude;
	}

	public String getGpsLongitude() {
		return gpsLongitude;
	}

	public void setGpsLongitude(String gpsLongitude) {
		this.gpsLongitude = gpsLongitude;
	}

	public Boolean getGpsEnabled() {
		return gpsEnabled;
	}

	public void setGpsEnabled(Boolean gpsEnabled) {
		this.gpsEnabled = gpsEnabled;
	}

	public String getDevicePlatform() {
		return devicePlatform;
	}

	public void setDevicePlatform(String devicePlatform) {
		this.devicePlatform = devicePlatform;
	}

	public String getDeviceModel() {
		return deviceModel;
	}

	public void setDeviceModel(String deviceModel) {
		this.deviceModel = deviceModel;
	}

	public String getDeviceOSVersion() {
		return deviceOSVersion;
	}

	public void setDeviceOSVersion(String deviceOSVersion) {
		this.deviceOSVersion = deviceOSVersion;
	}

	public String getIpAddress() {
		return ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	public String getSessionId() {
		return sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public String getSessionUpdateTimestamp() {
		return sessionUpdateTimestamp;
	}

	public void setSessionUpdateTimestamp(String sessionUpdateTimestamp) {
		this.sessionUpdateTimestamp = sessionUpdateTimestamp;
	}

	public String getHkIdCardType() {
		return hkIdCardType;
	}

	public void setHkIdCardType(String hkIdCardType) {
		this.hkIdCardType = hkIdCardType;
	}

	public String getAppVersion() {
		return appVersion;
	}

	public void setAppVersion(String appVersion) {
		this.appVersion = appVersion;
	}

	public Boolean getExported() {
		return exported;
	}

	public void setExported(Boolean exported) {
		this.exported = exported;
	}

	public String getLoginAccountType() {
		return loginAccountType;
	}

	public void setLoginAccountType(String loginAccountType) {
		this.loginAccountType = loginAccountType;
	}

	public Boolean getDerivative033Flag() {
		return derivative033Flag;
	}

	public void setDerivative033Flag(Boolean derivative033Flag) {
		this.derivative033Flag = derivative033Flag;
	}

	public Boolean getDerivative034Flag() {
		return derivative034Flag;
	}

	public void setDerivative034Flag(Boolean derivative034Flag) {
		this.derivative034Flag = derivative034Flag;
	}

	public Boolean getDerivative035Flag() {
		return derivative035Flag;
	}

	public void setDerivative035Flag(Boolean derivative035Flag) {
		this.derivative035Flag = derivative035Flag;
	}
	
	public Boolean getNormalRiskFlag() {
		return normalRiskFlag;
	}

	public void setNormalRiskFlag(Boolean normalRiskFlag) {
		this.normalRiskFlag = normalRiskFlag;
	}
	
	public Boolean getNeedUploadAddressProof() {
		return needUploadAddressProof;
	}

	public void setNeedUploadAddressProof(Boolean needUploadAddressProof) {
		this.needUploadAddressProof = needUploadAddressProof;
	}
	
	public Boolean getNeedUploadSignature() {
		return needUploadSignature;
	}

	public void setNeedUploadSignature(Boolean needUploadSignature) {
		this.needUploadSignature = needUploadSignature;
	}
	
	public String getMaoKey01() {
		return maoKey01;
	}

	public void setMaoKey01(String maoKey01) {
		this.maoKey01 = maoKey01;
	}
	
	public String getMaoKey02() {
		return maoKey02;
	}

	public void setMaoKey02(String maoKey02) {
		this.maoKey02 = maoKey02;
	}
	
	public String getMaoKey03() {
		return maoKey03;
	}

	public void setMaoKey03(String maoKey03) {
		this.maoKey03 = maoKey03;
	}
	
	public String getMaoKey04() {
		return maoKey04;
	}

	public void setMaoKey04(String maoKey04) {
		this.maoKey04 = maoKey04;
	}
	
	public String getMaoKey05() {
		return maoKey05;
	}

	public void setMaoKey05(String maoKey05) {
		this.maoKey05 = maoKey05;
	}
	
	public String getMaoKey06() {
		return maoKey06;
	}

	public void setMaoKey06(String maoKey06) {
		this.maoKey06 = maoKey06;
	}
	
	public String getMaoKey07() {
		return maoKey07;
	}

	public void setMaoKey07(String maoKey07) {
		this.maoKey07 = maoKey07;
	}
	
	public String getMaoKey08() {
		return maoKey08;
	}

	public void setMaoKey08(String maoKey08) {
		this.maoKey08 = maoKey08;
	}
	
	public String getChinaID() {
		return chinaID;
	}

	public void setChinaID(String chinaID) {
		this.chinaID = chinaID;
	}
	
	public String getChinaIDExpiryDate() {
		return chinaIDExpiryDate;
	}

	public void setChinaIDExpiryDate(String chinaIDExpiryDate) {
		this.chinaIDExpiryDate = chinaIDExpiryDate;
	}
	
	public String getPassport() {
		return passport;
	}

	public void setPassport(String passport) {
		this.passport = passport;
	}
	
	public String getPassportIssueCountry() {
		return passportIssueCountry;
	}

	public void setPassportIssueCountry(String passportIssueCountry) {
		this.passportIssueCountry = passportIssueCountry;
	}
	
	public String getPassportExpiryDate() {
		return passportExpiryDate;
	}

	public void setPassportExpiryDate(String passportExpiryDate) {
		this.passportExpiryDate = passportExpiryDate;
	}
	
	public String getCtpNumber() {
		return ctpNumber;
	}

	public void setCtpNumber(String ctpNumber) {
		this.ctpNumber = ctpNumber;
	}
	
	public String getCtpIssueCountry() {
		return ctpIssueCountry;
	}

	public void setCtpIssueCountry(String ctpIssueCountry) {
		this.ctpIssueCountry = ctpIssueCountry;
	}
	
	public String getCtpExpiryDate() {
		return ctpExpiryDate;
	}

	public void setCtpExpiryDate(String ctpExpiryDate) {
		this.ctpExpiryDate = ctpExpiryDate;
	}
	
	public String getGivenNameChi() {
		return givenNameChi;
	}

	public void setGivenNameChi(String givenNameChi) {
		this.givenNameChi = givenNameChi;
	}
	
	public String getSurNameChi() {
		return surNameChi;
	}

	public void setSurNameChi(String surNameChi) {
		this.surNameChi = surNameChi;
	}
	
	public String getGivenNameEng() {
		return givenNameEng;
	}

	public void setGivenNameEng(String givenNameEng) {
		this.givenNameEng = givenNameEng;
	}
	
	public String getSurNameEng() {
		return surNameEng;
	}

	public void setSurNameEng(String surNameEng) {
		this.surNameEng = surNameEng;
	}
	
	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	
	public Boolean getSecuritiesAccountFlag() {
		return securitiesAccountFlag;
	}

	public void setSecuritiesAccountFlag(Boolean securitiesAccountFlag) {
		this.securitiesAccountFlag = securitiesAccountFlag;
	}
	
	public Boolean getLdAccountFlag() {
		return ldAccountFlag;
	}

	public void setLdAccountFlag(Boolean ldAccountFlag) {
		this.ldAccountFlag = ldAccountFlag;
	}
	
	public Boolean getIsBEAStaff() {
		return isBEAStaff;
	}

	public void setIsBEAStaff(Boolean isBEAStaff) {
		this.isBEAStaff = isBEAStaff;
	}
	
	public Boolean getHighRiskIndustryFlag() {
		return highRiskIndustryFlag;
	}

	public void setHighRiskIndustryFlag(Boolean highRiskIndustryFlag) {
		this.highRiskIndustryFlag = highRiskIndustryFlag;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ApplicationFormData applicationFormResponseData = (ApplicationFormData) o;
		return Objects.equals(this.applicationReference, applicationFormResponseData.applicationReference)
				&& Objects.equals(this.deviceId, applicationFormResponseData.deviceId)
				&& Objects.equals(this.applicationStatus, applicationFormResponseData.applicationStatus)
				&& Objects.equals(this.idvStatus, applicationFormResponseData.idvStatus)
				&& Objects.equals(this.language, applicationFormResponseData.language)
				&& Objects.equals(this.verificationReferenceNumber, applicationFormResponseData.verificationReferenceNumber)
				&& Objects.equals(this.fullNameEng, applicationFormResponseData.fullNameEng)
				&& Objects.equals(this.fullNameChi, applicationFormResponseData.fullNameChi)
				&& Objects.equals(this.dateOfBirth, applicationFormResponseData.dateOfBirth)
				&& Objects.equals(this.hkIdCardNumber, applicationFormResponseData.hkIdCardNumber)
				&& Objects.equals(this.hkPermanentResident, applicationFormResponseData.hkPermanentResident)
				&& Objects.equals(this.email, applicationFormResponseData.email)
				&& Objects.equals(this.countryNumber, applicationFormResponseData.countryNumber)
				&& Objects.equals(this.mobileNumber, applicationFormResponseData.mobileNumber)
				&& Objects.equals(this.lastSubmitPageId, applicationFormResponseData.lastSubmitPageId)
				&& Objects.equals(this.applicationDetail, applicationFormResponseData.applicationDetail)
				&& Objects.equals(this.pinSetting, applicationFormResponseData.pinSetting)
				&& Objects.equals(this.creationTimestamp, applicationFormResponseData.creationTimestamp)
				&& Objects.equals(this.lastUpdateTimestamp, applicationFormResponseData.lastUpdateTimestamp)
				&& Objects.equals(this.submissionTimestamp, applicationFormResponseData.submissionTimestamp)
				&& Objects.equals(this.devicePlatform, applicationFormResponseData.devicePlatform)
				&& Objects.equals(this.deviceModel, applicationFormResponseData.deviceModel)
				&& Objects.equals(this.deviceOSVersion, applicationFormResponseData.deviceOSVersion)
				&& Objects.equals(this.ipAddress, applicationFormResponseData.ipAddress)
				&& Objects.equals(this.sessionId, applicationFormResponseData.sessionId)
				&& Objects.equals(this.sessionUpdateTimestamp, applicationFormResponseData.sessionUpdateTimestamp)
				&& Objects.equals(this.hkIdCardType, applicationFormResponseData.hkIdCardType)
				&& Objects.equals(this.exported, applicationFormResponseData.exported)
				// new
				&& Objects.equals(this.accountNumber, applicationFormResponseData.accountNumber)
				&& Objects.equals(this.productType, applicationFormResponseData.productType)
				&& Objects.equals(this.loginAccountType, applicationFormResponseData.loginAccountType)
				&& Objects.equals(this.derivative033Flag, applicationFormResponseData.derivative033Flag)
				&& Objects.equals(this.derivative034Flag, applicationFormResponseData.derivative034Flag)
				&& Objects.equals(this.derivative035Flag, applicationFormResponseData.derivative035Flag)
				&& Objects.equals(this.normalRiskFlag, applicationFormResponseData.normalRiskFlag)
				&& Objects.equals(this.needUploadAddressProof, applicationFormResponseData.needUploadAddressProof)
				&& Objects.equals(this.needUploadSignature, applicationFormResponseData.needUploadSignature)
				&& Objects.equals(this.maoKey01, applicationFormResponseData.maoKey01)
				&& Objects.equals(this.maoKey02, applicationFormResponseData.maoKey02)
				&& Objects.equals(this.maoKey03, applicationFormResponseData.maoKey03)
				&& Objects.equals(this.maoKey04, applicationFormResponseData.maoKey04)
				&& Objects.equals(this.maoKey05, applicationFormResponseData.maoKey05)
				&& Objects.equals(this.maoKey06, applicationFormResponseData.maoKey06)
				&& Objects.equals(this.maoKey07, applicationFormResponseData.maoKey07)
				&& Objects.equals(this.maoKey08, applicationFormResponseData.maoKey08)
				&& Objects.equals(this.chinaID, applicationFormResponseData.chinaID)
				&& Objects.equals(this.chinaIDExpiryDate, applicationFormResponseData.chinaIDExpiryDate)
				&& Objects.equals(this.passport, applicationFormResponseData.passport)
				&& Objects.equals(this.passportIssueCountry, applicationFormResponseData.passportIssueCountry)
				&& Objects.equals(this.passportExpiryDate, applicationFormResponseData.passportExpiryDate)
				&& Objects.equals(this.givenNameChi, applicationFormResponseData.givenNameChi)
				&& Objects.equals(this.surNameChi, applicationFormResponseData.surNameChi)
				&& Objects.equals(this.givenNameEng, applicationFormResponseData.givenNameEng)
				&& Objects.equals(this.surNameEng, applicationFormResponseData.surNameEng)
				&& Objects.equals(this.nickname, applicationFormResponseData.nickname);
	}

	@Override
	public int hashCode() {
		return Objects.hash(applicationReference, deviceId, applicationStatus, idvStatus, language, verificationReferenceNumber,
				fullNameEng, fullNameChi, dateOfBirth, hkIdCardNumber, hkPermanentResident, email, countryNumber, mobileNumber, lastSubmitPageId,
				applicationDetail, pinSetting, creationTimestamp, lastUpdateTimestamp, submissionTimestamp, devicePlatform, deviceModel,
				deviceOSVersion, ipAddress, sessionId, sessionUpdateTimestamp, hkIdCardType, exported, accountNumber, productType, loginAccountType,
				derivative033Flag, derivative034Flag, derivative035Flag, normalRiskFlag, needUploadAddressProof, needUploadSignature, maoKey01,
				maoKey02, maoKey03, maoKey04, maoKey05, maoKey06, maoKey07, maoKey08, chinaID, chinaIDExpiryDate, passport, passportIssueCountry, 
				passportExpiryDate, givenNameChi, surNameChi, givenNameEng, surNameEng, nickname); // new
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ApplicationFormResponseData {\n");

		sb.append("    applicationReference: ").append(toIndentedString(applicationReference)).append("\n");
		sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
		sb.append("    applicationStatus: ").append(toIndentedString(applicationStatus)).append("\n");
		sb.append("    idvStatus: ").append(toIndentedString(idvStatus)).append("\n");
		sb.append("    language: ").append(toIndentedString(language)).append("\n");
		sb.append("    verificationReferenceNumber: ").append(toIndentedString(verificationReferenceNumber)).append("\n");
		sb.append("    fullNameEng: ").append(toIndentedString(fullNameEng)).append("\n");
		sb.append("    fullNameChi: ").append(toIndentedString(fullNameChi)).append("\n");
		sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
		sb.append("    hkIdCardNumber: ").append(toIndentedString(hkIdCardNumber)).append("\n");
		sb.append("    hkPermanentResident: ").append(toIndentedString(hkPermanentResident)).append("\n");
		sb.append("    email: ").append(toIndentedString(email)).append("\n");
		sb.append("    countryNumber: ").append(toIndentedString(countryNumber)).append("\n");
		sb.append("    mobileNumber: ").append(toIndentedString(mobileNumber)).append("\n");
		sb.append("    lastSubmitPageId: ").append(toIndentedString(lastSubmitPageId)).append("\n");
		sb.append("    applicationDetail: ").append(toIndentedString(applicationDetail)).append("\n");
		sb.append("    pinSetting: ").append(toIndentedString(pinSetting)).append("\n");
		sb.append("    creationTimestamp: ").append(toIndentedString(creationTimestamp)).append("\n");
		sb.append("    lastUpdateTimestamp: ").append(toIndentedString(lastUpdateTimestamp)).append("\n");
		sb.append("    submissionTimestamp: ").append(toIndentedString(submissionTimestamp)).append("\n");
		sb.append("    devicePlatform: ").append(toIndentedString(devicePlatform)).append("\n");
		sb.append("    deviceModel: ").append(toIndentedString(deviceModel)).append("\n");
		sb.append("    deviceOSVersion: ").append(toIndentedString(deviceOSVersion)).append("\n");
		sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
		sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
		sb.append("    sessionUpdateTimestamp: ").append(toIndentedString(sessionUpdateTimestamp)).append("\n");
		sb.append("    hkIdCardType: ").append(toIndentedString(hkIdCardType)).append("\n");
		sb.append("    exported: ").append(toIndentedString(exported)).append("\n");

		sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
		sb.append("    productType: ").append(toIndentedString(productType)).append("\n");
		sb.append("    loginAccountType: ").append(toIndentedString(loginAccountType)).append("\n");
		sb.append("    derivative033Flag: ").append(toIndentedString(derivative033Flag)).append("\n");
		sb.append("    derivative034Flag: ").append(toIndentedString(derivative034Flag)).append("\n");
		sb.append("    derivative035Flag: ").append(toIndentedString(derivative035Flag)).append("\n");
		
		sb.append("    normalRiskFlag: ").append(toIndentedString(normalRiskFlag)).append("\n");
		sb.append("    needUploadAddressProof: ").append(toIndentedString(needUploadAddressProof)).append("\n");
		sb.append("    needUploadSignature: ").append(toIndentedString(needUploadSignature)).append("\n");
		sb.append("    maoKey01: ").append(toIndentedString(maoKey01)).append("\n");
		sb.append("    maoKey02: ").append(toIndentedString(maoKey02)).append("\n");
		sb.append("    maoKey03: ").append(toIndentedString(maoKey03)).append("\n");
		sb.append("    maoKey04: ").append(toIndentedString(maoKey04)).append("\n");
		sb.append("    maoKey05: ").append(toIndentedString(maoKey05)).append("\n");
		sb.append("    maoKey06: ").append(toIndentedString(maoKey06)).append("\n");
		sb.append("    maoKey07: ").append(toIndentedString(maoKey07)).append("\n");
		sb.append("    maoKey08: ").append(toIndentedString(maoKey08)).append("\n");
		sb.append("    chinaID: ").append(toIndentedString(chinaID)).append("\n");
		sb.append("    chinaIDExpiryDate: ").append(toIndentedString(chinaIDExpiryDate)).append("\n");
		sb.append("    passport: ").append(toIndentedString(passport)).append("\n");
		sb.append("    passportIssueCountry: ").append(toIndentedString(passportIssueCountry)).append("\n");
		sb.append("    passportExpiryDate: ").append(toIndentedString(passportExpiryDate)).append("\n");
		sb.append("    givenNameChi: ").append(toIndentedString(givenNameChi)).append("\n");
		sb.append("    surNameChi: ").append(toIndentedString(surNameChi)).append("\n");
		sb.append("    givenNameEng: ").append(toIndentedString(givenNameEng)).append("\n");
		sb.append("    surNameEng: ").append(toIndentedString(surNameEng)).append("\n");
		sb.append("    nickname: ").append(toIndentedString(nickname)).append("\n");
		
		sb.append("}");
		return sb.toString();
	}

	/**
	 * Convert the given object to string with each line indented by 4 spaces (except the first line).
	 */
	private String toIndentedString(java.lang.Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}

}
