import java.io.*;
import java.util.regex.*;

public class App {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("-----1-----");
        String var = "good";
        String var1 = "Good morning";

        System.out.println(var1.toLowerCase().contains(var.toLowerCase()));
        System.out.println(var1.contains(var));

        System.out.println("-----2-----");
        System.out.println("Please enter surname, name and patronymic: ");
        String fullName = br.readLine();

        String[] arr = fullName.split(" ");
        try {
            System.out.println("Surnames and initials: " + arr[0] + " " + arr[1].substring(0, 1) + ". " + arr[2].substring(0, 1) + ". ");
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Please, write correct name");
        }
        System.out.println("Name: " + arr[1]);
        System.out.println("Name, middle name and last name: " + arr[1] + " " + arr[2] + " " + arr[0]);

        System.out.println("-----3-----");
        System.out.println("Please enter five username wich could include 3 to 15 characters of the Latin alphabet, numbers, and underscores");

        String[] username = new String[5];
        String character = "[a-zA-Z_0-9]{3,15}";
        Pattern pattern = Pattern.compile(character);
        Matcher matcher;
        for (int i = 0; i < username.length; i++) {
            username[i] = br.readLine();
            matcher = pattern.matcher(username[i]);

            if (matcher.matches()) {
                System.out.println("Username: " + username[i] + " is valid.");
            } else {
                System.out.println("Username: " + username[i] + " is not valid.");

            }
        }
    }
}