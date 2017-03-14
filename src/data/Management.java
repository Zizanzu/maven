package data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Management {
	public static List<TimeTable> list_timetables;
	public static List<Student> list_students;
	public static List<Professor> list_professors;
	public static List<Room> list_rooms;
	
	public Management() {
		// TODO Auto-generated constructor stub
		list_timetables = new ArrayList<>();
		list_students = new ArrayList<>();
		list_professors = new ArrayList<>();
		list_rooms = new ArrayList<>();
	}
	
	public List<TimeTable> getTimeTables() {
        return list_timetables;
    }

	public void setStudents(List<Student> students) {
        this.list_students = students;
    }

    public void setProfessors(List<Professor> professors) {
        this.list_professors = professors;
    }

    public void setTimeTables(List<TimeTable> timeTables) {
        this.list_timetables = timeTables;
    }

    public void setRooms(List<Room> rooms) {
        this.list_rooms = rooms;
    }

    public void addStudent(Student student){
        this.list_students.add(student);
    }

    public void addProfessor(Professor professor){
        this.list_professors.add(professor);
    }

    public void addRoom(Room room){
        this.list_rooms.add(room);
    }

    public void addTimeTable(TimeTable timeTable) {
        list_timetables.add(timeTable);
    }

    public List<Student> getStudents() {
        return list_students;
    }
    
	public Student findStudent(String name) {
        for (Student student : list_students) {
            if (student.getFirst_name().equals(name) || student.getLast_name().equals(name))
                return student;
        }
        return null;
    }
	
	public Professor findProfessor(String name){
        for (Professor professor : list_professors) {
            if(professor.getName().equals(name))
                return professor;
        }
        return null;
    }
	
	public Room findRoom(String name){
        for (Room room: list_rooms) {
            if(room.getName() == name)
                return room;
        }
        return null;
    }
	
	public boolean findStudentInList(List<Student> students, String name){
        for (Student student : students) {
            if (student.getFirst_name().equals(name) || student.getLast_name().equals(name))
                return true;
        }
        return false;
    }
	
	public TimeTable findProfessorInTimeTable(int id_prof, LocalDateTime time){
		for (int j = 0; j < list_timetables.size(); j++) {
			for (Professor prof : list_professors) {
	            if (prof.getId().equals(id_prof))
	            	return list_timetables.get(j);
	        }
		}
		return null;
	}
	
	public TimeTable findStudentInTimeTable(int id_stu, LocalDateTime time){
		for (int j = 0; j < list_timetables.size(); j++) {
			List<Student> list_stu = list_timetables.get(j).getList_student();
			for (Student student : list_stu) {
	            if (student.getId().equals(id_stu))
	            	return list_timetables.get(j);
	        }
		}
		return null;
	}
	
	public Boolean checkRoomFree(int id_room, LocalDateTime time) {
		// Boolean check = false;
		
		for (int j = 0; j < list_rooms.size(); j++) {
			if (list_rooms.get(j).getId().equals(id_room)) {
				for (int i = 0; i < list_timetables.size(); i++) {
					int tmp = list_timetables.get(i).getId_room();
					System.out.println("Checking Room "+i+": "+tmp);
					if (tmp == id_room) {
						LocalDateTime start = list_timetables.get(i).getPeriod().getStart_time();
						LocalDateTime stop = list_timetables.get(i).getPeriod().getEnd_time();
						
						if (time.isAfter(start)==true && time.isBefore(stop)) {
							System.out.println("Room is not free.");
							return false;
						}
						
					}
				}
				System.out.println("Room is free.");
				return true;
			}
		}
			
		return false;
	}

	

}
