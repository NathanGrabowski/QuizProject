/*------------------------------------------------------------------------------

File:   QuizMain.java
Date:
Purpose:
Author: Nathan Grabowski

------------------------------------------------------------------------------*/
import java.util.ArrayList;
import java.util.Scanner;

public class QuizMain {
Scanner keyboard=new Scanner(System.in);
ArrayList <Question> qList = new ArrayList<Question>();
int score = 0;
int questionsasked = 0;
    public static void main(String[] args) {
        new QuizMain();
    }

    public QuizMain() {
        initalize();
        mainLoop();
    }

    public void initalize(){
        
        String [] MCanswers = {"Lightning","Rage","Clone","Jump"};
        String [] PIOanswers = {"Archer","Barbarian", "Goblin","Giant"};
        int MCcorrect = 0;
        int [] PIOcorrect = {1,0,3,2};
        String SAcorrect = "Minion";
        qList.add(new MultipleChoiceQuestion ("What is the first spell that you unlock in the spell factory?",MCanswers, MCcorrect, keyboard));  
        qList.add(new PutInOrderQuestion ("In what order do you unlock these troops?", PIOanswers, PIOcorrect,keyboard));
        qList.add(new ShortAnswerQuestion ("What is the first troop unlocked in the dark barracks?", SAcorrect,keyboard));
    }
    
    public void mainLoop(){
        
    for(int i = 0; i < qList.size(); i++){ 
        Question q = qList.get(i);
        q.setUpQuestion();
        if(q.processAnswer()==true){
            System.out.println("CORRECT");
            score++;
        }else{
            System.out.println("INCORRECT");
        }
        questionsasked++;
        System.out.println("Score: "+ score+"/"+questionsasked);
    }
}
}