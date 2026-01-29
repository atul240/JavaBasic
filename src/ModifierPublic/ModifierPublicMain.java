package ModifierPublic;

import ModifiersDefault.ModifierDefault;

class PublicTest{
    public static void main(String[] args) {
        ModifierPublicMain modifierPublicMain = new ModifierPublicMain();
        System.out.println(modifierPublicMain.name);
        modifierPublicMain.display();
    }
}

public class ModifierPublicMain {
    public String name = "atul";
    public void display(){
        System.out.println("Hello "+name);
    }
}
