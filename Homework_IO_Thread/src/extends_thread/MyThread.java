package extends_thread;

public class MyThread extends Thread {
    private String s;
    private int pause;

    public MyThread(String s, int pause) {
        this.s = s;
        this.pause = pause;
    }
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                sleep(pause);
            } catch (InterruptedException e) {
            }
            System.out.println(s);
        }
    }

}