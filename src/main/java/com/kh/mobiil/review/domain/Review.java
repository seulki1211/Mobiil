package com.kh.mobiil.review.domain;

import java.sql.Date;

public class Review {
	private int reviewNo;
	private int spaceNo;
	private int reviewImgNo;
	private String memberEmail;
	private String reviewContents;
	private String reviewWriter;
	private Date rCreateDate;
	private Date rUpdateDate;
	private String rStatus;
	
	public Review() {}

	public int getReviewNo() {
		return reviewNo;
	}

	public void setReviewNo(int reviewNo) {
		this.reviewNo = reviewNo;
	}

	public int getSpaceNo() {
		return spaceNo;
	}

	public void setSpaceNo(int spaceNo) {
		this.spaceNo = spaceNo;
	}

	public int getReviewImgNo() {
		return reviewImgNo;
	}

	public void setReviewImgNo(int reviewImgNo) {
		this.reviewImgNo = reviewImgNo;
	}

	public String getMemberEmail() {
		return memberEmail;
	}

	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}

	public String getReviewContents() {
		return reviewContents;
	}

	public void setReviewContents(String reviewContents) {
		this.reviewContents = reviewContents;
	}

	public String getReviewWriter() {
		return reviewWriter;
	}

	public void setReviewWriter(String reviewWriter) {
		this.reviewWriter = reviewWriter;
	}

	public Date getrCreateDate() {
		return rCreateDate;
	}

	public void setrCreateDate(Date rCreateDate) {
		this.rCreateDate = rCreateDate;
	}

	public Date getrUpdateDate() {
		return rUpdateDate;
	}

	public void setrUpdateDate(Date rUpdateDate) {
		this.rUpdateDate = rUpdateDate;
	}

	public String getrStatus() {
		return rStatus;
	}

	public void setrStatus(String rStatus) {
		this.rStatus = rStatus;
	}

	@Override
	public String toString() {
		return "Review [reviewNo=" + reviewNo + ", spaceNo=" + spaceNo + ", reviewImgNo=" + reviewImgNo
				+ ", memberEmail=" + memberEmail + ", reviewContents=" + reviewContents + ", reviewWriter="
				+ reviewWriter + ", rCreateDate=" + rCreateDate + ", rUpdateDate=" + rUpdateDate + ", rStatus="
				+ rStatus + "]";
	}
	
	

}
