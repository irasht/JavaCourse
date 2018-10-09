package task_one;

import java.io.*;

public class Rectangle {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int length = 0;
        int width = 0;
        System.out.println("Please enter length of a rectangle");
        try {
            length = Integer.parseInt(br.readLine());
        } catch (NumberFormatException e) {
            System.out.println("You entered wrong data");
        } catch (IOException e) {
            System.out.println("Please enter number");
        }
        System.out.println("Please enter width of a rectangle");
        try {
            width = Integer.parseInt(br.readLine());
        } catch (NumberFormatException e) {
            System.out.println("You entered wrong data");
        } catch (IOException e) {
            System.out.println("Please enter number");
        }
        try {
            System.out.println(squareRectangle(length, width));
        } catch (IllegalArgumentException e) {
            System.out.println("Rectangle side couldn't be negative number or 0");
        }
    }

    private static int squareRectangle(int a, int b) throws IllegalArgumentException {
        if (a <= 0 || b <= 0) {
            throw new IllegalArgumentException();
        }
        return a * b;
    }
}