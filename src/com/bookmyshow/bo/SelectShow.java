package com.bookmyshow.bo;

import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;

import com.bookmyshow.constants.BookMyShowConstants;
import com.bookmyshow.vo.Booking;
import com.bookmyshow.vo.Movie;
import com.bookmyshow.vo.Screen;
import com.bookmyshow.vo.Theater;

public class SelectShow {
	Scanner sc = new Scanner(System.in);
	static int bookid;
	public int selectMovie() {
		System.out.println("Select Movie :");
		Iterator<Movie> itr = BookMyShowConstants.movies.iterator();
		while (itr.hasNext()) {
			Movie mov;
			mov = itr.next();
			System.out.println(mov.getMovieId() + "," + mov.getMovieName());
		}
		int moviech = sc.nextInt();
		
		return moviech;
	}
	public String selectTheater(int moviech) {
		System.out.println("Select Theater:");
		Iterator<Theater> itr = BookMyShowConstants.theaters.iterator();
		while (itr.hasNext()) {
			Theater thtr;
			thtr = itr.next();
			System.out.println(thtr.getTheaterid() + "," + thtr.getTheaterName());
		}
		sc.nextLine();
		String thtrch = sc.nextLine();
		
		return thtrch;
	}
	public int selectScreen(int thtrch) {
		System.out.println("Select Screen:");
		Iterator<Screen> itr = BookMyShowConstants.screens.iterator();
		while (itr.hasNext()) {
			Screen scr;
			scr = itr.next();
			System.out.println(scr.getScreenId() + "," + scr.getScreenName());
		}
		int scrch = sc.nextInt();
		
		return scrch;
	}
	public void selectSeatNo(int scrch,int movieId) {
		System.out.println("Enter the no of tickets:");
		int no = sc.nextInt(); 
		System.out.println("Congrats Your Tickets are booked");
		Booking book = new Booking();
		bookid++;
		book.setBookingId(bookid);
		book.setBooked_date(new Date());
		book.setUserId(RegisterUser.userId);
		book.setMovieId(movieId);
		
	}
}
