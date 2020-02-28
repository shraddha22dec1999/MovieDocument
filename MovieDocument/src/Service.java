import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

import onlineMovieTicketSystem.Movie;
import onlineMovieTicketSystem.Screen;

public class Service extends Theater {
	static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	public void searchMovie(ArrayList list){
		try {
		System.out.println("Enter movie name");
		String moviename=br.readLine();
		if(list.isEmpty())
			System.out.println("Empty list");
		else {
			Iterator<Movie> it=list.iterator();
			while(it.hasNext()) {
				Movie m=it.next();
		
           String returnMovie = null;
			if (moviename.equalsIgnoreCase(m.getMovieName())) {
				System.out.println("Movie name:"+m.getMovieName());
				System.out.println("Movie Id:"+m.getMovieId());
				System.out.println("Movie genre:"+m.getMovieGenre());
				System.out.println("Movie Director:"+m.getMovieDirector());
				System.out.println("Movie Language:"+m.getLanguages());
				System.out.println("Movie release date:"+m.getMovieReleaseDate());
				break;
			}
		
		
	}}}
	catch(Exception e) {
		System.out.println("Wrong details...");
	}
		
	}
		
		public void searchScreen(ArrayList list2) {
				try {
				System.out.println("Enter screen");
				int screenId=Integer.valueOf(br.readLine());
				if(list2.isEmpty())
					System.out.println("Empty list");
				else {
					Iterator<Screen> it1=list2.iterator();
					while(it1.hasNext()) {
						Screen s=it1.next();
				
			 String returnScreen = null;
				if(screenId == s.getScreenId()){
					//returnScreen = screen;
					System.out.println("Available Screen :"+s.getScreenId());
					break;
				}
					}}}
			catch(Exception e) {
				System.out.println("Wrong details!!");
			}
}
}