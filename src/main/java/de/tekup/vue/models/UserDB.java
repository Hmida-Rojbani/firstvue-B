package de.tekup.vue.models;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;

public class UserDB {

	@Getter private static List<User> users = new ArrayList<>();
	
	static {
		users.add(new User(1,"John","Doe","john@gmail.com","1234"));
		users.add(new User(2,"Jane","Doe","jane@gmail.com","5678"));
	}
	
	public static void addUser(User user) {
		user.setId(users.size()+1);
		users.add(user);
	}
}
