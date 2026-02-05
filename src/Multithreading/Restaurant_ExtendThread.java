package Multithreading;

class CookingTask extends Thread{
    private String task;

    CookingTask(String task){
        this.task = task;
    }

    @Override
    public void run(){
        System.out.println(task+" is getting prepared "+Thread.currentThread().getName());
    }

}


public class Restaurant_ExtendThread {
    public static void main(String[] args) {
        CookingTask t1 = new CookingTask("Biryani");
        CookingTask t2 = new CookingTask("Rayta");
        CookingTask t3 = new CookingTask("Chatni");

        t1.start();
        t2.start();
        t3.start();
    }
}
