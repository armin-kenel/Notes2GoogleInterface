package ch.secona.notes2google;

public class InterfacePerson {
	String uid = "";
	String firstName = "";
	String middleName = "";
	String lastName = "";
	String phoneBusiness = "";
	String phoneBusinessDirect = "";
	String phoneBusiness2 = "";
	String mobileBusiness = "";
	String mobileBusiness2 = "";
	String mobilePrivate = "";
	String mobilePrivate2 = "";
	String phonePrivate = "";
	String faxPrivate = "";
	String faxBusiness = "";
	String emergencyNumber = "";
	String companyName = "";
	String jobTitle = "";
	String eMailBusiness = "";
	String eMailBusiness2 = "";
	String eMailPrivate = "";
	String eMailPrivate2 = "";
	String modified = "";
	String categories = "";

	public String getUid() {
		return uid;
	}

	public void setUid(final String uid) {
		this.uid = uid;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(final String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(final String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(final String lastName) {
		this.lastName = lastName;
	}

	public String getPhoneBusiness() {
		return phoneBusiness;
	}

	public void setPhoneBusiness(final String phoneBusiness) {
		this.phoneBusiness = phoneBusiness;
	}

	public String getPhoneBusinessDirect() {
		return phoneBusinessDirect;
	}

	public void setPhoneBusinessDirect(final String phoneBusinessDirect) {
		this.phoneBusinessDirect = phoneBusinessDirect;
	}

	public String getPhoneBusiness2() {
		return phoneBusiness2;
	}

	public void setPhoneBusiness2(final String phoneBusiness2) {
		this.phoneBusiness2 = phoneBusiness2;
	}

	public String getMobileBusiness() {
		return mobileBusiness;
	}

	public void setMobileBusiness(final String mobileBusiness) {
		this.mobileBusiness = mobileBusiness;
	}

	public String getMobileBusiness2() {
		return mobileBusiness2;
	}

	public void setMobileBusiness2(final String mobileBusiness2) {
		this.mobileBusiness2 = mobileBusiness2;
	}

	public String getMobilePrivate() {
		return mobilePrivate;
	}

	public void setMobilePrivate(final String mobilePrivate) {
		this.mobilePrivate = mobilePrivate;
	}

	public String getMobilePrivate2() {
		return mobilePrivate2;
	}

	public void setMobilePrivate2(final String mobilePrivate2) {
		this.mobilePrivate2 = mobilePrivate2;
	}

	public String getPhonePrivate() {
		return phonePrivate;
	}

	public void setPhonePrivate(final String phonePrivate) {
		this.phonePrivate = phonePrivate;
	}

	public String getFaxPrivate() {
		return faxPrivate;
	}

	public void setFaxPrivate(final String faxPrivate) {
		this.faxPrivate = faxPrivate;
	}

	public String getFaxBusiness() {
		return faxBusiness;
	}

	public void setFaxBusiness(final String faxBusiness) {
		this.faxBusiness = faxBusiness;
	}

	public String getEmergencyNumber() {
		return emergencyNumber;
	}

	public void setEmergencyNumber(final String emergencyNumber) {
		this.emergencyNumber = emergencyNumber;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(final String companyName) {
		this.companyName = companyName;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(final String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String geteMailBusiness() {
		return eMailBusiness;
	}

	public void seteMailBusiness(final String eMailBusiness) {
		this.eMailBusiness = eMailBusiness;
	}

	public String geteMailBusiness2() {
		return eMailBusiness2;
	}

	public void seteMailBusiness2(final String eMailBusiness2) {
		this.eMailBusiness2 = eMailBusiness2;
	}

	public String geteMailPrivate() {
		return eMailPrivate;
	}

	public void seteMailPrivate(final String eMailPrivate) {
		this.eMailPrivate = eMailPrivate;
	}

	public String geteMailPrivate2() {
		return eMailPrivate2;
	}

	public void seteMailPrivate2(final String eMailPrivate2) {
		this.eMailPrivate2 = eMailPrivate2;
	}

	public String getModified() {
		return modified;
	}

	public void setModified(final String modified) {
		this.modified = modified;
	}

	public String getCategories() {
		return categories;
	}

	public void setCategories(final String categories) {
		this.categories = categories;
	}

	@Override
	public String toString() {
		return "InterfacePerson [uid=" + uid + ", firstName=" + firstName + ", middleName=" + middleName + ", lastName="
				+ lastName + ", phoneBusiness=" + phoneBusiness + ", phoneBusinessDirect=" + phoneBusinessDirect
				+ ", phoneBusiness2=" + phoneBusiness2 + ", mobileBusiness=" + mobileBusiness + ", mobileBusiness2="
				+ mobileBusiness2 + ", mobilePrivate=" + mobilePrivate + ", mobilePrivate2=" + mobilePrivate2
				+ ", phonePrivate=" + phonePrivate + ", faxPrivate=" + faxPrivate + ", faxBusiness=" + faxBusiness
				+ ", emergencyNumber=" + emergencyNumber + ", companyName=" + companyName + ", jobTitle=" + jobTitle
				+ ", eMailBusiness=" + eMailBusiness + ", eMailBusiness2=" + eMailBusiness2 + ", eMailPrivate="
				+ eMailPrivate + ", eMailPrivate2=" + eMailPrivate2 + ", modified=" + modified + ", categories="
				+ categories + "]";
	}
}