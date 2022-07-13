package com.opencode.practice.exception;

/**
 * @author Grihan
 */
public class QuestionnaireNotFoundException extends RuntimeException{
    public QuestionnaireNotFoundException(long id) {
        super("Could not find the questionnaire " + id);
    }
}
