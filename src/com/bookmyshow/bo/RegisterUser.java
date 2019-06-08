package com.bookmyshow.bo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.bookmyshow.vo.User;

public class RegisterUser {
	static int userId;
	Scanner sc = new Scanner(System.in);
	List<User> users = new ArrayList<>();

	public void Register() {

		User user = new User();
		System.out.println("Please provide the below Details to Register:");
		userId++;
		System.out.println("Enter Name");
		String name = sc.nextLine();
		System.out.println("Enter Mobile No");
		String mobileNo = sc.nextLine();
		System.out.println("Enter Email Id");
		String emailId = sc.nextLine();
		System.out.println("Enter Gender");
		String gender = sc.nextLine();
		System.out.println("Enter Password");
		String password = sc.nextLine();
		if (name != null) {
			user.setName(name);
		}
		if (mobileNo != null) {
			user.setMobno(mobileNo);
		}
		if (emailId != null) {
			user.setEmailid(emailId);
		}
		if (gender != null) {
			user.setGender(gender);
		}
		if (password != null) {
			user.setPassword(password);
		}
		users.add(user);
		System.out.println("User Registered Success");

	}

	public Boolean login() {
		System.out.println("Enter Name");
		String name = sc.nextLine();
		System.out.println("Enter Password");
		String password = sc.nextLine();
	    Boolean check = false;
		Iterator <User>itr = users.iterator();
		while(itr.hasNext()) {
			User usr;
			usr = itr.next(); 
			if(usr.getName().equalsIgnoreCase(name) && usr.getPassword().equalsIgnoreCase(password)) {
				check = true;
				break;
			}
		}
	 	if(check) { 
			System.out.println("Login Success");
	 	}
		else {
			System.out.println("Login Failed");
		}
	 	return check;
	}
}
