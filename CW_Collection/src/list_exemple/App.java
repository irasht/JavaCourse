package list_exemple;

import java.util.*;

public class App {
    public static void main(String[] args) {
        int listSize = 10;
        Random rand = new Random();

        System.out.println("-----1-----");
        List<Integer> myCollection = new LinkedList<>();
        for (int i = 0; i < listSize; i++) {
            myCollection.add(rand.nextInt(25));
        }
        System.out.println(myCollection);

        System.out.println("-----2-----");
        List<Integer> newCollection = new ArrayList<>();
        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) > 5) {
                newCollection.add(i);
            }
        }
        System.out.println(newCollection);

        System.out.println("-----3-----");
        Iterator itr = myCollection.iterator();
        while (itr.hasNext()) {
            int x = (Integer) itr.next();
            if (x > 20)
                itr.remove();
        }
        System.out.println(myCollection);

        System.out.println("-----4-----");
        myCollection.add(2, 1);
        myCollection.add(8, -3);
        myCollection.add(5, -4);
        System.out.println(myCollection);

        System.out.println("-----5-----");
        Collections.sort(myCollection);
        System.out.println(myCollection);
    }
}