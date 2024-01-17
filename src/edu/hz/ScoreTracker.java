package edu.hz;

//Observer Pattern

import java.util.ArrayList;
import java.util.List;

public class ScoreTracker {
    private int score;
    private List<ScoreObserver> observers;

    public ScoreTracker() {
        this.score = 0;
        this.observers = new ArrayList<>();
    }

    public void addObserver(ScoreObserver observer) {
        observers.add(observer);
    }


    public void updateScore(int points) {
        score += points;
        notifyObservers();
    }

    private void notifyObservers() {
        for (ScoreObserver observer : observers) {
            observer.updateScore(score);
        }
    }

    public void displayFinalScore() {
        for (ScoreObserver observer : observers) {
            if (observer instanceof ScoreDisplay) {
                ((ScoreDisplay) observer).displayFinalScore(score);
            }
        }
    }}
