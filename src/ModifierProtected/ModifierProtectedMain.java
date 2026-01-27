package ModifierProtected;

class ModifierProtectedTest{
    protected String name = "atul";
    protected void display(){
        System.out.println("Hello "+name);
    }
}

class ModifierProtectedTestChild extends ModifierProtectedTest{

}

public class ModifierProtectedMain extends ModifierProtectedTestChild{
    public static void main(String[] args) {
        ModifierProtectedTestChild modifierProtectedTestChild = new ModifierProtectedTestChild();
        modifierProtectedTestChild.display();

        ModifierProtectedTest modifierProtectedTest = new ModifierProtectedTest();
        System.out.println(modifierProtectedTest.name);
    }
}
