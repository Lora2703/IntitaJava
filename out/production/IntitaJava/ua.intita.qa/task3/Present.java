package task3;

public class Present {
    private Sweet[] sweets;

    public void addSweets (Sweet[] sweets){
        this.sweets = sweets;
    }

    double weightPresent = 0;
    public double weightPresent (Sweet[] sweets){
        for (Sweet sweet: sweets) {
            weightPresent += sweet.getWeight();
        }
        return weightPresent;
    }

    public void choiseSugar (double sugarMin, double sugarMax, Sweet[] sweets){
        for (Sweet sweet: sweets) {
            if((sweet.getSugar()>=sugarMin)&(sweet.getSugar()<=sugarMax)){
                System.out.println(sweet);
            }
        }
    }



}
