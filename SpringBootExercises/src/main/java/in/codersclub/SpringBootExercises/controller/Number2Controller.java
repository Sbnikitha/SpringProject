package in.codersclub.SpringBootExercises.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import in.codersclub.SpringBootExercises.Model.Number2;

@Controller
public class Number2Controller {
	@GetMapping("/number2")
	public String ViewForm(Model model)
	{
	model.addAttribute("Number2", new Number2());
	return "number2";
	}
	@PostMapping("/Number2")
	public String addForm(@ModelAttribute Number2 Number2 ,BindingResult result,Model model)
	{
	model.addAttribute("Number2",Number2);
	return "doubleNumber";
	}
}
