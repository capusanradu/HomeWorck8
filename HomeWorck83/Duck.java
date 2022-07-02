package HomeWorcks.home8.HomeWorck83;

public class Duck implements HowAnnimalsBehaves{
    @Override
    public String walk() {
        return "duck-walk-fly";
    }

    @Override
    public String talk() {
        return "Quack-Quack";
    }

    @Override
    public String eat() {
        return "small fish";
    }
}
