package HomeWorcks.home8.HomeWorck82;

public class MainBank {
    public static void main(String[] args) {
        Person radu = new Person(new IngBank());
        radu.depositemoney(500);
        radu.withdrawmoney(500);
    }
}
