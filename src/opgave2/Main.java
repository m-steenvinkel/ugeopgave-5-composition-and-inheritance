package opgave2;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();

        animals.add(new Lion("Lion", 100));
        animals.add(new Wolf("Wolf", 80));
        animals.add(new Rabbit("Rabbit", 50));
        animals.add(new Wolf("Wolf2", 80));

        Contest contest1 = new Contest(animals.get(0), animals.get(1));
        Contest contest2 = new Contest(animals.get(2), animals.get(3));

        contest1.playRound();
        System.out.println();
        contest2.playRound();
    }
}
