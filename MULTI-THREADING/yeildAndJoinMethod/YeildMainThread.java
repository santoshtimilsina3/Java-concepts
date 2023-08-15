package yeildAndJoinMethod;

public class YeildMainThread {
    public static void main(String[] args) {
        YeildChildThread child = new YeildChildThread();
        child.start();
        for(int i = 0; i < 100; i++) {
            System.out.println("parent/Main Thread");
        }
    }
}
