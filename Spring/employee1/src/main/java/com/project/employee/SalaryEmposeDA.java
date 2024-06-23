package com.project.employee;



import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
public class SalaryEmposeDA extends MySqlConnection{

	String salarybyid="select * from salary_empose where employeeId=?";
	String salarybymonth="select * from salary_empose where month=? and year=?";
	String allSalary="select * from salary_empose";
	String salaryinput="insert into  salary_empose  values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
	String salaryUpdateStatement="UPDATE salary_empose SET `leave`=?, leaveNotPay=?, total=?, emposeDate=? WHERE id=?";
	
	
	//============================Salary impose====================================
	
	public void insertSalary(String month, int year, Date date) {
		int salaryId;
		int absentcount;
		int leaveCount;
		boolean check=false;
		List<SalaryEmpose> checksalary=new ArrayList<>();
//		int id;
//		int employeeId;
//		Double basic house, communication, transport, medical, leave, leaveNotPay, bonous, total, month, year, emposeDate
		//================================1st part=================================================
		
		try {
//			checksalary=null;
			con=DriverManager.getConnection(url,user,pass);
			ps=con.prepareStatement(salarybymonth);
			ps.setString(1, month);
			ps.setInt(2, year);
			rs=ps.executeQuery();
			while (rs.next()) {
				checksalary.add(new SalaryEmpose(rs.getInt(1),rs.getInt(2),rs.getDouble(3),rs.getDouble(4),rs.getDouble(5),rs.getDouble(6),rs.getDouble(7),rs.getInt(8),rs.getDouble(9),rs.getDouble(10),rs.getDouble(11),rs.getString(12),rs.getInt(13), rs.getDate(14)));
				
			}
			  rs=ps.executeQuery();
			  check=rs.next();
			System.out.println(check);
		}catch(Exception e) {
			System.out.println(e);
		}
		
		
		
		//=================================2nd part=================================================
		if(check) {
			System.out.println("if work");
			try {
				SalaryDA da=new SalaryDA();
				AttendanceDA attendanceDA=new AttendanceDA();
				List<Integer> absent=new ArrayList<>();
				List<Salary> allSalary=new ArrayList<>();
				allSalary=da.employeeSalary();
				con=DriverManager.getConnection(url,user,pass);
				ps=con.prepareStatement(salaryUpdateStatement);
				
				for(int i=0;i<allSalary.size();i++) {
					absentcount=0;
					leaveCount=0;
					absent=null;
					absent=attendanceDA.MakeAbsenttReport(allSalary.get(i).getEmployeeId(),month,String.valueOf(year));
					absentcount=absent.get(1);
					leaveCount=absent.get(2);
					for(int j=0;j<checksalary.size();j++) {
						for(int k=0;k<checksalary.size();k++) {
							if(checksalary.get(k).getEmployeeId()==allSalary.get(i).getEmployeeId()) {
								
								double house= allSalary.get(i).getBasic()*(Double. valueOf(allSalary.get(i).getHouse())/100);
								double communication= allSalary.get(i).getBasic()*(Double. valueOf(allSalary.get(i).getCommunication())/100);
								double transport= allSalary.get(i).getBasic()*(Double.valueOf(allSalary.get(i).getTransport()) /100);
								double medical= allSalary.get(i).getBasic()*(Double.valueOf(allSalary.get(i).getMedical()) /100);
								System.out.println("medical" + medical);
//								
								int leave=0;
								if(leaveCount>3) {
									leave=(leaveCount-3)+absentcount;
								}else {
									leave=absentcount;
								}
								double leaveNotPay=( allSalary.get(i).getBasic()/30)*Double.valueOf(leave);
								
							 System.out.println("leave Not Pay -> " + leaveNotPay);
								double bonous=0;
								double total=allSalary.get(i).getBasic()+house+communication+transport+medical-leaveNotPay;
								ps.setInt(1, leave);
								ps.setDouble(2, leaveNotPay);
								ps.setDouble(3, total);
								ps.setDate(4, date);
								ps.setInt(5, checksalary.get(k).getId());
								ps.executeUpdate();
							}
//							ps.close();
								
							}
						}
							
					}
					
					
			}catch(Exception e) {
				
				System.out.println("if exception "+e);
//				
			}
		}
		
		
		
		//=====================================3rd Part==============================================
	else {
		System.out.println("Else work");
		try {
			SalaryDA da=new SalaryDA();
			AttendanceDA attendanceDA=new AttendanceDA();
			
			
			List<Integer> absent=new ArrayList<>();
			List<Salary> allSalary=new ArrayList<>();
			
			
			allSalary=da.employeeSalary();
			System.out.println("All salary Data -> "+ allSalary);
			
			
			con=DriverManager.getConnection(url,user,pass);
			ps=con.prepareStatement(salaryinput);
			
			for(int i=0;i<allSalary.size();i++) {
				
				String getLastId="select * from salary_empose";
				
				System.out.println("All salary employee id -> "+ allSalary.get(i).getEmployeeId());
				
				PreparedStatement pstatement=con.prepareStatement(getLastId);
				ResultSet result=pstatement.executeQuery();
				salaryId=0;
				while(result.next()) {
					salaryId=0;
					salaryId=result.getInt(1);
				}
				absentcount=0;
				leaveCount=0;
				absent=null;
				absent=attendanceDA.MakeAbsenttReport(allSalary.get(i).getEmployeeId(),month,String.valueOf(year));
//				System.out.println("Absent Data -> "+ absent);
				absentcount=absent.get(1);
				leaveCount=absent.get(2);
				System.out.println("Absent -> "+absentcount);
				System.out.println("Leave -> "+leaveCount);
				for(int j=0;j<absent.size();j++) {
					
					
						
					}
				
				double house= allSalary.get(i).getBasic()*(Double. valueOf(allSalary.get(i).getHouse())/100);
				double communication= allSalary.get(i).getBasic()*(Double. valueOf(allSalary.get(i).getCommunication())/100);
				double transport= allSalary.get(i).getBasic()*(Double.valueOf(allSalary.get(i).getTransport()) /100);
				double medical= allSalary.get(i).getBasic()*(Double.valueOf(allSalary.get(i).getMedical()) /100);
				System.out.println("medical" + medical);
//				
				int leave=0;
//				if(absent==null) {
//					leave=0;
//				}else {
//					leave=Integer.valueOf(absent.size())  ;
//				}
//				System.out.println(allSalary.get(i).getEmployeeId());
//				System.out.println("leave -> "+ leave);
				if(leaveCount>3) {
					leave=(leaveCount-3)+absentcount;
				}else {
					leave=absentcount;
				}
				double leaveNotPay=( allSalary.get(i).getBasic()/30)*Double.valueOf(leave);
//				
			 System.out.println("leave Not Pay -> " + leaveNotPay);
				double bonous=0;
				double total=allSalary.get(i).getBasic()+house+communication+transport+medical-leaveNotPay;
				ps.setInt(1, salaryId+1);
				ps.setInt(2,allSalary.get(i).getEmployeeId());
				ps.setDouble(3, allSalary.get(i).getBasic());
				ps.setDouble(4, house);
				ps.setDouble(5, communication);
				ps.setDouble(6, transport);
				ps.setDouble(7, medical);
				ps.setInt(8, leave);
				ps.setDouble(9, leaveNotPay);
				ps.setDouble(10,bonous);
				ps.setDouble(11, total);
				
				ps.setString(12,month);
				ps.setInt(13,year);
				
		
				
				ps.setDate(14, date);
				System.out.println(date);
				System.out.println("Works before");
				ps.executeUpdate();
				System.out.println("Works");
					
				
			}
//			con=DriverManager.getConnection(url,user,pass);
//			ps=con.prepareStatement(salaryinput);
			
			
			ps.close();
		}catch(Exception e) {
			
			System.out.println("else exception "+e);
//			
		}
		}
	}
	
	
	
	
	//-----------------------Salary by Month------------------------------
	
List<SalaryEmpose> salary=new ArrayList<>();
	
