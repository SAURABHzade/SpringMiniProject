package com.nt.service;

import com.nt.bo.CoronaPatientBO;
import com.nt.dao.CoronaPatientDAO;
import com.nt.dao.CoronaPatientDAOImpl;
import com.nt.dto.CoronaPatientDTO;

public class CoronaPatientServiceImpl implements CoronaPatientService {
 
private CoronaPatientDAO  dao;
	public CoronaPatientServiceImpl(CoronaPatientDAO dao) {
	
	this.dao = dao;
}
	@Override
	public String register(CoronaPatientDTO dto) throws Exception {
        
		float billAmt=0.0f;
		int count=0;
		CoronaPatientBO bo=null;
		CoronaPatientDAO dao=null;
		billAmt=dto.getPdays()*dto.getPcharge();
		
		 bo=new CoronaPatientBO();
		bo.setBillAmt(billAmt);
		
       count=dao.insert(bo);
		//use ternary operator 
    	String s=(count>0)?"Corona Patient Bill Amount Successfully Submitted":"Corona Patient bill Amount not Done";
   return s;
		
	}

}
