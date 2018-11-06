package com.shop.entity;

import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;
import org.springframework.stereotype.Component;

import java.util.*;

@Component("users")
public class Users {
	private Integer id;
	private String name;
	private String gender;
	private String phone;
	private String password;
	private String regip;
	private Date joindate;
	private Integer usernum;

	@Override
	public String toString() {
		return "Users{" +
				"id=" + id +
				", name='" + name + '\'' +
				", gender='" + gender + '\'' +
				", phone=" + phone +
				", password='" + password + '\'' +
				", regip='" + regip + '\'' +
				", joindate=" + joindate +
				", usernum=" + usernum +
				'}';
	}

	public Users() {
		super();
	}

	public Users(String name, String gender, String phone, String password, String regip, Date joindate, Integer usernum) {
		this.name = name;
		this.gender = gender;
		this.phone = phone;
		this.password = password;
		this.regip = regip;
		this.joindate = joindate;
		this.usernum = usernum;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRegip() {
		return regip;
	}

	public void setRegip(String regip) {
		this.regip = regip;
	}

	public Date getJoindate() {
		return joindate;
	}

	public void setJoindate(Date joindate) {
		this.joindate = joindate;
	}

	public Integer getUsernum() {
		return usernum;
	}

	public void setUsernum(Integer usernum) {
		this.usernum = usernum;
	}
}
