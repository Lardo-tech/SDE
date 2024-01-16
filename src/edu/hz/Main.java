package edu.hz;

import edu.hz.io.*;

import java.util.Scanner;

public class Main {
    QuizFacade facade;

    public static void main(String[] args) {
        QuizFacade quizFacade = new QuizFacade();
        quizFacade.QuizOption();
        quizFacade.conductQuiz();
    }
}