package clientServer;

import java.io.IOException;
import java.net.ServerSocket;
import java.util.LinkedList;

public class ClientServer {
	
	static int port=1212;
	
	public static void main(String[] args) {
		
		ServerSocket servSocket;
		try{
			servSocket=new ServerSocket(port);
		}
		catch(IOException e) {
			System.out.println("Cant Start Server");
			return;
		}
		System.out.println("Server Started!");
		LinkedList<User> users = new LinkedList<User>();
		
		synchronized (users) {
			
			mainloop : while(true) {
				User u = new User();
				
				try{
					u.initSocket(servSocket.accept());
					System.out.println("New user is connected");
					users.add(u);
					u.send("Please wait");
				}
				catch(IOException e) {
					System.out.println("Connection failed");
					users.remove(users.indexOf(u));
					continue mainloop;
				}
				
				LinkedList<User> copy = (LinkedList<User>) users.clone();
				users=new LinkedList<>();
				
				Thread t = new Thread(new Authentication(u));
				t.start();
				System.out.println("Authentication is in process...");
				
			}
			
		}
	}
	
}
