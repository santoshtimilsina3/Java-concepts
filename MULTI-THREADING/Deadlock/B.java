package Deadlock;

public class B {
    public synchronized void d2(A a) {
        System.out.println("Thread 1 starts execution" +
                "of d2() method");
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            System.out.println("Thread 2 trying to call A's Last() method");
            a.last();
        }
    }

    public synchronized void last() {
        System.out.println("Inside B's last() method");
    }
}
