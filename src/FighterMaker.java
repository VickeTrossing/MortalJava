import java.util.ArrayList;
import java.util.List;

public class FighterMaker {
    static FighterMaker instance = new FighterMaker();

    List<Fighter> currentList = new ArrayList<>();
    List<Fighter> winningList = new ArrayList<>();


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
}
