package edu.hz;
import java.util.Scanner;

//Template Method Pattern

public class MusicQuiz extends QuizTemplate {
    private final Scanner scanner = new Scanner(System.in);

    public MusicQuiz(ScoreTracker scoreTracker) {
        super(scoreTracker);
    }

    @Override
    protected void generateQuestionOne() {
        System.out.println("Who is known as the 'King of Pop'?");
    }

    @Override
    protected void generateQuestionTwo() {
        System.out.println("Which band released the album 'The Dark Side of the Moon'?");
    }

    @Override
    protected void generateAnswerOne() {
        System.out.println("a) Michael Jackson");
        System.out.println("b) Elvis Presley");
        System.out.println("c) Madonna");
        System.out.println("d) Prince");

        String userAnswer = scanner.nextLine();

        if ("a".equalsIgnoreCase(userAnswer)) {
            System.out.println("Correct! Michael Jackson is known as the 'King of Pop.' \n");
            updateScore(1);
        } else {
            System.out.println("Incorrect. The correct answer is a) Michael Jackson. \n");
        }
    }

    @Override
    protected void generateAnswerTwo() {
        System.out.println("a) The Beatles");
        System.out.println("b) Led Zeppelin");
        System.out.println("c) Pink Floyd");
        System.out.println("d) Queen");

        String userAnswer = scanner.nextLine();

        if ("c".equalsIgnoreCase(userAnswer)) {
            System.out.println("Correct! 'The Dark Side of the Moon' was released by Pink Floyd. \n");
            updateScore(1);
        } else {
            System.out.println("Incorrect. The correct answer is c) Pink Floyd. \n");
        }
    }
}


