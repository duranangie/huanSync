package com.u2team.huansync.activity.trivia.question.controller;

import com.u2team.huansync.activity.trivia.question.model.Question;
import com.u2team.huansync.activity.trivia.question.model.QuestionDAO;

import java.util.List;

public class QuestionController {
    private static QuestionDAO questionDAO = new QuestionDAO();

    //view all questions
    public static List<Question> getAllQuestions() {
        return questionDAO.getAllQuestions();
    }

    //get one question by id
    public static Question getQuestionById(long questionId){
        return questionDAO.getQuestionById(questionId);
    }

    //add or insert questions
    public static void insertQuestion(Question question){
        questionDAO.insertQuestion(question);
    }

    //update question by id
    public static void updateQuestion(Question question){
        questionDAO.updateQuestion(question);
    }

    //delete question by id
    public static void deleteQuestion(long questionId){
        questionDAO.deleteQuestion(questionId);
    }
}
