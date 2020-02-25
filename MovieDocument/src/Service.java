import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

import onlineMovieTicketSystem.Movie;
import onlineMovieTicketSystem.Screen;

public class Service extends Theater {
	static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	public Movie searchMovie(ArrayList list){
		try {
		System.out.println("Enter movie name");
		String moviename=br.readLine();
		if(list.isEmpty())
			System.out.println("Empty list");
		else {
			Iterator<Movie> it=list.iterator();
			while(it.hasNext()) {
				Movie m=it.next();
		
           Movie returnMovie = null;
		for(Movie movie2 : getMovies()){
			if (moviename.equalsIgnoreCase(movie2.getMovieName())) {
				returnMovie = movie2;
				break;
			}
		}
		
		return returnMovie;
	}}}
	catch(Exception e) {
		System.out.println("Wrong details");
	}
		return null;
	}
		
		public Screen searchScreen(ArrayList list2) {
				try {
				System.out.println("Enter screen");
				int screenId=Integer.valueOf(br.readLine());
				if(list2.isEmpty())
					System.out.println("Empty list");
				else {
					Iterator<Screen> it1=list2.iterator();
					while(it1.hasNext()) {
						Screen s=it1.next();
				
			 Screen returnScreen = null;
			 for (Screen screen : getListOfScreens()) {
				if(screenId == screen.getScreenId()){
					returnScreen = screen;
					break;
				}
			}
			 return returnScreen;
					}}}
			catch(Exception e) {
				System.out.println("Wrong details!!");
			}
				return null;
}
}