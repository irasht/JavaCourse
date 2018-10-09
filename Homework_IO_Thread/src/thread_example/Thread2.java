package thread_example;

public class Thread2 extends Thread {
    public void run() {
        for (int i = 0; i < 3; i++) {
            try {
                sleep(250);
            } catch (InterruptedException e) {
            }
            System.out.println("Thread number two");
        }
    }
}