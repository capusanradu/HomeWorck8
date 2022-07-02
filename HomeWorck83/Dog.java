package HomeWorcks.home8.HomeWorck83;

public class Dog implements HowAnnimalsBehaves{
    @Override
    public String walk() {
        return "dog-walks";
    }

    @Override
    public String talk() {
        return "ham";
    }

    @Override
    public String eat() {
        return "dog food";
    }
}
