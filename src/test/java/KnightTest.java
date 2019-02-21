import enemies.Troll;
import itemTypes.Weapon;
import players.Knight;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class KnightTest {
        Knight keith;
        Weapon sword;
        Troll troll;

        @Before
        public void before(){
            sword = new Weapon("Excalibur", 15,10);
            keith = new Knight("Sir Keith Sledger", sword);
            troll = new Troll("Mr Bridgy", 30, sword);
        }

        @Test
        public void hasName(){
            assertEquals("Sir Keith Sledger", keith.getName());
        }

        @Test
        public void canSetName(){
            keith.setName("Cuthbert");
            assertEquals("Cuthbert", keith.getName());
        }

        @Test
        public void hasHealth(){
            assertEquals(100, keith.getHealth());
        }

        @Test
        public void canSetHealth(){
            keith.setHealth(45);
            assertEquals(45, keith.getHealth());
        }

        @Test
        public void hasWeapon(){
            assertEquals(sword, keith.getWeapon());
        }

        @Test
        public void canSetWeapon(){
            Weapon spoon = new Weapon("Timothy", 1,1);
            keith.setWeapon(spoon);
            assertEquals(spoon, keith.getWeapon());
        }

        @Test
        public void canAttack(){
            keith.attack(troll);
            assertEquals(15, troll.getHealth());
        }
}
