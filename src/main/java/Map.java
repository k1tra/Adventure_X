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
        room1.addItemRoom(new Item("våben1"));
        //room2.addItemRoom(new Item("våben2"));
        room1.addItemRoom(new Item("våben3"));
        room4.addItemRoom(new Item("våben4"));
        room4.addItemRoom(new Item("våben5"));
        room4.addItemRoom(new Item("våben6"));
        room7.addItemRoom(new Item("våben7"));
        room8.addItemRoom(new Item("våben8"));
        room9.addItemRoom(new Item("våben9"));
        room9.addItemRoom(new Food("apple",40));
        room1.addItemRoom(new Food("banana",15));
        room1.addItemRoom(new Food("castello", -20));
        room2.addItemRoom(new Food("sugarcube", 60));
        room1.addItemRoom(new MeleeWeapon("sword",5));
        room1.addItemRoom(new RangedWeapon("breath", 10,2));
    }
}
