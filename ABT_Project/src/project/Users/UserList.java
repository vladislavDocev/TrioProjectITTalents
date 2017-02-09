package project.Users;

import java.util.ArrayList;
 // Използвам класа за създаване на обекти от тип UserList.
public class UserList {
	private String name; // Свойство име на User

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private ArrayList<UserDetails> usersList; // Създавам лист от обекти от тип UserDetails

	public void addUser(UserDetails user) {  // Функция за добавяне на обекти от тип UserDetails към обект от тип UserList
		usersList.add(user);   // Използвам лист за да мога да добавям в него няколко обекта от тип UserDetails за всеки един обект от тип UserList
	}

	private String nameProject;  // свойство име на проект на всеки обект от UserList

	public String getNameProject() {
		return nameProject;
	}

	public void setNameProject(String nameProject) {
		this.nameProject = nameProject;
	}

	public String toString() {
		return name + " \n" + usersList + " \n" + nameProject;
	}

	public UserList(String name) { // В конструктура всеки нов обект от UserList се инициализира с свойство name и му се създава лист от обекти от тип UserDetails
		this.name = name;
		usersList = new ArrayList<UserDetails>();
	}

}
