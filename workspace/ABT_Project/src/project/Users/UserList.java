package project.Users;

import java.util.ArrayList;
 // ��������� ����� �� ��������� �� ������ �� ��� UserList.
public class UserList {
	private String name; // �������� ��� �� User

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private ArrayList<UserDetails> usersList; // �������� ���� �� ������ �� ��� UserDetails

	public void addUser(UserDetails user) {  // ������� �� �������� �� ������ �� ��� UserDetails ��� ����� �� ��� UserList
		usersList.add(user);   // ��������� ���� �� �� ���� �� ������� � ���� ������� ������ �� ��� UserDetails �� ����� ���� ����� �� ��� UserList
	}

	private String nameProject;  // �������� ��� �� ������ �� ����� ����� �� UserList

	public String getNameProject() {
		return nameProject;
	}

	public void setNameProject(String nameProject) {
		this.nameProject = nameProject;
	}

	public String toString() {
		return name + " \n" + usersList + " \n" + nameProject;
	}

	public UserList(String name) { // � ������������ ����� ��� ����� �� UserList �� ������������ � �������� name � �� �� ������� ���� �� ������ �� ��� UserDetails
		this.name = name;
		usersList = new ArrayList<UserDetails>();
	}

}
