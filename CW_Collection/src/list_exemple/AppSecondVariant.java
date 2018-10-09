package list_exemple;

import java.util.ArrayList;
import java.util.Random;

public class AppSecondVariant {
    public static void main(String[] args) {
        System.out.println("-----1-----");
        ArrayList<Integer> myCollection = new ArrayList<Integer>();
        System.out.print(getRandomNumbers(myCollection, 10));

    }

    public static ArrayList<Integer> getRandomNumbers(ArrayList<Integer> addNumb, int sizeArray) {
        Random rand = new Random();
        for (int i = 0; i < sizeArray; i++) {
            addNumb.add(rand.nextInt(10));
        }
        return addNumb;
    }
}
// System.out.println("-----3-----");
//           for (int i = 0; i < myCollection.size(); i++) {
//        if (myCollection.get(i) > 20) {
//        myCollection.remove(i);
//        i--;
//        }
//        }
// System.out.println("-----5-----");
//         myCollection.sort(Comparator.naturalOrder());