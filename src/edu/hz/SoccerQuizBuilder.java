package edu.hz;

//Builder Pattern

public class SoccerQuizBuilder implements QuizBuilder {

    @Override
    public QuizTemplate buildQuiz() {
        return new SoccerQuiz();
    }
}