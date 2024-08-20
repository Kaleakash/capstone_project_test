package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {
@Id
private int sid;
private String sname;
private int age;

public Student() {
	super();
	// TODO Auto-generated constructor stub
}

public Student(int sid, String sname, int age) {
	super();
	this.sid = sid;
	this.sname = sname;
	this.age = age;
}

public int getSid() {
	return sid;
}
public void setSid(int sid) {
	this.sid = sid;
}
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}

}
