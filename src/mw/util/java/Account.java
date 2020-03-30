package mw.util.java;

public class Account {
    int money = 600;

    //取钱
    public void getMoney(int money){
        this.money-=money;//this.money = this.money-money
    }
    //y余额
    public int getBalance(){
        return money;
    }
}
