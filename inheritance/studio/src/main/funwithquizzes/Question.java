package funwithquizzes;
import java.util.Scanner;

public abstract class Question {
    private Scanner input = new Scanner(System.in);
    private String question;
    private String type;
    public Question() {
    }
    public void print() {
        System.out.println(this.type);
        System.out.println(this.question);
    }
    public Question(String question) {
        this.question = question;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getType() {
        return type;
    }
    public abstract boolean askQuestion();

    public void setType(String type) {
        this.type = type;
    }
    public Scanner getInput() {
        return input;
    }
}
