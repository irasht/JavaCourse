import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2 {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("Please enter number");
            try {
                System.out.println(readNumber(1, 10));
            } catch (OutOfRangeException e) {
                System.err.println("The number is out of range.");
            } catch (IOException | NumberFormatException e) {
                System.err.println("You entered not number");
            }
        }
    }

    private static int readNumber(int start, int end) throws IOException, OutOfRangeException {
        int number = Integer.parseInt(br.readLine());
        if (number > start && number < end) {
            return number;
        } else {
            throw new OutOfRangeException();
        }
    }

    private static class OutOfRangeException extends Exception {
        public OutOfRangeException() {
            super();
        }
    }
}