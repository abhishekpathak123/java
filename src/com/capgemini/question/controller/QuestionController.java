package com.capgemini.question.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.capgemini.question.bean.Question;
import com.capgemini.question.service.IQuestionService;

@Controller
public class QuestionController {

	@Autowired
	private IQuestionService questionService;

	public IQuestionService getQuestionService() {
		return questionService;
	}

	public void setQuestionService(IQuestionService questionService) {
		this.questionService = questionService;
	}

	ArrayList<String> topicList;

	@RequestMapping("/showHomePage")
	public String showHomePage() {
		return "index";
	}

	@RequestMapping("/showAddQuestionForm")
	public ModelAndView showAddQuestionForm(Model model) {
		topicList = new ArrayList<String>();
		Question question = new Question();
		topicList.add("MATHS");
		topicList.add("HISTORY");
		topicList.add("SCIENCE");

		model.addAttribute("topicList", topicList);
		model.addAttribute("date", LocalDateTime.now());
		return new ModelAndView("Add_Question", "question", question);
	}

	@RequestMapping("/addQuestion")
	public ModelAndView addDonation(
			@ModelAttribute("question") @Valid Question question,
			BindingResult result) {
		ModelAndView mv = null;
		if (!result.hasErrors()) {

			System.out.println(question.getQues_subtopic());

			int idn = (int) (Math.random() * 10000);
			String id = question.getQues_subtopic().substring(0, 1) + idn;
			question.setQues_no(id);
			System.out.println("Not have errorS");
			question = questionService.addQuestion(question);
			mv = new ModelAndView("addSuccess");
			mv.addObject("Ques_no", question.getQues_no());
			/*
			 * char[] subTopic = question.getQues_subtopic().toCharArray();
			 * mv.addObject("Ques_subtopic", subTopic[0]);
			 */
		} else {
			System.out.println(" have errorS");
			topicList = new ArrayList<String>();
			topicList.add("MATHS");
			topicList.add("HISTORY");
			topicList.add("SCIENCE");

			mv = new ModelAndView("Add_Question");
			mv.addObject("topicList", topicList);
			mv.addObject("date", LocalDateTime.now());
		}
		return mv;
	}
}
