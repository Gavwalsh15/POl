package ie.atu.productv6;

public class Dog extends Animal{
    private String vaccination;
    private String shedding;
    private Boolean neutered;

    public Dog() {
        super();
        vaccination = "";
        shedding = "";
        neutered = false;
        count++;
    }

    public String getVaccination() {return vaccination;}

    public void setVaccination(String vaccination) {this.vaccination = vaccination;}

    public String getShedding() {return shedding;}

    public void setShedding(String shedding) {this.shedding = shedding;}

    public Boolean getNeutered() {return neutered;}

    public void setNeutered(Boolean neutered) {this.neutered = neutered;}

    @Override
    public String toString() {
        return super.toString() +
                "\nVaccination:" + vaccination + '\n' +
                "Shedding:" + shedding + '\n' +
                "Neutered:" + neutered + '\n';
    }
}
