import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PhoneCall {
    public static void main(String[] args) {
        int country = 1;
        int time = 0;
        int paymant;
        int amountPay = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 1; i <= 3; i++) {
            System.out.println("Please, enter standard units per minute for country" + i);
            try {
                country = Integer.parseInt(br.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("Talks continued ...");
            try {
                time = Integer.parseInt(br.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
            paymant = country * time;
            amountPay += paymant;
            if (i == 0) {
                System.out.println("First phone call will cost: " + paymant);
            }
            if (i == 1) {
                System.out.println("Second phone call will cost: " + paymant);
            }
            if (i == 2) {
                System.out.println("Third phone call will cost: " + paymant);
            }
        }

        System.out.println("Amount: " + amountPay);
    }
}