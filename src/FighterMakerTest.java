import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class FighterMakerTest {

    FighterMaker ref;
    static FighterMaker instance;

    @BeforeAll
    public static void beforeAll(){
        System.out.println("Starting tests...");
    }

    @BeforeEach
    public void beforeTest() {
        ref = new FighterMaker();
        ref.createFighterArray();
        System.out.println("Running a test... ");
    }

    @Test
    void createFighterArray() {
        assertNotNull(ref.currentList);
    }


    @Test
    void testCurrentList() {
        assertEquals(8, ref.currentList.size());
    }

    @Test
        public void testHealth(){
      for(int i = 0; i < ref.currentList.size(); i++){
          System.out.println("Testing health... ");
          assertEquals(100, ref.currentList.get(i).getHealth());
      }
    }




    @AfterAll
    public static void afterTest() {
        System.out.println("Test over.");
    }

}