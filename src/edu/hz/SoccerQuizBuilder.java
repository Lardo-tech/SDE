package edu.hz;

public class SoccerQuizBuilder implements QuizBuilder {

    private String _questions = "";

    public void QuestionOne() {
        _questions += "De eerste vraag is: voetbal";
        this.addNewLine();
    }

    public void AnswerOne() {
        _questions += "Het antwoord is: voetbal";
        this.addNewLine();
    }

    public void QuestionTwo() {
        _questions += "De tweede vraag is: voetbal";
        this.addNewLine();
    }

    public void AnswerTwo() {
        _questions += "Het antwoord is: voetbal";
        this.addNewLine();
    }

    public void QuestionThree() {
        _questions += "De derde vraag is: voetbal";
        this.addNewLine();
    }


    public void AnswerThree() {
        _questions += "Het antwoord is: voetbal";
        this.addNewLine();
    }


    public void QuestionFour() {
        _questions += "De vierde vraag is: voetbal";
        this.addNewLine();
    }


    public void AnswerFour() {
        _questions += "Het antwoord is: voetbal";
        this.addNewLine();
    }


    public void reset() {
        _questions = "";
    }

    public String getQuestions() {
        return _questions;
    }

    private void addNewLine() {
        _questions += "\n\r";
    }
}