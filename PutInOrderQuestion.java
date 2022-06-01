/*------------------------------------------------------------------------------

File:   PutInOrderQuestion.java
Date:
Purpose:
Author: Nathan Grabowski

------------------------------------------------------------------------------*/
import java.util.Scanner;
import java.util.StringTokenizer;

public class PutInOrderQuestion extends Question {

    private String qText;
    private String[] qAnswers;
    int[] correctAns;
    Scanner keyboard;

    public PutInOrderQuestion(String qT, String[] qA, int[] corA, Scanner sc) {

        qText = qT;
        qAnswers = qA;
        correctAns = corA;
        keyboard = sc;
    }

    public void setUpQuestion() {

        System.out.println(qText);
        System.out.println("Type in order with a space between them, for example, 2 1 0 3.");
        System.out.println("______________________________________________________________");
        for (int i = 0; i < qAnswers.length; i++) {
            System.out.println(i + "\t|\t" + qAnswers[i]);
        }
    }

    public boolean processAnswer() {
        String temp = keyboard.nextLine();
        StringTokenizer st = new StringTokenizer(temp);
        
        for(int i =0; i<correctAns.length;i++){
            int nextAnswer = Integer.parseInt(st.nextToken());
            if(nextAnswer != correctAns[i])
                return false;
        }
        return true;
    }
}
