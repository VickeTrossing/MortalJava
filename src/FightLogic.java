
public class FightLogic {

    public static void attackDefend(int attack, int defend, Fighter attacker, Fighter defender, int specialAttackChance) {
        if (attack <= defend) {
            attack = 0;
            System.out.println(defender.getName() + " blocks the attack!");
        }
        else {
            defender.setHealth(defender.getHealth() - attack);

            System.out.println(attacker.getName() + " attacks " + defender.getName() + " and deals "
                    + attack + " damage! " + defender.getName() + " has " + defender.getHealth() + " health left.");
        }

        if(specialAttackChance == 1){
            speicalAttack(attack, attacker, defender);
        }
    }



    public static void speicalAttack(int attack, Fighter attacker, Fighter defender){
        attack = defender.getHealth()/2;
        defender.setHealth(defender.getHealth() - attack);
        System.out.println(attacker.getName() + " GETS A SPECIAL ATTACK AND DEALS " + attack + " DAMAGE! " +  defender.getName() + " has " + defender.getHealth() + " health left!");
    }
}