package opgave1;

import java.util.ArrayList;

public class Room {
    private String name;
    private ArrayList<Lamp> lamps;
    private ArrayList<Window> windows;

    public Room(String name) {
        this.name = name;
        this.lamps = new ArrayList<>();
        this.windows = new ArrayList<>();
    }

    public void addLamp(Lamp lamp) {
        lamps.add(lamp);
    }

    public void addWindow(Window window) {
        windows.add(window);
    }

    public int getLampCount() {
        return lamps.size();
    }

    public int getWindowCount() {
        return windows.size();
    }

    public int getTotalWatt() {
        int totalWatt = 0;
        for (Lamp lamp : lamps) {
            totalWatt += lamp.getWatt();
        }
        return totalWatt;
    }

    public int getTotalWindowArea() {
        int totalWindowArea = 0;
        for (Window window : windows) {
            totalWindowArea += window.getAreaCm2();
        }
        return totalWindowArea;
    }

    public void printRoom() {
        System.out.println(name + "(" + getLampCount() + " lamper, " + getWindowCount() + " vinduer)");
        System.out.println("  Lamper total watt: " + getTotalWatt() + "W");
        System.out.println("  Vinduer samlet areal: " + getTotalWindowArea() + "Cm2");
    }

}
