package file;

import java.io.*;
import java.util.*;

public class App {

    public static void main(String[] args) {

        String file = "mytext.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            System.out.println("File opened");

            String str = null;
            List<String> list = new ArrayList<>();

            while ((str = br.readLine()) != null) {
                list.add(str);
            }
//            printList(list);
            countSymbolsInline(list);
            countMaxSize(list);
            countMinSize(list);
            getVar(list);

        } catch (IOException ex) {
            System.out.println("Can`t open file");
        }
    }

    private static void printList(List<String> list) {
        for (String string : list) {
            System.out.println(string);
        }
    }

    public static void countSymbolsInline(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println("In line  " + (i + 1) + " are " + list.get(i).length() + " symbols");
        }
    }

    private static void countMaxSize(List<String> list) {
        String[] arr = list.toArray(new String[list.size()]);
        String max = arr[0];
        int maxi = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].length() > max.length()) {
                max = arr[i];
                maxi = i;
            }
        }
        System.out.println("Max line is " + (maxi + 1));
    }

    private static void countMinSize(List<String> list) {
        String[] arr = list.toArray(new String[list.size()]);
        String min = arr[0];
        int mini = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].length() < min.length()) {
                min = arr[i];
                mini = i;
            }
        }
        System.out.println("Min line is " + (mini + 1));
    }

    public static void getVar(List<String> list) {
        for (String string : list) {
            if (string.toLowerCase().contains("var")) {
                System.out.println("This line contains word \"var\" " + string);
            }
        }
    }
}
