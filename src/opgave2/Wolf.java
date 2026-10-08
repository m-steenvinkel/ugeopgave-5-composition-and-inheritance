package opgave2;

import java.util.Random;

public class Wolf extends Animal {

    Random r1 = new Random();

    public Wolf(String name, int energy) {
        super(name, energy);
    }

    @Override
    public int attack() {
        int random = r1.nextInt(30 - 10 + 1) + 10;
        return random;
    }
}

