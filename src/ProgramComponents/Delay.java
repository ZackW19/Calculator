package ProgramComponents;


// metoda na opóźnianie wyświetlania wywołanie Delay.wait(1000) gdzie 1000 to czas w ms
public class Delay {

    public static void wait(int ms){
        try {
            Thread.sleep(ms);
        }catch (InterruptedException exp){

        }
    }
}
