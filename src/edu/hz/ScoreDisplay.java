package edu.hz;

//Observer pattern

public class ScoreDisplay implements ScoreObserver {
    @Override
    public void updateScore(int score) {
        System.out.println("Current Score: " + score);
    }

    public void displayFinalScore(int finalScore) {
        System.out.println("Final Score: " + finalScore);
    }
}
