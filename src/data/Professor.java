package data;

public class Professor {
	private Integer id;
	private String name;
	
	public Professor(int id) {
		// TODO Auto-generated constructor stub
		this.id = id;
	}

	public Professor(int id, String name) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Professor [id=" + id + ", name=" + name + "]";
	}
	
}
