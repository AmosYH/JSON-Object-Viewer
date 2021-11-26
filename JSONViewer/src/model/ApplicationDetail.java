
package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import net.sf.json.JSONArray;

/**
 * ApplicationDetail
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ApplicationDetail implements Serializable {

	private static final long serialVersionUID = 1L;

	@JsonProperty("channel")
	private String channel = null;

	@JsonProperty("accountPurpose")
	private String accountPurpose = null;

	@JsonProperty("productType")
	private String productType = null;

	@JsonProperty("accountType")
	private String accountType = null;

	@JsonProperty("nationality")
	private String nationality = null;

	@JsonProperty("multipleNationalities")
	private Boolean multipleNationalities = null;

	@JsonProperty("residentialAddress")
	private ApplicationAddress residentialAddress = null;

	@JsonProperty("homeNumber")
	private String homeNumber = null;

	@JsonProperty("correspondenceAddressRequired")
	private Boolean correspondenceAddressRequired = null;

	@JsonProperty("correspondenceAddress")
	private ApplicationAddress correspondenceAddress = null;

	@JsonProperty("statementType")
	private String statementType = null;

	@JsonProperty("employmentStatus")
	private String employmentStatus = null;

	@JsonProperty("employmentStatusEn")
	private String employmentStatusEn = null;

	@JsonProperty("employmentStatusTc")
	private String employmentStatusTc = null;

	@JsonProperty("employmentStatusSc")
	private String employmentStatusSc = null;

	@JsonProperty("occupation")
	private String occupation = null;

	@JsonProperty("occupationEn")
	private String occupationEn = null;

	@JsonProperty("occupationTc")
	private String occupationTc = null;

	@JsonProperty("occupationSc")
	private String occupationSc = null;

	@JsonProperty("industryDescription")
	private String industryDescription = null;

	@JsonProperty("industryDescriptionEn")
	private String industryDescriptionEn = null;

	@JsonProperty("industryDescriptionTc")
	private String industryDescriptionTc = null;

	@JsonProperty("industryDescriptionSc")
	private String industryDescriptionSc = null;

	@JsonProperty("usCitizen")
	private Boolean usCitizen = null;

	@JsonProperty("taxResidenceCountry")
	private String taxResidenceCountry = null;

	@JsonProperty("taxIdNumber")
	private String taxIdNumber = null;

	@JsonProperty("taxResidenceOutsideHK")
	private Boolean taxResidenceOutsideHK = null;

	@JsonProperty("marketingStatementNotRequired")
	private Boolean marketingStatementNotRequired = null;

	@JsonProperty("marketingDirectMailNotRequired")
	private Boolean marketingDirectMailNotRequired = null;

	@JsonProperty("marketingPhoneCallNotRequired")
	private Boolean marketingPhoneCallNotRequired = null;

	@JsonProperty("marketingMobileMessageNotRequired")
	private Boolean marketingMobileMessageNotRequired = null;

	@JsonProperty("marketingEmailNotRequired")
	private Boolean marketingEmailNotRequired = null;

	@JsonProperty("marketingOthersNotRequired")
	private Boolean marketingOthersNotRequired = null;

	@JsonProperty("productSpecificInformation")
	private List<ProductSpecificInformation> productSpecificInformation = null;

	@JsonProperty("promotionCode")
	private String promotionCode = null;

	@JsonProperty("openAPI")
	private OpenAPI openAPI = null;

	@JsonProperty("accountTypeEn")
	private String accountTypeEn;

	@JsonProperty("accountTypeTc")
	private String accountTypeTc;

	@JsonProperty("accountTypeSc")
	private String accountTypeSc;

	@JsonProperty("taxResidenceHK")
	private Boolean taxResidenceHK;

	@JsonProperty("openSecuritiesAccount")
	private Boolean openSecuritiesAccount;

	@JsonProperty("openLDAccount")
	private Boolean openLDAccount;
	
	@JsonProperty("tradingConsentAgree")
	private Boolean tradingConsentAgree;
	
	@JsonProperty("dkDeclaration1")
	private Boolean dkDeclaration1;
	
	@JsonProperty("dkDeclaration2")
	private Boolean dkDeclaration2;
	
	@JsonProperty("employerRegSFC")
	private Boolean employerRegSFC;
	
	@JsonProperty("nationalityDeclaration")
	private Boolean nationalityDeclaration;
	
	@JsonProperty("fs_question_1_en")
	private String fs_question_1_en;
	
	@JsonProperty("fs_question_2_en")
	private String fs_question_2_en;
	
	@JsonProperty("fs_question_3_en")
	private String fs_question_3_en;
	
	@JsonProperty("fs_question_4_en")
	private String fs_question_4_en;
	
	@JsonProperty("fs_question_5_en")
	private String fs_question_5_en;
	
	@JsonProperty("fs_question_6_en")
	private String fs_question_6_en;
	
	@JsonProperty("fs_question_7_en")
	private String fs_question_7_en;
	
	@JsonProperty("fs_question_8_en")
	private String fs_question_8_en;
	
	@JsonProperty("fs_question_6_input")
	private String fs_question_6_input;
	
	@JsonProperty("fs_question_1")
	private String fs_question_1;
	
	@JsonProperty("fs_question_2")
	private String fs_question_2;
	
	@JsonProperty("fs_question_3")
	private String fs_question_3;
	
	@JsonProperty("fs_question_4")
	private String fs_question_4;
	
	@JsonProperty("fs_question_5")
	private String fs_question_5;
	
	@JsonProperty("fs_question_6")
	private String fs_question_6;
	
	@JsonProperty("fs_question_7")
	private String fs_question_7;
	
	@JsonProperty("fs_question_8")
	private String fs_question_8;
	
	@JsonProperty("addressFileName")
	private String addressFileName;
	
	@JsonProperty("addressFileSourceReferenceNumber")
	private String addressFileSourceReferenceNumber;
	
	@JsonProperty("addressFileSubmissionReference")
	private String addressFileSubmissionReference;
	
	@JsonProperty("addressStatus")
	private String addressStatus;
	
	@JsonProperty("addressUploadDeclaration")
	private Boolean addressUploadDeclaration;
	
	@JsonProperty("signatureUploadDeclaration")
	private Boolean signatureUploadDeclaration;
	
	@JsonProperty("riskDeclaration")
	private Boolean riskDeclaration;
	
	@JsonProperty("primaryIndFlag")
	private Boolean primaryIndFlag;
	
	@JsonProperty("beneficialOwnerFlag")
	private Boolean beneficialOwnerFlag;
	
	@JsonProperty("title")
	private String title;
	
	@JsonProperty("ipAddress")
	private String ipAddress;
	
	@JsonProperty("countryCode")
	private String countryCode;
	
	@JsonProperty("securitiesAccountAdvice")
	private String securitiesAccountAdvice;
	
	@JsonProperty("chinaIdFileName")
	private String chinaIdFileName;
	
	@JsonProperty("chinaIdFileSourceReferenceNumber")
	private String chinaIdFileSourceReferenceNumber;
	
	@JsonProperty("chinaIdFileSubmissionReference")
	private String chinaIdFileSubmissionReference;
	
	@JsonProperty("chinaIdStatus")
	private String chinaIdStatus;
	
	@JsonProperty("passportFileName")
	private String passportFileName;
	
	@JsonProperty("passportFileSourceReferenceNumber")
	private String passportFileSourceReferenceNumber;
	
	@JsonProperty("passportFileSubmissionReference")
	private String passportFileSubmissionReference;
	
	@JsonProperty("passportStatus")
	private String passportStatus;
	
	@JsonProperty("chinaBranchCode")
	private String chinaBranchCode;
	
	@JsonProperty("chinaBranch")
	private BranchDetail chinaBranch;
	
	@JsonProperty("hkBranch")
	private BranchDetail hkBranch;
	
	@JsonProperty("taxResidenceList")
	private JSONArray taxResidenceList;
	
	@JsonProperty("hkBranchCode")
	private String hkBranchCode;
	
	@JsonProperty("homeNumberCountryCode")
	private String homeNumberCountryCode;
	
	@JsonProperty("homeNumberAreaCode")
	private String homeNumberAreaCode;
	
	@JsonProperty("vc_question_1")
	private String vc_question_1;
	
	@JsonProperty("vc_question_2")
	private String vc_question_2;
	
	@JsonProperty("vc_question_3")
	private String vc_question_3;
	
	@JsonProperty("vc_question_4")
	private String vc_question_4;
	
	@JsonProperty("vc_question_5")
	private String vc_question_5;
	
	@JsonProperty("vc_question_6")
	private String vc_question_6;
	
	@JsonProperty("vc_question_7")
	private String vc_question_7;
	
	@JsonProperty("referrerCode")
	private String referrerCode;
	
	@JsonProperty("ctpFileName")
	private String ctpFileName;
	
	@JsonProperty("ctpFileSourceReferenceNumber")
	private String ctpFileSourceReferenceNumber;
	
	@JsonProperty("ctpFileSubmissionReference")
	private String ctpFileSubmissionReference;
	
	@JsonProperty("ctpStatus")
	private String ctpStatus;

	public OpenAPI getOpenAPI() {
		return openAPI;
	}

	public void setOpenAPI(OpenAPI openAPI) {
		this.openAPI = openAPI;
	}

	public ApplicationDetail channel(String channel) {
		this.channel = channel;
		return this;
	}

	/**
	 * channel Of Application
	 * 
	 * @return channel
	 **/
	public String getChannel() {
		return channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}

	public ApplicationDetail accountPurpose(String accountPurpose) {
		this.accountPurpose = accountPurpose;
		return this;
	}

	/**
	 * Account Purpose Of Application
	 * 
	 * @return accountPurpose
	 **/
	public String getAccountPurpose() {
		return accountPurpose;
	}

	public void setAccountPurpose(String accountPurpose) {
		this.accountPurpose = accountPurpose;
	}

	public ApplicationDetail productType(String productType) {
		this.productType = productType;
		return this;
	}

	/**
	 * Product Type Of Application
	 * 
	 * @return productType
	 **/
	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public ApplicationDetail accountType(String accountType) {
		this.accountType = accountType;
		return this;
	}

	/**
	 * Account Type Of Application
	 * 
	 * @return accountType
	 **/
	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public ApplicationDetail nationality(String nationality) {
		this.nationality = nationality;
		return this;
	}

	/**
	 * Nationality of Applicant
	 * 
	 * @return nationality
	 **/
	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public ApplicationDetail multipleNationalities(Boolean multipleNationalities) {
		this.multipleNationalities = multipleNationalities;
		return this;
	}

	/**
	 * Applicant is Multiple Nationalities or not
	 * 
	 * @return multipleNationalities
	 **/
	public Boolean getMultipleNationalities() {
		return multipleNationalities;
	}

	public void setMultipleNationalities(Boolean multipleNationalities) {
		this.multipleNationalities = multipleNationalities;
	}

	public ApplicationDetail residentialAddress(ApplicationAddress residentialAddress) {
		this.residentialAddress = residentialAddress;
		return this;
	}

	/**
	 * Get residentialAddress
	 * 
	 * @return residentialAddress
	 **/
	public ApplicationAddress getResidentialAddress() {
		return residentialAddress;
	}

	public void setResidentialAddress(ApplicationAddress residentialAddress) {
		this.residentialAddress = residentialAddress;
	}

	public ApplicationDetail homeNumber(String homeNumber) {
		this.homeNumber = homeNumber;
		return this;
	}

	/**
	 * Home Number of Applicant
	 * 
	 * @return homeNumber
	 **/
	public String getHomeNumber() {
		return homeNumber;
	}

	public void setHomeNumber(String homeNumber) {
		this.homeNumber = homeNumber;
	}

	public ApplicationDetail correspondenceAddressRequired(Boolean correspondenceAddressRequired) {
		this.correspondenceAddressRequired = correspondenceAddressRequired;
		return this;
	}

	/**
	 * Correspondence Address Required
	 * 
	 * @return correspondenceAddressRequired
	 **/
	public Boolean getCorrespondenceAddressRequired() {
		return correspondenceAddressRequired;
	}

	public void setCorrespondenceAddressRequired(Boolean correspondenceAddressRequired) {
		this.correspondenceAddressRequired = correspondenceAddressRequired;
	}

	public ApplicationDetail correspondenceAddress(ApplicationAddress correspondenceAddress) {
		this.correspondenceAddress = correspondenceAddress;
		return this;
	}

	/**
	 * Get correspondenceAddress
	 * 
	 * @return correspondenceAddress
	 **/
	public ApplicationAddress getCorrespondenceAddress() {
		return correspondenceAddress;
	}

	public void setCorrespondenceAddress(ApplicationAddress correspondenceAddress) {
		this.correspondenceAddress = correspondenceAddress;
	}

	public ApplicationDetail statementType(String statementType) {
		this.statementType = statementType;
		return this;
	}

	/**
	 * Statement Type of Applicant
	 * 
	 * @return statementType
	 **/
	public String getStatementType() {
		return statementType;
	}

	public void setStatementType(String statementType) {
		this.statementType = statementType;
	}

	public ApplicationDetail employmentStatus(String employmentStatus) {
		this.employmentStatus = employmentStatus;
		return this;
	}

	/**
	 * Employment Status of Applicant
	 * 
	 * @return employmentStatus
	 **/
	public String getEmploymentStatus() {
		return employmentStatus;
	}

	public void setEmploymentStatus(String employmentStatus) {
		this.employmentStatus = employmentStatus;
	}

	public ApplicationDetail occupation(String occupation) {
		this.occupation = occupation;
		return this;
	}

	/**
	 * Occupation of Applicant
	 * 
	 * @return occupation
	 **/
	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public ApplicationDetail industryDescription(String industryDescription) {
		this.industryDescription = industryDescription;
		return this;
	}

	/**
	 * Industry Description of Applicant
	 * 
	 * @return industryDescription
	 **/
	public String getIndustryDescription() {
		return industryDescription;
	}

	public void setIndustryDescription(String industryDescription) {
		this.industryDescription = industryDescription;
	}

	public ApplicationDetail usCitizen(Boolean usCitizen) {
		this.usCitizen = usCitizen;
		return this;
	}

	/**
	 * Applicant is US Citizen or not
	 * 
	 * @return usCitizen
	 **/
	public Boolean getUsCitizen() {
		return usCitizen;
	}

	public void setUsCitizen(Boolean usCitizen) {
		this.usCitizen = usCitizen;
	}

	public ApplicationDetail taxResidenceCountry(String taxResidenceCountry) {
		this.taxResidenceCountry = taxResidenceCountry;
		return this;
	}

	/**
	 * Tax Residence Country of Applicant
	 * 
	 * @return taxResidenceCountry
	 **/
	public String getTaxResidenceCountry() {
		return taxResidenceCountry;
	}

	public void setTaxResidenceCountry(String taxResidenceCountry) {
		this.taxResidenceCountry = taxResidenceCountry;
	}

	public ApplicationDetail taxIdNumber(String taxIdNumber) {
		this.taxIdNumber = taxIdNumber;
		return this;
	}

	/**
	 * Tax Number of Applicant
	 * 
	 * @return taxIdNumber
	 **/
	public String getTaxIdNumber() {
		return taxIdNumber;
	}

	public void setTaxIdNumber(String taxIdNumber) {
		this.taxIdNumber = taxIdNumber;
	}

	public ApplicationDetail taxResidenceOutsideHK(Boolean taxResidenceOutsideHK) {
		this.taxResidenceOutsideHK = taxResidenceOutsideHK;
		return this;
	}

	/**
	 * Applicant is Tax Residence Outside HK or not
	 * 
	 * @return taxResidenceOutsideHK
	 **/
	public Boolean getTaxResidenceOutsideHK() {
		return taxResidenceOutsideHK;
	}

	public void setTaxResidenceOutsideHK(Boolean taxResidenceOutsideHK) {
		this.taxResidenceOutsideHK = taxResidenceOutsideHK;
	}

	public ApplicationDetail marketingStatementNotRequired(Boolean marketingStatementNotRequired) {
		this.marketingStatementNotRequired = marketingStatementNotRequired;
		return this;
	}

	/**
	 * Marketing Statement is Not Required or not
	 * 
	 * @return marketingStatementNotRequired
	 **/
	public Boolean getMarketingStatementNotRequired() {
		return marketingStatementNotRequired;
	}

	public void setMarketingStatementNotRequired(Boolean marketingStatementNotRequired) {
		this.marketingStatementNotRequired = marketingStatementNotRequired;
	}

	public ApplicationDetail marketingDirectMailNotRequired(Boolean marketingDirectMailNotRequired) {
		this.marketingDirectMailNotRequired = marketingDirectMailNotRequired;
		return this;
	}

	/**
	 * Marketing DirectMail is Not Required or not
	 * 
	 * @return marketingDirectMailNotRequired
	 **/
	public Boolean getMarketingDirectMailNotRequired() {
		return marketingDirectMailNotRequired;
	}

	public void setMarketingDirectMailNotRequired(Boolean marketingDirectMailNotRequired) {
		this.marketingDirectMailNotRequired = marketingDirectMailNotRequired;
	}

	public ApplicationDetail marketingPhoneCallNotRequired(Boolean marketingPhoneCallNotRequired) {
		this.marketingPhoneCallNotRequired = marketingPhoneCallNotRequired;
		return this;
	}

	/**
	 * Marketing Phone Call is Not Required or not
	 * 
	 * @return marketingPhoneCallNotRequired
	 **/
	public Boolean getMarketingPhoneCallNotRequired() {
		return marketingPhoneCallNotRequired;
	}

	public void setMarketingPhoneCallNotRequired(Boolean marketingPhoneCallNotRequired) {
		this.marketingPhoneCallNotRequired = marketingPhoneCallNotRequired;
	}

	public ApplicationDetail marketingMobileMessageNotRequired(Boolean marketingMobileMessageNotRequired) {
		this.marketingMobileMessageNotRequired = marketingMobileMessageNotRequired;
		return this;
	}

	/**
	 * Marketing Mobile Message is Not Required or not
	 * 
	 * @return marketingMobileMessageNotRequired
	 **/
	public Boolean getMarketingMobileMessageNotRequired() {
		return marketingMobileMessageNotRequired;
	}

	public void setMarketingMobileMessageNotRequired(Boolean marketingMobileMessageNotRequired) {
		this.marketingMobileMessageNotRequired = marketingMobileMessageNotRequired;
	}

	public ApplicationDetail marketingEmailNotRequired(Boolean marketingEmailNotRequired) {
		this.marketingEmailNotRequired = marketingEmailNotRequired;
		return this;
	}

	/**
	 * Marketing Email is Not Required or not
	 * 
	 * @return marketingEmailNotRequired
	 **/
	public Boolean getMarketingEmailNotRequired() {
		return marketingEmailNotRequired;
	}

	public void setMarketingEmailNotRequired(Boolean marketingEmailNotRequired) {
		this.marketingEmailNotRequired = marketingEmailNotRequired;
	}

	public ApplicationDetail marketingOthersNotRequired(Boolean marketingOthersNotRequired) {
		this.marketingOthersNotRequired = marketingOthersNotRequired;
		return this;
	}

	/**
	 * Marketing Others is Not Required or not
	 * 
	 * @return marketingOthersNotRequired
	 **/
	public Boolean getMarketingOthersNotRequired() {
		return marketingOthersNotRequired;
	}

	public void setMarketingOthersNotRequired(Boolean marketingOthersNotRequired) {
		this.marketingOthersNotRequired = marketingOthersNotRequired;
	}

	public ApplicationDetail productSpecificInformation(List<ProductSpecificInformation> productSpecificInformation) {
		this.productSpecificInformation = productSpecificInformation;
		return this;
	}

	public ApplicationDetail addProductSpecificInformationItem(ProductSpecificInformation productSpecificInformationItem) {
		if (this.productSpecificInformation == null) {
			this.productSpecificInformation = new ArrayList<ProductSpecificInformation>();
		}
		this.productSpecificInformation.add(productSpecificInformationItem);
		return this;
	}

	/**
	 * Get productSpecificInformation
	 * 
	 * @return productSpecificInformation
	 **/
	public List<ProductSpecificInformation> getProductSpecificInformation() {
		return productSpecificInformation;
	}

	public void setProductSpecificInformation(List<ProductSpecificInformation> productSpecificInformation) {
		this.productSpecificInformation = productSpecificInformation;
	}

	public ApplicationDetail promotionCode(String promotionCode) {
		this.promotionCode = promotionCode;
		return this;
	}

	/**
	 * Promotion Code of Applicant
	 * 
	 * @return promotionCode
	 **/
	public String getPromotionCode() {
		return promotionCode;
	}

	public void setPromotionCode(String promotionCode) {
		this.promotionCode = promotionCode;
	}

	public String getEmploymentStatusEn() {
		return employmentStatusEn;
	}

	public void setEmploymentStatusEn(String employmentStatusEn) {
		this.employmentStatusEn = employmentStatusEn;
	}

	public String getEmploymentStatusTc() {
		return employmentStatusTc;
	}

	public void setEmploymentStatusTc(String employmentStatusTc) {
		this.employmentStatusTc = employmentStatusTc;
	}

	public String getEmploymentStatusSc() {
		return employmentStatusSc;
	}

	public void setEmploymentStatusSc(String employmentStatusSc) {
		this.employmentStatusSc = employmentStatusSc;
	}

	public String getOccupationEn() {
		return occupationEn;
	}

	public void setOccupationEn(String occupationEn) {
		this.occupationEn = occupationEn;
	}

	public String getOccupationTc() {
		return occupationTc;
	}

	public void setOccupationTc(String occupationTc) {
		this.occupationTc = occupationTc;
	}

	public String getOccupationSc() {
		return occupationSc;
	}

	public void setOccupationSc(String occupationSc) {
		this.occupationSc = occupationSc;
	}

	public String getIndustryDescriptionEn() {
		return industryDescriptionEn;
	}

	public void setIndustryDescriptionEn(String industryDescriptionEn) {
		this.industryDescriptionEn = industryDescriptionEn;
	}

	public String getIndustryDescriptionTc() {
		return industryDescriptionTc;
	}

	public void setIndustryDescriptionTc(String industryDescriptionTc) {
		this.industryDescriptionTc = industryDescriptionTc;
	}

	public String getIndustryDescriptionSc() {
		return industryDescriptionSc;
	}

	public void setIndustryDescriptionSc(String industryDescriptionSc) {
		this.industryDescriptionSc = industryDescriptionSc;
	}

	public String getAccountTypeEn() {
		return accountTypeEn;
	}

	public void setAccountTypeEn(String accountTypeEn) {
		this.accountTypeEn = accountTypeEn;
	}

	public String getAccountTypeTc() {
		return accountTypeTc;
	}

	public void setAccountTypeTc(String accountTypeTc) {
		this.accountTypeTc = accountTypeTc;
	}

	public String getAccountTypeSc() {
		return accountTypeSc;
	}

	public void setAccountTypeSc(String accountTypeSc) {
		this.accountTypeSc = accountTypeSc;
	}

	public Boolean getTaxResidenceHK() {
		return taxResidenceHK;
	}

	public void setTaxResidenceHK(Boolean taxResidenceHK) {
		this.taxResidenceHK = taxResidenceHK;
	}

	public Boolean getOpenSecuritiesAccount() {
		return openSecuritiesAccount;
	}

	public void setOpenSecuritiesAccount(Boolean openSecuritiesAccount) {
		this.openSecuritiesAccount = openSecuritiesAccount;
	}

	public Boolean getOpenLDAccount() {
		return openLDAccount;
	}

	public void setOpenLDAccount(Boolean openLDAccount) {
		this.openLDAccount = openLDAccount;
	}
	
	

	public Boolean getTradingConsentAgree() {
		return tradingConsentAgree;
	}

	public void setTradingConsentAgree(Boolean tradingConsentAgree) {
		this.tradingConsentAgree = tradingConsentAgree;
	}

	public Boolean getDkDeclaration1() {
		return dkDeclaration1;
	}

	public void setDkDeclaration1(Boolean dkDeclaration1) {
		this.dkDeclaration1 = dkDeclaration1;
	}

	public Boolean getDkDeclaration2() {
		return dkDeclaration2;
	}

	public void setDkDeclaration2(Boolean dkDeclaration2) {
		this.dkDeclaration2 = dkDeclaration2;
	}
	
	public Boolean getEmployerRegSFC2() {
		return employerRegSFC;
	}

	public void setEmployerRegSFC(Boolean employerRegSFC) {
		this.employerRegSFC = employerRegSFC;
	}
	
	public Boolean getNationalityDeclaration() {
		return nationalityDeclaration;
	}

	public void setNationalityDeclaration(Boolean nationalityDeclaration) {
		this.nationalityDeclaration = nationalityDeclaration;
	}
	
	public String getFs_question_1() {
		return fs_question_1;
	}

	public void setFs_question_1(String fs_question_1) {
		this.fs_question_1 = fs_question_1;
	}
	
	public String getFs_question_2() {
		return fs_question_2;
	}

	public void setFs_question_2(String fs_question_2) {
		this.fs_question_2 = fs_question_2;
	}
	
	public String getFs_question_3() {
		return fs_question_3;
	}

	public void setFs_question_3(String fs_question_3) {
		this.fs_question_3 = fs_question_3;
	}
	
	public String getFs_question_4() {
		return fs_question_4;
	}

	public void setFs_question_4(String fs_question_4) {
		this.fs_question_4 = fs_question_4;
	}
	
	public String getFs_question_5() {
		return fs_question_5;
	}

	public void setFs_question_5(String fs_question_5) {
		this.fs_question_5 = fs_question_5;
	}
	
	public String getFs_question_6() {
		return fs_question_6;
	}

	public void setFs_question_6(String fs_question_6) {
		this.fs_question_6 = fs_question_6;
	}
	
	public String getFs_question_7() {
		return fs_question_7;
	}

	public void setFs_question_7(String fs_question_7) {
		this.fs_question_7 = fs_question_7;
	}
	
	public String getFs_question_8() {
		return fs_question_8;
	}

	public void setFs_question_8(String fs_question_8) {
		this.fs_question_8 = fs_question_8;
	}
	
	public String getFs_question_1_en() {
		return fs_question_1_en;
	}

	public void setFs_question_1_en(String fs_question_1_en) {
		this.fs_question_1_en = fs_question_1_en;
	}
	
	public String getFs_question_2_en() {
		return fs_question_2_en;
	}

	public void setFs_question_2_en(String fs_question_2_en) {
		this.fs_question_2_en = fs_question_2_en;
	}
	
	public String getFs_question_3_en() {
		return fs_question_3_en;
	}

	public void setFs_question_3_en(String fs_question_3_en) {
		this.fs_question_3_en = fs_question_3_en;
	}
	
	public String getFs_question_4_en() {
		return fs_question_4_en;
	}

	public void setFs_question_4_en(String fs_question_4_en) {
		this.fs_question_4_en = fs_question_4_en;
	}
	
	public String getFs_question_5_en() {
		return fs_question_5_en;
	}

	public void setFs_question_5_en(String fs_question_5_en) {
		this.fs_question_5_en = fs_question_5_en;
	}
	
	public String getFs_question_6_en() {
		return fs_question_6_en;
	}

	public void setFs_question_6_en(String fs_question_6_en) {
		this.fs_question_6_en = fs_question_6_en;
	}
	
	public String getFs_question_7_en() {
		return fs_question_7_en;
	}

	public void setFs_question_7_en(String fs_question_7_en) {
		this.fs_question_7_en = fs_question_7_en;
	}
	
	public String getFs_question_8_en() {
		return fs_question_8_en;
	}

	public void setFs_question_8_en(String fs_question_8_en) {
		this.fs_question_8_en = fs_question_8_en;
	}
	
	public String getFs_question_6_input() {
		return fs_question_6_input;
	}

	public void setFs_question_6_input(String fs_question_6_input) {
		this.fs_question_6_input = fs_question_6_input;
	}
	
	public String getAddressFileName() {
		return addressFileName;
	}

	public void setAddressFileName(String addressFileName) {
		this.addressFileName = addressFileName;
	}
	
	public String getAddressFileSourceReferenceNumber() {
		return addressFileSourceReferenceNumber;
	}

	public void setAddressFileSourceReferenceNumber(String addressFileSourceReferenceNumber) {
		this.addressFileSourceReferenceNumber = addressFileSourceReferenceNumber;
	}
	
	public String getAddressFileSubmissionReference() {
		return addressFileSubmissionReference;
	}

	public void setAddressFileSubmissionReference(String addressFileSubmissionReference) {
		this.addressFileSubmissionReference = addressFileSubmissionReference;
	}
	
	public String getAddressStatus() {
		return addressStatus;
	}

	public void setAddressStatus(String addressStatus) {
		this.addressStatus = addressStatus;
	}
	
	public Boolean getAddressUploadDeclaration() {
		return addressUploadDeclaration;
	}

	public void setAddressUploadDeclaration(Boolean addressUploadDeclaration) {
		this.addressUploadDeclaration = addressUploadDeclaration;
	}
	
	public Boolean getSignatureUploadDeclaration() {
		return signatureUploadDeclaration;
	}

	public void setSignatureUploadDeclaration(Boolean signatureUploadDeclaration) {
		this.signatureUploadDeclaration = signatureUploadDeclaration;
	}
	
	public Boolean getRiskDeclaration() {
		return riskDeclaration;
	}

	public void setRiskDeclaration(Boolean riskDeclaration) {
		this.riskDeclaration = riskDeclaration;
	}
	
	public Boolean getPrimaryIndFlag() {
		return primaryIndFlag;
	}

	public void setPrimaryIndFlag(Boolean primaryIndFlag) {
		this.primaryIndFlag = primaryIndFlag;
	}
	
	public Boolean getBeneficialOwnerFlag() {
		return beneficialOwnerFlag;
	}

	public void setBeneficialOwnerFlag(Boolean beneficialOwnerFlag) {
		this.beneficialOwnerFlag = beneficialOwnerFlag;
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getIpAddress() {
		return ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}
	
	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	
	public String getSecuritiesAccountAdvice() {
		return securitiesAccountAdvice;
	}

	public void setSecuritiesAccountAdvice(String securitiesAccountAdvice) {
		this.securitiesAccountAdvice = securitiesAccountAdvice;
	}
	
	public String getChinaIdFileName() {
		return chinaIdFileName;
	}

	public void setChinaIdFileName(String chinaIdFileName) {
		this.chinaIdFileName = chinaIdFileName;
	}
	
	public String getChinaIdFileSourceReferenceNumber() {
		return chinaIdFileSourceReferenceNumber;
	}

	public void setChinaIdFileSourceReferenceNumber(String chinaIdFileSourceReferenceNumber) {
		this.chinaIdFileSourceReferenceNumber = chinaIdFileSourceReferenceNumber;
	}
	
	public String getChinaIdFileSubmissionReference() {
		return chinaIdFileSubmissionReference;
	}

	public void setChinaIdFileSubmissionReference(String chinaIdFileSubmissionReference) {
		this.chinaIdFileSubmissionReference = chinaIdFileSubmissionReference;
	}
	
	public String getChinaIdStatus() {
		return chinaIdStatus;
	}

	public void setChinaIdStatus(String chinaIdStatus) {
		this.chinaIdStatus = chinaIdStatus;
	}
	
	public String getPassportFileName() {
		return passportFileName;
	}

	public void setPassportFileName(String passportFileName) {
		this.passportFileName = passportFileName;
	}
	
	public String getPassportFileSourceReferenceNumber() {
		return passportFileSourceReferenceNumber;
	}

	public void setPassportFileSourceReferenceNumber(String passportFileSourceReferenceNumber) {
		this.passportFileSourceReferenceNumber = passportFileSourceReferenceNumber;
	}
	
	public String getPassportFileSubmissionReference() {
		return passportFileSubmissionReference;
	}

	public void setPassportFileSubmissionReference(String passportFileSubmissionReference) {
		this.passportFileSubmissionReference = passportFileSubmissionReference;
	}
	
	public String getPassportStatus() {
		return passportStatus;
	}

	public void setPassportStatus(String passportStatus) {
		this.passportStatus = passportStatus;
	}
	
	public String getChinaBranchCode() {
		return chinaBranchCode;
	}

	public void setChinaBranchCode(String chinaBranchCode) {
		this.chinaBranchCode = chinaBranchCode;
	}
	
	public BranchDetail getChinaBranch() {
		return chinaBranch;
	}

	public void setChinaBranch(BranchDetail chinaBranch) {
		this.chinaBranch = chinaBranch;
	}
	
	public BranchDetail getHkBranch() {
		return hkBranch;
	}

	public void setHkBranch(BranchDetail hkBranch) {
		this.hkBranch = hkBranch;
	}
	
	public JSONArray getTaxResidenceList() {
		return taxResidenceList;
	}

	public void setTaxResidenceList(JSONArray taxResidenceList) {
		this.taxResidenceList = taxResidenceList;
	}
	
	public String getHkBranchCode() {
		return hkBranchCode;
	}

	public void setHkBranchCode(String hkBranchCode) {
		this.hkBranchCode = hkBranchCode;
	}
	
	public String getHomeNumberCountryCode() {
		return homeNumberCountryCode;
	}

	public void setHomeNumberCountryCode(String homeNumberCountryCode) {
		this.homeNumberCountryCode = homeNumberCountryCode;
	}
	
	public String getHomeNumberAreaCode() {
		return homeNumberAreaCode;
	}

	public void setHomeNumberAreaCode(String homeNumberAreaCode) {
		this.homeNumberAreaCode = homeNumberAreaCode;
	}
	
	public String getVc_question_1() {
		return vc_question_1;
	}

	public void setVc_question_1(String vc_question_1) {
		this.vc_question_1 = vc_question_1;
	}
	
	public String getVc_question_2() {
		return vc_question_2;
	}

	public void setVc_question_2(String vc_question_2) {
		this.vc_question_2 = vc_question_2;
	}
	
	public String getVc_question_3() {
		return vc_question_3;
	}

	public void setVc_question_3(String vc_question_3) {
		this.vc_question_3 = vc_question_3;
	}
	
	public String getVc_question_4() {
		return vc_question_4;
	}

	public void setVc_question_4(String vc_question_4) {
		this.vc_question_4 = vc_question_4;
	}
	
	public String getVc_question_5() {
		return vc_question_5;
	}

	public void setVc_question_5(String vc_question_5) {
		this.vc_question_5 = vc_question_5;
	}
	
	public String getVc_question_6() {
		return vc_question_6;
	}

	public void setVc_question_6(String vc_question_6) {
		this.vc_question_6 = vc_question_6;
	}
	
	public String getVc_question_7() {
		return vc_question_7;
	}

	public void setVc_question_7(String vc_question_7) {
		this.vc_question_7 = vc_question_7;
	}
	
	public String getReferrerCode() {
		return referrerCode;
	}

	public void setReferrerCode(String referrerCode) {
		this.referrerCode = referrerCode;
	}
	
	public String getCtpFileName() {
		return ctpFileName;
	}

	public void setCtpFileName(String ctpFileName) {
		this.ctpFileName = ctpFileName;
	}
	
	public String getCtpFileSourceReferenceNumber() {
		return ctpFileSourceReferenceNumber;
	}

	public void setCtpFileSourceReferenceNumber(String ctpFileSourceReferenceNumber) {
		this.ctpFileSourceReferenceNumber = ctpFileSourceReferenceNumber;
	}
	
	public String getCtpFileSubmissionReference() {
		return ctpFileSubmissionReference;
	}

	public void setCtpFileSubmissionReference(String ctpFileSubmissionReference) {
		this.ctpFileSubmissionReference = ctpFileSubmissionReference;
	}
	
	public String getCtpStatus() {
		return ctpStatus;
	}

	public void setCtpStatus(String ctpStatus) {
		this.ctpStatus = ctpStatus;
	}
	

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ApplicationDetail applicationDetail = (ApplicationDetail) o;
		return Objects.equals(this.channel, applicationDetail.channel)
				&& Objects.equals(this.accountPurpose, applicationDetail.accountPurpose)
				&& Objects.equals(this.productType, applicationDetail.productType)
				&& Objects.equals(this.accountType, applicationDetail.accountType)
				&& Objects.equals(this.nationality, applicationDetail.nationality)
				&& Objects.equals(this.multipleNationalities, applicationDetail.multipleNationalities)
				&& Objects.equals(this.residentialAddress, applicationDetail.residentialAddress)
				&& Objects.equals(this.homeNumber, applicationDetail.homeNumber)
				&& Objects.equals(this.correspondenceAddressRequired, applicationDetail.correspondenceAddressRequired)
				&& Objects.equals(this.correspondenceAddress, applicationDetail.correspondenceAddress)
				&& Objects.equals(this.statementType, applicationDetail.statementType)
				&& Objects.equals(this.employmentStatus, applicationDetail.employmentStatus)
				&& Objects.equals(this.occupation, applicationDetail.occupation)
				&& Objects.equals(this.industryDescription, applicationDetail.industryDescription)
				&& Objects.equals(this.usCitizen, applicationDetail.usCitizen)
				&& Objects.equals(this.taxResidenceCountry, applicationDetail.taxResidenceCountry)
				&& Objects.equals(this.taxIdNumber, applicationDetail.taxIdNumber)
				&& Objects.equals(this.taxResidenceOutsideHK, applicationDetail.taxResidenceOutsideHK)
				&& Objects.equals(this.marketingStatementNotRequired, applicationDetail.marketingStatementNotRequired)
				&& Objects.equals(this.marketingDirectMailNotRequired, applicationDetail.marketingDirectMailNotRequired)
				&& Objects.equals(this.marketingPhoneCallNotRequired, applicationDetail.marketingPhoneCallNotRequired)
				&& Objects.equals(this.marketingMobileMessageNotRequired, applicationDetail.marketingMobileMessageNotRequired)
				&& Objects.equals(this.marketingEmailNotRequired, applicationDetail.marketingEmailNotRequired)
				&& Objects.equals(this.marketingOthersNotRequired, applicationDetail.marketingOthersNotRequired)
				&& Objects.equals(this.productSpecificInformation, applicationDetail.productSpecificInformation)
				&& Objects.equals(this.accountTypeEn, applicationDetail.accountTypeEn)
				&& Objects.equals(this.accountTypeTc, applicationDetail.accountTypeTc)
				&& Objects.equals(this.accountTypeSc, applicationDetail.accountTypeSc)
				&& Objects.equals(this.taxResidenceHK, applicationDetail.taxResidenceHK)
				&& Objects.equals(this.openSecuritiesAccount, applicationDetail.openSecuritiesAccount)
				&& Objects.equals(this.openLDAccount, applicationDetail.openLDAccount)
				&& Objects.equals(this.tradingConsentAgree, applicationDetail.tradingConsentAgree)
				&& Objects.equals(this.dkDeclaration1, applicationDetail.dkDeclaration1)
				&& Objects.equals(this.dkDeclaration2, applicationDetail.dkDeclaration2);
		
	}

	@Override
	public int hashCode() {
		return Objects.hash(channel, accountPurpose, productType, accountType, nationality, multipleNationalities, residentialAddress,
				homeNumber, correspondenceAddressRequired, correspondenceAddress, statementType, employmentStatus, occupation,
				industryDescription, usCitizen, taxResidenceCountry, taxIdNumber, taxResidenceOutsideHK, marketingStatementNotRequired,
				marketingDirectMailNotRequired, marketingPhoneCallNotRequired, marketingMobileMessageNotRequired, marketingEmailNotRequired,
				marketingOthersNotRequired, productSpecificInformation, promotionCode, accountTypeEn, accountTypeTc, accountTypeSc,
				taxResidenceHK, openSecuritiesAccount, openLDAccount, tradingConsentAgree, dkDeclaration1, dkDeclaration2);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ApplicationDetail {\n");

		sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
		sb.append("    accountPurpose: ").append(toIndentedString(accountPurpose)).append("\n");
		sb.append("    productType: ").append(toIndentedString(productType)).append("\n");
		sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
		sb.append("    accountTypeEn: ").append(toIndentedString(accountTypeEn)).append("\n");
		sb.append("    accountTypeTc: ").append(toIndentedString(accountTypeTc)).append("\n");
		sb.append("    accountTypeSc: ").append(toIndentedString(accountTypeSc)).append("\n");
		sb.append("    nationality: ").append(toIndentedString(nationality)).append("\n");
		sb.append("    multipleNationalities: ").append(toIndentedString(multipleNationalities)).append("\n");
		sb.append("    residentialAddress: ").append(toIndentedString(residentialAddress)).append("\n");
		sb.append("    homeNumber: ").append(toIndentedString(homeNumber)).append("\n");
		sb.append("    correspondenceAddressRequired: ").append(toIndentedString(correspondenceAddressRequired)).append("\n");
		sb.append("    correspondenceAddress: ").append(toIndentedString(correspondenceAddress)).append("\n");
		sb.append("    statementType: ").append(toIndentedString(statementType)).append("\n");
		sb.append("    employmentStatus: ").append(toIndentedString(employmentStatus)).append("\n");
		sb.append("    occupation: ").append(toIndentedString(occupation)).append("\n");
		sb.append("    industryDescription: ").append(toIndentedString(industryDescription)).append("\n");
		sb.append("    usCitizen: ").append(toIndentedString(usCitizen)).append("\n");
		sb.append("    taxResidenceCountry: ").append(toIndentedString(taxResidenceCountry)).append("\n");
		sb.append("    taxIdNumber: ").append(toIndentedString(taxIdNumber)).append("\n");
		sb.append("    taxResidenceOutsideHK: ").append(toIndentedString(taxResidenceOutsideHK)).append("\n");
		sb.append("    marketingStatementNotRequired: ").append(toIndentedString(marketingStatementNotRequired)).append("\n");
		sb.append("    marketingDirectMailNotRequired: ").append(toIndentedString(marketingDirectMailNotRequired)).append("\n");
		sb.append("    marketingPhoneCallNotRequired: ").append(toIndentedString(marketingPhoneCallNotRequired)).append("\n");
		sb.append("    marketingMobileMessageNotRequired: ").append(toIndentedString(marketingMobileMessageNotRequired)).append("\n");
		sb.append("    marketingEmailNotRequired: ").append(toIndentedString(marketingEmailNotRequired)).append("\n");
		sb.append("    marketingOthersNotRequired: ").append(toIndentedString(marketingOthersNotRequired)).append("\n");
		sb.append("    productSpecificInformation: ").append(toIndentedString(productSpecificInformation)).append("\n");
		sb.append("    promotionCode: ").append(toIndentedString(promotionCode)).append("\n");
		sb.append("    openSecuritiesAccount: ").append(toIndentedString(openSecuritiesAccount)).append("\n");
		sb.append("    openLDAccount: ").append(toIndentedString(openLDAccount)).append("\n");
		sb.append("    tradingConsentAgree: ").append(toIndentedString(tradingConsentAgree)).append("\n");
		sb.append("    dkDeclaration1: ").append(toIndentedString(dkDeclaration1)).append("\n");
		sb.append("    dkDeclaration2: ").append(toIndentedString(dkDeclaration2)).append("\n");
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
