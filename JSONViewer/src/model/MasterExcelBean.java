package model;

import java.io.Serializable;

public class MasterExcelBean implements Serializable {

	private static final long serialVersionUID = 2901288489835206819L;

	private String referenceID;       // applicationReference
	private String idvResult;
	private String customerName;      // English Name
	private String hkid;              // HKID
	private String mobilePhone;       // mobileNumber
	private String emailAddress;      // emailAddress
	private String referralCode;      // promotionCode
	private String language;          // Language
	private String newArrivalDateTime;// Submission Date (YYYY-MM-DD hh:mi:ss)
	private String batch;             // Export Date (YYYY-MM-DD hh:mi:ss)
	private String completedDate;
	private String status;
	private String rejectReason;
	private String runTime;

	private String accountNo;
	private String isMao;
	private String openDateMao;
	private String isSecuritiesAC;
	private String openDateSecuritiesAC;
	private String isLinkedDepositAC;
	private String openDateLinkedDepositAC;
	private String loginAccountType;

	private String productType;
	private String parsedProductType;
	private String dkVideo;
	private String useOfDepositInfo;
	
	private String referrerCode;
	private String applicationStatus;

	public String getReferenceID() {
		return referenceID;
	}

	public void setReferenceID(String referenceID) {
		this.referenceID = referenceID;
	}

	public String getIdvResult() {
		return idvResult;
	}

	public void setIdvResult(String idvResult) {
		this.idvResult = idvResult;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getHkid() {
		return hkid;
	}

	public void setHkid(String hkid) {
		this.hkid = hkid;
	}

	public String getMobilePhone() {
		return mobilePhone;
	}

	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getReferralCode() {
		return referralCode;
	}

	public void setReferralCode(String referralCode) {
		this.referralCode = referralCode;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getNewArrivalDateTime() {
		return newArrivalDateTime;
	}

	public void setNewArrivalDateTime(String newArrivalDateTime) {
		this.newArrivalDateTime = newArrivalDateTime;
	}

	public String getBatch() {
		return batch;
	}

	public void setBatch(String batch) {
		this.batch = batch;
	}

	public String getCompletedDate() {
		return completedDate;
	}

	public void setCompletedDate(String completedDate) {
		this.completedDate = completedDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getRejectReason() {
		return rejectReason;
	}

	public void setRejectReason(String rejectReason) {
		this.rejectReason = rejectReason;
	}

	public String getRunTime() {
		return runTime;
	}

	public void setRunTime(String runTime) {
		this.runTime = runTime;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getIsMao() {
		return isMao;
	}

	public void setIsMao(String isMao) {
		this.isMao = isMao;
	}

	public String getOpenDateMao() {
		return openDateMao;
	}

	public void setOpenDateMao(String openDateMao) {
		this.openDateMao = openDateMao;
	}

	public String getIsSecuritiesAC() {
		return isSecuritiesAC;
	}

	public void setIsSecuritiesAC(String isSecuritiesAC) {
		this.isSecuritiesAC = isSecuritiesAC;
	}

	public String getOpenDateSecuritiesAC() {
		return openDateSecuritiesAC;
	}

	public void setOpenDateSecuritiesAC(String openDateSecuritiesAC) {
		this.openDateSecuritiesAC = openDateSecuritiesAC;
	}

	public String getIsLinkedDepositAC() {
		return isLinkedDepositAC;
	}

	public void setIsLinkedDepositAC(String isLinkedDepositAC) {
		this.isLinkedDepositAC = isLinkedDepositAC;
	}

	public String getOpenDateLinkedDepositAC() {
		return openDateLinkedDepositAC;
	}

	public void setOpenDateLinkedDepositAC(String openDateLinkedDepositAC) {
		this.openDateLinkedDepositAC = openDateLinkedDepositAC;
	}

	public String getLoginAccountType() {
		return loginAccountType;
	}

	public void setLoginAccountType(String loginAccountType) {
		this.loginAccountType = loginAccountType;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getParsedProductType() {
		return parsedProductType;
	}

	public void setParsedProductType(String parsedProductType) {
		this.parsedProductType = parsedProductType;
	}

	public String getDkVideo() {
		return dkVideo;
	}

	public void setDkVideo(String dkVideo) {
		this.dkVideo = dkVideo;
	}

	public String getUseOfDepositInfo() {
		return useOfDepositInfo;
	}

	public void setUseOfDepositInfo(String useOfDepositInfo) {
		this.useOfDepositInfo = useOfDepositInfo;
	}
	
	public String getReferrerCode() {
		return referrerCode;
	}

	public void setReferrerCode(String referrerCode) {
		this.referrerCode = referrerCode;
	}

	@Override
	public String toString() {
		return "MasterExcelBean [referenceID=" + referenceID + ", idvResult=" + idvResult + ", customerName=" + customerName + ", hkid="
				+ hkid + ", mobilePhone=" + mobilePhone + ", emailAddress=" + emailAddress + ", referralCode=" + referralCode
				+ ", language=" + language + ", newArrivalDateTime=" + newArrivalDateTime + ", batch=" + batch + ", completedDate="
				+ completedDate + ", status=" + status + ", rejectReason=" + rejectReason + ", runTime=" + runTime + ", accountNo="
				+ accountNo + ", isMao=" + isMao + ", openDateMao=" + openDateMao + ", isSecuritiesAC=" + isSecuritiesAC
				+ ", openDateSecuritiesAC=" + openDateSecuritiesAC + ", isLinkedDepositAC=" + isLinkedDepositAC
				+ ", openDateLinkedDepositAC=" + openDateLinkedDepositAC + ", loginAccountType=" + loginAccountType + ", productType="
				+ productType + ", parsedProductType=" + parsedProductType + ", dkVideo=" + dkVideo + ", useOfDepositInfo="
				+ useOfDepositInfo + ", referrerCode=" + referrerCode + "]";
	}

}
