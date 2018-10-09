package thread_example;

public class Runner {
    public static void main(String[] args){
        Thread tr = new StudyThread();
        tr.start();
        System.out.println("main method works");
    }
}
