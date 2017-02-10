package clientServer;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client {
	
	final static String host="localhost";
	final static int port=1212;
	
	public static void main(String[] args) {
		System.out.println("Connecting to server...");
		Socket s;
		DataInputStream in;
		DataOutputStream out;
		Scanner keybIn = new Scanner(System.in);
		
		try{
			s=new Socket(host,port);
			in=new DataInputStream(s.getInputStream());
			out=new DataOutputStream(s.getOutputStream());
		}
		catch(IOException e) {
			System.out.println("Cant connect to server");
			return;
		}
		System.out.println("Connected to server");
		String msgFromServer;
		String toSend;
		
		try {
			while(true) {
				msgFromServer=in.readUTF();
				System.out.println(msgFromServer);
				if(msgFromServer.equals("REFUSE")) {
					System.out.println("Incorrect details. You are now logging off...");
					break;
				}
				else if(msgFromServer.equals("Please enter your unique 10-digit identification number:")) {
					System.out.println("Enter 10-digit number:");
					toSend=keybIn.next();
					out.writeUTF(toSend);
				}
				else if(msgFromServer.equals("Please send your name, and the id of the candidate")) {
					System.out.println("Enter name:");
					toSend=keybIn.next();
					out.writeUTF(toSend);
					System.out.println("Enter id of the candidate from the sent list:");
					toSend=keybIn.next();
					out.writeUTF(toSend);
				}
			}
		} catch (IOException e2) {
			System.out.println("Connection lost");
			
		} 
		finally{
			try {
				if(in!=null) in.close();
				if(out!=null) out.close();
				if(s!=null) s.close();
			}
			catch(IOException e2) {}
		
		}
		
	}

}
