/******************************************************************************
 * Created: 9/28/2018
 * Last Edit: 9/29/2018
 * File: Main.Java
 * Author: Carlos Perez
 * Class: COP 3003 - CRN 80602
 *
 * Summary: The driver class of the program. Where the object "Widget" is created and defined.
 ******************************************************************************/

import java.util.ArrayList;
import java.util.Collections;
public class Main {

  public static void main(String[] args) {

    ArrayList<Product> products = new ArrayList<>();

    products = testCollection();

    //Reference Product.compareTo() function to sort string.
    Collections.sort(products);
    //Prints out sorted ArrayList<Product> products
    printList(products);

  }

  public static  ArrayList<Product> testCollection() {
    ArrayList<Product> products = new ArrayList<>();
    //Generate Items to the the list
    AudioPlayer a1 = new AudioPlayer("iPod Mini", "MP3");
    AudioPlayer a2 = new AudioPlayer("Walkman", "WAV ");
    MoviePlayer m1 = new MoviePlayer("DBPOWER MK101",
        new Screen(" 720x480", 40, 22), MonitorType.LCD);
    MoviePlayer m2 = new MoviePlayer("Pyle PDV156BK",
        new Screen("1366x768", 40, 22), MonitorType.LED);

    products.add(a1);
    products.add(a2);
    products.add(m1);
    products.add(m2);

    //Return  ArrayList<Product> products[testCollection] -> ArrayList<Product> products[main]
    return products;
  }
  public static void printList(ArrayList<Product> products){
    for(int i=0;i<products.size();i++){
      System.out.println(products.get(i));
    }

  }

}
