public class ThreadDemo extends Thread{
    public void run(){
        for(int i = 0; i <10;i++){
            System.out.println("child Thread " + i + "");
        }
    }

}