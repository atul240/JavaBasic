package Multithreading;

class CookingTask1 implements Runnable{

    private String task;

    CookingTask1(String task){
        this.task = task;
    }

    @Override
    public void run() {
        System.out.println(task+" is ready "+Thread.currentThread().getName());
    }
}

public class Restaurant_ImplimentsRunnable {
    static CookingTask1 t1 = new CookingTask1("Kheer");
    static CookingTask1 t2 = new CookingTask1("Sabji");
    static CookingTask1 t3 = new CookingTask1("Pudi");

    public static void main(String[] args) {
        Thread t11 = new Thread(t1);
        Thread t22 = new Thread(t2);
        Thread t33 = new Thread(t3);
        t11.start();
        t22.start();
        t33.start();
    }

}
