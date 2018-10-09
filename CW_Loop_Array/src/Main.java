public class Main {

    public static void main(String[] args) {
        int tenInt[] = {1, 0, 10, 30, 22, -65, -84, 20, 9, 13};
        int max = 0;
        int countPositive = 0;
        int countNegative = 0;
        for (int k : tenInt) {
            if (k > max) {
                max = k;
            }
            if (k > 0) {
                countPositive++;
            }
            if (k < 0) {
                countNegative++;
            }
        }
        System.out.println("The biggest of these numbers is" + max);
        System.out.println("CountPositive=" + countPositive);
        System.out.println("CountNegative=" + countNegative);
    }
}