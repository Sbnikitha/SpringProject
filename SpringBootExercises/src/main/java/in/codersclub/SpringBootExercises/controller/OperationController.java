package in.codersclub.SpringBootExercises.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import in.codersclub.SpringBootExercises.Model.Operation;

@Controller
public class OperationController {
	@GetMapping("/operation2numbers")
	public String ViewForm(Model model)
	{
	model.addAttribute("Operation", new Operation());
	return "operation2numbers";
	}
	@PostMapping("/operation")
	public String addForm(@ModelAttribute Operation operation,BindingResult result,Model model)
	{
	model.addAttribute("operation",operation);
	return "operationResult";
	}
}
