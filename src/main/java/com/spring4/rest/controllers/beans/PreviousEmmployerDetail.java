package com.spring4.rest.controllers.beans;

import java.util.Date;
import java.util.Map;
import java.util.Set;

public class PreviousEmmployerDetail {

	private String companyName;
	private String address;
	private Map<String, String> contacts;
	private String description;
	private Date joiningDate;
	private Date releasingDate;
	private Role jobRole;
	private double highestAnnualPkg;
	private double highestSalary;
	private Set<Project> projects;

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Map<String, String> getContacts() {
		return contacts;
	}

	public void setContacts(Map<String, String> contacts) {
		this.contacts = contacts;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
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

	public Role getJobRole() {
		return jobRole;
	}

	public void setJobRole(Role jobRole) {
		this.jobRole = jobRole;
	}

	public double getHighestAnnualPkg() {
		return highestAnnualPkg;
	}

	public void setHighestAnnualPkg(double highestAnnualPkg) {
		this.highestAnnualPkg = highestAnnualPkg;
	}

	public double getHighestSalary() {
		return highestSalary;
	}

	public void setHighestSalary(double highestSalary) {
		this.highestSalary = highestSalary;
	}

	public Set<Project> getProjects() {
		return projects;
	}

	public void setProjects(Set<Project> projects) {
		this.projects = projects;
	}

	@Override
	public String toString() {
		return "PreviousEmmployerDetail [companyName=" + companyName + ", address=" + address + ", contacts=" + contacts
				+ ", description=" + description + ", joiningDate=" + joiningDate + ", releasingDate=" + releasingDate
				+ ", jobRole=" + jobRole + ", highestAnnualPkg=" + highestAnnualPkg + ", highestSalary=" + highestSalary
				+ ", projects=" + projects + "]";
	}

}
