package InterfaceDemo;

interface Demo{
    int a = 10;
    void display();
}

class Test implements Demo{

    @Override
    public void display() {
        System.out.println("This is Display Method");
    }
}

public class InterfaceTest extends Test {
    public static void main(String[] args) {
        Test t = new Test();
        t.display();
    }
}
