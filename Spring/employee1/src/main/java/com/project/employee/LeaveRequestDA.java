package com.project.employee;

import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;

public class LeaveRequestDA extends MySqlConnection{
	
	
	//========================================save request========================================
	
	String requestLeave="insert into leave_request(fromDate, toDate, requestDate, description,employeeId) values(?,?,?,?,?)";
	public void leaveRequest(LeaveRequest lr) {
		try {
			con=DriverManager.getConnection(url,user,pass);
			ps=con.prepareStatement(requestLeave);
			ps.setDate(1, lr.getFromDate());
			ps.setDate(2, lr.getToDate());
			ps.setDate(3, lr.getRequestDate());
			ps.setString(4, lr.getDescription());
			ps.setInt(5, lr.getEmployeeId());
			ps.executeUpdate();
			ps.close();
			
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
	//=========================================get all request===========================================
	
	String allrequest="select * from leave_request where status='requested'";
	String allrequeststatus="select * from leave_request";
	List<LeaveRequest> requestList=new ArrayList<>();
	List<LeaveRequest> requestListstatus=new ArrayList<>();
	public List<LeaveRequest> allRequestList(){
		
		try {
			con=DriverManager.getConnection(url,user,pass);
			ps=con.prepareStatement(allrequest);
			rs=ps.executeQuery();
			while(rs.next()) {
				requestList.add(new LeaveRequest(rs.getInt(1),rs.getDate(2),rs.getDate(3),rs.getDate(4),rs.getString(5),rs.getString(6),rs.getInt(7)));
			}
			ps.close();
			
		}catch(Exception e) {
			System.out.println(e);
		}
		
		return requestList;
	}
	
	
public List<LeaveRequest> allRequestListstatus(){
		
		try {
			con=DriverManager.getConnection(url,user,pass);
			ps=con.prepareStatement(allrequeststatus);
			rs=ps.executeQuery();
			while(rs.next()) {
				requestListstatus.add(new LeaveRequest(rs.getInt(1),rs.getDate(2),rs.getDate(3),rs.getDate(4),rs.getString(5),rs.getString(6),rs.getInt(7)));
			}
			ps.close();
			
		}catch(Exception e) {
			System.out.println(e);
		}
		
		return requestListstatus;
	}
	
	//==========================================reject request=======================================
	
	String rejectRequest="update leave_request set status=? where requestId=?";
	public void rejectLeaveRequest(int id, String status) {
		try {
			con=DriverManager.getConnection(url,user,pass);
			ps=con.prepareStatement(rejectRequest);
			ps.setString(1, status);
			ps.setInt(2, id);
			ps.executeUpdate();
			ps.close();
			
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
	
	
	
	
	
	
	
	
	

}
