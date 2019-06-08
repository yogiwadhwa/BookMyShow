package com.bookmyshow.bo;

import java.util.Scanner;

public class Communicator {
	Boolean check = false;
	public void serveUser(){
		RegisterUser registerUser = new RegisterUser();
		SelectShow selectShow = new SelectShow();
		int choice;
		System.out.println("Welcome to BookMyShow");
		while(true) {
		if(!check) {
		System.out.println("Please Register or Login to proceed ahead \n1.Register \n2.Login\n 3.Exit");
		Scanner sc = new Scanner(System.in);
		choice = sc.nextInt();
		}
		else{
			choice = 2;
		}
		switch(choice) {
			case 1:
				registerUser.Register();
				break;
			case 2:
				if(!check)
				check = registerUser.login();
				if(check) {
					Scanner sc1 = new Scanner(System.in);
					System.out.println("Please enter 1 to go for Movie List:");
					int ch = sc1.nextInt();
					if(ch == 1) {
					int moviech = selectShow.selectMovie();
					String thch = selectShow.selectTheater(moviech);
					int scrch = selectShow.selectScreen(moviech);
					selectShow.selectSeatNo(scrch, moviech);
					}
					else {
						System.out.println("Wrong Choice");
						break;
					}
				}
				break;
			case 3: 
				System.out.println("Stopping the App");
				System.exit(0);
				break;
		}
		}
	}
}
