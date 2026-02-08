package Multithreading;

class YieldTest implements Runnable{
    @Override
    public void run(){
        for(int i=0; i<5; i++){
            System.out.println("Yield Thread "+Thread.currentThread().getName());
            Thread.yield();
        }
    }
}

public class YieldDemo {
    public static void main(String[] args) {
        Thread t1 = new Thread(new YieldTest());
        t1.start();

        for(int i=0; i<5; i++){
            System.out.println("Main Thread "+Thread.currentThread().getName());
        }
    }
}
