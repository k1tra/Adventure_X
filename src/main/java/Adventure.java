public class Adventure {
    // why do I make these attributes? -v- ah, its so we can use those variables?
    private Player player;
    private Map map;

    public Adventure(){
        player = new Player(100);
        map = new Map();
        map.createMap();
        player.setCurrentRoom(map.getStarterRoom());
    }

    public void playerDropItem(String itemName){
        player.dropItem(itemName);
    }

    public void playerEatItem(String itemName){
        eatStatus status = player.eatFood(itemName);
        if(status==eatStatus.eaten){
            System.out.println("I ate "+itemName);
        }else if(status==eatStatus.unedible) {
            System.out.println("You cannot eat that!");
        }else if(status==eatStatus.nonexisting){
            System.out.println("That item does not exist!");
            }
        }

    public void takeItem(String type){
        player.pickUpItem(type);
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
    public void lookAround(){
        player.lookAround();
    }
    public void lookAtInventory(){
        player.lookAtInventory();
    }

}
