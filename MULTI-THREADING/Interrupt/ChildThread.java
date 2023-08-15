package Interrupt;

public class ChildThread extends Thread{

    @Override
    public void run(){
        for(int i = 0; i <1000;i++){
            System.out.println("CHild Thread");
        }
        try{
            Thread.currentThread().sleep(20);
        }catch (InterruptedException e){
            System.out.println("I am interrupted Thread");
        }
    }
}
