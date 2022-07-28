package com.lti.beans;

public class Admin {
	
	private int adminId;
	private String adminFirstName;
	private String adminLastName;
	private String adminEmail;
	private long adminPhoneNumber;
	private String adminPassword;
	

	public Admin(int adminId, String adminFirstName, String adminLastName, String adminEmail, long adminPhoneNumber,
			String adminPassword) {
		super();
		this.adminId = adminId;
		this.adminFirstName = adminFirstName;
		this.adminLastName = adminLastName;
		this.adminEmail = adminEmail;
		this.adminPhoneNumber = adminPhoneNumber;
		this.adminPassword = adminPassword;
	}

	public Admin() {
		super();
	}

	public int getAdminId() {
		return adminId;
	}

	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}

	public String getAdminFirstName() {
		return adminFirstName;
	}

	public void setAdminFirstName(String adminFirstName) {
		this.adminFirstName = adminFirstName;
	}

	public String getAdminLastName() {
		return adminLastName;
	}

	public void setAdminLastName(String adminLastName) {
		this.adminLastName = adminLastName;
	}

	public String getAdminEmail() {
		return adminEmail;
	}

	public void setAdminEmail(String adminEmail) {
		this.adminEmail = adminEmail;
	}

	public long getAdminPhoneNumber() {
		return adminPhoneNumber;
	}

	public void setAdminPhoneNumber(long adminPhoneNumber) {
		this.adminPhoneNumber = adminPhoneNumber;
	}

	public String getAdminPassword() {
		return adminPassword;
	}

	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}

	@Override
	public String toString() {
		return "Admin [adminId=" + adminId + ", adminFirstName=" + adminFirstName + ", adminLastName=" + adminLastName
				+ ", adminEmail=" + adminEmail + ", adminPhoneNumber=" + adminPhoneNumber + ", adminPassword="
				+ adminPassword + "]";
	}

}
