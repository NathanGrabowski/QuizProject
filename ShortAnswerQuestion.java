/*------------------------------------------------------------------------------

File:   ShortAnswerQuestion.java
Date:
Purpose:
Author: Nathan Grabowski

------------------------------------------------------------------------------*/
import java.util.Scanner;

public class ShortAnswerQuestion extends Question {

    private String qText;
    String correctAns;
    Scanner keyboard;

    public ShortAnswerQuestion(String qT, String corA, Scanner sc) {

        qText = qT;
        correctAns = corA;
        keyboard = sc;
    }

    public void setUpQuestion() {

        System.out.println(qText);
        System.out.println("");
        }


    public boolean processAnswer() {
        String temp = keyboard.nextLine();
        if (temp.contains(correctAns)){
            return true;
        } else {
            return false;
        }
    }
}