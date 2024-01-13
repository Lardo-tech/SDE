package edu.hz;

//Builder Pattern
public class MusicQuizBuilder implements QuizBuilder {
        @Override
        public QuizTemplate buildQuiz() {
            return new MusicQuiz();
        }
}