package com.project.employee;

import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;

public class SalaryDA extends MySqlConnection{

	String salarybyid="select * from salary where employeeId=?";
	String allSalary="select * from salary";
	String salaryinput="insert into salary(basic,house,communication,transport,medical,employeeId) values(?,?,?,?,?,?);";
//	String employeeSalary="update attendance set status=? where employeeId=? and date=?;";
	
	public void insertSalary(Salary s) {
		try {
//			
			con=DriverManager.getConnection(url,user,pass);
			ps=con.prepareStatement(salaryinput);
			ps.setDouble(1, s.getBasic());
			ps.setInt(2, s.getHouse());
			ps.setInt(3, s.getCommunication());
			ps.setInt(4, s.getTransport());
			ps.setInt(5, s.getMedical());
			ps.setInt(6, s.getEmployeeId());
			ps.executeUpdate();
			
			
		}catch(Exception e) {
			System.out.println(e);
//			
		}
	}
	
	//------------------------------All Salary---------------------------------------------------
	
	List<Salary> salary=new ArrayList<>();
	
	public List<Salary> employeeSalary(){
		try {
			con=DriverManager.getConnection(url,user,pass);
			ps=con.prepareStatement(allSalary);
			rs=ps.executeQuery();
			while (rs.next()) {
				salary.add(new Salary(rs.getInt(1),rs.getDouble(2),rs.getInt(3),rs.getInt(4),rs.getInt(5),rs.getInt(6),rs.getInt(7)));
				
			}
			
		}catch(Exception e) {
			System.out.println(e);
		}
		
		return salary;
	}
	
	//------------------------------Salary By ID------------------------------------------------
	public Salary personSalary=new Salary();
	public Salary salaryById(int employeeId) {
		personSalary=null;
		try {
			con=DriverManager.getConnection(url,user,pass);
			ps=con.prepareStatement(salarybyid);
			ps.setInt(1, employeeId);
			rs=ps.executeQuery();
			while (rs.next()) {
				salary.add(new Salary(rs.getInt(1),rs.getDouble(2),rs.getInt(3),rs.getInt(4),rs.getInt(5),rs.getInt(6),rs.getInt(7)));
				
			}
		}catch(Exception e) {
			System.out.println(e);
		}
		
		return personSalary;
	}
}
