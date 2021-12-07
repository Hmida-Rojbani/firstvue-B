package de.tekup.vue.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
	
	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private String password;

}
