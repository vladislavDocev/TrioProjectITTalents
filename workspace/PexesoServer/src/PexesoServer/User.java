package PexesoServer;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class User {
	
	Socket s;
	DataInputStream in;
	DataOutputStream out;
	int points;
	int number;

	public void initSocket(Socket s) throws IOException {
		this.s=s;
		in=new DataInputStream(s.getInputStream());
		out=new DataOutputStream(s.getOutputStream());
	}

	public void send(String msg) throws IOException {
		this.out.writeUTF(msg);
	}
	public int get() throws IOException {
		return this.in.readInt();
	}

	
}
