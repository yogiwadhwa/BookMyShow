package com.bookmyshow.vo;

import java.util.List;

public class Theater {
	String theaterid;
	String theaterName;
	Address address;
	
	List<Movie> movies;
	List<Screen> screens;
	float rating;

	public String getTheaterid() {
		return theaterid;
	}
	public void setTheaterid(String theaterid) {
		this.theaterid = theaterid;
	}
	public List<Screen> getScreens() {
		return screens;
	}
	public void setScreens(List<Screen> screens) {
		this.screens = screens;
	}
	public String getTheaterName() {
		return theaterName;
	}
	public void setTheaterName(String theaterName) {
		this.theaterName = theaterName;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public List<Movie> getMovies() {
		return movies;
	}
	public void setMovies(List<Movie> movies) {
		this.movies = movies;
	}
	public float getRating() {
		return rating;
	}
	public void setRating(float rating) {
		this.rating = rating;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((movies == null) ? 0 : movies.hashCode());
		result = prime * result + Float.floatToIntBits(rating);
		result = prime * result + ((screens == null) ? 0 : screens.hashCode());
		result = prime * result + ((theaterName == null) ? 0 : theaterName.hashCode());
		result = prime * result + ((theaterid == null) ? 0 : theaterid.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Theater other = (Theater) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (movies == null) {
			if (other.movies != null)
				return false;
		} else if (!movies.equals(other.movies))
			return false;
		if (Float.floatToIntBits(rating) != Float.floatToIntBits(other.rating))
			return false;
		if (screens == null) {
			if (other.screens != null)
				return false;
		} else if (!screens.equals(other.screens))
			return false;
		if (theaterName == null) {
			if (other.theaterName != null)
				return false;
		} else if (!theaterName.equals(other.theaterName))
			return false;
		if (theaterid == null) {
			if (other.theaterid != null)
				return false;
		} else if (!theaterid.equals(other.theaterid))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Theater [theaterid=" + theaterid + ", theaterName=" + theaterName + ", address=" + address + ", movies="
				+ movies + ", screens=" + screens + ", rating=" + rating + "]";
	}
	
}
