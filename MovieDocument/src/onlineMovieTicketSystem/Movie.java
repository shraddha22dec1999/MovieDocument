package onlineMovieTicketSystem;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Movie {

	private Integer movieId, movieLength;
	private String movieName;
	private ArrayList<String> movieGenre;
	String movieDirector;
	private LocalDate movieReleaseDate;
	private String[] languages;
	
	public Integer getMovieId() {
		return movieId;
	}
	public void setMovieId(Integer movieId) {
		this.movieId = movieId;
	}
	public Integer getMovieLength() {
		return movieLength;
	}
	public void setMovieLength(Integer movieLength) {
		this.movieLength = movieLength;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public ArrayList<String> getMovieGenre() {
		return movieGenre;
	}
	public void setMovieGenre(ArrayList<String> al) {
		this.movieGenre = al;
	}
	public String getMovieDirector() {
		return movieDirector;
	}
	public void setMovieDirector(String string) {
		this.movieDirector = string;
	}
	public LocalDate getMovieReleaseDate() {
		return movieReleaseDate;
	}
	public void setMovieReleaseDate(LocalDate movieReleaseDate) {
		this.movieReleaseDate = movieReleaseDate;
	}
	public String[] getLanguages() {
		return languages;
	}
	public void setLanguages(String[] al3) {
		this.languages = al3;
	}
	public void setMovieLength(LocalTime of) {
		// TODO Auto-generated method stub
		
	}
	public void setLanguages(ArrayList<String> al3) {
		// TODO Auto-generated method stub
		
	}
	
}
