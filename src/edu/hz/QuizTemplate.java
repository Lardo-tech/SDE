package edu.hz;

//Template Method Pattern

public abstract class QuizTemplate {
    public final void generateQuiz() {
        generateQuestionOne();
        generateAnswerOne();
        generateQuestionTwo();
        generateAnswerTwo();
    }

    protected abstract void generateQuestionOne();
    protected abstract void generateQuestionTwo();
    protected abstract void generateAnswerOne();
    protected abstract void generateAnswerTwo();
}
