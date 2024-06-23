package com.project.employee;

import java.sql.Date;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;

public class AttendanceDA extends MySqlConnection{
	//==================================field name====================================
	String a01="a01";
	String a02="a02";
	String a03="a03";
	String a04="a04";
	String a05="a05";
	String a06="a06";
	String a07="a07";
	String a08="a08";
	String a09="a09";
	String a10="a10";
	String a11="a11";
	String a12="a12";
	String a13="a13";
	String a14="a14";
	String a15="a15";
	String a16="a16";
	String a17="a17";
	String a18="a18";
	String a19="a19";
	String a20="a20";
	String a21="a21";
	String a22="a22";
	String a23="a23";
	String a24="a24";
	String a25="a25";
	String a26="a26";
	String a27="a27";
	String a28="a28";
	String a29="a29";
	String a30="a30";
	String a31="a31";
//============================================field name end==================================
	
	
//	String insertAttendance="insert into attendance(employeeId,date,status) values(?,?,?);";
	
	String allAttendance = "select * from attendance where month=? and year=?";
	
	
	int check;
	public void attendance(String fild, String fieldValue, int id, String month, String year) {
		check=0;
		System.out.println("Before if Field name => "+fild);
		System.out.println("Vaable if Field name => "+a01);
		if(fild.matches(a01)) {
			String updateAttendance="update attendance set a01=? where employeeId=? and month=? and year=?;";
			String insertAttendance="insert into attendance(employeeId,month,year,a01) values(?,?,?,?);";
			try {
				System.out.println("Field name => "+fild);
				System.out.println("Field value => "+fieldValue);
				System.out.println("id  => "+id);
				System.out.println("month  => "+month);
				System.out.println("year  => "+year);
				con=DriverManager.getConnection(url,user,pass);
				System.out.println("Connection  => "+con);
				ps=con.prepareStatement(updateAttendance);
				ps.setString(1, fieldValue);
				ps.setInt(2, id);
				ps.setString(3, month);
				ps.setString(4, year);
				check=ps.executeUpdate();
				System.out.println("update  => "+check);
				if(check==0) {
					ps=con.prepareStatement(insertAttendance);
//					ps.setString(1, fild);
					ps.setInt(1, id);
					ps.setString(2, month);
					ps.setString(3, year);
					ps.setString(4, fieldValue);
				
					ps.executeUpdate();
				}
				ps.close();
			}catch(Exception e) {
				System.out.println(e);
			}
		}else if(fild.matches(a02)) {
			String updateAttendance="update attendance set a02=? where employeeId=? and month=? and year=?;";
			String insertAttendance="insert into attendance(employeeId,month,year,a02) values(?,?,?,?);";
			try {
				System.out.println("Field name => "+fild);
				System.out.println("Field value => "+fieldValue);
				System.out.println("id  => "+id);
				System.out.println("month  => "+month);
				System.out.println("year  => "+year);
				con=DriverManager.getConnection(url,user,pass);
				ps=con.prepareStatement(updateAttendance);
				ps.setString(1, fieldValue);
				ps.setInt(2, id);
				ps.setString(3, month);
				ps.setString(4, year);
				check=ps.executeUpdate();
				System.out.println("update  => "+check);
				if(check==0) {
					ps=con.prepareStatement(insertAttendance);
//					ps.setString(1, fild);
					ps.setInt(1, id);
					ps.setString(2, month);
					ps.setString(3, year);
					ps.setString(4, fieldValue);
				
					ps.executeUpdate();
				}
				ps.close();
			}catch(Exception e) {
				System.out.println(e);
			}
		}else if(fild.matches(a03)) {
			String updateAttendance="update attendance set a03=? where employeeId=? and month=? and year=?;";
			String insertAttendance="insert into attendance(employeeId,month,year,a03) values(?,?,?,?);";
			try {
				System.out.println("Field name => "+fild);
				System.out.println("Field value => "+fieldValue);
				System.out.println("id  => "+id);
				System.out.println("month  => "+month);
				System.out.println("year  => "+year);
				con=DriverManager.getConnection(url,user,pass);
				ps=con.prepareStatement(updateAttendance);
				ps.setString(1, fieldValue);
				ps.setInt(2, id);
				ps.setString(3, month);
				ps.setString(4, year);
				check=ps.executeUpdate();
				System.out.println("update  => "+check);
				if(check==0) {
					ps=con.prepareStatement(insertAttendance);
//					ps.setString(1, fild);
					ps.setInt(1, id);
					ps.setString(2, month);
					ps.setString(3, year);
					ps.setString(4, fieldValue);
				
					ps.executeUpdate();
				}
				ps.close();
			}catch(Exception e) {
				System.out.println(e);
			}
		}else if(fild.matches(a04)) {
			String updateAttendance="update attendance set a04=? where employeeId=? and month=? and year=?;";
			String insertAttendance="insert into attendance(employeeId,month,year,a04) values(?,?,?,?);";
			try {
				System.out.println("Field name => "+fild);
				System.out.println("Field value => "+fieldValue);
				System.out.println("id  => "+id);
				System.out.println("month  => "+month);
				System.out.println("year  => "+year);
				con=DriverManager.getConnection(url,user,pass);
				ps=con.prepareStatement(updateAttendance);
				ps.setString(1, fieldValue);
				ps.setInt(2, id);
				ps.setString(3, month);
				ps.setString(4, year);
				check=ps.executeUpdate();
				System.out.println("update  => "+check);
				if(check==0) {
					ps=con.prepareStatement(insertAttendance);
//					ps.setString(1, fild);
					ps.setInt(1, id);
					ps.setString(2, month);
					ps.setString(3, year);
					ps.setString(4, fieldValue);
				
					ps.executeUpdate();
				}
				ps.close();
			}catch(Exception e) {
				System.out.println(e);
			}
		}else if(fild.matches(a05)) {
			String updateAttendance="update attendance set a05=? where employeeId=? and month=? and year=?;";
			String insertAttendance="insert into attendance(employeeId,month,year,a05) values(?,?,?,?);";
			try {
				System.out.println("Field name => "+fild);
				System.out.println("Field value => "+fieldValue);
				System.out.println("id  => "+id);
				System.out.println("month  => "+month);
				System.out.println("year  => "+year);
				con=DriverManager.getConnection(url,user,pass);
				ps=con.prepareStatement(updateAttendance);
				ps.setString(1, fieldValue);
				ps.setInt(2, id);
				ps.setString(3, month);
				ps.setString(4, year);
				check=ps.executeUpdate();
				System.out.println("update  => "+check);
				if(check==0) {
					ps=con.prepareStatement(insertAttendance);
//					ps.setString(1, fild);
					ps.setInt(1, id);
					ps.setString(2, month);
					ps.setString(3, year);
					ps.setString(4, fieldValue);
				
					ps.executeUpdate();
				}
				ps.close();
			}catch(Exception e) {
				System.out.println(e);
			}
		}else if(fild.matches(a06)) {
			String updateAttendance="update attendance set a06=? where employeeId=? and month=? and year=?;";
			String insertAttendance="insert into attendance(employeeId,month,year,a06) values(?,?,?,?);";
			try {
				System.out.println("Field name => "+fild);
				System.out.println("Field value => "+fieldValue);
				System.out.println("id  => "+id);
				System.out.println("month  => "+month);
				System.out.println("year  => "+year);
				con=DriverManager.getConnection(url,user,pass);
				ps=con.prepareStatement(updateAttendance);
				ps.setString(1, fieldValue);
				ps.setInt(2, id);
				ps.setString(3, month);
				ps.setString(4, year);
				check=ps.executeUpdate();
				System.out.println("update  => "+check);
				if(check==0) {
					ps=con.prepareStatement(insertAttendance);
//					ps.setString(1, fild);
					ps.setInt(1, id);
					ps.setString(2, month);
					ps.setString(3, year);
					ps.setString(4, fieldValue);
				
					ps.executeUpdate();
				}
				ps.close();
			}catch(Exception e) {
				System.out.println(e);
			}
		}else if(fild.matches(a07)) {
			String updateAttendance="update attendance set a07=? where employeeId=? and month=? and year=?;";
			String insertAttendance="insert into attendance(employeeId,month,year,a07) values(?,?,?,?);";
			try {
				System.out.println("Field name => "+fild);
				System.out.println("Field value => "+fieldValue);
				System.out.println("id  => "+id);
				System.out.println("month  => "+month);
				System.out.println("year  => "+year);
				con=DriverManager.getConnection(url,user,pass);
				ps=con.prepareStatement(updateAttendance);
				ps.setString(1, fieldValue);
				ps.setInt(2, id);
				ps.setString(3, month);
				ps.setString(4, year);
				check=ps.executeUpdate();
				System.out.println("update  => "+check);
				if(check==0) {
					ps=con.prepareStatement(insertAttendance);
//					ps.setString(1, fild);
					ps.setInt(1, id);
					ps.setString(2, month);
					ps.setString(3, year);
					ps.setString(4, fieldValue);
				
					ps.executeUpdate();
				}
				ps.close();
			}catch(Exception e) {
				System.out.println(e);
			}
		}else if(fild.matches(a08)) {
			String updateAttendance="update attendance set a08=? where employeeId=? and month=? and year=?;";
			String insertAttendance="insert into attendance(employeeId,month,year,a08) values(?,?,?,?);";
			try {
				System.out.println("Field name => "+fild);
				System.out.println("Field value => "+fieldValue);
				System.out.println("id  => "+id);
				System.out.println("month  => "+month);
				System.out.println("year  => "+year);
				con=DriverManager.getConnection(url,user,pass);
				ps=con.prepareStatement(updateAttendance);
				ps.setString(1, fieldValue);
				ps.setInt(2, id);
				ps.setString(3, month);
				ps.setString(4, year);
				check=ps.executeUpdate();
				System.out.println("update  => "+check);
				if(check==0) {
					ps=con.prepareStatement(insertAttendance);
//					ps.setString(1, fild);
					ps.setInt(1, id);
					ps.setString(2, month);
					ps.setString(3, year);
					ps.setString(4, fieldValue);
				
					ps.executeUpdate();
				}
				ps.close();
			}catch(Exception e) {
				System.out.println(e);
			}
		}else if(fild.matches(a09)) {
			String updateAttendance="update attendance set a09=? where employeeId=? and month=? and year=?;";
			String insertAttendance="insert into attendance(employeeId,month,year,a09) values(?,?,?,?);";
			try {
				System.out.println("Field name => "+fild);
				System.out.println("Field value => "+fieldValue);
				System.out.println("id  => "+id);
				System.out.println("month  => "+month);
				System.out.println("year  => "+year);
				con=DriverManager.getConnection(url,user,pass);
				ps=con.prepareStatement(updateAttendance);
				ps.setString(1, fieldValue);
				ps.setInt(2, id);
				ps.setString(3, month);
				ps.setString(4, year);
				check=ps.executeUpdate();
				System.out.println("update  => "+check);
				if(check==0) {
					ps=con.prepareStatement(insertAttendance);
//					ps.setString(1, fild);
					ps.setInt(1, id);
					ps.setString(2, month);
					ps.setString(3, year);
					ps.setString(4, fieldValue);
				
					ps.executeUpdate();
				}
				ps.close();
			}catch(Exception e) {
				System.out.println(e);
			}
		}else if(fild.matches(a10)) {
			String updateAttendance="update attendance set a10=? where employeeId=? and month=? and year=?;";
			String insertAttendance="insert into attendance(employeeId,month,year,a10) values(?,?,?,?);";
			try {
				System.out.println("Field name => "+fild);
				System.out.println("Field value => "+fieldValue);
				System.out.println("id  => "+id);
				System.out.println("month  => "+month);
				System.out.println("year  => "+year);
				con=DriverManager.getConnection(url,user,pass);
				ps=con.prepareStatement(updateAttendance);
				ps.setString(1, fieldValue);
				ps.setInt(2, id);
				ps.setString(3, month);
				ps.setString(4, year);
				check=ps.executeUpdate();
				System.out.println("update  => "+check);
				if(check==0) {
					ps=con.prepareStatement(insertAttendance);
//					ps.setString(1, fild);
					ps.setInt(1, id);
					ps.setString(2, month);
					ps.setString(3, year);
					ps.setString(4, fieldValue);
				
					ps.executeUpdate();
				}
				ps.close();
			}catch(Exception e) {
				System.out.println(e);
			}
		}else if(fild.matches(a11)) {
			String updateAttendance="update attendance set a11=? where employeeId=? and month=? and year=?;";
			String insertAttendance="insert into attendance(employeeId,month,year,a11) values(?,?,?,?);";
			try {
				System.out.println("Field name => "+fild);
				System.out.println("Field value => "+fieldValue);
				System.out.println("id  => "+id);
				System.out.println("month  => "+month);
				System.out.println("year  => "+year);
				con=DriverManager.getConnection(url,user,pass);
				ps=con.prepareStatement(updateAttendance);
				ps.setString(1, fieldValue);
				ps.setInt(2, id);
				ps.setString(3, month);
				ps.setString(4, year);
				check=ps.executeUpdate();
				System.out.println("update  => "+check);
				if(check==0) {
					ps=con.prepareStatement(insertAttendance);
//					ps.setString(1, fild);
					ps.setInt(1, id);
					ps.setString(2, month);
					ps.setString(3, year);
					ps.setString(4, fieldValue);
				
					ps.executeUpdate();
				}
				ps.close();
			}catch(Exception e) {
				System.out.println(e);
			}
		}else if(fild.matches(a12)) {
			String updateAttendance="update attendance set a12=? where employeeId=? and month=? and year=?;";
			String insertAttendance="insert into attendance(employeeId,month,year,a12) values(?,?,?,?);";
			try {
				System.out.println("Field name => "+fild);
				System.out.println("Field value => "+fieldValue);
				System.out.println("id  => "+id);
				System.out.println("month  => "+month);
				System.out.println("year  => "+year);
				con=DriverManager.getConnection(url,user,pass);
				ps=con.prepareStatement(updateAttendance);
				ps.setString(1, fieldValue);
				ps.setInt(2, id);
				ps.setString(3, month);
				ps.setString(4, year);
				check=ps.executeUpdate();
				System.out.println("update  => "+check);
				if(check==0) {
					ps=con.prepareStatement(insertAttendance);
//					ps.setString(1, fild);
					ps.setInt(1, id);
					ps.setString(2, month);
					ps.setString(3, year);
					ps.setString(4, fieldValue);
				
					ps.executeUpdate();
				}
				ps.close();
			}catch(Exception e) {
				System.out.println(e);
			}
		}else if(fild.matches(a13)) {
			String updateAttendance="update attendance set a13=? where employeeId=? and month=? and year=?;";
			String insertAttendance="insert into attendance(employeeId,month,year,a13) values(?,?,?,?);";
			try {
				System.out.println("Field name => "+fild);
				System.out.println("Field value => "+fieldValue);
				System.out.println("id  => "+id);
				System.out.println("month  => "+month);
				System.out.println("year  => "+year);
				con=DriverManager.getConnection(url,user,pass);
				ps=con.prepareStatement(updateAttendance);
				ps.setString(1, fieldValue);
				ps.setInt(2, id);
				ps.setString(3, month);
				ps.setString(4, year);
				check=ps.executeUpdate();
				System.out.println("update  => "+check);
				if(check==0) {
					ps=con.prepareStatement(insertAttendance);
//					ps.setString(1, fild);
					ps.setInt(1, id);
					ps.setString(2, month);
					ps.setString(3, year);
					ps.setString(4, fieldValue);
				
					ps.executeUpdate();
				}
				ps.close();
			}catch(Exception e) {
				System.out.println(e);
			}
		}else if(fild.matches(a14)) {
			String updateAttendance="update attendance set a14=? where employeeId=? and month=? and year=?;";
			String insertAttendance="insert into attendance(employeeId,month,year,a14) values(?,?,?,?);";
			try {
				System.out.println("Field name => "+fild);
				System.out.println("Field value => "+fieldValue);
				System.out.println("id  => "+id);
				System.out.println("month  => "+month);
				System.out.println("year  => "+year);
				con=DriverManager.getConnection(url,user,pass);
				ps=con.prepareStatement(updateAttendance);
				ps.setString(1, fieldValue);
				ps.setInt(2, id);
				ps.setString(3, month);
				ps.setString(4, year);
				check=ps.executeUpdate();
				System.out.println("update  => "+check);
				if(check==0) {
					ps=con.prepareStatement(insertAttendance);
//					ps.setString(1, fild);
					ps.setInt(1, id);
					ps.setString(2, month);
					ps.setString(3, year);
					ps.setString(4, fieldValue);
				
					ps.executeUpdate();
				}
				ps.close();
			}catch(Exception e) {
				System.out.println(e);
			}
		}else if(fild.matches(a15)) {
			String updateAttendance="update attendance set a15=? where employeeId=? and month=? and year=?;";
			String insertAttendance="insert into attendance(employeeId,month,year,a15) values(?,?,?,?);";
			try {
				System.out.println("Field name => "+fild);
				System.out.println("Field value => "+fieldValue);
				System.out.println("id  => "+id);
				System.out.println("month  => "+month);
				System.out.println("year  => "+year);
				con=DriverManager.getConnection(url,user,pass);
				ps=con.prepareStatement(updateAttendance);
				ps.setString(1, fieldValue);
				ps.setInt(2, id);
				ps.setString(3, month);
				ps.setString(4, year);
				check=ps.executeUpdate();
				System.out.println("update  => "+check);
				if(check==0) {
					ps=con.prepareStatement(insertAttendance);
//					ps.setString(1, fild);
					ps.setInt(1, id);
					ps.setString(2, month);
					ps.setString(3, year);
					ps.setString(4, fieldValue);
				
					ps.executeUpdate();
				}
				ps.close();
			}catch(Exception e) {
				System.out.println(e);
			}
		}else if(fild.matches(a16)) {
			String updateAttendance="update attendance set a16=? where employeeId=? and month=? and year=?;";
			String insertAttendance="insert into attendance(employeeId,month,year,a16) values(?,?,?,?);";
			try {
				System.out.println("Field name => "+fild);
				System.out.println("Field value => "+fieldValue);
				System.out.println("id  => "+id);
				System.out.println("month  => "+month);
				System.out.println("year  => "+year);
				con=DriverManager.getConnection(url,user,pass);
				ps=con.prepareStatement(updateAttendance);
				ps.setString(1, fieldValue);
				ps.setInt(2, id);
				ps.setString(3, month);
				ps.setString(4, year);
				check=ps.executeUpdate();
				System.out.println("update  => "+check);
				if(check==0) {
					ps=con.prepareStatement(insertAttendance);
//					ps.setString(1, fild);
					ps.setInt(1, id);
					ps.setString(2, month);
					ps.setString(3, year);
					ps.setString(4, fieldValue);
				
					ps.executeUpdate();
				}
				ps.close();
			}catch(Exception e) {
				System.out.println(e);
			}
		}else if(fild.matches(a17)) {
			String updateAttendance="update attendance set a17=? where employeeId=? and month=? and year=?;";
			String insertAttendance="insert into attendance(employeeId,month,year,a17) values(?,?,?,?);";
			try {
				System.out.println("Field name => "+fild);
				System.out.println("Field value => "+fieldValue);
				System.out.println("id  => "+id);
				System.out.println("month  => "+month);
				System.out.println("year  => "+year);
				con=DriverManager.getConnection(url,user,pass);
				ps=con.prepareStatement(updateAttendance);
				ps.setString(1, fieldValue);
				ps.setInt(2, id);
				ps.setString(3, month);
				ps.setString(4, year);
				check=ps.executeUpdate();
				System.out.println("update  => "+check);
				if(check==0) {
					ps=con.prepareStatement(insertAttendance);
//					ps.setString(1, fild);
					ps.setInt(1, id);
					ps.setString(2, month);
					ps.setString(3, year);
					ps.setString(4, fieldValue);
				
					ps.executeUpdate();
				}
				ps.close();
			}catch(Exception e) {
				System.out.println(e);
			}
		}else if(fild.matches(a18)) {
			String updateAttendance="update attendance set a18=? where employeeId=? and month=? and year=?;";
			String insertAttendance="insert into attendance(employeeId,month,year,a18) values(?,?,?,?);";
			try {
				System.out.println("Field name => "+fild);
				System.out.println("Field value => "+fieldValue);
				System.out.println("id  => "+id);
				System.out.println("month  => "+month);
				System.out.println("year  => "+year);
				con=DriverManager.getConnection(url,user,pass);
				ps=con.prepareStatement(updateAttendance);
				ps.setString(1, fieldValue);
				ps.setInt(2, id);
				ps.setString(3, month);
				ps.setString(4, year);
				check=ps.executeUpdate();
				System.out.println("update  => "+check);
				if(check==0) {
					ps=con.prepareStatement(insertAttendance);
//					ps.setString(1, fild);
					ps.setInt(1, id);
					ps.setString(2, month);
					ps.setString(3, year);
					ps.setString(4, fieldValue);
				
					ps.executeUpdate();
				}
				ps.close();
			}catch(Exception e) {
				System.out.println(e);
			}
		}else if(fild.matches(a19)) {
			String updateAttendance="update attendance set a19=? where employeeId=? and month=? and year=?;";
			String insertAttendance="insert into attendance(employeeId,month,year,a19) values(?,?,?,?);";
			try {
				System.out.println("Field name => "+fild);
				System.out.println("Field value => "+fieldValue);
				System.out.println("id  => "+id);
				System.out.println("month  => "+month);
				System.out.println("year  => "+year);
				con=DriverManager.getConnection(url,user,pass);
				ps=con.prepareStatement(updateAttendance);
				ps.setString(1, fieldValue);
				ps.setInt(2, id);
				ps.setString(3, month);
				ps.setString(4, year);
				check=ps.executeUpdate();
				System.out.println("update  => "+check);
				if(check==0) {
					ps=con.prepareStatement(insertAttendance);
//					ps.setString(1, fild);
					ps.setInt(1, id);
					ps.setString(2, month);
					ps.setString(3, year);
					ps.setString(4, fieldValue);
				
					ps.executeUpdate();
				}
				ps.close();
			}catch(Exception e) {
				System.out.println(e);
			}
		}else if(fild.matches(a20)) {
			String updateAttendance="update attendance set a20=? where employeeId=? and month=? and year=?;";
			String insertAttendance="insert into attendance(employeeId,month,year,a20) values(?,?,?,?);";
			try {
				System.out.println("Field name => "+fild);
				System.out.println("Field value => "+fieldValue);
				System.out.println("id  => "+id);
				System.out.println("month  => "+month);
				System.out.println("year  => "+year);
				con=DriverManager.getConnection(url,user,pass);
				ps=con.prepareStatement(updateAttendance);
				ps.setString(1, fieldValue);
				ps.setInt(2, id);
				ps.setString(3, month);
				ps.setString(4, year);
				check=ps.executeUpdate();
				System.out.println("update  => "+check);
				if(check==0) {
					ps=con.prepareStatement(insertAttendance);
//					ps.setString(1, fild);
					ps.setInt(1, id);
					ps.setString(2, month);
					ps.setString(3, year);
					ps.setString(4, fieldValue);
				
					ps.executeUpdate();
				}
				ps.close();
			}catch(Exception e) {
				System.out.println(e);
			}
		}else if(fild.matches(a21)) {
			String updateAttendance="update attendance set a21=? where employeeId=? and month=? and year=?;";
			String insertAttendance="insert into attendance(employeeId,month,year,a21) values(?,?,?,?);";
			try {
				System.out.println("Field name => "+fild);
				System.out.println("Field value => "+fieldValue);
				System.out.println("id  => "+id);
				System.out.println("month  => "+month);
				System.out.println("year  => "+year);
				con=DriverManager.getConnection(url,user,pass);
				ps=con.prepareStatement(updateAttendance);
				ps.setString(1, fieldValue);
				ps.setInt(2, id);
				ps.setString(3, month);
				ps.setString(4, year);
				check=ps.executeUpdate();
				System.out.println("update  => "+check);
				if(check==0) {
					ps=con.prepareStatement(insertAttendance);
//					ps.setString(1, fild);
					ps.setInt(1, id);
					ps.setString(2, month);
					ps.setString(3, year);
					ps.setString(4, fieldValue);
				
					ps.executeUpdate();
				}
				ps.close();
			}catch(Exception e) {
				System.out.println(e);
			}
		}else if(fild.matches(a22)) {
			String updateAttendance="update attendance set a22=? where employeeId=? and month=? and year=?;";
			String insertAttendance="insert into attendance(employeeId,month,year,a22) values(?,?,?,?);";
			try {
				System.out.println("Field name => "+fild);
				System.out.println("Field value => "+fieldValue);
				System.out.println("id  => "+id);
				System.out.println("month  => "+month);
				System.out.println("year  => "+year);
				con=DriverManager.getConnection(url,user,pass);
				ps=con.prepareStatement(updateAttendance);
				ps.setString(1, fieldValue);
				ps.setInt(2, id);
				ps.setString(3, month);
				ps.setString(4, year);
				check=ps.executeUpdate();
				System.out.println("update  => "+check);
				if(check==0) {
					ps=con.prepareStatement(insertAttendance);
//					ps.setString(1, fild);
					ps.setInt(1, id);
					ps.setString(2, month);
					ps.setString(3, year);
					ps.setString(4, fieldValue);
				
					ps.executeUpdate();
				}
				ps.close();
			}catch(Exception e) {
				System.out.println(e);
			}
		}else if(fild.matches(a23)) {
			String updateAttendance="update attendance set a23=? where employeeId=? and month=? and year=?;";
			String insertAttendance="insert into attendance(employeeId,month,year,a23) values(?,?,?,?);";
			try {
				System.out.println("Field name => "+fild);
				System.out.println("Field value => "+fieldValue);
				System.out.println("id  => "+id);
				System.out.println("month  => "+month);
				System.out.println("year  => "+year);
				con=DriverManager.getConnection(url,user,pass);
				ps=con.prepareStatement(updateAttendance);
				ps.setString(1, fieldValue);
				ps.setInt(2, id);
				ps.setString(3, month);
				ps.setString(4, year);
				check=ps.executeUpdate();
				System.out.println("update  => "+check);
				if(check==0) {
					ps=con.prepareStatement(insertAttendance);
//					ps.setString(1, fild);
					ps.setInt(1, id);
					ps.setString(2, month);
					ps.setString(3, year);
					ps.setString(4, fieldValue);
				
					ps.executeUpdate();
				}
				ps.close();
			}catch(Exception e) {
				System.out.println(e);
			}
		}else if(fild.matches(a24)) {
			String updateAttendance="update attendance set a24=? where employeeId=? and month=? and year=?;";
			String insertAttendance="insert into attendance(employeeId,month,year,a24) values(?,?,?,?);";
			try {
				System.out.println("Field name => "+fild);
				System.out.println("Field value => "+fieldValue);
				System.out.println("id  => "+id);
				System.out.println("month  => "+month);
				System.out.println("year  => "+year);
				con=DriverManager.getConnection(url,user,pass);
				ps=con.prepareStatement(updateAttendance);
				ps.setString(1, fieldValue);
				ps.setInt(2, id);
				ps.setString(3, month);
				ps.setString(4, year);
				check=ps.executeUpdate();
				System.out.println("update  => "+check);
				if(check==0) {
					ps=con.prepareStatement(insertAttendance);
//					ps.setString(1, fild);
					ps.setInt(1, id);
					ps.setString(2, month);
					ps.setString(3, year);
					ps.setString(4, fieldValue);
				
					ps.executeUpdate();
				}
				ps.close();
			}catch(Exception e) {
				System.out.println(e);
			}
		}else if(fild.matches(a25)) {
			String updateAttendance="update attendance set a25=? where employeeId=? and month=? and year=?;";
			String insertAttendance="insert into attendance(employeeId,month,year,a25) values(?,?,?,?);";
			try {
				System.out.println("Field name => "+fild);
				System.out.println("Field value => "+fieldValue);
				System.out.println("id  => "+id);
				System.out.println("month  => "+month);
				System.out.println("year  => "+year);
				con=DriverManager.getConnection(url,user,pass);
				ps=con.prepareStatement(updateAttendance);
				ps.setString(1, fieldValue);
				ps.setInt(2, id);
				ps.setString(3, month);
				ps.setString(4, year);
				check=ps.executeUpdate();
				System.out.println("update  => "+check);
				if(check==0) {
					ps=con.prepareStatement(insertAttendance);
//					ps.setString(1, fild);
					ps.setInt(1, id);
					ps.setString(2, month);
					ps.setString(3, year);
					ps.setString(4, fieldValue);
				
					ps.executeUpdate();
				}
				ps.close();
			}catch(Exception e) {
				System.out.println(e);
			}
		}else if(fild.matches(a26)) {
			String updateAttendance="update attendance set a26=? where employeeId=? and month=? and year=?;";
			String insertAttendance="insert into attendance(employeeId,month,year,a26) values(?,?,?,?);";
			try {
				System.out.println("Field name => "+fild);
				System.out.println("Field value => "+fieldValue);
				System.out.println("id  => "+id);
				System.out.println("month  => "+month);
				System.out.println("year  => "+year);
				con=DriverManager.getConnection(url,user,pass);
				ps=con.prepareStatement(updateAttendance);
				ps.setString(1, fieldValue);
				ps.setInt(2, id);
				ps.setString(3, month);
				ps.setString(4, year);
				check=ps.executeUpdate();
				System.out.println("update  => "+check);
				if(check==0) {
					ps=con.prepareStatement(insertAttendance);
//					ps.setString(1, fild);
					ps.setInt(1, id);
					ps.setString(2, month);
					ps.setString(3, year);
					ps.setString(4, fieldValue);
				
					ps.executeUpdate();
				}
				ps.close();
			}catch(Exception e) {
				System.out.println(e);
			}
		}else if(fild.matches(a27)) {
			String updateAttendance="update attendance set a27=? where employeeId=? and month=? and year=?;";
			String insertAttendance="insert into attendance(employeeId,month,year,a27) values(?,?,?,?);";
			try {
				System.out.println("Field name => "+fild);
				System.out.println("Field value => "+fieldValue);
				System.out.println("id  => "+id);
				System.out.println("month  => "+month);
				System.out.println("year  => "+year);
				con=DriverManager.getConnection(url,user,pass);
				ps=con.prepareStatement(updateAttendance);
				ps.setString(1, fieldValue);
				ps.setInt(2, id);
				ps.setString(3, month);
				ps.setString(4, year);
				check=ps.executeUpdate();
				System.out.println("update  => "+check);
				if(check==0) {
					ps=con.prepareStatement(insertAttendance);
//					ps.setString(1, fild);
					ps.setInt(1, id);
					ps.setString(2, month);
					ps.setString(3, year);
					ps.setString(4, fieldValue);
				
					ps.executeUpdate();
				}
				ps.close();
			}catch(Exception e) {
				System.out.println(e);
			}
		}else if(fild.matches(a28)) {
			String updateAttendance="update attendance set a28=? where employeeId=? and month=? and year=?;";
			String insertAttendance="insert into attendance(employeeId,month,year,a28) values(?,?,?,?);";
			try {
				System.out.println("Field name => "+fild);
				System.out.println("Field value => "+fieldValue);
				System.out.println("id  => "+id);
				System.out.println("month  => "+month);
				System.out.println("year  => "+year);
				con=DriverManager.getConnection(url,user,pass);
				ps=con.prepareStatement(updateAttendance);
				ps.setString(1, fieldValue);
				ps.setInt(2, id);
				ps.setString(3, month);
				ps.setString(4, year);
				check=ps.executeUpdate();
				System.out.println("update  => "+check);
				if(check==0) {
					ps=con.prepareStatement(insertAttendance);
//					ps.setString(1, fild);
					ps.setInt(1, id);
					ps.setString(2, month);
					ps.setString(3, year);
					ps.setString(4, fieldValue);
				
					ps.executeUpdate();
				}
				ps.close();
			}catch(Exception e) {
				System.out.println(e);
			}
		}else if(fild.matches(a29)) {
			String updateAttendance="update attendance set a29=? where employeeId=? and month=? and year=?;";
			String insertAttendance="insert into attendance(employeeId,month,year,a29) values(?,?,?,?);";
			try {
				System.out.println("Field name => "+fild);
				System.out.println("Field value => "+fieldValue);
				System.out.println("id  => "+id);
				System.out.println("month  => "+month);
				System.out.println("year  => "+year);
				con=DriverManager.getConnection(url,user,pass);
				ps=con.prepareStatement(updateAttendance);
				ps.setString(1, fieldValue);
				ps.setInt(2, id);
				ps.setString(3, month);
				ps.setString(4, year);
				check=ps.executeUpdate();
				System.out.println("update  => "+check);
				if(check==0) {
					ps=con.prepareStatement(insertAttendance);
//					ps.setString(1, fild);
					ps.setInt(1, id);
					ps.setString(2, month);
					ps.setString(3, year);
					ps.setString(4, fieldValue);
				
					ps.executeUpdate();
				}
				ps.close();
			}catch(Exception e) {
				System.out.println(e);
			}
		}else if(fild.matches(a30)) {
			String updateAttendance="update attendance set a30=? where employeeId=? and month=? and year=?;";
			String insertAttendance="insert into attendance(employeeId,month,year,a30) values(?,?,?,?);";
			try {
				System.out.println("Field name => "+fild);
				System.out.println("Field value => "+fieldValue);
				System.out.println("id  => "+id);
				System.out.println("month  => "+month);
				System.out.println("year  => "+year);
				con=DriverManager.getConnection(url,user,pass);
				ps=con.prepareStatement(updateAttendance);
				ps.setString(1, fieldValue);
				ps.setInt(2, id);
				ps.setString(3, month);
				ps.setString(4, year);
				check=ps.executeUpdate();
				System.out.println("update  => "+check);
				if(check==0) {
					ps=con.prepareStatement(insertAttendance);
//					ps.setString(1, fild);
					ps.setInt(1, id);
					ps.setString(2, month);
					ps.setString(3, year);
					ps.setString(4, fieldValue);
				
					ps.executeUpdate();
				}
				ps.close();
			}catch(Exception e) {
				System.out.println(e);
			}
		}else if(fild.matches(a31)) {
			String updateAttendance="update attendance set a31=? where employeeId=? and month=? and year=?;";
			String insertAttendance="insert into attendance(employeeId,month,year,a31) values(?,?,?,?);";
			try {
				System.out.println("Field name => "+fild);
				System.out.println("Field value => "+fieldValue);
				System.out.println("id  => "+id);
				System.out.println("month  => "+month);
				System.out.println("year  => "+year);
				con=DriverManager.getConnection(url,user,pass);
				ps=con.prepareStatement(updateAttendance);
				ps.setString(1, fieldValue);
				ps.setInt(2, id);
				ps.setString(3, month);
				ps.setString(4, year);
				check=ps.executeUpdate();
				System.out.println("update  => "+check);
				if(check==0) {
					ps=con.prepareStatement(insertAttendance);
//					ps.setString(1, fild);
					ps.setInt(1, id);
					ps.setString(2, month);
					ps.setString(3, year);
					ps.setString(4, fieldValue);
				
					ps.executeUpdate();
				}
				ps.close();
			}catch(Exception e) {
				System.out.println(e);
			}
		}
		
			
		
	}
	
