package edu.hz;

import edu.hz.io.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ConsoleWriter writer = new ConsoleWriter();
        QuizBuilder builder;

        System.out.println("Choose a quiz type:");
        System.out.println("1. Soccer Quiz");
        System.out.println("2. Music Quiz");

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

        QuizDirector director = new QuizDirector(builder);
        String quiz = director.makeQuizQuestions();

        writer.writeLine(quiz);
    }
}