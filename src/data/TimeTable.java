package data;

import java.util.List;
import java.util.ArrayList;

public class TimeTable {
	private Integer id;

	private Period period;

	private Integer id_professor;

	private Integer id_room;
	
	public List<Student> list_student = new ArrayList<>();
	
	
	public TimeTable(int id) {
		// TODO Auto-generated constructor stub
		this.id = id;
	}

	public TimeTable() {
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Period getPeriod() {
		return period;
	}

	public void setPeriod(Period period) {
		this.period = period;
	}

	public Integer getId_professor() {
		return id_professor;
	}

	public void setId_professor(Integer id_professor) {
		this.id_professor = id_professor;
	}

	public Integer getId_room() {
		return id_room;
	}

	public void setId_room(Integer id_room) {
		this.id_room = id_room;
	}

	public List<Student> getList_student() {
		return list_student;
	}

	public void setList_student(List<Student> list_student) {
		this.list_student = list_student;
	}

	@Override
	public String toString() {
		return "TimeTable [id=" + id + ", period=" + period + ", id_professor="
				+ id_professor + ", id_room=" + id_room + "]";
	}
	
	public void addStudent(Student student) {
		list_student.add(student);
    }
	
}
