package thread_example;

public class Thread3 extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                sleep(100);
            } catch (InterruptedException e) {
            }
            System.out.println("Thread number three");
        }
    }
}