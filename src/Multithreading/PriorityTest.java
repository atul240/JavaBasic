package Multithreading;

class PriorityDemo implements Runnable {

    @Override
    public void run() {
        for (int i=0; i<5; i++){
            System.out.println("child Thread "+Thread.currentThread().getName());
        }
    }
}

public class PriorityTest {
    public static void main(String[] args) {
        Thread t1 = new Thread(new PriorityDemo(), "1");
        Thread t2 = new Thread(new PriorityDemo(), "2");
        System.out.println("t1 ki priority = "+t1.getPriority());
        System.out.println("t2 ki priority = "+t2.getPriority());

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);

        System.out.println("t1 ki priority = "+t1.getPriority());
        System.out.println("t2 ki priority = "+t2.getPriority());

        t1.start();
        t2.start();

        for (int i=0; i<5; i++){
            System.out.println("main Thread "+Thread.currentThread().getName());
        }

    }
}
