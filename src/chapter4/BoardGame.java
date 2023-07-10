package chapter4;

import java.util.Random;

public class BoardGame {
    public static void main(String[] args) {
        //known
       int maxRoll = 6;
       int maxSpace = 20;
       int currentSpace = 0;

       for (int i =0; i<maxRoll-1; i++){
          if (currentSpace==maxSpace){
             break;
          }
          else{
             Random random = new Random();
             int die = random.nextInt(6)+1;
             currentSpace+=die;
             int spaceRemaining = maxSpace-currentSpace;
             System.out.println("Roll #"+(i+1)+": You've rolled a "+die+". You are now on space "+currentSpace+" and you" +
                     " have "+ spaceRemaining +" more to go.");
          }
       }
       if(currentSpace<maxSpace||currentSpace>maxSpace){
          System.out.println("oops, You Lose!");
       }
       else{
          System.out.println("Congrats, You win!");
       }
    }
}
