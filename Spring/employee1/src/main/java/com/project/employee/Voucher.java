package com.project.employee;

public class Voucher {
	int voucherNumber;
	String heading;
	String description;
	Double ammount;
	String status;
	int requesterId;
	public Voucher() {
		super();
	}
	public Voucher(int voucherNumber, String heading, String description, Double ammount, String status,
			int requesterId) {
		super();
		this.voucherNumber = voucherNumber;
		this.heading = heading;
		this.description = description;
		this.ammount = ammount;
		this.status = status;
		this.requesterId = requesterId;
	}
	public int getVoucherNumber() {
		return voucherNumber;
	}
	public void setVoucherNumber(int voucherNumber) {
		this.voucherNumber = voucherNumber;
	}
	public String getHeading() {
		return heading;
	}
	public void setHeading(String heading) {
		this.heading = heading;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Double getAmmount() {
		return ammount;
	}
	public void setAmmount(Double ammount) {
		this.ammount = ammount;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getRequesterId() {
		return requesterId;
	}
	public void setRequesterId(int requesterId) {
		this.requesterId = requesterId;
	}
	@Override
	public String toString() {
		return "Voucher [voucherNumber=" + voucherNumber + ", heading=" + heading + ", description=" + description
				+ ", ammount=" + ammount + ", status=" + status + ", requesterId=" + requesterId
				+ ", getVoucherNumber()=" + getVoucherNumber() + ", getHeading()=" + getHeading()
				+ ", getDescription()=" + getDescription() + ", getAmmount()=" + getAmmount() + ", getStatus()="
				+ getStatus() + ", getRequesterId()=" + getRequesterId() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	

}
