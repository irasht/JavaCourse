package set_example;

import java.util.*;

public class App {
    public static void main(String[] args) {
        Set<String> countryAsia = new TreeSet<>();
        countryAsia.add("China");
        countryAsia.add("India");
        countryAsia.add("Vietnam");
        countryAsia.add("Russia");
//      System.out.println(countryAsia);

        Set<String> countryEurope = new TreeSet<>();
        countryEurope.addAll(Arrays.asList(new String[]{"France", "Finland", "Iceland", "Germany", "Russia"}));
//      System.out.println(countryEurope);

        union(countryAsia, countryEurope);

        intersect(countryAsia, countryEurope);
    }

    private static void union(Set set1, Set set2) {
        Set<Integer> union = new TreeSet<>(set1);
        union.addAll(set2);
        System.out.println("-----Union of the two Sets-----");
        System.out.println(union);
    }

    private static void intersect(Set set1, Set set2) {
        Set intersect = new TreeSet(set1);
        intersect.retainAll(set2);
        System.out.println("-----Intersection of two Sets-----");
        System.out.println(intersect);
    }
}