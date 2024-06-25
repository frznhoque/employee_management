package com.project.employee;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class SalaryEmpose {
	@Id
	int id;
	int employeeId;
	Double basic;
	Double house;
	Double communication;
	Double transport;
	Double medical;
	int present;
	int absent;
	int leave;
	int totalAbsent;
	Double leaveNotPay;
	Double bonous;
	Double total;
	String month;
	int year;
	Date emposeDate;
	public SalaryEmpose() {
		super();
	}
	public SalaryEmpose(int id, int employeeId, Double basic, Double house, Double communication, Double transport,
			Double medical, int present, int absent, int leave, int totalAbsent, Double leaveNotPay, Double bonous,
			Double total, String month, int year, Date emposeDate) {
		super();
		this.id = id;
		this.employeeId = employeeId;
		this.basic = basic;
		this.house = house;
		this.communication = communication;
		this.transport = transport;
		this.medical = medical;
		this.present = present;
		this.absent = absent;
		this.leave = leave;
		this.totalAbsent = totalAbsent;
		this.leaveNotPay = leaveNotPay;
		this.bonous = bonous;
		this.total = total;
		this.month = month;
		this.year = year;
		this.emposeDate = emposeDate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public Double getBasic() {
		return basic;
	}
	public void setBasic(Double basic) {
		this.basic = basic;
	}
	public Double getHouse() {
		return house;
	}
	public void setHouse(Double house) {
		this.house = house;
	}
	public Double getCommunication() {
		return communication;
	}
	public void setCommunication(Double communication) {
		this.communication = communication;
	}
	public Double getTransport() {
		return transport;
	}
	public void setTransport(Double transport) {
		this.transport = transport;
	}
	public Double getMedical() {
		return medical;
	}
	public void setMedical(Double medical) {
		this.medical = medical;
	}
	public int getPresent() {
		return present;
	}
	public void setPresent(int present) {
		this.present = present;
	}
	public int getAbsent() {
		return absent;
	}
	public void setAbsent(int absent) {
		this.absent = absent;
	}
	public int getLeave() {
		return leave;
	}
	public void setLeave(int leave) {
		this.leave = leave;
	}
	public int getTotalAbsent() {
		return totalAbsent;
	}
	public void setTotalAbsent(int totalAbsent) {
		this.totalAbsent = totalAbsent;
	}
	public Double getLeaveNotPay() {
		return leaveNotPay;
	}
	public void setLeaveNotPay(Double leaveNotPay) {
		this.leaveNotPay = leaveNotPay;
	}
	public Double getBonous() {
		return bonous;
	}
	public void setBonous(Double bonous) {
		this.bonous = bonous;
	}
	public Double getTotal() {
		return total;
	}
	public void setTotal(Double total) {
		this.total = total;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public Date getEmposeDate() {
		return emposeDate;
	}
	public void setEmposeDate(Date emposeDate) {
		this.emposeDate = emposeDate;
	}
	@Override
	public String toString() {
		return "SalaryEmpose [id=" + id + ", employeeId=" + employeeId + ", basic=" + basic + ", house=" + house
				+ ", communication=" + communication + ", transport=" + transport + ", medical=" + medical
				+ ", present=" + present + ", absent=" + absent + ", leave=" + leave + ", totalAbsent=" + totalAbsent
				+ ", leaveNotPay=" + leaveNotPay + ", bonous=" + bonous + ", total=" + total + ", month=" + month
				+ ", year=" + year + ", emposeDate=" + emposeDate + "]";
	}
	

}
