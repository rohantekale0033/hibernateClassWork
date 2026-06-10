package com.practice.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="student_data")
public class Student {
  @Id
  private int id;
  private String fname;
  private String lname;
  private String city;
  @Column(name="contact")
  private long mobileno;
  
  
  public int getId() {
	return id;
  }
  public void setId(int id) {
	this.id = id;
  }
  public String getFname() {
	return fname;
  }
  public void setFname(String fname) {
	this.fname = fname;
  }
  public String getLname() {
	return lname;
  }
  public void setLname(String lname) {
	this.lname = lname;
  }
  public String getCity() {
	return city;
  }
  public void setCity(String city) {
	this.city = city;
  }
  public long getMobileno() {
	return mobileno;
  }
  public void setMobileno(long mobileno) {
	this.mobileno = mobileno;
  }
  
}
