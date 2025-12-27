
import java.util.Random;
import java.util.Scanner;

public class NumberGuessing{
    public static void main(String[]args){

        Random random= new Random();
        Scanner sc = new Scanner(System.in);

        //generating random number between 1-100
        int number=random.nextInt(100);
        int guess;
        int attempts=0;

        System.out.println("guess the number between 1-100:");

        do{
            guess=sc.nextInt();
            attempts++;

            if(guess< number){
                System.out.println("Too low! Try again:");
            }
            else if(guess>number){
                System.out.println("Too high! Try again:");
            }
              else{
                System.out.println("Correct");
                
                 System.out.println("you guessed it in "+ attempts+"attempts.");
            
              }
            }while(guess!=number);
            sc.close();
        }
    }
