import enemies.Orc;
import itemTypes.Weapon;
import org.junit.Before;
import org.junit.Test;
import players.Knight;

import static org.junit.Assert.assertEquals;

public class OrcTest {

    Orc snarly;
    Weapon cutlass;
    Knight keith;

    @Before
    public void before(){

        cutlass = new Weapon("Cutlass", 5, 10);
        snarly = new Orc("Mr Snarly", 20, cutlass);
        keith = new Knight("Sir Keith", cutlass);
    }

    @Test
    public void hasName(){
        assertEquals("Mr Snarly", snarly.getName());
    }

    @Test
    public void canSetName(){
        snarly.setName("Papa Smurf");
        assertEquals("Papa Smurf", snarly.getName());
    }

    @Test
    public void hasHealth(){
        assertEquals(20, snarly.getHealth());
    }

    @Test
    public void canSetHealth(){
        snarly.setHealth(90);
        assertEquals(90, snarly.getHealth());
    }

    @Test
    public void hasWeapon(){
        assertEquals(cutlass, snarly.getWeapon());
    }

    @Test
    public void canSetWeapon(){
        Weapon hammer = new Weapon("Hammer", 12,4);
        snarly.setWeapon(hammer);
        assertEquals(hammer, snarly.getWeapon());
    }

    @Test
    public void canAttack(){
        snarly.attack(keith);
        assertEquals(95, keith.getHealth());
    }

}
