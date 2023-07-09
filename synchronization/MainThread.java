package synchronization;

import Interrupt.ChildThread;

public class MainThread {
    public static void main(String[] args) throws InterruptedException {

       /* Here we will make one display object and perform pass the same object in multiple threads
       This way we cannot assure that which thread will perform the operation
       to ensure the execution of a ceratin thread we willuse synchronized keyword
        */
        Display display = new Display();
        ThreadDemo thread = new ThreadDemo(display, "kushal");
        ThreadDemo secondThread = new ThreadDemo(display, "Rohit");
        ThreadDemo thirdThread = new ThreadDemo(display, "sandip");
        ThreadDemo forthThread = new ThreadDemo(display, "gulsan");
//        thread.start();
//        secondThread.start();
//        thirdThread.start();
//        forthThread.start();

        //synchronization of block
        ThreadDemo newThread = new ThreadDemo(display, "kushal");
        ThreadDemo secondNewThread = new ThreadDemo(display, "Rohit");
        newThread.start();
        secondNewThread.start();
    }
}
