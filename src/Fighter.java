import java.util.Random;

public class Fighter {
    private String name, winningMotto;
    private int health;

    public Fighter(String name, String winningMotto, int health) {
        this.name = name;
        this.winningMotto = winningMotto;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public String getWinningMotto() {
        return winningMotto;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    @Override
    public String toString() {
        return ""+name + " " + "";
    }
}
