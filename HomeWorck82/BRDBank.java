package HomeWorcks.home8.HomeWorck82;

public class BRDBank implements Bank {
    int bankAccount = 0;

    @Override
    public String bankPresentation() {
        return "Welcome to BRD Bank!";
    }

    @Override
    public int widrawMoney() {
        return bankAccount;
    }

    @Override
    public int depositMoney() {
        return bankAccount ;
    }
}
