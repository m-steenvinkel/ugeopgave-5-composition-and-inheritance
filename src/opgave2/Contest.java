package opgave2;

public class Contest {
    private Animal animal1;
    private Animal animal2;

    public Contest(Animal animal1, Animal animal2) {
        this.animal1 = animal1;
        this.animal2 = animal2;
    }

    public void playRound() {
        int round = 0;
        while (getWinner() == null) {
            round++;
            System.out.println("=== Runde " + round + " ===");
            animal2.reduceEnergy(animal1.attack());
            System.out.print(animal1.getName() + " angriber " + animal2.getName() + " for " + animal1.attack() + "! ");
            System.out.println("(" + animal2.getName() + " har " + animal2.getEnergy() + " energi tilbage)");

            animal1.reduceEnergy(animal2.attack());
            System.out.print(animal2.getName() + " angriber " + animal1.getName() + " for " + animal2.attack() + "! ");
            System.out.println("(" + animal1.getName() + " har " + animal1.getEnergy() + " energi tilbage)\n");
        }
        System.out.println("The winner is: " + getWinner());
    }

    public Animal getWinner() {
        if (animal1.isActive()) {
            return animal2;
        } else if (animal2.isActive()) {
            return animal1;
        } else {
            return null;
        }
    }

}
