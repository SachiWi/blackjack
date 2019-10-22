//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DiceTest {
    Dice dice;

    public DiceTest() {
    }

    //@Before
    //public void setUp() throws Exception {
       // this.dice = new Dice("test dice");
    //}

   // @After
   // public void tearDown() throws Exception {
        //this.dice = null;
   // }

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
