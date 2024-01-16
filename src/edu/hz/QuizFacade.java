package edu.hz;

import java.util.Scanner;

public class QuizFacade {
    private QuizBuilder builder;

    public void QuizOption () {
        System.out.println("Choose a quiz type: \n 1. Soccer Quiz \n 2. Music Quiz");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        if (choice == 1) {
            builder = new SoccerQuizBuilder();
        } else if (choice == 2) {
            builder = new MusicQuizBuilder();
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
    }
}