package databasecommunicator;

import java.util.Scanner;
import databasecommunicator.Communicator;
public class App {

	public static void main(String[] args) {
		Communicator communicator = new Communicator();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter:");
		String input = sc.nextLine();
		if(input.equals("pa55word")) 
		{
			while(!input.toLowerCase().equals("exit()"))
			{	
				System.out.print("Enter account name:");
				String acc_name = sc.next();
				
				System.out.print("Enter account email:");
				String acc_email = sc.next();
				
				System.out.print("Enter account password:");
				String acc_pass = sc.next();
				
				System.out.print("Enter application name:");
				String app = sc.next();
				
				communicator.Run(acc_name, acc_email, acc_pass, app);
				System.out.println("Enter 'exit()' to quit");
				input = sc.next();
			}
		}
		System.out.println("Have a nice day!");
	}
}
