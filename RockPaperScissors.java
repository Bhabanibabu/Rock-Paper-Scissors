package Assignment_InternPE;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random random=new Random();
        String[] rps={"Rock","Paper","Scissors"};
        String computerMove, playerMove;
        int computerChoice;

        while (true){
            System.out.println("Enter your move (Rock, Paper, Scissors). To exit the game, type 'exit': ");
            playerMove= sc.nextLine();

            if (playerMove.equalsIgnoreCase("exit")){
                System.out.println("Thanks for playing!");
                break;
            }
            if (!playerMove.equalsIgnoreCase("Rock") && !playerMove.equalsIgnoreCase("Paper") && !playerMove.equalsIgnoreCase("Scissors")){
                System.out.println("Invalid move, please try again.");
                continue;
            }
            computerChoice=random.nextInt(3);
            computerMove=rps[computerChoice];
            System.out.println("Computer chose: " + computerMove);

            if (playerMove.equalsIgnoreCase(computerMove)){
                System.out.println("It's a tie!");
            } else if (playerMove.equalsIgnoreCase("Rock")) {
                if (computerMove.equals("Scissors")){
                    System.out.println("You Win!");
                }else {
                    System.out.println("You Lose!");
                }
                }else if (playerMove. equalsIgnoreCase("Paper")){
                if (computerMove.equals("Rock")){
                    System.out.println("You Win!");
                }else {
                    System.out.println("You Lose!");
                }
            } else if (playerMove.equalsIgnoreCase("Scissors")) {
                if(computerMove.equals("Paper")){
                    System.out.println("You Win!");
                }else {
                    System.out.println("You Lose!");
                }
            }
        }
        sc.close();
    }
}
