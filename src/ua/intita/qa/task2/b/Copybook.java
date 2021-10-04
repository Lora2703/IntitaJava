package ua.intita.qa.task2.b;

public abstract class Copybook implements Paper{

    private int numberOfSheet;
    private String typeOfCover;
    private String producer;


    public Copybook(int numberOfSheet, String typeOfCover, String producer) {
        this.numberOfSheet = numberOfSheet;
        this.typeOfCover = typeOfCover;
        this.producer = producer;
    }

    public int getNumberOfSheet() {
        return numberOfSheet;
    }

    public void setNumberOfSheet(int numberOfSheet) {
        this.numberOfSheet = numberOfSheet;
    }

    public String getTypeOfCover() {
        return typeOfCover;
    }

    public void setTypeOfCover(String typeOfCover) {
        this.typeOfCover = typeOfCover;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    @Override
    public String toString() {
        return "Copybook{" +
                "numberOfSheet=" + numberOfSheet +
                ", typeOfCover='" + typeOfCover + '\'' +
                ", producer='" + producer + '\'' +
                '}';
    }
}
