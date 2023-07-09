package synchronization;

public class Display {

    public synchronized void wish(String name)throws InterruptedException {
        for (int i = 0; i < 20; i++) {
            System.out.println("Happy birthday :- " + name);
            Thread.sleep(200);
        }
    }
}
