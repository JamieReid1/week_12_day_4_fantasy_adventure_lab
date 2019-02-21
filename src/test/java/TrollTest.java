import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrollTest {

    Troll bridgey;
    Weapon club;

    @Before
    public void before(){

        club = new Weapon("club", 3, 9);
        bridgey = new Troll("Mr Bridgey", 12, club);

    }

    @Test
    public void hasName(){
        assertEquals("Mr Bridgey", bridgey.getName());
    }

    @Test
    public void canSetName(){
        bridgey.setName("Papa Smurf");
        assertEquals("Papa Smurf", bridgey.getName());
    }

    @Test
    public void hasHealth(){
        assertEquals(12, bridgey.getHealth());
    }

    @Test
    public void canSetHealth(){
        bridgey.setHealth(90);
        assertEquals(90, bridgey.getHealth());
    }

    @Test
    public void hasWeapon(){
        assertEquals(club, bridgey.getWeapon());
    }

    @Test
    public void canSetWeapon(){
        Weapon hammer = new Weapon("Hammer", 12,4);
        bridgey.setWeapon(hammer);
        assertEquals(hammer, bridgey.getWeapon());
    }
}
