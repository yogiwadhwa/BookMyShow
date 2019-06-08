package com.bookmyshow.constants;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.bookmyshow.vo.Movie;
import com.bookmyshow.vo.Screen;
import com.bookmyshow.vo.Theater;

public class BookMyShowConstants {

	public static List<String> theaterid;
	static {
		theaterid = new ArrayList<String>();
		theaterid.add("THT1");
		theaterid.add("THT2");
		theaterid.add("THT3");
	}
	public static Movie movie1;
	static {
		movie1 = new Movie();
		movie1.setMovieId(1);
		movie1.setMovieName("Jurassic Park");
		movie1.setTheaterId(theaterid);
	}

	public static List<Movie> movies;
	static {
		movies = new ArrayList<>(Arrays.asList(movie1));
	}

	public static Screen screen1;
	static {
		screen1 = new Screen();
		screen1.setScreenId(01);
		screen1.setScreenName("Large Screen");
		screen1.setScreenType("Large");
		screen1.setNoOfSeats(50);
	}

	public static Screen screen2;
	static {
		screen2 = new Screen();
		screen2.setScreenId(02);
		screen2.setScreenName("Extra Large Screen");
		screen2.setScreenType("Large");
		screen2.setNoOfSeats(50);
	}
	public static Screen screen3;
	static {
		screen3 = new Screen();
		screen3.setScreenId(03);
		screen3.setScreenName("Small Screen");
		screen3.setScreenType("Small");
		screen3.setNoOfSeats(50);
	}

	public static List<Screen> screens;
	static {
		screens = new ArrayList<>(Arrays.asList(screen1, screen2, screen3));
	}
	public static Theater theater;
	static {
		theater = new Theater();
		theater.setTheaterid("THT1");
		theater.setTheaterName("SANGAM");
		theater.setMovies(movies);
		theater.setScreens(screens);
	}
	public static List<Theater> theaters;
	static {
		theaters = new ArrayList<>(Arrays.asList(theater));
	}
}