import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TaskTwo {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter a sentence that contains the words between more than one space");
        String sentence = br.readLine();
        sentence = sentence.replaceAll("\\s+", " ");
        System.out.println(sentence.trim());
    }
}