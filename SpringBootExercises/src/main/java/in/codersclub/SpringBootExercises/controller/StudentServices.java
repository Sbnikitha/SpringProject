package in.codersclub.SpringBootExercises.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import in.codersclub.SpringBootExercises.Model.Student;

@Service
public class StudentServices {
	private List<Student> students=Arrays.asList(
			new Student ("1JT19CS076","Nikitha","F","Bangalore"),
			new Student ("1JT19CS001","Ram","M","Mangalore"),
			new Student ("1JT19CS004","Seeta","F","Chittor"),
			new Student ("1JT19CS017","Sri","M","Mumbai"));
	public List<Student> getAllStudents(){
		return students;
	}
	public Student getStudentUsn(String usn) {
		return students.stream().filter(t ->t.getusn().equals(usn)).findFirst().get();
	}
	public Student getStudentGender(String gender) {
		return students.stream().filter(t ->t.getGender().equals(gender)).findAny().get();
	}
}
