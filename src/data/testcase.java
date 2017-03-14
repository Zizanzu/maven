package data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class testcase {

    private Management management;
    
    @Before
    public void setUp() throws Exception {
    	management = new Management();
        addData();
        Assert.assertNotNull(management);
    }
    
    @Test
    public void findProfessorInTimeTable() throws Exception {
        LocalDateTime time1 = LocalDateTime.of(2017, 3, 8, 10, 30);
        TimeTable timeTable = management.findProfessorInTimeTable(1, time1);
        Assert.assertNotEquals(management.getTimeTables().get(0), timeTable);
    }

    @Test
    public void findStudentInTimeTable() throws Exception {
        LocalDateTime time1 = LocalDateTime.of(2017, 3, 8, 8, 30);
        TimeTable timeTable = management.findStudentInTimeTable(1, time1);
        Assert.assertEquals(management.getTimeTables().get(0), timeTable);
    }

    @Test
    public void roomIsNotFree() throws Exception{
        LocalDateTime time1 = LocalDateTime.of(2017, 3, 8, 8, 30);
        Boolean free = management.checkRoomFree(102, time1);
        Assert.assertEquals(false, free);

    }

    @Test
    public void roomIsFree() throws Exception{
        LocalDateTime time1 = LocalDateTime.of(2017, 3, 8, 10, 30);
        Boolean free = management.checkRoomFree(101, time1);
        Assert.assertEquals(true, free);
    }

    @Test
    public void findStudentInList() throws Exception{
        Boolean b = management.findStudentInList(management.getStudents(), "Lucas");
        System.out.println(b);
    }


    /**
     * Add items
     */
    public void addData(){
        //List of professors
        List<Professor> professors = new ArrayList<>();
        professors.add(new Professor(1, "Samuel Barnes"));
        professors.add(new Professor(2, "Aidan Chapman"));
        professors.add(new Professor(3, "James Moore"));
        professors.add(new Professor(4, "Jany Moore"));

        management.setProfessors(professors);

        //List of students
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Lucas","Morris"));
        students.add(new Student(2, "Jackson","Clarke"));
        students.add(new Student(3, "Corey","Russell"));
        students.add(new Student(4, "Isaac","Andrews"));
        students.add(new Student(5, "Ryan","Burke"));
        students.add(new Student(6, "Emmett","Daniels"));

        management.setStudents(students);

        //List of room

        List<Room> rooms = new ArrayList<>();
        rooms.add(new Room(1,"101"));
        rooms.add(new Room(2,"201"));
        rooms.add(new Room(3,"301"));
        rooms.add(new Room(4,"401"));
        rooms.add(new Room(5,"501"));

        management.setRooms(rooms);

        //create new time table
        TimeTable timeTable = new TimeTable();
        LocalDateTime time = LocalDateTime.of(2017, 3, 8, 8, 0);
        timeTable.setPeriod(new Period(time,time.plusHours(2)));
        timeTable.addStudent(students.get(1));
        timeTable.addStudent(students.get(2));
        timeTable.addStudent(students.get(3));

        timeTable.setId_professor(professors.get(0).getId());
        timeTable.setId_room(rooms.get(0).getId());

        management.addTimeTable(timeTable);

        //create new time table
        TimeTable timeTable1 = new TimeTable();
        time = LocalDateTime.of(2017, 3, 8, 8, 0);
        timeTable1.setPeriod(new Period(time, time.plusHours(2)));
        timeTable1.addStudent(students.get(3));
        timeTable1.addStudent(students.get(4));
        timeTable1.addStudent(students.get(1));

        timeTable1.setId_professor(professors.get(1).getId());
        timeTable1.setId_room(rooms.get(1).getId());

        management.addTimeTable(timeTable1);
    }

}
