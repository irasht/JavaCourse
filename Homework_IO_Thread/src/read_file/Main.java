package read_file;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("---1---");
        BufferedReader br = null;
        List<String> lines = new ArrayList<String>();
        String fileName = "file1.txt";

        try {
            br = new BufferedReader(new FileReader(fileName));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String line = "";
        try {
            while ((line = br.readLine()) != null) {
                lines.add(line);
            }
            br.close();
        } catch (FileNotFoundException e) {
            System.err.println("Unable to find the file: " + fileName);
        } catch (IOException e) {
            System.err.println("Unable to read the file: " + fileName);
        }
        String[] arr = lines.toArray(new String[0]);

        for (String s : arr) {
            System.out.println(s);
        }

        String file2 = "file2.txt";
        FileWriter fw = null;
        BufferedWriter bw = null;

        try {
            bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file2)));
            bw.write("number of lines in file1.txt :" + lines.size() + " lines\n");
            String longest = Collections.max(lines, new Comparator<String>() {
                @Override
                public int compare(String s1, String s2) {
                    return s1.length() - s2.length();
                }
            });

            bw.write("the longest line in file1.txt :" + longest + " \n");
            bw.write("name and birthday date :" + lines.get(1) + " lines\n");
        } catch (IOException ex) {
        } finally {
            try {
                bw.close();
            } catch (Exception ex) {
            }
        }
    }
}