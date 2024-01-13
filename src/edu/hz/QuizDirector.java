package edu.hz;

//Builder Pattern

public class QuizDirector {
    private QuizBuilder _builder;

    public QuizDirector(QuizBuilder builder) {
        _builder = builder;
    }


    public void makeQuizQuestions() {
    QuizTemplate quiz = _builder.buildQuiz();

    quiz.generateQuiz();
    }
}
