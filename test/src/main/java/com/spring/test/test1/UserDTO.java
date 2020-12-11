package com.spring.test.test1;

public class loginDTO {
	private String id;
	private String password;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public loginDTO() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "EncryDTO [id=" + id + ", password=" + password + "]";
	}
	
	
}
