package project.Agents;

import java.util.Scanner;

import jade.core.*;
import jade.lang.acl.ACLMessage;
// Това е агентът, изпращащ съобщение,съдържащо user request, в случая име, до друг/други агенти, 
public class SenderAgent extends Agent { 
	/**
	 * Petko Gotsov
	 */
	private static final long serialVersionUID = 1L;
	private Scanner sc;
	public String name;
	
	// В setup на агента четем от конзолата name и използваме метод sendMessage() за да го изпратим до други агенти
	protected void setup() { 
		sc = new Scanner(System.in);
		System.out.println("Enter name: ");
		name = sc.nextLine();
		System.out.println("Hello! My local name is: " + this.getLocalName());
		sendMessage();
	}

	private void sendMessage() {  
		AID r = new AID("Peter", AID.ISLOCALNAME); // Създаваме инстанция на AID, която съдържа името на агента до който изпращаме съобщение
		ACLMessage aclMessage = new ACLMessage(ACLMessage.REQUEST); // създаваме обект от тип ACLMessage като задаваме типа на съобщението - REQUEST
		aclMessage.addReceiver(r); // Метод за подаване на получател на съобщението
		aclMessage.setContent(name); // Метод за задаване съдържание на съобщението в случая name
		this.send(aclMessage); // Изпращаме съобщение
	}
}
