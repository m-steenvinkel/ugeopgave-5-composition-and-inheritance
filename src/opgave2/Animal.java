package opgave2;

public abstract class Animal {
    private String name;
    private int energy;

    public Animal(String name, int energy) {
        this.name = name;
        this.energy = energy;
    }

    public boolean isActive() {
        return energy < 0;
    }

    public abstract int attack();

    public String toString() {
        return name + " (energi: " + energy + ")";
    }

    public String getName() {
        return name;
    }

    public int getEnergy() {
        return energy;
    }

    public void reduceEnergy(int amount) {
        energy -= amount;
    }
}
