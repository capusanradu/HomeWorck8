package HomeWorcks.home8.HomeWorck82;

public class Person {
    private Bank bank;

    public Person(Bank bank) {
        this.bank = bank;
    }
    public void depositemoney(int money){
        System.out.println("You have deposit: " + money + " and you now have: " + (bank.depositMoney() + money));
    }

    public void withdrawmoney(int money){
        System.out.println("You have withdraw: " + money + " and you now have: " + (bank.depositMoney() - money));
    }

}
