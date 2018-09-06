package com.springmvcproject.springmvcproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.springmvcproject.springmvcproject.model.ExamService;

@Controller
public class ExamController {

	@Autowired
	private ExamService examService;


	@GetMapping("/allExams")
	public String allExams(Model model) {
		model.addAttribute("exams", examService.getAllExams());
		return "exams";
	}
}
