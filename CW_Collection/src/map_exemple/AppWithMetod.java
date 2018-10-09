package map_exemple;

import java.io.*;
import java.util.*;


public class AppWithMetod {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Map<Integer, String> employeeMap = new HashMap<>();

        employeeMap.put(21, "Ivan");
        employeeMap.put(22, "Anna");
        employeeMap.put(38, "Maria");
        employeeMap.put(94, "Sofia");
        employeeMap.put(25, "Jakiv");
        employeeMap.put(6, "Sasha");
        employeeMap.put(7, "Pavlo");

        System.out.println("----------1----------");
        printMap(employeeMap);

        System.out.println("----------2----------");
        getValueById(employeeMap, br);

        System.out.println("----------3----------");
        getIdByValue(employeeMap, br);
    }

    private static <K, V> void printMap(Map<K, V> map) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            System.out.println("Key : " + entry.getKey() + ". Value : " + entry.getValue());
        }
    }

    private static void getValueById(Map<Integer, String> map, BufferedReader br) throws IOException {
        System.out.println("Please enter ID");
        int id = Integer.parseInt(br.readLine());
        if (map.containsKey(id)) {
            System.out.println(map.get(id));
        } else {
            System.out.println("Sorry there no such ID");
        }
    }

    private static void getIdByValue(Map<Integer, String> map, BufferedReader br) throws IOException {
        System.out.println("Please enter name");
        String name = br.readLine();
        if (map.containsValue(name)) {
            for (Integer key : map.keySet()) {
                if (map.get(key).equals(name)) {
                    System.out.println(key);
                }
            }
        } else {
            System.out.println("Sorry there no such name");
        }
    }
}