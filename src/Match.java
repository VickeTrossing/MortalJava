
import java.util.Collections;
import java.util.Scanner;

public class Match{
    FighterMaker ref = FighterMaker.getInstance();
    Scanner scan = new Scanner(System.in);

    public void matches() throws InterruptedException {
        Collections.shuffle(ref.currentList);
        outerloop:
        for (int i = 0; i < ref.currentList.size(); ) {
            for (int j = 0; j < ref.currentList.size(); ) {
                if (ref.currentList.size() == 1) {
                    System.out.println("THE WINNER IS: " + ref.currentList.get(0));
                    System.out.println(ref.currentList.get(0) + "once again screams: " + ref.currentList.get(0).getWinningMotto());
                    break outerloop;
                }
                MatchLogic.matchLogic();
                System.out.print("Press any key to go to next match: ");
                scan.nextLine();
            }
            ref.currentList.addAll(ref.winningList);
            ref.winningList.clear();
        }
    }
}




