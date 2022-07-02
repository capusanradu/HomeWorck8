package HomeWorcks.home8.HomeWorck83;

public class Animals {
    private HowAnnimalsBehaves howAnnimalsBehaves;

    public Animals(HowAnnimalsBehaves howAnnimalsBehaves) {
        this.howAnnimalsBehaves = howAnnimalsBehaves;
    }

    public void talk(){
        System.out.println(howAnnimalsBehaves.talk());
    }

    public void walk(){
        System.out.println(howAnnimalsBehaves.walk());
    }

    public void eat(){
        System.out.println(howAnnimalsBehaves.eat());
    }

}
