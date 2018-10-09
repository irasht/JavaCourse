package second_thread;

public class PeaceThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
            }
            System.out.println("Peace in the peace");
        }
    }
}