package map_example;

import java.util.*;

public class Application {
    public static void main(String[] args) {
        Map<String, String> personMap = new HashMap<>();
        personMap.put("Petrov", "Ivan");
        personMap.put("Ivanova", "Anna");
        personMap.put("Krit", "Maria");
        personMap.put("Bilyk", "Ivan");
        personMap.put("Stepova", "Anna");
        personMap.put("Maslo", "Lilja");
        personMap.put("Shutka", "Vasja");
        personMap.put("Antonovuch", "Stepan");
        personMap.put("Vyshnja", "Ivan");
        personMap.put("Kit", "Andrij");
        System.out.println("----------1----------");
        printMap(personMap);

        System.out.println("----------2----------");
        areThereTwoPepsonWithSameName(personMap, "Ivan");

        System.out.println("----------3----------");
        removeName(personMap, "Ivan");
//        removeName(personMap, "Anna");
    }

    private static <K, V> void printMap(Map<K, V> map) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "  " + entry.getValue());
        }
    }

    private static void areThereTwoPepsonWithSameName(Map<String, String> map, String firstName) {
        System.out.println("Are there at less two persons with the same firstName?");
        Iterator<String> it = map.keySet().iterator();
        int count = 0;
        while (it.hasNext()) {
            String key = it.next();
            if (map.get(key).equals(firstName)) {
                count++;
            }
        }
        System.out.println("There are " + count + " pearson with firstName " + firstName);
    }

    private static void removeName(Map<String, String> map, String firstName) {
        System.out.println("Remove person with same firstName");
        Iterator<String> it = map.keySet().iterator();
        while (it.hasNext()) {
            String key = it.next();
            if (map.get(key).equals(firstName)) {
                it.remove();
            }
        }
        printMap(map);
    }
}