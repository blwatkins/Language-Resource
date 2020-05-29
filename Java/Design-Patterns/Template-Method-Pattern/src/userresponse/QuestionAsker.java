package userresponse;

import java.util.Scanner;

public class QuestionAsker {
    private String question;
    private String answer;
    Scanner input;

    public QuestionAsker(String question) {
        input = new Scanner(System.in);
        this.question = question;
        this.answer = "";
    }

    public void askQuestion() {
        System.out.print(question + " ");
        answer =  input.nextLine();
    }

    public boolean answerIs(String answer) {
        boolean answerMatches = false;

        if (this.answer.equalsIgnoreCase(answer)) {
            answerMatches = true;
        }

        return answerMatches;
    }
}
