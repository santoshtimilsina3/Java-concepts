public class Main {
        public static void main(String[] args) {

            Thread newThread = new Thread();
            newThread.setName("santoshi");
            newThread.currentThread().getName();
            System.out.println(newThread.getName());

            Thread.currentThread().setPriority(7);
            ThreadDemo thread = new ThreadDemo();

            thread.setPriority(10);
            System.out.println(Thread.currentThread().getPriority());
            System.out.println(thread.getPriority());
            thread.run(); //normal function call
            thread.start();
            for(int i = 0; i <5;i++){
                System.out.println("main Thread " + i + "");
            }
        }
}
