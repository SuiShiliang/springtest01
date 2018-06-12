package springtest08;

public class Operator {

	private Integer id;
	private String username;
	private String password;
	private String role;
	private Boolean disablead;
	
	public Operator() {
	}
	
	public Operator(Integer id, String username, String password, String role, Boolean disablead) {
		this.id = id;
		this.username = username;
		this.password = password;
		this.role = role;
		this.disablead = disablead;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
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
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public Boolean getDisablead() {
		return disablead;
	}
	public void setDisablead(Boolean disablead) {
		this.disablead = disablead;
	}
	
}
