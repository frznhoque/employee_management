package com.project.employee;

import java.sql.Date;

public class LeaveRequest{

	int requestId;
	Date fromDate;
	Date toDate;
	Date requestDate;
	String description;
	String status;
	int employeeId;
	public LeaveRequest() {
		super();
	}
	public LeaveRequest(int requestId, Date fromDate, Date toDate, Date requestDate, String description, String status,
			int employeeId) {
		super();
		this.requestId = requestId;
		this.fromDate = fromDate;
		this.toDate = toDate;
		this.requestDate = requestDate;
		this.description = description;
		this.status = status;
		this.employeeId = employeeId;
	}
	public int getRequestId() {
		return requestId;
	}
	public void setRequestId(int requestId) {
		this.requestId = requestId;
	}
	public Date getFromDate() {
		return fromDate;
	}
	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}
	public Date getToDate() {
		return toDate;
	}
	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}
	public Date getRequestDate() {
		return requestDate;
	}
	public void setRequestDate(Date requestDate) {
		this.requestDate = requestDate;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	@Override
	public String toString() {
		return "LeaveRequest [requestId=" + requestId + ", fromDate=" + fromDate + ", toDate=" + toDate
				+ ", requestDate=" + requestDate + ", description=" + description + ", status=" + status
				+ ", employeeId=" + employeeId + "]";
	}
	
	
	
}
