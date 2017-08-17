package ProgramComponents;

//metoda - czekamy na nacisnięcie klawisza w celu kontynuacji
import java.util.Scanner;

public class Prompt {

    private static Scanner scanner1;

    public static void promptEnterKey(){
        System.out.println("Nacisnij \"ENTER\" aby kontynuować...");
        Scanner scanner1 = new Scanner(System.in);
        scanner1.nextLine();
    }

}
