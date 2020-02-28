package onlineMovieTicketSystem;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Service1 extends Movie {
	static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	public static Movie insert() {
		Movie m=new Movie();
		try {
			ArrayList <String> al=new ArrayList<>();
			ArrayList<Integer> al2=new ArrayList<>();
			ArrayList<String> al3=new ArrayList<>();
			ArrayList<Integer> al4=new ArrayList<>();
	
			System.out.println("Enter the name of the movie");
			m.setMovieName(br.readLine());
			
			System.out.println("Enter the movie id");
			m.setMovieId(Integer.parseInt(br.readLine()));
			
			System.out.println("Enter the show genre");
			String str=br.readLine();
		    StringTokenizer st=new StringTokenizer(str,",");
			while(st.hasMoreTokens()) {
				al.add(st.nextToken());
			}
	//		System.out.println("set movie genre");
			m.setMovieGenre(al);
			
			System.out.println("Enter the name of movie director");
			m.setMovieDirector(br.readLine());
			
			System.out.println("Enter screen time of movie in format hh:mm:ss");
			str=br.readLine();
			st=new StringTokenizer(str,":");
			while(st.hasMoreTokens()) {
				al2.add(Integer.parseInt(st.nextToken()));
		     }
			m.setMovieLength(LocalTime.of((int)al2.get(0),(int)al2.get(1),(int)al2.get(2)));
			System.out.println("Enter the language of the movie");
			str=br.readLine();
			st=new StringTokenizer(str,",");
			while(st.hasMoreElements())
			{
			al3.add(st.nextToken());}
			m.setLanguages(al3);
			System.out.println("Enter date of the movie release in format dd/mm/yyyy");
			str=br.readLine();
			st=new StringTokenizer(str,"/");
			while(st.hasMoreElements()) {
			al4.add(Integer.parseInt(st.nextToken()));
			}
			m.setMovieReleaseDate(LocalDate.of(al4.get(2), al4.get(1), al4.get(0)));
			System.out.println("Done!!");
			return m;
			}
		catch(Exception e) {
			System.out.println("Wrong details!!");
			return null;
		}
	}
	
	
}
