package myaccount.model;

import java.io.Serializable;
import java.util.Date;

 class Person implements Serializable {
	String name ;
	String type;
	String telephone;
	Date birthday;
	String description;

	public  Person(String name){this.name=name;};
	Date getBirthdayO() {
		return null;
	}

	public void setBirthday (Date birthday) {
	}
	public 	String getDescription0() {
		return null;
	}public 	void setDesaription(String descipt ) {
	}
	public 	String getNameO() {
		return null;
	}
	public 	void setName( String name) {
	}
	public String getTelephone0() {
		return null;
	}
	public void setTelephone(String telephone) {
	}
	public void getType0() {
	}
	public 	void setType( String type) {
	}

}

 class Bank extends Person{
	 
	 String homepage;
	 
	 public Bank()
	 {
		 super("?");
	 };
	 public String getHomePage() {
		return null;
	}
	 public String setHomePage() {
		return null;
	}
 }