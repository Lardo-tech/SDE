// MusicQuizBuilder.java
package edu.hz;

// Builder Pattern
public class MusicQuizBuilder implements QuizBuilder {
    private ScoreTracker scoreTracker;

    public MusicQuizBuilder(ScoreTracker scoreTracker) {
        this.scoreTracker = scoreTracker;
    }

    @Override
    public QuizTemplate buildQuiz() {
        return new MusicQuiz(scoreTracker);
    }
}
