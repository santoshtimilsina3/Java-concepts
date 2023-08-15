package synchronization;

public class ThreadDemo extends Thread {
    Display display;
    String name;

    public ThreadDemo(Display display, String name) {
        this.display = display;
        this.name = name;
    }

    @Override
    public void run() {
        try {
            display.greet(name);
//            display.wish(name);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
