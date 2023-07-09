package synchronization;

public class Display {

    public synchronized void wish(String name)throws InterruptedException {
        for (int i = 0; i < 20; i++) {
            System.out.println("Happy birthday :- " + name);
            Thread.sleep(200);
        }
    }

    public void greet(String name)throws InterruptedException {
//1 lakhs line of code
        synchronized (this) {
            for (int i = 0; i < 20; i++) {
                System.out.println("hello "+ name);
            }

        }

//1 lakhs line of code

    }
}
