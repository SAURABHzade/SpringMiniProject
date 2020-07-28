package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import com.nt.bo.CoronaPatientBO;

public class CoronaPatientDAOImpl implements CoronaPatientDAO {
	private  static final  String   Corona="INSERT INTO CORONADETAIL VALUES(?,?,?,?)";
      private DataSource ds;	
	public CoronaPatientDAOImpl(DataSource ds) {
		this.ds = ds;
	}
	@Override
	public int insert(CoronaPatientBO bo) throws Exception {
		Connection con=null;
		PreparedStatement ps=null;
		int count=0;
		//get pooled jdbc connection
		con=ds.getConnection();
		//create PreparedStatement object
		ps=con.prepareStatement(Corona);
		//set values to query params
	ps.setString(1,bo.getPname());
	ps.setString(2,bo.getPadd());
	ps.setInt(3,bo.getPdays());
	ps.setFloat(4,bo.getBillAmt());
		//execute the SQL query
		count=ps.executeUpdate();
		//close jdbc objs
		ps.close();
		con.close();
		return count;
	}

}
