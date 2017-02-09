package project.Agents;

import java.util.ArrayList;
import java.util.Scanner;

import jade.core.Agent;
import jade.core.behaviours.CyclicBehaviour;
import jade.lang.acl.ACLMessage;
import jade.lang.acl.MessageTemplate;
import project.Users.UserDetails;
import project.Users.UserList;
// ���������� ���� ����� �� ���������� �� ��������� � ��������� �� ���������� �� ����� �����
public class ReceiverAgent extends Agent {
	private static final long serialVersionUID = 1L;

	static ArrayList<UserList> list = new ArrayList<>(); // ��������� ���� �� ������ �� ��� UserList � ����� �� ����������� �������� � ����� �� �������
// � setup �� ������ - ��������� �������� ����������� �� ���� �� �������� ��������� �� �����(ReceiveAgentBehaviour), � ����� �������� �������� �������� (ReceiveAgentBehaviour)
	protected void setup() {
		System.out.println("Hello! My local name is " + this.getLocalName());
		addBehaviour(new ReceiveAgentBehaviour());
	}

	static class ReceiveAgentBehaviour extends CyclicBehaviour { // ���������� Behaviour ��� CyclicBehaviour, ������ ��� ���� ����� done(),����� �� �� ������� ���� ���������� �� ���������� � ���� � ���� �� �������� name �����������
		private static final long serialVersionUID = 1L;

		private static final MessageTemplate mt = MessageTemplate
				.MatchPerformative(ACLMessage.REQUEST); // ��������� �� ������-����� �� ��� MessageTemplate ���� �������� ���� �� ���������� ��������� - � ������ REQUEST 

		public void action() {
			ACLMessage aclMessage = myAgent.receive(mt); // ��������� ����� �� ��� ACLMessage � ��������� ������ receive() �� ������ ��������� �� ���������� �� ���������
			if (aclMessage != null) { // ��� �� ���������
				createDbUsers(); // ���������� ���� ����� �� �� �������� ���� ����� � ������ �� ��� UserList, ���� �� ��������������
				String name = aclMessage.getContent(); // ������ getContent() ����� ������������ �� ����������� � �� ��������� � String name
				@SuppressWarnings("resource")
				Scanner sc = new Scanner(System.in);
				printUser(name); // ���������� ���� ����� �� �� ������� ����� � ������ �� ��� UserList � �� ������� ����� �� ��������, ��� ����������� �� ����, �������� ���� �����������
				while (!name.equalsIgnoreCase("end")) { // ��������� ����� ������ �� ������� "end"
					System.out.println("Enter a name: ");
					name = sc.nextLine();
					printUser(name);
				}

			}
		}
	}

	private static void printUser(String name) { 
		int y = 0;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getName().equals(name)) {
				System.out.println(list.get(i));
			} else {
				y++;
			}
		}
		if (y == list.size()) {
			System.out.println("Missing user!");
		}
	}

	public static void createDbUsers() {
		UserList ul = new UserList("Petko Gotsov");
		ul.addUser(new UserDetails("FKSU", "TU", 121213080));
		ul.setNameProject("NetLogo project");
		list.add(ul);

		ul = new UserList("Ivan Petkov");
		ul.addUser(new UserDetails("FMI", "SU", 171718209));
		ul.setNameProject("Search engine project");
		list.add(ul);

		ul = new UserList("Georgi Ivanov");
		ul.addUser(new UserDetails("FKSU", "TU", 121213987));
		ul.setNameProject("Meta-Search engine project");
		list.add(ul);

		ul = new UserList("Johnny Depp");
		ul.addUser(new UserDetails("FKSU", "TU", 121213090));
		ul.setNameProject("Social Search engine project");
		list.add(ul);

		ul = new UserList("John Travolta");
		ul.addUser(new UserDetails("FMI", "SU", 171718199));
		ul.setNameProject("Job Optimization project");
		list.add(ul);

	}
}