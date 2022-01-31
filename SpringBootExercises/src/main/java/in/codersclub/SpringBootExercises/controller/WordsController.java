package in.codersclub.SpringBootExercises.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import in.codersclub.SpringBootExercises.Model.Word;

@Controller
public class WordsController {

	@GetMapping("/word")
	public String ViewForm(Model model)
	{
	model.addAttribute("Word", new Word());
	return "word";
	}
	@PostMapping("/word")
	public String addForm(@ModelAttribute Word word,BindingResult result,Model model)
	{
	model.addAttribute("Word", word);
	return "word";
	} 
}
