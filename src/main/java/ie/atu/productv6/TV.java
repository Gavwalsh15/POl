package ie.atu.productv6;


public class TV extends Product{

    private String screenSize;
    private String brand;


    public TV() {
        super();
        screenSize = "";
        brand = "";
        count++;
    }

    public String getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(String screenSize) {
        this.screenSize = screenSize;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nSize: " + screenSize + '\n' +
                "Brand: " + brand;
    }
}
