package com.spring4.rest.controllers.beans;

import java.util.Date;
import java.util.Map;
import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapKeyColumn;
import javax.persistence.OneToMany;
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
	
	@ElementCollection(targetClass = java.lang.String.class)
	@CollectionTable(name = "contacts", joinColumns = {@JoinColumn(name = "emp_id")})
	@MapKeyColumn(name = "contact_type")
	@Column(name = "contact")
	private Map<String, String> contacts;

	@ElementCollection
	@CollectionTable(name = "addresses", joinColumns = {@JoinColumn(name = "emp_id")})
	@MapKeyColumn(name = "address_type")
	@Column(name = "address")
	private Map<String, Address> addresses;
	
	
	@ElementCollection(targetClass = java.lang.String.class)
	@CollectionTable(name = "skills", joinColumns = {@JoinColumn(name = "emp_id")})
	@Column(name = "skill")
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

	@OneToMany
	@JoinColumn(name = "emp_id")
	private Set<PreviousEmployerDetail> previousEmployerDetails;

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

	public Map<String, Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(Map<String, Address> addresses) {
		this.addresses = addresses;
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

	public Set<PreviousEmployerDetail> getPreviousEmmployerDetails() {
		return previousEmployerDetails;
	}

	public void setPreviousEmmployerDetails(Set<PreviousEmployerDetail> previousEmployerDetails) {
		this.previousEmployerDetails = previousEmployerDetails;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", gender=" + gender + ", contacts=" + contacts + ", addresses=" + addresses + ", skills=" + skills
				+ ", experience=" + experience + ", annualPkg=" + annualPkg + ", salary=" + salary + ", joiningDate="
				+ joiningDate + ", releasingDate=" + releasingDate + ", employeeStatus=" + employeeStatus
				+ ", PreviousEmployerDetails=" + previousEmployerDetails + "]";
	}

}
