package Synch;

public class Account {
    private  int balance=600;
    public void withDraw(int money){
        this.balance-=money;//取款
    }

    public int getBalance(){
        return balance;
    }//查看余额
}
