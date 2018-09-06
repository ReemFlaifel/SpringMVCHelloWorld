package com.springmvcproject.springmvcproject.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springmvcproject.springmvcproject.model.beans.Exam;

@Service
public class ExamService {
	private List<Exam> exams = new ArrayList<>();

	public ExamService() {
		init();
	}

	private void init() {
		exams.add(new Exam("Java", 60, 1, 10));
		exams.add(new Exam("C++", 60, 2, 20));
		exams.add(new Exam("Bio", 60, 3, 15));
	}

	public List<Exam> getAllExams() {
		return exams;
	}
}