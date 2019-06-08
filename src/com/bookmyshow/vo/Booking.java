package com.bookmyshow.vo;

import java.sql.Time;
import java.util.Date;
import java.util.List;

public class Booking {
	int bookingId; 
    int userId; 
    int movieId; 
    List<Movie> bookedSeats; 
    int amount; 
   // PaymentStatus status_of_payment; 
    Date booked_date; 
    Time movie_timing;
	public int getBookingId() {
		return bookingId;
	}
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public List<Movie> getBookedSeats() {
		return bookedSeats;
	}
	public void setBookedSeats(List<Movie> bookedSeats) {
		this.bookedSeats = bookedSeats;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public Date getBooked_date() {
		return booked_date;
	}
	public void setBooked_date(Date booked_date) {
		this.booked_date = booked_date;
	}
	public Time getMovie_timing() {
		return movie_timing;
	}
	public void setMovie_timing(Time movie_timing) {
		this.movie_timing = movie_timing;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + amount;
		result = prime * result + ((bookedSeats == null) ? 0 : bookedSeats.hashCode());
		result = prime * result + ((booked_date == null) ? 0 : booked_date.hashCode());
		result = prime * result + bookingId;
		result = prime * result + movieId;
		result = prime * result + ((movie_timing == null) ? 0 : movie_timing.hashCode());
		result = prime * result + userId;
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
		Booking other = (Booking) obj;
		if (amount != other.amount)
			return false;
		if (bookedSeats == null) {
			if (other.bookedSeats != null)
				return false;
		} else if (!bookedSeats.equals(other.bookedSeats))
			return false;
		if (booked_date == null) {
			if (other.booked_date != null)
				return false;
		} else if (!booked_date.equals(other.booked_date))
			return false;
		if (bookingId != other.bookingId)
			return false;
		if (movieId != other.movieId)
			return false;
		if (movie_timing == null) {
			if (other.movie_timing != null)
				return false;
		} else if (!movie_timing.equals(other.movie_timing))
			return false;
		if (userId != other.userId)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Booking [bookingId=" + bookingId + ", userId=" + userId + ", movieId=" + movieId + ", bookedSeats="
				+ bookedSeats + ", amount=" + amount + ", booked_date=" + booked_date + ", movie_timing=" + movie_timing
				+ "]";
	}
    
}
