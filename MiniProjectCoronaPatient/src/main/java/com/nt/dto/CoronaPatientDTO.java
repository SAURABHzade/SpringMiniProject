package com.nt.dto;

import java.io.Serializable;

public class CoronaPatientDTO implements Serializable {
private String pname;
private String padd;
private int pdays;
private int pcharge;
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
public int getPdays() {
	return pdays;
}
public void setPdays(int pdays) {
	this.pdays = pdays;
}
public int getPcharge() {
	return pcharge;
}
public void setPcharge(int pcharge) {
	this.pcharge = pcharge;
}
}
