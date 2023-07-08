package Interrupt;

public class JoinMainThread {

    public static void main(String[] args) throws InterruptedException {

        ChildThread child = new ChildThread();
        child.start();
        child.interrupt();
        System.out.println("main thread");
    }

    }