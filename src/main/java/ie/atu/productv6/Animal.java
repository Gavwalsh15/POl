package ie.atu.productv6;

import java.text.NumberFormat;

public class Animal implements Productable{
    private String type;
    private String breed;
    private int age;
    private double price;
    protected static int count = 0;

    public Animal() {
    }


    public String getType() {return type;}

    public void setType(String type) {this.type = type;}

    public String getBreed() {return breed;}

    public void setBreed(String breed) {this.breed = breed;}

    public int getAge() {return age;}

    public void setAge(int age) {this.age = age;}

    public double getPrice() {return price;}

    public void setPrice(double price) {
        this.price = price;
    }

    public String getPriceFormatted() {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        return currency.format(price);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age;
    }
}
