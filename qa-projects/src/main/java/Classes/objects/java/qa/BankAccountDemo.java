package Classes.objects.java.qa;

public class BankAccountDemo {
    public static void main(String[] args){
        BankAccount Ahmed = new BankAccount("Ahmed", 500);
        System.out.println(Ahmed.getBalance());
        System.out.println(Ahmed.getOwner());
        Ahmed.withdraw(400);
        System.out.println(Ahmed.getBalance());
        Ahmed.withdraw(200);
        System.out.println(Ahmed.getBalance());
        Ahmed.deposit(700);
        System.out.println(Ahmed.getBalance());
    }
}
