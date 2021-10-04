package ua.intita.qa.task1;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Bike bike1 = new Bike("Specialized", "USA", "aluminium", "XL",
                               "offroad",29.0, 24, "hydraulic");
        try (FileOutputStream out = new FileOutputStream("bike.xml");
             BufferedOutputStream out1 = new BufferedOutputStream(out);
             XMLEncoder xmlEncoder = new XMLEncoder(out1)) {

            xmlEncoder.writeObject(bike1);
            xmlEncoder.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }

//        try (XMLDecoder xmlDecoder = new XMLDecoder(new BufferedInputStream(new FileInputStream("bike.xml")))) {
//            Bike bike2 = (Bike) xmlDecoder.readObject();
//
//            System.out.println(bike2);
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
    }
}
