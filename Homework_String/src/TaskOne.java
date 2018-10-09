import java.io.*;

public class TaskOne {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        System.out.println("Please enter sentence of five words");
        String sentence = br.readLine();

        String[] arr = sentence.split(" ");
        String lWord = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() > lWord.length()) {
                lWord = arr[i];
            }
        }
        sb.append(arr[1]);
        sb = sb.reverse();
        System.out.println("Longest word in the sentence: [" + lWord + "] it consist of " + lWord.length() + " letters.");
        System.out.println("Second word [" + arr[1] + "] in reverse order: [" + sb+"]");
    }
}