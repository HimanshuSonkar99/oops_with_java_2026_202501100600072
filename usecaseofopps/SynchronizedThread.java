package usecaseofopps;

// public Case Study 1: Bank Account Withdrawal and Deposit System
// Scenario:
// A bank account has an initial balance of ₹500. Two operations need to be performed concurrently:
// •	A Customer wants to withdraw ₹700. 
// •	The Bank wants to deposit ₹500 into the same account. 
// Since the account initially contains only ₹500, the customer cannot withdraw ₹700 immediately. The withdrawal thread should therefore wait until sufficient balance becomes available.
// The bank deposit operation adds ₹500 to the account and then notifies the waiting withdrawal thread. Once notified, the customer can continue the withdrawal.
// The application must ensure that the account is accessed safely by multiple threads. Therefore, the withdraw() and deposit() methods are synchronized.
// //Driver Class
public class SynchronizedThread {
    public static void main(String[] args)
            throws InterruptedException {
        BankAccount account = new BankAccount();
        WithdrawThread w = new WithdrawThread(account);
        DepositThread d = new DepositThread(account);
        Thread thread1 = new Thread(w, "Customer");
        Thread thread2 = new Thread(d, "Bank");
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
    }
}
class BankAccount {
    private int balance = 500;
    synchronized void withdraw(int amount){
        System.out.println(Thread.currentThread().getName()+"Is trying to withdraw:" + amount);
        while(balance < amount){
            System.out.println("Insufficient balance.Waiting");
            try{
                wait();
            } catch(InterruptedException e){
                System.out.println(e);
            }
        }
        balance = balance - amount;
        System.out.println("Withdrawl succesfful");
        System.out.println("Balance: " + balance);
    }
    synchronized void deposit(int amount){
        try{
            Thread.sleep(1000);
        }catch(InterruptedException e){
            System.out.println(e);
        }
        System.out.println(Thread.currentThread().getName() + "is depositing " + amount);
        balance = balance+amount;
        System.out.println("Deposit successfull");
        System.out.println("Balance: "+ balance);
        notify();
    }
}
class WithdrawThread implements Runnable{
    BankAccount account;//ref
    WithdrawThread(BankAccount account){
        this.account = account;
    }
    public void run(){
        account.withdraw(700);
    }
}
class DepositThread implements Runnable{
    BankAccount account;
    DepositThread(BankAccount account){
        this.account = account;
    }
    public void run(){
        account.deposit(500);
    }
}

