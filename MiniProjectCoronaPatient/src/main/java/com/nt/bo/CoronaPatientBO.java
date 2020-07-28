package com.nt.bo;

import java.io.Serializable;

public class CoronaPatientBO implements Serializable {

	private String pname;
	private String padd;
	private int pdays;
	private float billAmt;
	
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
	public float getBillAmt() {
		return billAmt;
	}
	public void setBillAmt(float billAmt) {
		this.billAmt = billAmt;
	}
	
}
