package funwithquizzes;

import java.util.ArrayList;

public class QuizRunner {
    public static void main(String[] args) {
        Quiz myQuiz = new Quiz();
        myQuiz.addQuestion(new TrueFalse("String is primitive data type.", false));
        myQuiz.addQuestion(new TrueFalse("In most cases double should be used over float", true));

        myQuiz.addQuestion(new MultipleChoice("Java was released in what year?", 3,
                new String[]{"1993", "1999", "1995", "2000"}));

        myQuiz.addQuestion(new Checkbox("In JavaScript, which of the following strings result in NaN when passed to Number?",
                new Integer[]{1,2}, new String[]{"'three'", "'3 3'", "'33'", "'3'"}));

        myQuiz.run();
    }
}
