package extends_thread;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new MyThread("Hello", 300);
        Thread t2 = new MyThread("Why", 450);
        Thread t3 = new MyThread("Bye", 200);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        t3.start();
    }
}