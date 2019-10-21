//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

import java.util.Random;

public class Dice {
    private String id;
    private Random random;

    public Dice(String id) {
        this.id = id;
        this.random = new Random();
    }

    public int roll() {
        return this.random.nextInt(6) + 1;
    }
}
