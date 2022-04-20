/**
 * 
 */
package library.content;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

/**
 * @author SteveBrown
 * @version 1.0
 *  Initial
 * @version 1.1
 * 	
 * @since 1.0
 *
 */
@XmlRootElement(name="Optional", namespace = "Employee")
@XmlAccessorType(XmlAccessType.FIELD)
public class EmployeeOptionalData  {	
	@XmlElement(name="Title",namespace="EmpOptType")
	private String title;
	@XmlElement(name="Street",namespace="EmpOptType")
	private String street;
	@XmlElement(name="PostCode",namespace="EmpOptType")
	private String postCode;
	@XmlElement(name="Bank",namespace="EmpOptType")
	private String bank;
	@XmlElement(name="IBAN",namespace="EmpOptType")
	private String ibanNumber;
	@XmlElement(name="EmailAddress",namespace="EmpOptType")
	private String emailAddress;
	@XmlElement(name="MobileNumber",namespace="EmpOptType")
	private String mobileNumber;
	@XmlElement(name="TaxStatus",namespace="EmpOptType")
	private String taxStatus;	
	@XmlElement(name="ContractType",namespace="EmpOptType")
	private String contractType;	
	@XmlElement(name="Company",namespace="EmpOptType")
	private String company;
	@XmlElement(name="Department",namespace="EmpOptType")
	private String department;
	@XmlElement(name="Schedule",namespace="EmpOptType")
	private String schedule;
	@XmlElement(name="EmploymentType",namespace="EmpOptType")
	private String employmentType;
	@XmlElement(name="EmploymentTitle",namespace="EmpOptType")
	private String employeeTitle;	
	@XmlElement(name="IsSpecialPartTimer",namespace="EmpOptType")
	private boolean isSpecialPartTimer;
	@XmlElement(name="Grade",namespace="EmpOptType")
	private String grade;	
	@XmlElement(name="CostCenter",namespace="EmpOptType")
	private String costCentre;

	public String getStreet() {		
		return street;
	}	
	public void setStreet(String street) {
		this.street = street;	
	}
	
	public String getPostCode() {
		return postCode;
	}	
	public void setPostCode(String postCode) {
		this.postCode = postCode;	
	}
	
	public String getBank() {
		return bank;
	}	
	public void setBank(String bank) {
		this.bank = bank;	
	}
	
	public String getIbanNumber() {
		return ibanNumber;
	}	
	public void setIbanNumber(String ibanNumber) {
		this.ibanNumber = ibanNumber;	
	}
	
	public String getEmailAddress() {
		return emailAddress;
	}	
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;	
	}
		
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;		
	}
	
	public String getTaxStatus() {
		return taxStatus;
	}
	public void setTaxStatus(String taxStatus) {
		this.taxStatus = taxStatus;		
	}
	
	public String getContractType() {
		return contractType;
	}
	public void setContractType(String contractType) {
		this.contractType = contractType;
	}
	
	public String getCompany() {
		return company;
	}	
	public void setCompany(String company) {
		this.company = company;
	}
	
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	public String getSchedule() {
		return schedule;
	}	
	public void setSchedule(String schedule) {
		this.schedule = schedule;		
	}
	
	public String getEmploymentType() {
		return employmentType;
	}	
	public void setEmploymentType(String employmentType) {
		this.employmentType = employmentType;	
	}	
	public boolean isSpecialPartTimer() {
		return isSpecialPartTimer;
	}
	
	public void setSpecialPartTimer(boolean isSpecialPartTimer) {
		this.isSpecialPartTimer = isSpecialPartTimer;	
	}
	
	public String getGrade() {
		return grade;
	}	
	public void setGrade(String grade) {
		this.grade = grade;		
	}
	
	public String getCostCentre() {
		return costCentre;
	}	
	public void setCostCentre(String costCentre) {
		this.costCentre = costCentre;		
	}
	
//	public List<Allowance> getTaxablePermanentAllowances() {
//		return taxablePermanentAllowances;
//	}	
//	public void setTaxablePermanentAllowances(List<Allowance> taxablePermanentAllowances) {
//		this.taxablePermanentAllowances = taxablePermanentAllowances;		
//	}
	
//	public List<Allowance> getNonTaxablePermanentAllowances() {
//		return nonTaxablePermanentAllowances;
//	}	
//	public void setNonTaxablePermanentAllowances(List<Allowance> nonTaxablePermanentAllowances) {
//		this.nonTaxablePermanentAllowances = nonTaxablePermanentAllowances;	
//	}
	
	public void setEmployeeTitle(String employeeTitle) {
		this.employeeTitle = employeeTitle;		
	}	
	public String getEmployeeTitle() {
		return employeeTitle;
	}
	
}