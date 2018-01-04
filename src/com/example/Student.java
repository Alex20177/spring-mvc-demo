package com.example;

import java.util.LinkedHashMap;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;


public class Student {

	private String firstName;
	
	@NotNull(message="Is required")
	@Size(min=1,message="Is required")
	private String lastName;
	
	private String country;
	private LinkedHashMap<String, String> countryOptions;
	private String language;
	private String operatingSystem[];
	
	@Min(value=0,message="The value must be greater or equal to zero")
	@Max(value=10,message="The value must be less or equal to ten")
	private int subjects;
	
	@Pattern(regexp="^[a-zA-Z0-9]{5}",message="only 5 characteres/digits")
	private String postalCode;
	
	public Student() {
		countryOptions=new LinkedHashMap<>();
		countryOptions.put("BRA", "Brazil");
		countryOptions.put("FRA", "Francia");
		countryOptions.put("MEX", "Mexico");
		countryOptions.put("IND", "India");
	}//Close basic constructor

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

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String[] getOperatingSystem() {
		return operatingSystem;
	}

	public void setOperatingSystem(String[] operatingSystem) {
		this.operatingSystem = operatingSystem;
	}

	public int getSubjects() {
		return subjects;
	}

	public void setSubjects(int subjects) {
		this.subjects = subjects;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	 
}//Close Student class.
