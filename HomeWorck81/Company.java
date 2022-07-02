package HomeWorcks.home8.HomeWorck81;

public class Company {

    private Advertisement advertisement;

    public Company(Advertisement advertisement){
        this.advertisement = advertisement;
    }

    public void makeFacebookadds(){
        System.out.println("Make " + advertisement.advertisementOnFacebook() + " with number " + advertisement.adevertisementDoneFacebook());
    }

    public void makeEmailadds(){
        System.out.println("Make " + advertisement.advertisementOnEmail() + " with number " + advertisement.adevertisementDoneEmail());
    }

    public void makePrintadds(){
        System.out.println("Make " + advertisement.advertisementOnPrint() + " with number " + advertisement.adevertisementDonePrint());
    }

}
