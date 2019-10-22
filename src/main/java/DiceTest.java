import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DiceTest {

    Dice dice;

    @Before
    public void setUp() throws Exception {
        dice = new Dice("test dice");
    }

    @After
    public void tearDown() throws Exception {
        dice = null;
    }
}