package com.example.demo.Model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class User {
@Id
@GeneratedValue
int userId;
String name;
String password;
String mobile;
String email;
String role;
public int getUserId() {
	return userId;
}
public void setUserId(int userId) {
	this.userId = userId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getMobile() {
	return mobile;
}
public void setMobile(String mobile) {
	this.mobile = mobile;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getRole() {
	return role;
}
public void setRole(String role) {
	this.role = role;
}
public User(int userId, String name, String password, String mobile, String email, String role) {
	super();
	this.userId = userId;
	this.name = name;
	this.password = password;
	this.mobile = mobile;
	this.email = email;
	this.role = role;
}
public User() {
	super();
	// TODO Auto-generated constructor stub
}


}
