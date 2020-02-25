import java.io.BufferedReader;
import java.io.InputStreamReader;
//import java.security.Provider.Service;
import java.util.ArrayList;

import onlineMovieTicketSystem.Movie;
import onlineMovieTicketSystem.Screen;
import onlineMovieTicketSystem.Service1;

public class DetailsEntry extends Service {
	public static void main(String[] args) {
		Service service=new Service();
		ArrayList<Movie> list=new ArrayList<>();
		ArrayList<Screen> list2=new ArrayList<>();
		Service1 s=new Service1();
		try {
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			boolean flag=true;
			int choice;
			while(flag) {
				System.out.println("Enter your choice \n1) To search movie \n2) To search screen \n3) To insert Movie");
				choice=Integer.parseInt(br.readLine());
				Service ser=new Service();
				switch(choice) {
				case 1:
					ser.searchMovie(list);
					break;
				case 2:
					ser.searchScreen(list2);
					break;
				case 3:
					list.add(Service1.insert());
					break;
				}
			}
		}
		catch(Exception e) {
			System.out.println("Enter choice as per above given reference. Run the program again!" );
		}
	}

}
