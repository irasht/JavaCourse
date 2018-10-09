package use_anonymous;

public class Main {
    public static void main(String args[]) {

        final Object res1 = "res1";
        final Object res2 = "res2";

        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (res1) {
                    System.out.println("Work1");
                    try {
                        Thread.sleep(400);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (res2) {

                        System.out.println("Work2");
                    }
                }
            }
        }).start();

        new Thread(new Runnable() {

            @Override
            public void run() {
                synchronized (res2) {
                    System.out.println("Work3");
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (res1) {
                        System.out.println("Work4");
                    }
                }
            }
        }).start();

    }

}