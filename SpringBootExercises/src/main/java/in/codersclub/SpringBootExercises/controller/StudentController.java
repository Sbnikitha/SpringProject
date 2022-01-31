package in.codersclub.SpringBootExercises.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.codersclub.SpringBootExercises.Model.Sentence;
import in.codersclub.SpringBootExercises.Model.Student;

@RestController
public class StudentController {
	@Autowired
	private StudentServices studentServices;
	
	@RequestMapping("/student")
	public List<Student> getallStudents(){
		return studentServices.getAllStudents();
		
	}
	@GetMapping("/sudentusn")
	public String ViewForm(Model model)
	{
	model.addAttribute("student", new Student());
	return "student";
	}
	@RequestMapping("/student/{usn}")
	public Student getStudentUsn(@PathVariable String usn){
		return studentServices.getStudentUsn(usn);	
	}
	@RequestMapping("/students/{gender}")
	public Student getStudentGender(@PathVariable String gender){
		return studentServices.getStudentGender(gender);	
	}

}
