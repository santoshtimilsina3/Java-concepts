package yeildAndJoinMethod;

public class JoinMainThread {

    public static void main(String[] args) throws InterruptedException {
//        JoinChildThread joinThread = new JoinChildThread();
//        joinThread.start();
//        for (int i = 0; i < 10; i++) {
//            System.out.println("Main Thread");
//            joinThread.join(20);
//        }

        //executing main thread first then only excecuting child thread

        ExecuteChildAfterMainExecution childAfterMainExecution = new ExecuteChildAfterMainExecution();
        childAfterMainExecution.mainThread = Thread.currentThread();

        childAfterMainExecution.start();
        for (int i = 0; i < 5; i++) {
            System.out.println("Main Thread");
         Thread.currentThread().sleep(100);
        }

        //
    }
}
