package thread_example;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread1();
        Thread t2 = new Thread3();
        t1.start();
        t2.start();
    }
}