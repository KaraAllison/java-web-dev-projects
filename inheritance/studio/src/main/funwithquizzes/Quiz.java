package funwithquizzes;

import java.util.ArrayList;

public class Quiz {
    private ArrayList<Question> questions;
    private double score;

    public Quiz() {
        this.questions = new ArrayList<>();
        this.score = 0;
    }
    public Quiz(ArrayList<Question> questions) {
        this.questions = questions;
    }
    public void addQuestion(Question question) {
        questions.add(question);
    }
    public void run() {
        for (Question q : questions) {
            if(q.askQuestion()) {
                score ++;
            };
        }
        System.out.println("You scored " + score + "/" + questions.size() +
                " = " + score/questions.size()*100 + "%");
    }

    public ArrayList<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(ArrayList<Question> questions) {
        this.questions = questions;
    }
}
