/*------------------------------------------------------------------------------

File:   Question.java
Date:
Purpose:
Author: Nathan Grabowski

------------------------------------------------------------------------------*/

public abstract class Question{
    public abstract void setUpQuestion();
    public abstract boolean processAnswer();
    public static boolean needSkip = false;    
}