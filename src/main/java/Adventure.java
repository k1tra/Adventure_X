public class Adventure {
    private Player player;
    private Map map;

    public Adventure(){
        player = new Player();
        map = new Map();
        map.createMap();
        player.setCurrentRoom(map.getStarterRoom());
    }

    /*public void go(String way){
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
    }*/
    //moveplayer
    public void movePlayer(String way){
        player.movePlayer(way);
    }

}
