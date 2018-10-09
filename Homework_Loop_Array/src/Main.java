import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("---1---");
        int month_days[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        getAmountOfDay(month_days, br);

        System.out.println("---2---");
        int[] tenInt = new int[10];
        sumOrProduct(tenInt, br);

        System.out.println("---3---");
        int[] fiveInt = new int[5];
        secondPositiveNumb(fiveInt, br);

        System.out.println("---4---");
        tillFirstNegativeNumb(br);
    }

    private static void getAmountOfDay(int[] arr, BufferedReader br) throws IOException {
        System.out.print("Enter the number of month. ");
        int monthNumber = Integer.parseInt(br.readLine());
        for (int i = 0; i < arr.length; i++) {
            if (i == monthNumber - 1) {
                System.out.println("There are " + arr[i] + " days.");
            }
        }
    }

    private static void sumOrProduct(int[] tenInt, BufferedReader br) throws IOException {
        int result = 0;

        System.out.println("Enter 10 int numbers. ");
        for (int i = 0; i < tenInt.length; i++) {
            tenInt[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 0; i < tenInt.length / 2; i++) {
            if (tenInt[i] > 0) {
                result += tenInt[i];
            } else {
                result = 1;
                for (int j = tenInt.length / 2; j < tenInt.length; j++) {
                    result *= tenInt[j];
                }
                break;
            }
        }
        System.out.println(result);
    }

    private static void tillFirstNegativeNumb(BufferedReader br) throws IOException {
        System.out.println("Enter  integers until the first negative number.");
        int number = Integer.parseInt(br.readLine());
        int multiplication = 1;
        while (number > 0) {
            if (number % 2 == 0) {
                multiplication *= number;
            }
            number = Integer.parseInt(br.readLine());
        }
        System.out.println("Product = " + multiplication);
    }

    private static void secondPositiveNumb(int arr[], BufferedReader br) throws IOException {
        System.out.println("Enter 5 int numbers. ");
        int count = 0;
        int position = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                count++;
                position = i;
            }
            if (count == 2) {
                break;
            }
        }
        if (!(count == 1 || count == 0)) {
            position++;
            System.out.println("Position of second positive number is " + position);
        }
        minFiveNumb(arr);
    }

   private static void minFiveNumb(int[] arr) {
        int min = arr[0];
        int imin = 0;
        int i = 0;
        while (i < arr.length) {
            if (arr[i] < min) {
                min = arr[i];
                imin = i;
            }
            i++;
        }
        System.out.println("Minimum = " + min + " is in " + (imin + 1) + " place");
    }


}