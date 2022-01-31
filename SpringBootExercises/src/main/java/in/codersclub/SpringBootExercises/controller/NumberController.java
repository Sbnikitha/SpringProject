package in.codersclub.SpringBootExercises.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import in.codersclub.SpringBootExercises.Model.Number;

@Controller
public class NumberController {
	@GetMapping("/number")
	public String ViewForm(Model model)
	{
	model.addAttribute("Number", new Number());
	return "number";
	}
	@PostMapping("/Number")
	public String addForm(@ModelAttribute Number Number ,BindingResult result,Model model)
	{
	model.addAttribute("Number",Number);
	return "numberInWord";
	}
}
