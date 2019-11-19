package com.lti.ui;

import java.util.Scanner;

import com.lti.service.UserService;

public class Main2 {
	private static UserService service = null;
	 static{
		 
		 service = new UserService();
		 
	 }

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println(" enter username");
		String username = sc.next();
		System.out.println("enter password");
		String password= sc.next();
		boolean result = service.checkLogin(username, password);
		if(result){
			System.out.println("Sucessful login... show the menu");
		}else{
			System.out.println("Invalid login...");
		}
	

}
}