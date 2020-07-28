package com.nt.vo;

import java.io.Serializable;

public class CoronaPatientVO implements Serializable {
private String pname;
private String padd;
private String pdays;
private String pcharge;
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}
public String getPadd() {
	return padd;
}
public void setPadd(String padd) {
	this.padd = padd;
}
public String getPdays() {
	return pdays;
}
public void setPdays(String pdays) {
	this.pdays = pdays;
}
public String getPcharge() {
	return pcharge;
}
public void setPcharge(String pcharge) {
	this.pcharge = pcharge;
}
	
}
