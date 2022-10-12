public class Adventure {
    private Room currentRoom;
    public Adventure(){
        currentRoom = room1;
    }

    private Room room1 = new Room("Krypt1", "krypt1");
    private Room room2 = new Room("Krypt2", "krypt2");
    private Room room3 = new Room("Krypt3", "krypt3");
    private Room room4 = new Room("Krypt4", "krypt4");
    private Room room5 = new Room("Krypt5", "krypt5");
    private Room room6 = new Room("Krypt6", "krypt6");
    private Room room7 = new Room("Krypt7", "krypt7");
    private Room room8 = new Room("Krypt8", "krypt8");
    private Room room9 = new Room("Krypt9", "krypt9");


    public void go(String way){
        switch(way){
            case "north":
                Room north = currentRoom.getNorth();
                if(north==null){
                    System.out.println("You cannot go that way");
                    return;
                }
                currentRoom=north;
                break;
            case "south":
                Room south = currentRoom.getSouth();
                if(south==null){
                    System.out.println("You cannot go that way");
                    return;
                }
                currentRoom=south;
                break;
            case "west":
                Room west = currentRoom.getWest();
                if(west==null){
                    System.out.println("You cannot go that way");
                    return;
                }
                currentRoom=west;
                break;
            case "east":
                Room east = currentRoom.getEast();
                if(east==null){
                    System.out.println("You cannot go that way");
                    return;
                }
                currentRoom=east;
                break;
        }
    }

    public void createMap(){
        room1.setEast(room2);
        room1.setSouth(room4);
        room2.setWest(room1);
        room2.setEast(room3);
        room3.setWest(room2);
        room3.setSouth(room6);
        room4.setNorth(room1);
        room4.setSouth(room7);
        room5.setSouth(room8); // special room
        room6.setNorth(room3);
        room6.setSouth(room9);
        room7.setNorth(room4);
        room7.setEast(room8);
        room8.setNorth(room5);
        room8.setEast(room9);
        room8.setWest(room7);
        room9.setNorth(room6);
        room9.setWest(room8);


    }

    public Room getCurrentRoom(){
        return currentRoom;
    }


}
