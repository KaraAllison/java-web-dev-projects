package funwithquizzes;

import java.util.ArrayList;
import java.util.Objects;

public class Checkbox extends Question {
    private String[] choices;
    private Integer[] answer;
    public Checkbox(String question, Integer[] answer, String[] choices) {
        super(question);
        setType("Checkbox");
        this.answer = answer;
        this.choices = choices;
    }
    public void printChoices() {
        for (int i = 0; i < choices.length; i ++) {
            System.out.println(i + 1 + ". " + choices[i]);
        }
    }
    public boolean askQuestion() {
        ArrayList<Integer> response = new ArrayList<>();
        print();
        printChoices();
        while (true) {
            boolean flag = false;
            System.out.println("Enter the numbers of your selection one at a time (Enter x when done): ");
            while (true) {
//                getInput().nextLine();
                try {
                    response.add(getInput().nextInt());
                } catch (Exception e) {
                    if (getInput().nextLine().equals("x")) {
                        break;
                    }
                    getInput().nextLine();
                    flag = true;
                    break;
                }
            }
            if (flag) {
                response.clear();
                continue;
            }
            if (isValid(response)) {
                break;
            } else {
                response.clear();
            }

        }

        if (isCorrect(response)) {
            System.out.println("Correct");
            return true;
        } else {
            System.out.println("Wrong");
            return false;
        }
    }
    public boolean isValid (ArrayList<Integer> response) {
        for (int i = 0; i < response.size(); i ++) {
            if (response.get(i) < 1 || response.get(i) > choices.length) {
                return false;
            }
        }
        return !response.isEmpty() && response.size() <= choices.length;
    }
    public boolean isCorrect (ArrayList<Integer> response) {
        if (response.size() != answer.length) {
            return false;
        }
        for (int i = 0; i < response.size(); i ++) {
            if (!Objects.equals(answer[i], response.get(i))) {
                return false;
            }
        }
        return true;
    }

    public String[] getChoices() {
        return choices;
    }

    public void setChoices(String[] choices) {
        this.choices = choices;
    }

    public Integer[] getAnswer() {
        return answer;
    }

    public void setAnswer(Integer[] answer) {
        this.answer = answer;
    }
}
