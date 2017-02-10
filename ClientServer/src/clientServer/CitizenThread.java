package clientServer;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;

public class CitizenThread implements Runnable {
	
	String[] candidates;
	User u;
	HashMap<Integer,Integer> votes; 
	ArrayList<User> votedCitizensRegister = new ArrayList<User>();
	
	public CitizenThread(User u) {
		this.u=u;
		this.candidates = new String[10];
		this.votes=new HashMap<Integer,Integer>();
		for (int i = 0; i < candidates.length; i++) {
			candidates[i]="Izbor";
			votes.put(i, 0);
		}
	}
	@Override
	public void run() {
		try {
			this.u.send(Arrays.toString(candidates));
			this.u.send("Candidates Sent!");
		} catch (IOException e) {
			System.out.println("Could not send candidates to User");
		}
		try {
			this.u.send("Please send your name, and the id of the candidate");
			String name=this.u.get();
			int id=Integer.parseInt(this.u.get());
			if(votes.containsKey(id)) {
				for(Entry<Integer, Integer> e : votes.entrySet()) {
					if(e.getKey()==id) {
						int votesNumber=e.getValue() + 1;
						e.setValue(votesNumber);
						System.out.println("Correctly voted for " + this.candidates[id]);
						votedCitizensRegister.add(u);
					}
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
		catch(IOException e) {
			System.out.println("Could not receive information from user");
		}
		
	}

}
