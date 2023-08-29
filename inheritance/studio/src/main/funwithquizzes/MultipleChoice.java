package funwithquizzes;

public class MultipleChoice extends Question{
    private String[] choices;
    private int answer;
    public MultipleChoice(String question, int answer, String[] choices) {
        super(question);
        setType("Multiple Choice");
        this.answer = answer;
        this.choices = choices;
    }
    public void printChoices() {
        for (int i = 0; i < choices.length; i ++) {
            System.out.println(i + 1 + ". " + choices[i]);
        }
    }

    public boolean askQuestion() {
        int response;
        print();
        printChoices();
        while (true) {
            System.out.println("Enter the number of your selection: ");
            try {
                response = getInput().nextInt();
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
    public boolean isValid (int response) {
        return response > 0 && response <= choices.length;
    }
    public boolean isCorrect (int response) {
        return answer == response;
    }

    public String[] getChoices() {
        return choices;
    }

    public void setChoices(String[] choices) {
        this.choices = choices;
    }

    public int getAnswer() {
        return answer;
    }

    public void setAnswer(int answer) {
        this.answer = answer;
    }
}
