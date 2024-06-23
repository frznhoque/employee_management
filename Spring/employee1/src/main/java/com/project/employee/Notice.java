package com.project.employee;

import java.sql.Date;

public class Notice {
	int noticeId;
	String noticeHeading;
	String noticeDescription;
	Date noticeDate;
	public Notice() {
		super();
	}
	public Notice(int noticeId, String noticeHeading, String noticeDescription, Date noticeDate) {
		super();
		this.noticeId = noticeId;
		this.noticeHeading = noticeHeading;
		this.noticeDescription = noticeDescription;
		this.noticeDate = noticeDate;
	}
	public int getNoticeId() {
		return noticeId;
	}
	public void setNoticeId(int noticeId) {
		this.noticeId = noticeId;
	}
	public String getNoticeHeading() {
		return noticeHeading;
	}
	public void setNoticeHeading(String noticeHeading) {
		this.noticeHeading = noticeHeading;
	}
	public String getNoticeDescription() {
		return noticeDescription;
	}
	public void setNoticeDescription(String noticeDescription) {
		this.noticeDescription = noticeDescription;
	}
	public Date getNoticeDate() {
		return noticeDate;
	}
	public void setNoticeDate(Date noticeDate) {
		this.noticeDate = noticeDate;
	}
	@Override
	public String toString() {
		return "Notice [noticeId=" + noticeId + ", noticeHeading=" + noticeHeading + ", noticeDescription="
				+ noticeDescription + ", noticeDate=" + noticeDate + ", getNoticeId()=" + getNoticeId()
				+ ", getNoticeHeading()=" + getNoticeHeading() + ", getNoticeDescription()=" + getNoticeDescription()
				+ ", getNoticeDate()=" + getNoticeDate() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
	
	
	

}
