package clientServer;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class User {
	
	Socket s;
	DataInputStream in;
	DataOutputStream out;
	
	
	public void initSocket(Socket s) throws IOException {
		this.s=s;
		this.in=new DataInputStream(s.getInputStream());
		this.out=new DataOutputStream(s.getOutputStream());
	}
	
	public void send(String msg) throws IOException {
		this.out.writeUTF(msg);
	}
	public String get() throws IOException {
		return this.in.readUTF();
	}
	

}
