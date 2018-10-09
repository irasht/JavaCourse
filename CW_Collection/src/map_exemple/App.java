package map_exemple;

import java.io.*;
import java.util.*;


public class App {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Map<Integer, String> employeeMap = new HashMap<Integer, String>();

        employeeMap.put(1, "Ivan");
        employeeMap.put(2, "Anna");
        employeeMap.put(3, "Maria");
        employeeMap.put(4, "Sofia");
        employeeMap.put(5, "Jakiv");
        employeeMap.put(6, "Sasha");
        employeeMap.put(7, "Pavlo");

        System.out.println("----------1----------");
        printMap(employeeMap);

        System.out.println("----------2----------");
        System.out.println("Please enter ID");
        int id = Integer.parseInt(br.readLine());
        if (employeeMap.containsKey(id)) {
            System.out.println(employeeMap.get(id));
        } else {
            System.out.println("Sorry there no such ID");
        }
        System.out.println("----------3----------");
        System.out.println("Please enter name");
        String name = br.readLine();
        if (employeeMap.containsValue(name)) {
            for (Integer key : employeeMap.keySet()) {
                if (employeeMap.get(key).equals(name)) {
                    System.out.println(key);
                }
            }
        } else {
            System.out.println("Sorry there no such name");
        }

//        for (Integer key : employeeMap.keySet()) {
//            if (employeeMap.get(key).equals(name)) {
//                System.out.println(key);
//            } else {
//                System.out.println("Sorry there no such name");
//                break;
//            }
//        }
    }

    public static <K, V> void printMap(Map<K, V> map) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            System.out.println("Key : " + entry.getKey() + ". Value : " + entry.getValue());
        }
    }
}
