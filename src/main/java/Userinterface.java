import java.util.Scanner;

public class Userinterface {
    private Scanner sc = new Scanner(System.in);

    public Userinterface () {
        System.out.println(""" 
    Welcome To The Adventure Game
    Where do you want to go?
    7. Look for the description of the room
    8. Help for instructions
    9. Exit the game
    """);
        String name = sc.nextLine();
        int number = sc.nextInt();


    }
}
