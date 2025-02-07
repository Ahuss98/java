package Classes.objects.java.qa;

public class BankAccount {
    private String owner;
    private int balance;

    public BankAccount(String owner){
        this.owner = owner;
        this.balance = 0;
    }
    public BankAccount(String owner, int balance){
        this.owner = owner;
        this.balance = balance;
    }
    public void deposit(int amount){
        if(amount > 0){
            this.balance += amount;
        } else {
            System.out.println("Error: please deposit an amount above 0");
        }
    }
    public void withdraw(int amount){
        if(amount > 0){
        if(amount > balance){
            System.out.println("you do not have the money necessary to withdraw that amount");
        } else {
            this.balance -= amount;
        }
        } else {
            System.out.println("please withdraw a number above 0");
        }
    }
    public String getOwner(){
        return owner;
    }
    public int getBalance(){
        return balance;
    }

}
