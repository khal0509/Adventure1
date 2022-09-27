import java.util.Scanner;

public class UserInterface {
    private Scanner sc = new Scanner(System.in);


    //UserInput
    public void startProgram (int menuChoice){
    System.out.println("""
    Welcome To The Adventure Game
    Where do you want to go?
    7. Look for the description of the room
    8. Help for instructions
    9. Exit the game
                
        """);
        String name = sc.nextLine();
        int userInput = sc.nextInt();
        while (userInput != 9){
            switch (userInput) {
                case 7: 
                    currentRoom.getDescription();
                    break;
                case 8: 
                    System.out.println("To enter rooms enter 'go' and a direction");
                    break;
                default :
                    System.out.println("Exiting");
                    break;
            }
        }
    }
}
