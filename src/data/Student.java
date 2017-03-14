package data;

import java.util.Vector;

public class Student {

	public Integer id;

	public String first_name;

	public String last_name;

	public String email;

	public Student(int id, String first_name, String last_name) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.first_name = first_name;
		this.last_name = last_name;
	}
	
	public Integer getId() {
		return id;
	}
	
	public String getFirst_name() {
		return first_name;
	}
	
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	
	public String getLast_name() {
		return last_name;
	}
	
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", first_name=" + first_name + ", last_name=" + last_name + ", email=" + email + "]";
	}
  
}
