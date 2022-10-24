package login;

public class Login {
	
	private String username;
	private String password;
	private String message;
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getMessage() {
		username = this.getUsername();
		password = this.getPassword();
		if(username != "Maria") {
			return message = "Boas-vindas";
		} else {
			return message = "Login inválido!";
		}
	}
	
}