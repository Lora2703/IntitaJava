package task3;

public class ChokolateSweet extends Sweet{
    public String kindOfChokolate;

    public ChokolateSweet (String name, double weight, double sugar, String kindOfChokolate){
        super(name, weight, sugar);
        this.kindOfChokolate = kindOfChokolate;
    }
}
