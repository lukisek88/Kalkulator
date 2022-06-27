public class Calculator {


    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        double add = calc.add(20, 11.5);
        double subtract = calc.subtract(20, 11.5);

        System.out.println("Wyniki: ");
        System.out.println("Dodawanie: " + add + "  Odejmowanie: " + subtract);
    }
}
