package com.demo;

public class Bank {
	private int accno;
	private String name;
	private int balance;
	public Bank() {
		
	}
	public Bank(String name, int balance) {
		super();
		this.accno = accno;
		this.name = name;
		this.balance = balance;
	}
	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Bank [accno=" + accno + ", name=" + name + ", balance=" + balance + "]";
	}

}
