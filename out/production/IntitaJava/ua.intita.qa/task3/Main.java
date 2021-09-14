package task3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
    /*    Sweet[] sweets = new Sweet[8];
        sweets[0] = new ChokolateSweet("Ptashine moloko", 5.3, 12, "milk");
        sweets[1] = new Lollypop("Dushes", 4.1, 15, "yellow");
        sweets[2] = new ChokolateSweet("Karakum", 6.9, 11, "black");
                sweets[3] = new ChokolateSweet("Belochka",6.3, 9, "milk");
                sweets[4] = new Toffee("Iris", 2.5, 12.2, "milk");
                sweets[5] = new Toffee("Coffee", 3.9, 13.2,"coffee");
                sweets[6] = new Lollypop("Aeroflot", 3.7, 6.2, "green");
                sweets[7] = new Lollypop("Cherry", 5.1, 9.2, "red");*/
        ChokolateSweet sweets1 = new ChokolateSweet("Ptashine moloko", 5.3, 12, "milk");
        Lollypop sweets2 = new Lollypop("Dushes", 4.1, 15, "yellow");
        ChokolateSweet sweets3 = new ChokolateSweet("Karakum", 6.9, 11, "black");
        ChokolateSweet sweets4 = new ChokolateSweet("Belochka",6.3, 9, "milk");
        Toffee sweets5 = new Toffee("Iris", 2.5, 12.2, "milk");
        Toffee sweets6 = new Toffee("Coffee", 3.9, 13.2,"coffee");
        Lollypop sweets7 = new Lollypop("Aeroflot", 3.7, 6.2, "green");
        Lollypop sweets8 = new Lollypop("Cherry", 5.1, 9.2, "red");
        Sweet[] sweets = {sweets1, sweets2, sweets3, sweets4, sweets5, sweets6, sweets7, sweets8, sweets1, sweets2, sweets3, sweets4, sweets5, sweets6, sweets7, sweets8,
                sweets1, sweets2, sweets3, sweets4, sweets5, sweets6, sweets7, sweets8, sweets1, sweets2, sweets3, sweets4, sweets5, sweets6, sweets7, sweets8,
                sweets1, sweets2, sweets3, sweets4, sweets5, sweets6, sweets7, sweets8, sweets1, sweets2, sweets3, sweets4, sweets5, sweets6, sweets7, sweets8,
                sweets1, sweets2, sweets3, sweets4, sweets5, sweets6, sweets7, sweets8, sweets1, sweets2, sweets3, sweets4, sweets5, sweets6, sweets7, sweets8,
                sweets1, sweets2, sweets3, sweets4, sweets5, sweets6, sweets7, sweets8, sweets1, sweets2, sweets3, sweets4, sweets5, sweets6, sweets7, sweets8};



        Present presents = new Present();
        double weight;
        weight = presents.weightPresent(sweets);
        System.out.println("Weight of present: "+weight);

        Arrays.sort(sweets);
        for (Sweet sweet: sweets) {
            System.out.println(sweet.toString());
        }

        System.out.println("\n");
        double sugarMin = 6.0;
        double sugarMax = 11.0;
        System.out.println("Sugar from "+sugarMin+" to "+sugarMax+":");
        presents.choiseSugar(sugarMin, sugarMax, sweets);
    }
}
