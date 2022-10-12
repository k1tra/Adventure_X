import java.util.Scanner;

    public class UserInterface {
        private Adventure adventure;
        public UserInterface(Adventure adventure){
            this.adventure = adventure;
        }


        public void start() {
            Scanner sc = new Scanner(System.in);
            String gameplay;

            System.out.println("Hey og velkommen. Nu er det tid til eventyr - you know what you gotta do. Eller gør du?");
            System.out.println("Du er landet i en krypt. Du må angive retninger efter kompasset. \n" +
                    "For at gøre det hele lidt mere udfordrende kan du kun svare i engelske retningsangivelser: North, south, east og west.");
            System.out.println("Du kan også se dig omkring i det rum du er i, ved at skrive 'Look'. \n");
            System.out.println("Skulle det være helt slemt, så kan du skrive 'help' for at få en generel hjælpeliste udskrevet.\nSkulle det være endnu slemmere end helt slemt, så kan du skrive 'exit' og sågar 'quit' for at afslutte spillet. Psst. Det er ikke muligt at gemme.");
            //input switch-case gør det muligt for brugeren at lave inputs til den printede menu.
            do {
                gameplay=sc.nextLine().toLowerCase();

                switch(gameplay){
                    case "north":
                        adventure.go("north");
                        break;
                    case "south":
                        adventure.go("south");
                        break;
                    case "east":
                        adventure.go("east");
                        break;
                    case "west":
                        adventure.go("west");
                        break;
                    case "look":
                        Room currentRoom = adventure.getCurrentRoom();
                        System.out.println("name: " + currentRoom.getRoomName() + " description: " + currentRoom.getRoomDescription());
                        break;
                    case "help":
                        System.out.println("help has been written, this is a general output");
                        break;
                    case "exit":
                        break;
                    case "drop":
                        System.out.println("drop has been printed");
                        break;
                    case "take":
                        System.out.println("take has been printed");
                        break;
                    case "inventory":
                        System.out.println("inventory has been printed");
                        break;
                    default:
                        System.out.println("the switch case has passed to default state");
                        break;
                }
            } while (!gameplay.equals("exit"));
        }
    }
