package com.spring4.rest.controllers.beans;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Role {

	@Column(name ="r_nm")
	private String roleName;
	
	@Column(name ="respo")
	private String responsiblities;

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getResponsiblities() {
		return responsiblities;
	}

	public void setResponsiblities(String responsiblities) {
		this.responsiblities = responsiblities;
	}

	@Override
	public String toString() {
		return "Role [roleName=" + roleName + ", responsiblities=" + responsiblities + "]";
	}

}
