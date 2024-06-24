package com.project.employee;

import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;

public class LeaveRequestDA extends MySqlConnection{
	
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
	
	
	String allrequest="select * from leave_request where status='requested'";
	List<LeaveRequest> requestList=new ArrayList<>();
	public List<LeaveRequest> allRequestList(){
		
		try {
			con=DriverManager.getConnection(url,user,pass);
			ps=con.prepareStatement(allrequest);
			rs=ps.executeQuery();
			while(rs.next()) {
				requestList.add(new LeaveRequest(rs.getInt(1),rs.getDate(2),rs.getDate(3),rs.getDate(4),rs.getString(5),rs.getString(6),rs.getInt(7)));
			}
			
			
		}catch(Exception e) {
			System.out.println(e);
		}
		
		return requestList;
	}

}
