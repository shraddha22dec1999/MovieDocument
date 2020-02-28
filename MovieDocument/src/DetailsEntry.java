import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import onlineMovieTicketSystem.Movie;
import onlineMovieTicketSystem.Screen;
import onlineMovieTicketSystem.Service1;
import onlineMovieTicketSystem.Service2;

public class DetailsEntry extends Service {
	public static void main(String[] args) {
		Service service=new Service();
		ArrayList<Movie> list=new ArrayList<>();
		ArrayList<Screen> list2=new ArrayList<>();
		Service1 s=new Service1();
		Service2 se=new Service2();
		try {
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			boolean flag=true;
			int choice;
			while(flag) {
			//	System.out.println("Enter movie details"+list.add(Service1.insert()));
				System.out.println("Enter your choice \n1)To insert Movie  \n2) To insert screen \n3) To search screen \n4) To search movie");
				choice=Integer.parseInt(br.readLine());
				Service ser=new Service();
				switch(choice) {
				case 1:
					list.add(Service1.insert());
					break;
				case 2:
			         list2.add(Service2.insert());
			         break;
				case 3:
					ser.searchScreen(list2);
					break;
				case 4:
					ser.searchMovie(list);
					break;
				default:
					System.out.println("Invalid choice");
					break;
				}
			}
		}
		catch(Exception e) {
			System.out.println("Enter choice as per above given reference. Run the program again!" );
		}
	}

}
