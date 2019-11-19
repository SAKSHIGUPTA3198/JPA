package com.lti.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;
@Entity
@Table(name="Student")
@SequenceGenerator(name="seq",sequenceName="seq_student",initialValue=1,allocationSize=1)
public class Student implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="seq")
	private int studentId;
	private int rollName;
	private String StudentName;
	private double avgScore;
	@Transient
	private String dob;
	
	@OneToOne
	@JoinColumn(name="addressId")
	private Address address;
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public int getRollName() {
		return rollName;
	}
	public void setRollName(int rollName) {
		this.rollName = rollName;
	}
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	public double getAvgScore() {
		return avgScore;
	}
	public void setAvgScore(double avgScore) {
		this.avgScore = avgScore;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	
	
	public Address getAddress() {
		return address;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}
	public Student( int rollName, String studentName, double avgScore) {
		super();
		
		this.rollName = rollName;
		StudentName = studentName;
		this.avgScore = avgScore;
	}
	public Student() {
		super();
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", rollName=" + rollName + ", StudentName=" + StudentName
				+ ", avgScore=" + avgScore + "]";
	}
	
	
	

}
