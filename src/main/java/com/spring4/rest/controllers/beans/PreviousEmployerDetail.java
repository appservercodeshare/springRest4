package com.spring4.rest.controllers.beans;

import java.util.Date;
import java.util.Map;
import java.util.Set;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapKeyColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "prev_emp_details")
public class PreviousEmployerDetail {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "prev_emplr_id")
	private Integer prevEmployerDetailId;

	@Column(name = "comp_nm")
	private String companyName;

	@Embedded
	@AttributeOverrides({ @AttributeOverride(name = "landMark", column = @Column(name = "land_mark")) })
	private EmployerAddress employerAddress;

	@ElementCollection(fetch = FetchType.EAGER)
	@CollectionTable(name = "emplr_contacts", joinColumns = { @JoinColumn(name = "prev_emp_details") })
	@MapKeyColumn(name = "contact_type")
	@Column(name = "contact")
	private Map<String, String> contacts;

	@Column(name = "description")
	private String description;

	@Column(name = "joiningDate")
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date joiningDate;

	@Column(name = "releasingDate")
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date releasingDate;

	@Embedded
	@AttributeOverrides({ @AttributeOverride(name = "roleName", column = @Column(name = "role_name")),
			@AttributeOverride(name = "responsiblities", column = @Column(name = "responsiblity")) })
	private Role jobRole;

	@Column(name = "max_annual_pkg")
	private double highestAnnualPkg;

	@Column(name = "max_salary")
	private double highestSalary;

	@OneToMany(fetch = FetchType.EAGER)
	@Cascade({CascadeType.SAVE_UPDATE, CascadeType.DELETE})
	@JoinColumn(name = "prev_emp_details")
	private Set<Project> projects;

	public Integer getPrevEmployerDetailId() {
		return prevEmployerDetailId;
	}

	public void setPrevEmployerDetailId(Integer prevEmployerDetailId) {
		this.prevEmployerDetailId = prevEmployerDetailId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public EmployerAddress getEmployerAddress() {
		return employerAddress;
	}

	public void setEmployerAddress(EmployerAddress employerAddress) {
		this.employerAddress = employerAddress;
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
		return "PreviousEmployerDetail [prevEmployerDetailId=" + prevEmployerDetailId + ", companyName=" + companyName
				+ ", employerAddress=" + employerAddress + ", contacts=" + contacts + ", description=" + description
				+ ", joiningDate=" + joiningDate + ", releasingDate=" + releasingDate + ", jobRole=" + jobRole
				+ ", highestAnnualPkg=" + highestAnnualPkg + ", highestSalary=" + highestSalary + ", projects="
				+ projects + "]";
	}

}
