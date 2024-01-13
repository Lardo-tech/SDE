package edu.hz;

//Template Method Pattern

import java.util.Scanner;

public class SoccerQuiz extends QuizTemplate {
    private final Scanner scanner = new Scanner(System.in);

    @Override
    protected void generateQuestionOne() {
        System.out.println("Who won the FIFA World Cup in 2018?");
    }

    @Override
    protected void generateQuestionTwo() {
        System.out.println("Who is the all-time leading goal scorer in FIFA World Cup history?");
    }

    @Override
    protected void generateAnswerOne() {
        System.out.println("a) France");
        System.out.println("b) Croatia");
        System.out.println("c) Brazil");
        System.out.println("d) Germany");

        String userAnswer = scanner.nextLine();

        if ("a".equalsIgnoreCase(userAnswer)) {
            System.out.println("Correct! France won the FIFA World Cup in 2018. \n");
        } else {
            System.out.println("Incorrect. The correct answer is a France. \n");
        }
    }


    @Override
    protected void generateAnswerTwo() {
        System.out.println("a) Miroslav Klose");
        System.out.println("b) Ronaldo");
        System.out.println("c) Pele");
        System.out.println("d) Lionel Messi");

        String userAnswer = scanner.nextLine();

        if ("a".equalsIgnoreCase(userAnswer)) {
            System.out.println("Correct! Miroslav Klose is the all-time leading goal scorer in FIFA World Cup history.\n");
        } else {
            System.out.println("Incorrect. The correct answer is a Miroslav Klose.\n");
        }
    }
}
