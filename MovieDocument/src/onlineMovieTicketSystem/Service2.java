package onlineMovieTicketSystem;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Service2 extends Screen{
	static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	public static Screen insert() {
		Screen s=new Screen();
		try {
			ArrayList <String> al=new ArrayList<>();
			ArrayList<Integer> al2=new ArrayList<>();
			ArrayList<String> al3=new ArrayList<>();
			ArrayList<Integer> al4=new ArrayList<>();
	            
			System.out.println("Enter the screen id");
			s.setScreenId(Integer.parseInt(br.readLine()));
			
			System.out.println("Done!!");
			return s;
			}
		catch(Exception e) {
			System.out.println("Wrong details!!");
			return null;
		}
	}
	
	
}



