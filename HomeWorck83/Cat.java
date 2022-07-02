package HomeWorcks.home8.HomeWorck83;

public class Cat implements HowAnnimalsBehaves {
    @Override
    public String walk() {
        return "cat-walking";
    }

    @Override
    public String talk() {
        return "miau";
    }

    @Override
    public String eat() {
        return "fish";
    }
}
