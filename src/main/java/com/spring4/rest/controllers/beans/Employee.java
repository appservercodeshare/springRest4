package com.spring4.rest.controllers.beans;

import java.util.Date;
import java.util.Map;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.spring4.rest.enums.EmployeeStatus;

@Entity
@Table(name = "Employee")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "emp_id")
	private Integer employeeId;

	@Column(name = "f_nm")
	private String firstName;

	@Column(name = "l_nm")
	private String lastName;

	@Column(name = "gender")
	private String gender;
	private Map<String, String> contacts;

	private String address;
	private Set<String> skills;

	@Column(name = "experience")
	private Integer experience;

	@Column(name = "annualPkg")
	private double annualPkg;

	@Column(name = "salary")
	private String salary;

	@Column(name = "joiningDate")
	private Date joiningDate;

	@Column(name = "releasingDate")
	private Date releasingDate;

	@Column(name = "employeeStatus")
	private EmployeeStatus employeeStatus;

	private Set<PreviousEmmployerDetail> previousEmmployerDetails;

	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Map<String, String> getContacts() {
		return contacts;
	}

	public void setContacts(Map<String, String> contacts) {
		this.contacts = contacts;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Set<String> getSkills() {
		return skills;
	}

	public void setSkills(Set<String> skills) {
		this.skills = skills;
	}

	public Integer getExperience() {
		return experience;
	}

	public void setExperience(Integer experience) {
		this.experience = experience;
	}

	public double getAnnualPkg() {
		return annualPkg;
	}

	public void setAnnualPkg(double annualPkg) {
		this.annualPkg = annualPkg;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public Date getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}

	public Date getReleasingDate() {
		return releasingDate;
	}

	public void setReleasingDate(Date releasingDate) {
		this.releasingDate = releasingDate;
	}

	public EmployeeStatus getEmployeeStatus() {
		return employeeStatus;
	}

	public void setEmployeeStatus(EmployeeStatus employeeStatus) {
		this.employeeStatus = employeeStatus;
	}

	public Set<PreviousEmmployerDetail> getPreviousEmmployerDetails() {
		return previousEmmployerDetails;
	}

	public void setPreviousEmmployerDetails(Set<PreviousEmmployerDetail> previousEmmployerDetails) {
		this.previousEmmployerDetails = previousEmmployerDetails;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", gender=" + gender + ", contacts=" + contacts + ", address=" + address + ", skills=" + skills
				+ ", experience=" + experience + ", annualPkg=" + annualPkg + ", salary=" + salary + ", joiningDate="
				+ joiningDate + ", releasingDate=" + releasingDate + ", employeeStatus=" + employeeStatus
				+ ", previousEmmployerDetails=" + previousEmmployerDetails + "]";
	}

}
