import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Circle {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));
        System.out.println("Please, enter radius");
        //if radius double
        double radius = Double.parseDouble(br.readLine());
        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;

        /*//if radius int
        int radius = Integer.parseInt(br.readLine());
        double perimeter = 2 * Math.PI * (double) (radius);
        double area = Math.PI * (double) (radius*radius);*/
        System.out.println("Perimeter is " + perimeter);
        System.out.println("Area is " + area);
    }
}