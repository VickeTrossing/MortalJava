import java.util.ArrayList;
import java.util.List;

public class FighterMaker {
    static FighterMaker instance = new FighterMaker();

    List<Fighter> currentList = new ArrayList<>();
    ArrayList<Fighter> winningList = new ArrayList<>();
    List<Fighter> finalistList = new ArrayList<>();


    public static FighterMaker getInstance() {
        return instance;
    }

     void createFighterArray(){
        currentList .add(new Fighter("Marcus", "RÅTTA", 100));
        currentList .add(new Fighter("Vicke", "REEEEEE", 100));
        currentList .add(new Fighter("Mikaela", "KRÄNK MIG DÅ!", 100));
        currentList .add(new Fighter("Emil", "Det lirar", 100));
        currentList .add(new Fighter("Elliot", "Jag har faktiskt slutat snusa", 100));
        currentList .add(new Fighter("Trump", "China.", 100));
        currentList .add(new Fighter("Putin", "сука блять", 100));
        currentList .add(new Fighter("Casamassa", "Fanculo, porco dio!", 100));
    }

    public List<Fighter> getCurrentList() {
        return currentList;
    }

    public ArrayList<Fighter> getWinningList() {
        return winningList;
    }

    public List<Fighter> getFinalistList() {
        return finalistList;
    }
    /*void addWinner(Fighter fighter){
        winningList.add(fighter);
    }

    void addFinalist(Fighter fighter){
        finalistList.add(fighter);
    }*/
}
