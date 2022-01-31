package in.codersclub.SpringBootExercises.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import in.codersclub.SpringBootExercises.Model.Sentence;

@Controller
public class SentenceController {
	@GetMapping("/sentence")
	public String ViewForm(Model model)
	{
	model.addAttribute("Sentence", new Sentence());
	return "sentence";
	}
	@PostMapping("/sentence")
	public String addForm(@ModelAttribute Sentence sentence,BindingResult result,Model model)
	{
	model.addAttribute("Sentence",sentence);
	return "countSentence";
	}
}
