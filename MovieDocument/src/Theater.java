import java.io.BufferedReader;
import java.io.InputStreamReader;

import onlineMovieTicketSystem.Movie;
import onlineMovieTicketSystem.Screen;

public class Theater {
	
	public Integer getTheaterId() {
		return theaterId;
	}

	public void setTheaterId(Integer theaterId) {
		this.theaterId = theaterId;
	}

	public String getTheaterName() {
		return theaterName;
	}

	public void setTheaterName(String theaterName) {
		this.theaterName = theaterName;
	}

	public String getTheaterCity() {
		return theaterCity;
	}

	public void setTheaterCity(String theaterCity) {
		this.theaterCity = theaterCity;
	}

	public String getManagerName() {
		return managerName;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}

	public String getManagerContact() {
		return managerContact;
	}

	public void setManagerContact(String managerContact) {
		this.managerContact = managerContact;
	}

	public Movie[] getMovies() {
		return movies;
	}

	public void setMovies(Movie[] movies) {
		this.movies = movies;
	}

	public Screen[] getListOfScreens() {
		return listOfScreens;
	}

	public void setListOfScreens(Screen[] listOfScreens) {
		this.listOfScreens = listOfScreens;
	}

	private Integer theaterId;
	private String theaterName, theaterCity, managerName, managerContact;
	protected Movie[] movies;
	private Screen[] listOfScreens;

    
	
	}
		
	