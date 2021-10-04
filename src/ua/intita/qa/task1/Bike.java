package ua.intita.qa.task1;

import java.util.Objects;

public class Bike {
    private String name;
    private String prodCountry;
    private String typeOfFrame;
    private String sizeOfFrame;
    private String type;
    private double diamOfWheel;
    private int gear;
    private String typeOfBrake;

    public Bike(){
    }

    public Bike(String name, String prodCountry, String typeOfFrame, String sizeOfFrame, String type,
                double diamOfWheel, int gear, String typeOfBrake) {
        this.name = name;
        this.prodCountry = prodCountry;
        this.typeOfFrame = typeOfFrame;
        this.sizeOfFrame = sizeOfFrame;
        this.type = type;
        this.diamOfWheel = diamOfWheel;
        this.gear = gear;
        this.typeOfBrake = typeOfBrake;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProdCountry() {
        return prodCountry;
    }

    public void setProdCountry(String prodCountry) {
        this.prodCountry = prodCountry;
    }

    public String getTypeOfFrame() {
        return typeOfFrame;
    }

    public void setTypeOfFrame(String typeOfFrame) {
        this.typeOfFrame = typeOfFrame;
    }

    public String getSizeOfFrame() {
        return sizeOfFrame;
    }

    public void setSizeOfFrame(String sizeOfFrame) {
        this.sizeOfFrame = sizeOfFrame;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getDiamOfWheel() {
        return diamOfWheel;
    }

    public void setDiamOfWheel(double diamOfWheel) {
        this.diamOfWheel = diamOfWheel;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public String getTypeOfBrake() {
        return typeOfBrake;
    }

    public void setTypeOfBrake(String typeOfBrake) {
        this.typeOfBrake = typeOfBrake;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bike bike = (Bike) o;
        return Double.compare(bike.diamOfWheel, diamOfWheel) == 0 && gear == bike.gear && name.equals(bike.name) && prodCountry.equals(bike.prodCountry) && typeOfFrame.equals(bike.typeOfFrame) && sizeOfFrame.equals(bike.sizeOfFrame) && type.equals(bike.type) && typeOfBrake.equals(bike.typeOfBrake);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, prodCountry, typeOfFrame, sizeOfFrame, type, diamOfWheel, gear, typeOfBrake);
    }

    @Override
    public String toString() {
        return "Bike{" +
                "name='" + name + '\'' +
                ", prodCountry='" + prodCountry + '\'' +
                ", typeOfFrame='" + typeOfFrame + '\'' +
                ", sizeOfFrame='" + sizeOfFrame + '\'' +
                ", type='" + type + '\'' +
                ", diamOfWheel=" + diamOfWheel +
                ", gear=" + gear +
                ", typeOfBrake='" + typeOfBrake + '\'' +
                '}';
    }
}
