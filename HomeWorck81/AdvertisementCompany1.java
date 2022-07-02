package HomeWorcks.home8.HomeWorck81;

public class AdvertisementCompany1 implements Advertisement {
    private int quantity1 = 0;
    private int quantity2 = 0;
    private int quantity3 = 0;
    @Override
    public String advertisementOnFacebook() {
        quantity1++;
        return "We done Facebook adds";
    }

    @Override
    public int adevertisementDoneFacebook() {
        return quantity1;
    }

    @Override
    public String advertisementOnEmail() {
        quantity2++;
        return "We done Email adds";
    }

    @Override
    public int adevertisementDoneEmail() {
        return quantity2;
    }

    @Override
    public String advertisementOnPrint() {
        quantity3++;
        return "We done Prints adds";
    }

    @Override
    public int adevertisementDonePrint() {
        return quantity3;
    }
}