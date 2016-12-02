package com.spring4.rest.controllers.beans;

import java.util.Date;
import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "projects")
public class Project {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "project_id")
	private Integer projectId;

	@Column(name = "proj_title")
	private String projectTitle;

	@ElementCollection(targetClass = java.lang.String.class)
	@CollectionTable(name = "technologies", joinColumns = { @JoinColumn(name = "project_id")})
	@Column(name = "technology")
	private Set<String> technologies;
	
	@Column(name = "team_size")
	private Integer teamStrength;
	
	@Column(name = "start_date")
	private Date startDate;
	
	@Column(name = "end_date")
	private Date endDate;
	
	@Column(name = "client_name")
	private String clientName;

	public Integer getProjectId() {
		return projectId;
	}

	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}

	public String getProjectTitle() {
		return projectTitle;
	}

	public void setProjectTitle(String projectTitle) {
		this.projectTitle = projectTitle;
	}

	public Set<String> getTechnologies() {
		return technologies;
	}

	public void setTechnologies(Set<String> technologies) {
		this.technologies = technologies;
	}

	public Integer getTeamStrength() {
		return teamStrength;
	}

	public void setTeamStrength(Integer teamStrength) {
		this.teamStrength = teamStrength;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	@Override
	public String toString() {
		return "Project [projectId=" + projectId + ", projectTitle=" + projectTitle + ", technologies=" + technologies
				+ ", teamStrength=" + teamStrength + ", startDate=" + startDate + ", endDate=" + endDate
				+ ", clientName=" + clientName + "]";
	}

}
