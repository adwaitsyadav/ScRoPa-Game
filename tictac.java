import java.util.Random;
import java.util.Scanner;

public class tictac {
        public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                Random random= new Random();
                String[] choices ={
                        "rock",
                        "paper",
                        "scissors"
                };
                String playerChoice ;
                String compChoice ;
                String playAgain ="no" ;

                do{
                System.out.println("Enter your move (rock , paper , scissors):");
                playerChoice=scanner.next().toLowerCase();

                if(!playerChoice.equals("rock") &&
                   !playerChoice.equals("paper") &&
                   !playerChoice.equals("scissors")){
                        System.out.println("Invalid choice ");
                        continue;
                   }

                compChoice = choices[random.nextInt(3)];
                System.out.println("Computer choice : "+ compChoice);

                if(playerChoice.equals(compChoice)){
                        System.out.println("Its a TIE ");

                }
                else if(playerChoice.equals("rock")&&compChoice.equals("scissors") ||
                       (playerChoice.equals("paper")&&compChoice.equals("rock")) || 
                       (playerChoice.equals("scissors")&&compChoice.equals("paper"))){
                        System.out.println("You WIN");
                       
                }
                else{
                        System.out.println("You LOOSE");
                }
                      System.out.println("Play AGAIN ? (yes / no) ");
                      scanner.nextLine();
                      playAgain = scanner.nextLine().toLowerCase();
                }
                while(playAgain.equals("yes"));
                System.out.println("Thanks for playing !");

                scanner.close();


        }
}
