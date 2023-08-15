package Deadlock;

public class DeadLock extends Thread {

    A a = new A();
    B b = new B();

    public void m1() {
        this.start();
        a.d1(b);//Main thread call this
    }
    @Override
    public void run() {
        b.d2(a); // Child Thread calls this
    }
}
