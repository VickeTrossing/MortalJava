
public class FightLogic {
    public static void attackDefend(int attack, int defend, Fighter attacker, Fighter defender) {
        if (attack <= defend) {
            attack = 0;
            System.out.println(defender.getName() + " blocks the attack!");
        }
        else {
            defender.setHealth(defender.getHealth() - attack);

            System.out.println(attacker.getName() + " attacks " + defender.getName() + " and deals "
                    + attack + " damage! " + defender.getName() + " has " + defender.getHealth() + " health left.");
        }
    }
}