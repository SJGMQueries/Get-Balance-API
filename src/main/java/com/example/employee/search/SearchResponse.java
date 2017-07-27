package com.example.employee.search;


public class SearchResponse {
	private String flag;
	private double balance;
	public String getFlag() {
		return flag;
	}
	public void setFlag(String flag) {
		this.flag = flag;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "SearchResponse [flag=" + flag + ", balance=" + balance + "]";
	}

	

}
