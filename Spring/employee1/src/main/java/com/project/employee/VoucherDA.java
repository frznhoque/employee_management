package com.project.employee;

import java.sql.DriverManager;
import java.util.*;

public class VoucherDA extends MySqlConnection{

	String voucherinsert="insert into voucher(heading,description,ammount) values(?,?,?)";
	String requestVoucher="select * from voucher";
	
	public void saveVoucher(Voucher v) {
		try {
			con=DriverManager.getConnection(url, user, pass);
			ps=con.prepareStatement(voucherinsert);
			ps.setString(1, v.getHeading());
			ps.setString(2, v.getDescription());
			ps.setDouble(3, v.getAmmount());
			ps.executeUpdate();
			
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}
	
	List<Voucher> requestedVoucher=new ArrayList<>();
	public List<Voucher> getRequestVoucher(){
		
		try {
			con=DriverManager.getConnection(url, user, pass);
			ps=con.prepareStatement(requestVoucher);
			rs=ps.executeQuery();
			while(rs.next()) {
				requestedVoucher.add(new Voucher(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getDouble(4),rs.getString(5),rs.getInt(6)));
			}
			System.out.println(requestedVoucher.get(0).voucherNumber);
			
		}catch(Exception e) {
			System.out.println(e);
		}
		
		return requestedVoucher;
	}
}

