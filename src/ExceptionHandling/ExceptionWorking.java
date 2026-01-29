package ExceptionHandling;

public class ExceptionWorking {
    void print1(){
        print2();
    }
    void print2(){
        print3();
    }
    void print3(){
        print4();
    }
    void print4(){
        print5();
    }
    void print5(){
        print6();
    }
    void print6(){
        System.out.println(10/0);
    }

    public static void main(String[] args) {
        ExceptionWorking exceptionWorking  = new ExceptionWorking();
        exceptionWorking.print1();
    }

    /*
    java me function calling stack me perform hoti h.
    * yha vo saare methods ko check karegaa ki exception handler code kisi function ke pass h ya nhi, agar nhi hoti to vo main method pr check karta h
    * agar main method pr bhi nhi milti to jvm 'Defauilt Exception Handle' ko dedeta h, jisse ki hame console pr error dekhne ko milti h.
    * */

}
