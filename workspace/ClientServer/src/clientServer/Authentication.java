package clientServer;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Authentication implements Runnable {
	
	User u;
	int idn;
	HashMap<Integer,String> users;
	
	public Authentication(User u) {
		this.u=u;
		users = new HashMap<Integer,String> ();
		generateUsers();
	}
	@Override
	public void run() {
		int number;
		loop : while(true) {
		try {
			u.send("Please enter your unique 10-digit identification number:");
			number = Integer.parseInt(u.get());
		}
		catch(IOException e){
			System.out.println("Something went wrong");
			continue loop;
			}
		break;
		}
	
		if(users.containsKey(number)) {
			if(users.get(number).equals("Citizen")) {
				System.out.println("You are now logged in as Citizen");
				Thread t = new Thread(new CitizenThread(u));
				t.start();
			}
		}
		
		else {
			try {
				u.send("REFUSE");
			} catch (IOException e) {
				System.out.println("Cant send message");
			}
		}

	
		
	}
	
	private void generateUsers() {
		users.put(1010101010, "Admin");
		users.put(1111111111, "Citizen");
		users.put(1212121212, "Citizen");
		users.put(1414141414, "Citizen");
		users.put(1515151515, "Citizen");
	}

}
