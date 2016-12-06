package com.spring4.rest.controllers.beans;

import java.util.Map;

public class Foo {

	private String name;
	private Map<String, String> contacts;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Map<String, String> getContacts() {
		return contacts;
	}

	public void setContacts(Map<String, String> contacts) {
		this.contacts = contacts;
	}

	@Override
	public String toString() {
		return "Foo [name=" + name + ", contacts=" + contacts + "]";
	}

}
