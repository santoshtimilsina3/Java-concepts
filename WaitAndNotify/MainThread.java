package WaitAndNotify;

public class MainThread {
    public static void main(String[] args) throws InterruptedException {
        Notify notification = new Notify();
        notification.start();
        Thread.sleep(1000);
        synchronized (notification) {
            System.out.println("Main thread releases the lock and after calling wait()");
            notification.wait(1000);
            System.out.println(notification.total);
        }
    }
}
