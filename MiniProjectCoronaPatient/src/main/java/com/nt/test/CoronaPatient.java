package com.nt.test;
import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.controller.CoronaController;
import com.nt.vo.CoronaPatientVO;
public class CoronaPatient {

	public static void main(String[] args) {
		Scanner sc = null;
		String pname = null, padd = null, pday = null, pcharge = null;
		CoronaPatientVO vo = null;
		DefaultListableBeanFactory factory = null;
		XmlBeanDefinitionReader reader = null;
		CoronaController controller = null;
		String result = null;
		// read inputs
		sc = new Scanner(System.in);
		System.out.println("enter CoronaPatientname :: ");
		pname = sc.next();
		System.out.println("Enter CoronaPatient Address ::");
		padd = sc.next();
		System.out.println("Enter Number of Day CoronaPatient Stay::");
		pday = sc.next();
		System.out.println("Enter CoronaPatient Per Day Charge");
		pcharge = sc.next();

		// Store inputs in VO class object
		vo = new CoronaPatientVO();
		vo.setPname(pname);
		vo.setPadd(padd);
		vo.setPdays(pday);
		vo.setPcharge(pcharge);
	
		// create BEanFacory IOC container
		factory = new DefaultListableBeanFactory();
		reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		// get Controller Bean class object..
		controller = factory.getBean("controller", CoronaController.class);
		// invoke the method
		try {
			result = controller.coronaProcess(vo);
			System.out.println(result);
		} catch (Exception e) {
			System.out.println("Internal Problem");
			e.printStackTrace();
		}

	}

}
