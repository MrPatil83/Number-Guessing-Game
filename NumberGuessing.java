import java.util.Random;
import java.util.Scanner;


class Game {
    int number;
    int userInputNumber;
    int countOfGuessingNo=0;

    public int getCountOfGuessingNo() {
        return countOfGuessingNo;
    }

    public void setCountOfGuessingNo(int countOfGuessingNo) {
        this.countOfGuessingNo = countOfGuessingNo;
    }

    //constructor
      Game(){
        Random rand = new Random();
        this.number = rand.nextInt(100);
    }

      void  takingInput(){
        Scanner sc = new Scanner (System.in);
         System.out.println("Guess The Number :- ");
          userInputNumber= sc.nextInt();
    }

    boolean isCorrectNumber() {
        countOfGuessingNo++;
        System.out.println("You guessed it in "+getCountOfGuessingNo()+" attempts!");
        if (userInputNumber == number) {
            System.out.println("Congrats You Guessing Perfect Number...⭐⭐⭐⭐⭐ Random no is :- "+number);
            return true;

        } else if (userInputNumber > number) {
            System.out.println("Your Guessing Value Is To High....");
        } else if (userInputNumber < number) {
            System.out.println("Your Guessing Value Is To Low....");
        }
        return false;
    }
}

public class NumberGuessing {
    public static void main(String[] args) {

        Game g = new Game();
        boolean b =false;
        while(!b){
            g.takingInput();
            b= g.isCorrectNumber();
            System.out.println(b);
        }
    }
}
