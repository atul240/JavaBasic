package Multithreading;

class JoinTest implements Runnable{

    @Override
    public void run() {
        for(int i=0; i<5; i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+" : "+i);
        }
    }
}

public class JOIN {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new JoinTest(), "JoinTest");
        t1.start();
        t1.join();
        System.out.println("Main Thread");
    }
}
