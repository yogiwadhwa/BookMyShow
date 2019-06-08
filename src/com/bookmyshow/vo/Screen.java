package com.bookmyshow.vo;

public class Screen {
	int screenId;
	String screenType;
	int noOfSeats;
	String screenName;
	public int getScreenId() {
		return screenId;
	}
	public void setScreenId(int screenId) {
		this.screenId = screenId;
	}
	public String getScreenType() {
		return screenType;
	}
	public void setScreenType(String screenType) {
		this.screenType = screenType;
	}
	public int getNoOfSeats() {
		return noOfSeats;
	}
	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}
	public String getScreenName() {
		return screenName;
	}
	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + noOfSeats;
		result = prime * result + screenId;
		result = prime * result + ((screenName == null) ? 0 : screenName.hashCode());
		result = prime * result + ((screenType == null) ? 0 : screenType.hashCode());
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
		Screen other = (Screen) obj;
		if (noOfSeats != other.noOfSeats)
			return false;
		if (screenId != other.screenId)
			return false;
		if (screenName == null) {
			if (other.screenName != null)
				return false;
		} else if (!screenName.equals(other.screenName))
			return false;
		if (screenType == null) {
			if (other.screenType != null)
				return false;
		} else if (!screenType.equals(other.screenType))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Screen [screenId=" + screenId + ", screenType=" + screenType + ", noOfSeats=" + noOfSeats
				+ ", screenName=" + screenName + "]";
	}
	
}
