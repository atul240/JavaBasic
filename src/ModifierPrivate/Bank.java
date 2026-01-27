package ModifierPrivate;

class Account{
    private String pass = "abc123";
    private Integer balance = 123456;

    public String getPass() {
        return pass;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    Account(String pass){
        if(!pass.equals(this.pass)){
            throw new IllegalArgumentException("Wrong Password! Account creation denied.");
        }else{
            System.out.println("Valid User.");
        }

    }

}

public class Bank {
    public static void main(String[] args) {
        Account ac = new Account("abc123");
        System.out.println(ac.getBalance());
        ac.setBalance(98765432);
        System.out.println(ac.getBalance());
        System.out.println(ac.getPass());
    }
}
