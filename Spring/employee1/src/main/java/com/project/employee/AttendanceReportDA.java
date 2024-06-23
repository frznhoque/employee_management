package com.project.employee;

import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;

public class AttendanceReportDA extends MySqlConnection{

String showAllAttendance="select attendance.attendanceId, employees.name, attendance.month, attendance.year, attendance.a01, attendance.a02, attendance.a03, attendance.a04, attendance.a05, attendance.a06, attendance.a07, attendance.a08, attendance.a09, attendance.a10, attendance.a11, attendance.a12, attendance.a13, attendance.a14, attendance.a15, attendance.a16, attendance.a17, attendance.a18, attendance.a19, attendance.a20, attendance.a21, attendance.a22, attendance.a23, attendance.a24, attendance.a25, attendance.a26, attendance.a27, attendance.a28, attendance.a29, attendance.a30, attendance.a31 from attendance inner join employees on attendance.employeeId=employees.employeeId where attendance.month=? and attendance.year=?";
	
	List<AttendanceReport> attendanceReport=new ArrayList<>();
	public List<AttendanceReport> report(String month, String year){
		try {
			con=DriverManager.getConnection(url,user,pass);
			ps=con.prepareStatement(showAllAttendance);
			ps.setString(1, month);
			ps.setString(2, year);
			rs=ps.executeQuery();
			while(rs.next()) {
				attendanceReport.add(new AttendanceReport(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11),rs.getString(12),rs.getString(13),rs.getString(14),rs.getString(15),rs.getString(16),rs.getString(17),rs.getString(18),rs.getString(19),rs.getString(20),rs.getString(21),rs.getString(22),rs.getString(23),rs.getString(24),rs.getString(25),rs.getString(26),rs.getString(27),rs.getString(28),rs.getString(29),rs.getString(30),rs.getString(31),rs.getString(32),rs.getString(33),rs.getString(34),rs.getString(35)));
			}
		}catch(Exception e) {
			System.out.println(e);
		}
		
		return attendanceReport;
	}
}
