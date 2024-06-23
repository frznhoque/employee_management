package com.project.employee;

public class Salary {

	int salaryId;
	Double basic;
	int house;
	int communication;
	int transport;
	int medical;
	int employeeId;
	public Salary() {
		super();
	}
	public Salary(int salaryId, Double basic, int house, int communication, int transport, int medical,
			int employeeId) {
		super();
		this.salaryId = salaryId;
		this.basic = basic;
		this.house = house;
		this.communication = communication;
		this.transport = transport;
		this.medical = medical;
		this.employeeId = employeeId;
	}
	public int getSalaryId() {
		return salaryId;
	}
	public void setSalaryId(int salaryId) {
		this.salaryId = salaryId;
	}
	public Double getBasic() {
		return basic;
	}
	public void setBasic(Double basic) {
		this.basic = basic;
	}
	public int getHouse() {
		return house;
	}
	public void setHouse(int house) {
		this.house = house;
	}
	public int getCommunication() {
		return communication;
	}
	public void setCommunication(int communication) {
		this.communication = communication;
	}
	public int getTransport() {
		return transport;
	}
	public void setTransport(int transport) {
		this.transport = transport;
	}
	public int getMedical() {
		return medical;
	}
	public void setMedical(int medical) {
		this.medical = medical;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	@Override
	public String toString() {
		return "Salary [salaryId=" + salaryId + ", basic=" + basic + ", house=" + house + ", communication="
				+ communication + ", transport=" + transport + ", medical=" + medical + ", employeeId=" + employeeId
				+ ", getSalaryId()=" + getSalaryId() + ", getBasic()=" + getBasic() + ", getHouse()=" + getHouse()
				+ ", getCommunication()=" + getCommunication() + ", getTransport()=" + getTransport()
				+ ", getMedical()=" + getMedical() + ", getEmployeeId()=" + getEmployeeId() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
}
