import java.util.Scanner;

public class Menu {

    public static void startGame() throws InterruptedException {
        FighterMaker ref = FighterMaker.getInstance();
        Scanner input = new Scanner(System.in);
        Match refMatch = new Match();
        ref.createFighterArray();

        System.out.print("Welcome to Mortal Java!\nMenu:\n1. Start the game\n2. List fighters\n3. Quit game\nWhat do you want to do: ");
           String userInput= input.nextLine();
            switch (userInput) {
                case "1":
                    refMatch.matches();
                    break;

                case "2":
                    for (int i = 0; i < ref.currentList.size(); i++) {
                        System.out.println(ref.currentList.get(i));
                    }
                    System.out.println();
                    ref.currentList.clear();
                    startGame();
                    break;

                case "3":
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Stop that.");
                    startGame();
                    break;
            }
        }
    }
