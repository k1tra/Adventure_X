public class Map {


    private Room room1 = new Room("Krypt1", "krypt1");
    private Room room2 = new Room("Krypt2", "krypt2");
    private Room room3 = new Room("Krypt3", "krypt3");
    private Room room4 = new Room("Krypt4", "krypt4");
    private Room room5 = new Room("Krypt5", "krypt5");
    private Room room6 = new Room("Krypt6", "krypt6");
    private Room room7 = new Room("Krypt7", "krypt7");
    private Room room8 = new Room("Krypt8", "krypt8");
    private Room room9 = new Room("Krypt9", "krypt9");

    public Room getStarterRoom(){
        return room1;
    }

    public void createMap() {
        room1.setEast(room2);
        room1.setSouth(room4);
        room2.setWest(room1);
        room2.setEast(room3);
        room3.setWest(room2);
        room3.setSouth(room6);
        room4.setNorth(room1);
        room4.setSouth(room7);
        room5.setSouth(room8); // special room with only one entrance from room 8
        room6.setNorth(room3);
        room6.setSouth(room9);
        room7.setNorth(room4);
        room7.setEast(room8);
        room8.setNorth(room5);
        room8.setEast(room9);
        room8.setWest(room7);
        room9.setNorth(room6);
        room9.setWest(room8);

        // items tilføjes
        room1.addItem(new Item("Våben1"));
        room2.addItem(new Item("Våben2"));
        room3.addItem(new Item("Våben3"));
        room4.addItem(new Item("Våben4"));
        room5.addItem(new Item("Våben5"));
        room6.addItem(new Item("Våben6"));
        room7.addItem(new Item("Våben7"));
        room8.addItem(new Item("Våben8"));
        room9.addItem(new Item("Våben9"));
    }
}
