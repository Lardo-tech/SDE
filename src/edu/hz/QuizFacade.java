package edu.hz;

//Facade Pattern

import java.util.Scanner;

public class QuizFacade {
    private QuizBuilder builder;
    private ScoreTracker scoreTracker;

    public QuizFacade(ScoreTracker scoreTracker) {
        this.scoreTracker = scoreTracker;
    }

    public void QuizOption() {
        System.out.println("Choose a quiz type: \n 1. Soccer Quiz \n 2. Music Quiz");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        if (choice == 1) {
            builder = new SoccerQuizBuilder(scoreTracker);
        } else if (choice == 2) {
            builder = new MusicQuizBuilder(scoreTracker);
        } else {
            System.out.println("Invalid choice. Exiting program.");
            return;
        }
    }

    public void conductQuiz() {
        if (builder == null) {
            System.out.println("Quiz type not selected. Exiting program.");
            return;
        }

        QuizDirector director = new QuizDirector(builder);
        director.makeQuizQuestions();
        scoreTracker.displayFinalScore();

    }
}
