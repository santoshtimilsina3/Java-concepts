package yeildAndJoinMethod;

public class ExecuteChildAfterMainExecution extends Thread {

     static Thread mainThread;

    @Override
    public void run() {
        try {
            mainThread.join(20);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("Child Thread");
        }
    }
}
