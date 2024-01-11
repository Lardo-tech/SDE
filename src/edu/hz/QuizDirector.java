package edu.hz;

public class QuizDirector {
    private QuizBuilder _builder;

    public QuizDirector(QuizBuilder builder) {
        _builder = builder;
    }

    public void ChangeBuilder(QuizBuilder builder) {
        _builder = builder;
    }

    public String makeQuizQuestions() {
        _builder.reset();
        _builder.QuestionOne();
        _builder.AnswerOne();
        _builder.QuestionTwo();
        _builder.AnswerTwo();
        _builder.QuestionThree();
        _builder.AnswerThree();
        _builder.QuestionFour();
        _builder.AnswerFour();

        return _builder.getQuestions();
    }
}
