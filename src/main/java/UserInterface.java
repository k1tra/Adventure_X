import java.util.Scanner;

    public class UserInterface {
        private Adventure adventure;

        public void start() {
            adventure = new Adventure();


            Scanner sc = new Scanner(System.in);
            String gameplay; // not needed anymore?

            System.out.println("Hey og velkommen. Nu er det tid til eventyr - you know what you gotta do. Eller gør du?");
            System.out.println("Du er landet i en krypt. Du må angive retninger efter kompasset. \n" +
                    "For at gøre det hele lidt mere udfordrende kan du kun svare i engelske retningsangivelser: North, south, east og west.");
            System.out.println("Du kan også se dig omkring i det rum du er i, ved at skrive 'Look'. \n");
            System.out.println("Skulle det være helt slemt, så kan du skrive 'help' for at få en generel hjælpeliste udskrevet.\nSkulle det være endnu slemmere end helt slemt, så kan du skrive 'exit' og sågar 'quit' for at afslutte spillet. Psst. Det er ikke muligt at gemme.");
            //input switch-case gør det muligt for brugeren at lave inputs til den printede menu.
            do {
                gameplay=sc.nextLine().toLowerCase();
                String[] userInputList = gameplay.split(" ",2);
                String command = userInputList[0];
                String argument;
                if(userInputList.length>1){
                    argument=userInputList[1];
                }else{
                    argument="";
                }

                switch(command){
                    case "north":
                        adventure.movePlayer("north");
                        break;
                    case "south":
                        adventure.movePlayer("south");

                        break;
                    case "east":
                        adventure.movePlayer("east");
                        break;
                    case "west":
                        adventure.movePlayer("west");
                        break;
                    case "look":
                       adventure.lookAround();
                        // System.out.println("name: " + currentRoom.getRoomName() + " description: " + currentRoom.getRoomDescription());
                        break;
                    case "help":
                        System.out.println("Du åbner en støvet hjælpemanual. Siderne kan ikke rives fra hinanden, og dette er hvad du ser:\n Du kan indtaste følgende kommandoer:");
                        System.out.println("For at få en beskrivelse af dine omgivelser skal du skrive 'Look'");
                        System.out.println("For at bevæge dig i retninger skal du skrive 'go' efterfulgt af direction (north, south, east, west)");
                        System.out.println("For at se hvad du har i din inventory skal du skrive 'inventory'");
                        System.out.println("For at tage et item skal du skrive 'take + item'");
                        System.out.println("For at samle et item op skal du skrive 'take' efterfulgt af navnet på item");
                        System.out.println("For at smide et item skal du skrive 'drop' efterfulgt af navnet på itemmet. Det vil så ligge i det rum du smed det i");
                        System.out.println("For at spise et item skal du skrive 'eat' efterfulgt af navnet på item");
                        System.out.println("For at equippe et våben skriver du 'equip' efterfulgt af navnet på item");
                        System.out.println("For at unequippe skriver du 'unequip' efterfulgt af navnet på itemm");
                        System.out.println("For at angribe skal du skrive 'attack' efterfulgt af navnet på fjenden");
                        System.out.println("For at afslutte spillet skal du skrive 'exit'");
                        break;
                    case "exit":
                        System.out.println("You have exited the game.");
                        break;
                    case "drop":
                        adventure.playerDropItem(argument);
                        break;
                    case "take":
                        adventure.takeItem(argument);
                        break;
                    case "inventory":
                        adventure.lookAtInventory();
                        break;
                    case "health":
                        System.out.println("Your health is "+adventure.playerHealth());
                        break;
                    case "eat":
                        adventure.playerEatItem(argument);
                        break;
                    case "equip":
                        adventure.playerEquip(argument);
                        break;
                    case "unequip":
                        adventure.playerUnEquip(argument);
                        break;
                    case "attack":
                        // adventure method der kalder på player her
                    default:
                        System.out.println("the switch case has passed to default state");
                        break;
                }
            } while (!gameplay.equals("exit"));
        }
    }
