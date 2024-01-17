package edu.hz;

// Builder Pattern
public class SoccerQuizBuilder implements QuizBuilder {
    private ScoreTracker scoreTracker;

    public SoccerQuizBuilder(ScoreTracker scoreTracker) {
        this.scoreTracker = scoreTracker;
    }

    @Override
    public QuizTemplate buildQuiz() {
        return new SoccerQuiz(scoreTracker);
    }
}
