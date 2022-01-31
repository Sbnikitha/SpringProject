package in.codersclub.SpringBootExercises.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import in.codersclub.SpringBootExercises.Model.Addtion;



@Controller
public class AdditionController {
	@GetMapping("/add2numbers")
	public String ViewForm(Model model)
	{
	model.addAttribute("Addition", new Addtion());
	return "add2numbers";
	}
	@PostMapping("/addtion")
	public String addForm(@ModelAttribute Addtion addtion,BindingResult result,Model model)
	{
	model.addAttribute("addtion",addtion);
	return "addResult";
	}
	
}
