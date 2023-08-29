package funwithquizzes;

public class TrueFalse extends Question {
    private boolean answer;
    public TrueFalse(String question, boolean answer) {
        super(question);
        setType("True/False");
        this.answer = answer;
    }
    public boolean askQuestion() {
        boolean response;
        print();
        while (true) {
            System.out.println("Enter true/false: ");
            try {
                response = getInput().nextBoolean();
            } catch (Exception e) {
                getInput().nextLine();
                continue;
            }
            if (isValid(response)) {
                break;
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
    public boolean isValid (boolean response) {
        return true;
    }
    public boolean isCorrect (boolean response) {
        return answer == response;
    }

    public boolean isAnswer() {
        return answer;
    }

    public void setAnswer(boolean answer) {
        this.answer = answer;
    }
}
