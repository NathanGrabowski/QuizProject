/*------------------------------------------------------------------------------

File:   MultipleChoiceQuestion.java
Date:
Purpose:
Author: Nathan Grabowski

------------------------------------------------------------------------------*/
import java.util.Scanner;

public class MultipleChoiceQuestion extends Question {

    private String qText;
    private String[] qAnswers;
    int correctAns;
    Scanner keyboard;

    public MultipleChoiceQuestion(String qT, String[] qA, int corA, Scanner sc) {

        qText = qT;
        qAnswers = qA;
        correctAns = corA;
        keyboard = sc;
    }

    public void setUpQuestion() {

        System.out.println(qText);
        System.out.println("");
        char choice = 'A';
        for (String s : qAnswers) {
            System.out.println(choice + "\t" + s);
            choice++;
        }
    }

    public boolean processAnswer() {

        String temp = keyboard.nextLine();
        if (temp.charAt(0) - 'A' == correctAns || temp.charAt(0) - 'a' == correctAns) {
            return true;
        } else {
            return false;
        }
    }

}
