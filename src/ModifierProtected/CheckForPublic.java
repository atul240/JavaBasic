package ModifierProtected;

import ModifierPublic.ModifierPublicMain;

public class CheckForPublic {
    public static void main(String[] args) {
        ModifierPublicMain modifierPublicMain = new ModifierPublicMain();
        System.out.println(modifierPublicMain.name);
        modifierPublicMain.display();
    }
}
