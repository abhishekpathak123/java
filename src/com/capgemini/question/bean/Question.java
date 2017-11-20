package com.capgemini.question.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotEmpty;

//step 1: public bean & mark the bean with @Entity and @Table
@Entity
@Table(name="Question_Master")
public class Question {
	
	@Column(name="Ques_no")
	@Id
	private String Ques_no;
	
	@Column(name="Ques_subtopic")
	private String Ques_subtopic;
	
	@Column(name="Ques_category")
	private char Ques_category;
	
	@Column(name="Question")
	@NotEmpty(message="Please Enter a Question")
	private String Question;
	
	@Column(name="Option1")
	@NotEmpty(message="Please Enter value of option")
	private String Option1;

	@Column(name="option2")
	//@NotEmpty(message="Please Enter value of option")
	private String option2;
	
	@Column(name="option3")
	//@NotEmpty(message="Please Enter value of option")
	private String option3;

	@Column(name="option4")
	//@NotEmpty(message="Please Enter value of option")
	private String option4;
	
	@Column(name="Answer")
	@NotEmpty(message="Please Enter answer option")
	@Pattern(regexp = "^[1-4]$", message = "Answer must be between 1-4")
	private String Answer;
	
	@Column(name="Remarks")
	//@NotEmpty(message="Please Enter remark")
	private String Remarks;

	@Column(name="Review_cnt")
	//@NotEmpty(message="Please Enter value of option")
	//@Pattern(regexp = "^[0-9]+$", 	message = "Review count minimum 0")
	private String Review_cnt;

	public String getQues_no() {
		return Ques_no;
	}

	public void setQues_no(String ques_no) {
		Ques_no = ques_no;
	}

	public String getQues_subtopic() {
		return Ques_subtopic;
	}

	public void setQues_subtopic(String ques_subtopic) {
		Ques_subtopic = ques_subtopic;
	}

	public char getQues_category() {
		return Ques_category;
	}

	public void setQues_category(char ques_category) {
		Ques_category = ques_category;
	}

	public String getQuestion() {
		return Question;
	}

	public void setQuestion(String question) {
		Question = question;
	}

	public String getOption1() {
		return Option1;
	}

	public void setOption1(String option1) {
		Option1 = option1;
	}

	public String getOption2() {
		return option2;
	}

	public void setOption2(String option2) {
		this.option2 = option2;
	}

	public String getOption3() {
		return option3;
	}

	public void setOption3(String option3) {
		this.option3 = option3;
	}

	public String getOption4() {
		return option4;
	}

	public void setOption4(String option4) {
		this.option4 = option4;
	}

	public String getAnswer() {
		return Answer;
	}

	public void setAnswer(String answer) {
		Answer = answer;
	}

	public String getRemarks() {
		return Remarks;
	}

	public void setRemarks(String remarks) {
		Remarks = remarks;
	}

	public String getReview_cnt() {
		return Review_cnt;
	}

	public void setReview_cnt(String review_cnt) {
		Review_cnt = review_cnt;
	}

	@Override
	public String toString() {
		return "Question [Ques_no=" + Ques_no + ", Ques_subtopic="
				+ Ques_subtopic + ", Ques_category=" + Ques_category
				+ ", Question=" + Question + ", Option1=" + Option1
				+ ", option2=" + option2 + ", option3=" + option3
				+ ", option4=" + option4 + ", Answer=" + Answer + ", Remarks="
				+ Remarks + ", Review_cnt=" + Review_cnt + "]";
	}
	
	
}	