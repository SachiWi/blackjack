

import org.junit.Assert;
import org.junit.Test;

public class DiceTest {
    Dice dice;

    public DiceTest() {
    }


    @Test
    public void roll_checkAboveSix() {
        int value = this.dice.roll();
        Assert.assertFalse(value > 6);
    }

    @org.testng.annotations.Test
    public void roll_checkBelowOne() {
        int value = this.dice.roll();
        Assert.assertFalse(value < 1);
    }

    @Test
    public void roll_checkBetweenOneAndSix() {
        int value = this.dice.roll();
        Assert.assertTrue(0 < value && value < 7);
    }
}
