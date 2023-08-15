package Daemon;

public class MainThread {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().isDaemon());
//        Thread.currentThread().setDaemon(true); // will throw exception becoz main thread is started by JVM
        MyThread thread = new MyThread();
        System.out.println(thread.isDaemon());
        thread.setDaemon(true);
        System.out.println(thread.isDaemon());
    }
}
