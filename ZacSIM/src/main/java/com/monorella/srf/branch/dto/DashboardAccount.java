package com.monorella.srf.branch.dto;

public class DashboardAccount {
	private String branch_owner_cd; //등록 지점
	private int january; //1월 회계
	private int february;
	private int march;
	private int april;
	private int may;
	private int june;
	private int july;
	private int august;
	private int september;
	private int october;
	private int november;
	private int december;
	private String account_type; //수입 or 지출
	public String getBranch_owner_cd() {
		return branch_owner_cd;
	}
	public void setBranch_owner_cd(String branch_owner_cd) {
		this.branch_owner_cd = branch_owner_cd;
	}
	public int getJanuary() {
		return january;
	}
	public void setJanuary(int january) {
		this.january = january;
	}
	public int getFebruary() {
		return february;
	}
	public void setFebruary(int february) {
		this.february = february;
	}
	public int getMarch() {
		return march;
	}
	public void setMarch(int march) {
		this.march = march;
	}
	public int getApril() {
		return april;
	}
	public void setApril(int april) {
		this.april = april;
	}
	public int getMay() {
		return may;
	}
	public void setMay(int may) {
		this.may = may;
	}
	public int getJune() {
		return june;
	}
	public void setJune(int june) {
		this.june = june;
	}
	public int getJuly() {
		return july;
	}
	public void setJuly(int july) {
		this.july = july;
	}
	public int getAugust() {
		return august;
	}
	public void setAugust(int august) {
		this.august = august;
	}
	public int getSeptember() {
		return september;
	}
	public void setSeptember(int september) {
		this.september = september;
	}
	public int getOctober() {
		return october;
	}
	public void setOctober(int october) {
		this.october = october;
	}
	public int getNovember() {
		return november;
	}
	public void setNovember(int november) {
		this.november = november;
	}
	public int getDecember() {
		return december;
	}
	public void setDecember(int december) {
		this.december = december;
	}
	public String getAccount_type() {
		return account_type;
	}
	public void setAccount_type(String account_type) {
		this.account_type = account_type;
	}
	@Override
	public String toString() {
		return "DashboardAccount [branch_owner_cd=" + branch_owner_cd + ", january=" + january + ", february="
				+ february + ", march=" + march + ", april=" + april + ", may=" + may + ", june=" + june + ", july="
				+ july + ", august=" + august + ", september=" + september + ", october=" + october + ", november="
				+ november + ", december=" + december + ", account_type=" + account_type + "]";
	}
	
	
}
