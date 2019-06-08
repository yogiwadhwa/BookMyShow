package com.bookmyshow.vo;

import java.util.List;

public class Movie {
	int movieId;
	String movieName;
	List<String> theaterId;
	public List<String> getTheaterId() {
		return theaterId;
	}
	public void setTheaterId(List<String> theaterId) {
		this.theaterId = theaterId;
	}
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + movieId;
		result = prime * result + ((movieName == null) ? 0 : movieName.hashCode());
		result = prime * result + ((theaterId == null) ? 0 : theaterId.hashCode());
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
		Movie other = (Movie) obj;
		if (movieId != other.movieId)
			return false;
		if (movieName == null) {
			if (other.movieName != null)
				return false;
		} else if (!movieName.equals(other.movieName))
			return false;
		if (theaterId == null) {
			if (other.theaterId != null)
				return false;
		} else if (!theaterId.equals(other.theaterId))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", movieName=" + movieName + ", theaterId=" + theaterId + "]";
	}
	
}
