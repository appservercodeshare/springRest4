package com.spring4.rest.controllers.beans;

import java.util.Date;
import java.util.Set;

public class Project {

	private String projectTitle;
	private Set<String> technologies;
	private Integer teamStrength;
	private Date startDate;
	private Date endDate;
	private String clientName;

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
		return "Project [projectTitle=" + projectTitle + ", technologies=" + technologies + ", teamStrength="
				+ teamStrength + ", startDate=" + startDate + ", endDate=" + endDate + ", clientName=" + clientName
				+ "]";
	}

}
