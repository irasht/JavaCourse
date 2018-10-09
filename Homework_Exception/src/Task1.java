import java.io.*;

public class Task1 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double numb1 = 0;
        double numb2 = 0;

        System.out.println("Please enter first number");
        try {
            numb1 = Double.parseDouble(br.readLine());
        } catch (NumberFormatException | IOException e) {
            System.err.println("You entered wrong data1");
        }
        System.out.println("Please enter second number");
        try {
            numb2 = Double.parseDouble(br.readLine());
        } catch (NumberFormatException | IOException e) {
            System.err.println("You entered wrong data2");
        }
        try {
            System.out.println(div(numb1, numb2));
        } catch (ArithmeticException e) {
            System.err.println("We could not divide by zero");
        }
    }

    private static double div(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException();
        }
        return a / b;
    }
}