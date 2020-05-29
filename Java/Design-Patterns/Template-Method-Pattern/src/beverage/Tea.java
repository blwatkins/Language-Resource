package beverage;

import userresponse.QuestionAsker;

public class Tea extends Beverage {
    QuestionAsker questionAsker;

    public Tea() {
        super();
        questionAsker = new QuestionAsker("Would you like honey and lemon with your tea?");
    }

    protected void brew() {
        System.out.println("Steeping tea!");
    }

    protected void addCondiments() {
        System.out.println("Adding honey and lemon!");
    }

    protected boolean customerWantsCondiments() {
        boolean wantsCondiments = false;
        questionAsker.askQuestion();

        if (questionAsker.answerIs("yes")) {
            wantsCondiments = true;
        }

        return wantsCondiments;
    }
}
