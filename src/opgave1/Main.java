package opgave1;

public class Main {

    public static void main(String[] args) {
        Building building = new Building("Kontorbygningen");

        Room room1 = new Room("Mødelokale");
        Room room2 = new Room("Køkken");
        Room room3 = new Room("Kontor");

        Lamp lamp1 = new Lamp(40);
        Lamp lamp2 = new Lamp(60);
        Lamp lamp3 = new Lamp(100);

        Window window1 = new Window(120, 90);
        Window window2 = new Window(60, 60);
        Window window3 = new Window(100, 80);

        room1.addLamp(lamp1);
        room1.addLamp(lamp2);
        room1.addLamp(lamp2);
        room1.addWindow(window1);
        room1.addWindow(window2);

        room2.addLamp(lamp3);
        room2.addLamp(lamp3);
        room2.addWindow(window2);

        room3.addLamp(lamp1);
        room3.addLamp(lamp1);
        room3.addWindow(window3);

        building.addRoom(room1);
        building.addRoom(room2);
        building.addRoom(room3);

        building.printBuilding();

    }

}
