package com.nt.controller;

import com.nt.dto.CoronaPatientDTO;
import com.nt.service.CoronaPatientService;
import com.nt.vo.CoronaPatientVO;

public class CoronaController {

	private CoronaPatientService service;

	public CoronaController(CoronaPatientService service) {
		
		this.service = service;
	}
	public  String  coronaProcess(CoronaPatientVO  vo)throws Exception{
		CoronaPatientDTO dto=null;
		String result=null;
		//convert  VO class object to DTO class object
		dto=new CoronaPatientDTO();
		dto.setPname(vo.getPname());
		dto.setPadd(vo.getPadd());
		dto.setPdays(Integer.parseInt(vo.getPdays()));
		dto.setPcharge(Integer.parseInt(vo.getPcharge()));
		//use service
		result=service.register(dto);
		return result;
		
	}
	
	
}
