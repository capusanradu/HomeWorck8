package HomeWorcks.home8.HomeWorck81;

public class MainCompany {
    public static void main(String[] args) {
        Company raduCompany = new Company(new AdvertisementCompany1());

        for (int i = 0; i < 5; i++){
            raduCompany.makeFacebookadds();
            raduCompany.makeEmailadds();
            raduCompany.makePrintadds();
        }
    }
}
