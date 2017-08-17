import CalcFunctions.*;
import ProgramComponents.Delay;
import ProgramComponents.Menu;
import ProgramComponents.Prompt;
import ProgramComponents.ResultsList;


import java.io.Console;
import java.util.*;

import static java.lang.System.console;

public class Main {

    private static Scanner scanner;             //skaner do obsługi menu deklaracja tutaj pozwala na dostęp innym metodom

    public static void main(String[] args) {

        scanner = new Scanner(System.in);

        int pass;
        int password = 1111;  //przypisanie hasła
        int choice;
               do {
            System.out.println("Witaj w programie \"KALKULATOR\"");
            System.out.print("Podaj hasło: ");
            pass = scanner.nextInt();       //odczyt hasła ze skanera
            if (Objects.equals(pass,password))   //sprwdzenie czy pass = password

            {
                System.out.println("Hasło poprawne!!!");
                    Delay.wait(800);

                do {
                    Menu.printMenu();                                    //metoda printMenu drukuje menu
                    choice = scanner.nextInt();
                    parseChoice(choice);                                 //metoda parseChoice sprawdza wybor menu
                }
                while (choice != 7);
            } else
                System.out.println("*** Złe hasło! Spróbuj jeszcze raz ***");
                    Delay.wait(800);
        } while (pass != password);


    }

    private static void parseChoice(int choice) {

        switch (choice) {

            case 1:
            {
                String operation = "Dodawanie";
                System.out.println("Twój wybór to: " + operation);
                System.out.print("Podaj liczbę a: ");
                double a = scanner.nextDouble();
                System.out.print("Podaj liczbę b: ");
                double b = scanner.nextDouble();
                Add add = new Add(a, b);
                double results = add.getAdd();
                ResultsList.setListOfResults(operation + " " + a + " + " + b + " to " + results);
                System.out.println("Wynik  = " + results);
                System.out.println("Wynik zapisano do pamięci");
                Prompt.promptEnterKey();
                break;
            }

            case 2: {
                String operation = "Odejmowanie";
                System.out.println("Twój wybór to: " + operation);
                System.out.print("Podaj liczbę a: ");
                double a = scanner.nextDouble();
                System.out.print("Podaj liczbę b: ");
                double b = scanner.nextDouble();
                Subtract subtract = new Subtract(a, b);
                double results = subtract.getSubtract();
                ResultsList.setListOfResults(operation + " " + a + " - " + b + " to " + results);
                System.out.println("Wynik  = " + results);
                System.out.println("Wynik zapisano do pamięci");
                Prompt.promptEnterKey();
                break;
            }

            case 3: {
                String operation = "Mnożenie";
                System.out.println("Twój wybór to: " + operation);
                System.out.print("Podaj liczbę a: ");
                double a = scanner.nextDouble();
                System.out.print("Podaj liczbę b: ");
                double b = scanner.nextDouble();
                Multiply multiply = new Multiply(a, b);
                double results = multiply.getMultiply();
                ResultsList.setListOfResults(operation + " " + a + " * " + b + " to " + results);
                System.out.println("Wynik  = " + results);
                System.out.println("Wynik zapisano do pamięci");
                Prompt.promptEnterKey();
                break;
            }

            case 4: {
                String operation = "Dzielenie";
                System.out.println("Twój wybór to: " + operation);
                System.out.print("Podaj liczbę a: ");
                double a = scanner.nextDouble();
                System.out.print("Podaj liczbę b: ");
                double b = scanner.nextDouble();
                Divide divide = new Divide(a, b);
                double results = divide.getDivide();
                ResultsList.setListOfResults(operation + " " + a + " / " + b + " to " + results);
                System.out.println("Wynik  = " + results);
                System.out.println("Wynik zapisano do pamięci");
                Prompt.promptEnterKey();
                break;
            }

            case 5: {
                String operation = "Pierwiastek kwadratowy";
                System.out.println("Twój wybór to: " + operation);
                System.out.print("Podaj liczbę a: ");
                double a = scanner.nextDouble();
                Sqrt sqrt = new Sqrt(a);
                double results = sqrt.getSqrt();
                ResultsList.setListOfResults(operation + " z " + a +  " to " + results);
                System.out.println("Wynik  = " + results);
                System.out.println("Wynik zapisano do pamięci");
                Prompt.promptEnterKey();
                break;
            }

            case 6: {
                System.out.println("+==============================================+");
                System.out.println("Lista wyników:");
                for (String listOfResults : ResultsList.getListOfResults()) {
                    System.out.println(listOfResults);
                }
                System.out.println("+==============================================+");
                Prompt.promptEnterKey();
                break;
            }

            case 7: {
                break;
            }

            default: {
                System.out.println("Nie znam takiego polecenia!");
                Delay.wait(500);
            }
        }
    }

}

