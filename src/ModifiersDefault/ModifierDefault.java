package ModifiersDefault;

class Testclass {
    String name = "atul";

    void display(){
        System.out.println("Hello "+name);
    }
}

public class ModifierDefault {
    public static void main(String[] args) {
        Testclass tst = new Testclass();
        System.out.println(tst.name);
        tst.display();
    }
}




