package thread_example;

public class Thread1 extends Thread {
    Thread t;

    public Thread1() {
        t = new Thread2();
    }

    public void run() {
        t.start();
    }
}