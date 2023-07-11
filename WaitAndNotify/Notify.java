package WaitAndNotify;

public class Notify extends Thread{

    public int total = 0;

    @Override
    public void run() {
        System.out.println("Child method called");
        synchronized (this) {
            for (int i = 1; i <=100;i++) {
                total+=i;
            }
            System.out.println("Now notify the child thread");
            this.notify();
        }
    }
}
