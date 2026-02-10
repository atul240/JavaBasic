package Multithreading;

class SavingAccount{
    public synchronized void withdrow(String name)  {
        for (int i = 0; i < 5; i++) {
            System.out.print("Money withdrowl by = ");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(name);

        }
    }
}


class MyThread1 extends Thread{
    SavingAccount s;
    String name;

    MyThread1(SavingAccount s, String name){
        this.s = s;
        this.name = name;
    }

    @Override
    public void run(){
        s.withdrow(name);
    }
}

class SynchronizationDemo{
    public static void main(String[] args) {
        SavingAccount savingAccount = new SavingAccount();
        MyThread1 t1 = new MyThread1(savingAccount, "Pati");
        MyThread1 t2 = new MyThread1(savingAccount, "Patni");
        t2.start();
        t1.start();
    }
}

