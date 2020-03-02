import java.util.Scanner;

public class Betting {


    public static double yourBetting(Fighter f1, Fighter f2, int bet, double stakes){
        Scanner scan = new Scanner(System.in);
        System.out.println("How much do you want to bet? You have: " + bet);
        int yourBet = scan.nextInt();
        System.out.println("On 1. " + f1.getName() + " or 2. " + f2.getName()+"?");
        int yourChoice = scan.nextInt();

        switch (yourChoice){
            case 1: if(f1.getHealth() <= 0){
                return 0;
            }
            else{
                System.out.println("You won! You now have " + bet*stakes);
                return bet*stakes;
            }
            case 2: if(f2.getHealth() <= 0){
                return 0;
            }
            else{
                System.out.println("You won! You now have " + bet*stakes);
                return bet*stakes;
            }
        }

        return bet;
    }

}
