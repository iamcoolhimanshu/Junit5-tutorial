package com.javaMasterclass.assertions;

import com.javaMasterclass.Student;
import com.javaMasterclass.StudentService;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StudentServiceTest {

    @Test
    public void getStudentsTest() {
        StudentService studentService = new StudentService();

        //Student student = new Student(1, "Himanshu");
        List<Student> ListOfStudents = studentService.getStudents();

        //studentService.addStudent(student);

        boolean actualResult = ListOfStudents.isEmpty();

        assertTrue(actualResult);
        //assertTrue(() -> actualResult);
        //assertTrue(actualResult,"List Of Students is empty");
        //assertTrue(() -> actualResult,"List of students is empty");
        //assertTrue(actualResult,()-> "List Of Students is empty");
        //assertTrue(() -> actualResult, () -> "List Of Students is empty");
    }

    @Test
    public void getStudentTestUsingAssertFalse() {
        StudentService studentService = new StudentService();

        Student student = new Student(1,"Ram");
        List<Student> StudentsList = studentService.getStudents();
        studentService.addStudent(student);

        boolean actualResult = StudentsList.isEmpty();

        //assertFalse(() -> actualResult,"List Of Students should not empty");
        //assertFalse(actualResult);
        //assertFalse(actualResult,"Student list is empty");
        //assertFalse(() -> actualResult);
        //assertFalse(actualResult, () -> "List Of Students should not empty");
        assertFalse(() -> actualResult , ()-> "List of students should not empty");
    }

    @Test
    public void getStudentByIdTestUsingAssertNull() {
        StudentService studentService = new StudentService();
        Student student = new Student(1,"Ramesh");
        studentService.addStudent(student);

        Student actualObject = studentService.getStudentById(2);

        //assertNull(actualObject);
        //assertNull(actualObject,"Student Object is not null! ");
        assertNull(actualObject,() -> "Student Object should not be null" );
    }

    @Test
    public void getStudentByIdTestUsingAssertNotNull() {
        StudentService studentService = new StudentService();
        Student student = new Student(1,"Rohit");
        studentService.addStudent(student);

        Student actualObject = studentService.getStudentById(1);

        //assertNotNull(actualObject);
        //assertNotNull(actualObject,"Student is null");
        assertNotNull(actualObject,() -> "Student is null");
    }

    @Test
    public void getStudentByIdTestUsingAssertEquals() {
        StudentService studentService = new StudentService();
        Student student = new Student(1,"Virat");
        studentService.addStudent(student);

        Student actualObject = studentService.getStudentById(1);

        assertEquals(1,actualObject.getId());
        assertEquals("Virat",actualObject.getName());
        assertEquals(student,actualObject);
        assertEquals(1,actualObject.getId(),() -> "Student id is not equal");
        assertEquals("Virat",actualObject.getName(),() -> "Student name is not equal");
    }

    @Test
    public void getStudentByIdTestUsingAssertNowEquals() {
        StudentService studentService = new StudentService();
        Student student = new Student(1,"Virat");
        Student student1 = new Student(2,"Rohit");

        studentService.addStudent(student);

        Student actualObject = studentService.getStudentById(1);

        assertNotEquals(2,actualObject.getId());
        assertNotEquals("Vira",actualObject.getName());
        assertNotEquals(2,actualObject.getId(),"Student id is equal");
        assertNotEquals("Vir",actualObject.getName(),() -> "Student name is equal");
        assertNotEquals(student1,actualObject);

    }
}