package app.domain.models;

import app.domain.types.Role;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Setter
@Getter
@NoArgsConstructor
@SuperBuilder
@AllArgsConstructor
public class UserAccount extends Person {
	private String userName;
	private String password;
	
	public UserAccount(long document, String nombre, int age, Role role, String userName, String password) {
		super(document, nombre, age, role);
		this.userName = userName;
		this.password = password;
	}		
	
}
