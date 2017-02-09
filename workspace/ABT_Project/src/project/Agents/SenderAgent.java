package project.Agents;

import java.util.Scanner;

import jade.core.*;
import jade.lang.acl.ACLMessage;
// ���� � �������, �������� ���������,��������� user request, � ������ ���, �� ����/����� ������, 
public class SenderAgent extends Agent { 
	/**
	 * Petko Gotsov
	 */
	private static final long serialVersionUID = 1L;
	private Scanner sc;
	public String name;
	
	// � setup �� ������ ����� �� ��������� name � ���������� ����� sendMessage() �� �� �� �������� �� ����� ������
	protected void setup() { 
		sc = new Scanner(System.in);
		System.out.println("Enter name: ");
		name = sc.nextLine();
		System.out.println("Hello! My local name is: " + this.getLocalName());
		sendMessage();
	}

	private void sendMessage() {  
		AID r = new AID("Peter", AID.ISLOCALNAME); // ��������� ��������� �� AID, ����� ������� ����� �� ������ �� ����� ��������� ���������
		ACLMessage aclMessage = new ACLMessage(ACLMessage.REQUEST); // ��������� ����� �� ��� ACLMessage ���� �������� ���� �� ����������� - REQUEST
		aclMessage.addReceiver(r); // ����� �� �������� �� ��������� �� �����������
		aclMessage.setContent(name); // ����� �� �������� ���������� �� ����������� � ������ name
		this.send(aclMessage); // ��������� ���������
	}
}
