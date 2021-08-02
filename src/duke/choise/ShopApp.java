package duke.choise;

public class ShopApp{
    public static void main(String[] args) {
        double tax = 0.2;
        double total = 0;
        Customer c1 = new Customer("Pinky", 3);
   //     c1.setName("Pinky");
        c1.setSize("S");

        System.out.println("Welcome to our shop " + c1.getName());

        Clothing item1 = new Clothing("Blue Jacket", 20.9, "M");
        Clothing item2 = new Clothing("Orange T-Short", 10.5, "S");
    /*    item1.setDescription("Blue Jacket");
        item1.setPrice(20.9);
        item1.setSize("M");
        item2.setDescription("Orange T-Short");
        item2.setPrice(10.5);
        item2.setSize("S");*/
        Clothing[] items = {item1, item2, new Clothing(), new Clothing()};
        Clothing items[2] = new Clothing("Green Scarf", 5, "S");
        Clothing items[3] = new Clothing("Blue T-Short", 10.5, "S");
    /*    items[2].setPrice(5);
        items[2].setSize("S");
        items[3].setDescription("Blue T-Short");
        items[3].setPrice(10.5);
        items[3].setSize("S");*/

        System.out.println("Min price: "+Clothing.MINIMUM_PRICE);

        c1.addItems(items);
        c1.setSize(3);

   /*     int measurement = 3;
        switch (measurement) {
            case 1:
            case 2:
            case 3:
                c1.setSize("S");
                break;
            case 4:
            case 5:
            case 6:
                c1.setSize("M");
                break;
            case 7:
            case 8:
            case 9:
                c1.setSize("L");
                break;
            default:
                c1.setSize("XL");
        }*/
        for (Clothing item : items) {
            //    if (item.getSize().equals(c1.getSize())) {
            //        if (total > 15) {
            //            break;
            //       }
            //       total = total + item.getPrice();
            System.out.println("Item: " + item.getDescription() + ", " + item.getPrice() + ", " + item.getSize());
            //  }
        }
        System.out.println("Total: " + c1.getTotalClothingCoast());


    }
}
