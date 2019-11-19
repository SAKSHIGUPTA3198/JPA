package com.lti.ui;




import java.util.*;

import com.lti.service.UserService;
public class Main1 {
	private static UserService service = null;
	 static{
		 
		 service = new UserService();
		 
	 }

	public static void main(String[] args) {
	//int ch=0;
	Scanner sc = new Scanner(System.in);
	System.out.println("1:Add User  2:Read User 3:Modify User 4:Delete User");

	System.out.println("Enter your choice");
	
	int ch= sc.nextInt();
	switch(ch)
	{

	case 1:
		
		System.out.println("Enter Username");
		int rollNumber=sc.nextInt();
		System.out.println("Enter Name");
		String studentName = sc.next();
		System.out.println("Enter Avg Score");
	double avgScore =sc.nextDouble();
		Users user = new Users (username,password firstname, lastname,mobilenumber);
	 boolean result = service.addStudent(user);
		break;
		
	case 2:
		System.out.println("enter username");
		 int rollno=sc.nextInt();
		 Users  user = service.findStudentByRollNumber(username);
		   System.out.println(user);
		break;
		
	case 3:
		System.out.println("enter rollno to modify");
		 rollno= sc.nextInt();
		student2 = service.findStudentByRollNumber(rollno);
		System.out.println(" enter name n score to update");
		studentName = sc.next();
		avgScore = sc.nextDouble();
		student = new Student(rollno, studentName, avgScore);
		student = service.modifyStudent(student);
		System.out.println(student);
		
		
		
		break;
		
	case 4:
		System.out.println("Enter Rollno");
		rollNumber=sc.nextInt();
		boolean student3 = service.removeStudent(rollNumber);

		break;
		
		
	
	}
	}

}
