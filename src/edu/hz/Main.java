package edu.hz;

import edu.hz.io.*;

import java.util.Scanner;

public class Main {
    QuizFacade facade;

    public static void main(String[] args) {
        ScoreTracker scoreTracker = new ScoreTracker();
        ScoreDisplay scoreDisplay = new ScoreDisplay();
        scoreTracker.addObserver(scoreDisplay);

        QuizFacade quizFacade = new QuizFacade(scoreTracker);
        quizFacade.QuizOption();
        quizFacade.conductQuiz();
    }
}
