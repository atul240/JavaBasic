package ModifierPrivate;


class PrivateModifier{
    private String name = "Atul";

    PrivateModifier(){
        this.name = "Rakesh";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private void display(){
        System.out.println("Hello "+name);
    }
    public static void main(String[] args) {
        PrivateModifier privateModifier = new PrivateModifier();
        System.out.println(privateModifier.name);
        privateModifier.display();
    }
}

public class ModifierPrivateMain {
    public static void main(String[] args) {
        PrivateModifier privateModifier = new PrivateModifier();
        PrivateModifier privateModifie1 = new PrivateModifier();
        System.out.println("Hello world");
        System.out.println(privateModifier.getName());
        privateModifier.setName("Yogi");
        System.out.println(privateModifie1.getName());
    }
}
