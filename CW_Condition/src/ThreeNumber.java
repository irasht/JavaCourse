import java.io.BufferedReader;
import java.io.IOException;

public class ThreeNumber{
    private int number;
    private int countOdd = 0;

    public void inputData(BufferedReader br) throws IOException {
        int i = 1;
        System.out.println("Enter three numbers ");
        while (i <= 3) {
            System.out.print(i + " number = ");
            number = Integer.parseInt(br.readLine());
            i++;
            if (number % 2 != 0) {
                countOdd++;
            }
        }
        System.out.println("Odd: " + countOdd);
        System.out.println();
        System.out.print("Number of the day of the week is ");
        int weekDays = Integer.parseInt(br.readLine());
        System.out.println("Понеділок \n Monday \n 月曜日");
    }


}