package edu.hz;

//Template method pattern

public abstract class QuizTemplate {
    private ScoreTracker scoreTracker;

    public QuizTemplate(ScoreTracker scoreTracker) {
        this.scoreTracker = scoreTracker;
    }

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

    protected void updateScore(int points) {
        scoreTracker.updateScore(points);
    }
}
