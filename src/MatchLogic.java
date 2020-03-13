import java.util.Random;
import java.util.Scanner;

public class MatchLogic {

    private static Random rand = new Random();
    static Scanner scan = new Scanner(System.in);
    private static FighterMaker ref = FighterMaker.getInstance();

    public static void matchLogic() throws InterruptedException {
        Fighter f1 = ref.currentList.get(0);
        ref.currentList.remove(f1);
        Fighter f2 = ref.currentList.get(0);
        ref.currentList.remove(f2);

        int f1Count = 0;
        int f2Count = 0;
        int rounds = 1;

        f1.setHealth(100);
        f2.setHealth(100);

        System.out.println(f1.getName() + " will meet " + f2.getName() + "!\nPress enter to start the fight!");
        scan.nextLine();
        outerloop:
        while (true) {
            for (int i = 0; i < 3; i++) {
                int damage = rand.nextInt(14) + 1;
                int damage1 = rand.nextInt(14) + 1;
                int defendDamage = rand.nextInt(9);
                int defendDamage1 = rand.nextInt(9);
                //1Thread.sleep(600);

                if (f1.getHealth() <= 0) {
                    f2Count++;

                    if (f2Count == 2) {
                        System.out.println("The winner is " + f2.getName() + " and moves on to the next match!");
                        System.out.println(f2.getName() + " screams: " + f2.getWinningMotto());
                        ref.winningList.add(f2);
                        break outerloop;
                    }
                    System.out.println(f2.getName() + " wins round " + rounds + "!\nPress any enter for the next round");
                    scan.nextLine();
                    rounds++;
                    f1.setHealth(100);
                    f2.setHealth(100);
                }

                FightLogic.attackDefend(damage, defendDamage, f1, f2, damage);

                if (f2.getHealth() <= 0) {
                    f1Count++;

                    if (f1Count == 2) {
                        System.out.println("The winner is " + f1.getName() + " and moves on to the next match!");
                        System.out.println(f1.getName() + " screams: " + f1.getWinningMotto());
                        ref.winningList.add(f1);
                        break outerloop;
                    }
                    System.out.println(f1.getName() + " wins round " + rounds +"!\nPress any enter for the next round:");
                    scan.nextLine();
                    rounds++;
                    f1.setHealth(100);
                    f2.setHealth(100);
                }
                FightLogic.attackDefend(damage1, defendDamage1, f2, f1, damage1);
            }
        }
    }

}