	public List<SalaryEmpose> employeeSalary(String month, int year){
		try {
			con=DriverManager.getConnection(url,user,pass);
			ps=con.prepareStatement(salarybymonth);
			ps.setString(1, month);
			ps.setInt(2, year);
			rs=ps.executeQuery();
			while (rs.next()) {
				salary.add(new SalaryEmpose(rs.getInt(1),rs.getInt(2),rs.getDouble(3),rs.getDouble(4),rs.getDouble(5),rs.getDouble(6),rs.getDouble(7),rs.getInt(8),rs.getDouble(9),rs.getDouble(10),rs.getDouble(11),rs.getString(12),rs.getInt(13), rs.getDate(14)));
				
			}
			
		}catch(Exception e) {
			System.out.println(e);
		}
		
		return salary;
	}
	
List<SalaryEmpose> allsalary=new ArrayList<>();
	
	public List<SalaryEmpose> allemployeeSalary(){
		try {
			con=DriverManager.getConnection(url,user,pass);
			ps=con.prepareStatement(allSalary);
			rs=ps.executeQuery();
			while (rs.next()) {
				salary.add(new SalaryEmpose(rs.getInt(1),rs.getInt(2),rs.getDouble(3),rs.getDouble(4),rs.getDouble(5),rs.getDouble(6),rs.getDouble(7),rs.getInt(8),rs.getDouble(9),rs.getDouble(10),rs.getDouble(11),rs.getString(12),rs.getInt(13), rs.getDate(14)));
				
			}
			
		}catch(Exception e) {
			System.out.println(e);
		}
		
		return salary;
	}
}
