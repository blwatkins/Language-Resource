package beverage;

import java.util.Scanner;

public class Tea extends Beverage {
    private Scanner input;

    public Tea() {
        super();
        input = new Scanner(System.in);
    }

    protected void brew() {
        System.out.println("Steeping tea!");
    }

    protected void addCondiments() {
        System.out.println("Adding honey and lemon!");
    }

    protected boolean customerWantsCondiments() {
        boolean wantsCondiments = false;
        String answer = getUserResponse("Would you like honey and lemon with your tea?");

        if (isYes(answer)) {
            wantsCondiments = true;
        }

        return wantsCondiments;
    }

    private String getUserResponse(String question) {
        System.out.print(question + " ");
        return input.nextLine();
    }

    private boolean isYes(String answer) {
        return (answer.charAt(0) == 'Y' || answer.charAt(0) == 'y');
    }
}