	public void makeAttendance(Attendance a) {
		try {
//			con=DriverManager.getConnection(url,user,pass);
//			ps=con.prepareStatement(updateAttendance);
//			ps.setString(1, a.getStatus());
//			ps.setInt(2, a.getEmployeeId());
//			ps.setDate(3, a.getDate());
//			
//			ps.executeUpdate();
			con=DriverManager.getConnection(url,user,pass);
//			ps=con.prepareStatement(insertAttendance);
			ps.setInt(1, a.getEmployeeId());
			ps.executeUpdate();
			
			
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
	//_______________________Attendance Report_________________________
	
	
	String showAllAttendance="select * from attendance where month=? and year=?";
	
	List<Attendance> attendanceReport=new ArrayList<>();
	public List<Attendance> report(String month, String year){
		try {
			con=DriverManager.getConnection(url,user,pass);
			ps=con.prepareStatement(showAllAttendance);
			ps.setString(1, month);
			ps.setString(2, year);
			rs=ps.executeQuery();
			while(rs.next()) {
				attendanceReport.add(new Attendance(rs.getInt(1),rs.getInt(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11),rs.getString(12),rs.getString(13),rs.getString(14),rs.getString(15),rs.getString(16),rs.getString(17),rs.getString(18),rs.getString(19),rs.getString(20),rs.getString(21),rs.getString(22),rs.getString(23),rs.getString(24),rs.getString(25),rs.getString(26),rs.getString(27),rs.getString(28),rs.getString(29),rs.getString(30),rs.getString(31),rs.getString(32),rs.getString(33),rs.getString(34),rs.getString(35)));
			}
		}catch(Exception e) {
			System.out.println(e);
		}
		
		return attendanceReport;
	}
	
	// --------------------------Show attendance absent by id------------------------------------
	String absent="select * from attendance where employeeId=? and month=? and year=?";
	
	
	public List<Integer> MakeAbsenttReport(int id, String month, String year){
		 List<Integer> absentReport=new ArrayList<>();
//		absentReport=null;
		System.out.println("Employee Id => "+id);
		try {
			con=DriverManager.getConnection(url,user,pass);
			ps=con.prepareStatement(absent);
			ps.setInt(1, id);
			ps.setString(2, month);
			ps.setString(3, year);
			rs=ps.executeQuery();
			int presentCount=0, absentcount=0, leavecount=0;
			while(rs.next()) {
//				absentReport.add(new Attendance(rs.getInt(1),rs.getInt(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11),rs.getString(12),rs.getString(13),rs.getString(14),rs.getString(15),rs.getString(16),rs.getString(17),rs.getString(18),rs.getString(19),rs.getString(20),rs.getString(21),rs.getString(22),rs.getString(23),rs.getString(24),rs.getString(25),rs.getString(26),rs.getString(27),rs.getString(28),rs.getString(29),rs.getString(30),rs.getString(31),rs.getString(32),rs.getString(33),rs.getString(34),rs.getString(35)));
				
				for(int i =1; i<=31;i++) {
					 String status = rs.getString("a" + String.format("%02d", i));
					 switch (status) {
                     case "P":
                         presentCount++;
                         break;
                     case "A":
                    	 absentcount++;
                         break;
                     case "L":
                    	 leavecount++;
                         break;
                     // Handle other cases if needed
                 }
				}
			}
			absentReport.add(presentCount);
			absentReport.add(absentcount);
			absentReport.add(leavecount);
			System.out.println("Present: " + presentCount + ", Absent: " + absentcount + ", Leave: " + leavecount);
			System.out.println("Attendance Report => "+absentReport);
		}catch(Exception e) {
			System.out.println(e);
		}
		
		return absentReport;
	}
	
	
	
	
	// --------------------All Attendaance Report ---------------------
	List<Attendance> AllAttendanceReport=new ArrayList<>();
	public List<Attendance> allAttendanceReport(String month, String year){
		try {
			con=DriverManager.getConnection(url,user,pass);
			ps=con.prepareStatement(allAttendance);
			ps.setString(1, month);
			ps.setString(2, year);
			rs=ps.executeQuery();
			while(rs.next()) {
//				attendanceReport.add(new Attendance(rs.getInt(1),rs.getInt(2),rs.getDate(3),rs.getString(4)));
			}
		}catch(Exception e) {
			System.out.println(e);
		}
		
		return attendanceReport;
	}
	
	
}
