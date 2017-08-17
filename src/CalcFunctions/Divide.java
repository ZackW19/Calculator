package CalcFunctions;

//dzielenie
public class Divide {
    private double a;
    private double b;


    public Divide(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getDivide() {
        if (b != 0) {    //sprawdzenie czy nie dzielimy przez zero
            return a / b;
        } else System.out.println("!!!Nie dzielimy przez 0!!!");
        return 0;
    }
}