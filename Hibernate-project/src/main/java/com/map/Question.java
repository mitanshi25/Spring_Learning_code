package com.map;

import jakarta.persistence.CascadeType;

//import org.hibernate.annotations.CascadeType;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
//import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Question {
	@Id
	@Column (name = "question_id")
	private int questionId;
	private String question;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Answer answer;
	
	
	
	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}



	public int getQuestionId() {
		return questionId;
	}



	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}



	public String getQuestion() {
		return question;
	}



	public void setQuestion(String question) {
		this.question = question;
	}



	public Answer getAnswer() {
		return answer;
	}



	public void setAnswer(Answer answer) {
		this.answer = answer;
	}



	public Question(int questionId, String question, Answer answer) {
		super();
		this.questionId = questionId;
		this.question = question;
		this.answer = answer;
	}
	

}
