package com.snackcase.pojo;

public class User {
	private String userId;
	
	
	private String email;
	private String username;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	private String name;
	private String age;
	private String telephone;
	private String gender;
	private String nickname;
	private int role;
	private String password;
	private String password2;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public int getRole() {
		return role;
	}
	public void setRole(int i) {
		this.role = i;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPassword2() {
		return password2;
	}
	public void setPassword2(String password2) {
		this.password2 = password2;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", email=" + email + ", username=" + username + ", name=" + name + ", age="
				+ age + ", telephone=" + telephone + ", gender=" + gender + ", nickname=" + nickname + ", role=" + role
				+ ", password=" + password + ", password2=" + password2 + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
