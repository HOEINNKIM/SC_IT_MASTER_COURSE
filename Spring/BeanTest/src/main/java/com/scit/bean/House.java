package com.scit.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class House {

	@Autowired
	private Person person3;
	private String etc;

	public House() {}
	public House(Person person, String etc) {
		this.person3 = person;
		this.etc = etc;
	}
	public Person getPerson() {
		return person3;
	}
	public void setPerson(Person person) {
		this.person3 = person;
	}
	public String getEtc() {
		return etc;
	}
	public void setEtc(String etc) {
		this.etc = etc;
	}
	@Override
	public String toString() {
		return "House [person=" + person3 + ", etc=" + etc + "]";
	}
}