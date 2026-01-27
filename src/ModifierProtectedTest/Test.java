package ModifierProtectedTest;

import ModifierProtected.ModifierProtectedMain;

public class Test extends ModifierProtectedMain {
    public static void main(String[] args) {
        Test tst = new Test();
        System.out.println(tst.name);
        tst.display();
        tst.display();
    }
}
