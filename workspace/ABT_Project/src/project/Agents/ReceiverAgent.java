package project.Agents;

import java.util.ArrayList;
import java.util.Scanner;

import jade.core.Agent;
import jade.core.behaviours.CyclicBehaviour;
import jade.lang.acl.ACLMessage;
import jade.lang.acl.MessageTemplate;
import project.Users.UserDetails;
import project.Users.UserList;
// Използваме този агент за получаване на съобщение и показване на информация за даден обект
public class ReceiverAgent extends Agent {
	private static final long serialVersionUID = 1L;

	static ArrayList<UserList> list = new ArrayList<>(); // създаваме лист от обекти от тип UserList в който да съхраняваме обектите с които ще работим
// В setup на агента - получател добавяме поведението му като му подаваме инстанция на класа(ReceiveAgentBehaviour), в който описваме неговото действие (ReceiveAgentBehaviour)
	protected void setup() {
		System.out.println("Hello! My local name is " + this.getLocalName());
		addBehaviour(new ReceiveAgentBehaviour());
	}

	static class ReceiveAgentBehaviour extends CyclicBehaviour { // Използваме Behaviour тип CyclicBehaviour, защото той няма метод done(),който да се изпълни след извършване на действието в него и може да подаваме name многократно
		private static final long serialVersionUID = 1L;

		private static final MessageTemplate mt = MessageTemplate
				.MatchPerformative(ACLMessage.REQUEST); // Създаваме си шаблон-обект от тип MessageTemplate като подаваме вида на приеманото съобщение - в случая REQUEST 

		public void action() {
			ACLMessage aclMessage = myAgent.receive(mt); // Създаваме обект от тип ACLMessage и извикваме метода receive() на агента получател за получаване на съобщение
			if (aclMessage != null) { // Има ли съобщение
				createDbUsers(); // Използваме този метод за да създадем база данни с обекти от тип UserList, като ги инициализираме
				String name = aclMessage.getContent(); // Метода getContent() връща съдържанието на съобщението и го записваме в String name
				@SuppressWarnings("resource")
				Scanner sc = new Scanner(System.in);
				printUser(name); // Използваме този метод за да обходим листа с обекти от тип UserList и да изведем името на студента, ако съответства на това, получено чрез съобщението
				while (!name.equalsIgnoreCase("end")) { // Въвеждаме имена докато не въведем "end"
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