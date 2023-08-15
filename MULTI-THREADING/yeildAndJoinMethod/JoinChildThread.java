package yeildAndJoinMethod;

public class JoinChildThread extends Thread {

    @Override
    public void run(){
        for(int i=0; i<5;i++) {
            System.out.println("child thread");
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
