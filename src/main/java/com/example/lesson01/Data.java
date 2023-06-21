package com.example.lesson01;

// 일반 java bean 
public class Data { //바구니같은 객체
	
	// field
	private int id;
	private String name;
	private String addr;
	
	
	//getter, setter
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}

}
