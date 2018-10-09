package second_thread;

public class Runner {
    public static void main(String[] args){
        Thread helloThread = new HelloThread();
        Thread peaceThread = new PeaceThread();
        helloThread.start();
        peaceThread.start();
        System.out.println("My name is ...");
    }
}
