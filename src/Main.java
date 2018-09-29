/******************************************************************************
 * Created: 9/28/2018
 * Last Edit: 9/29/2018
 * File: Main.Java
 * Author: Carlos Perez
 * Class: COP 3003 - CRN 80602
 *
 * Summary: The driver class of the program. Where the object "Widget" is created and defined.
 ******************************************************************************/

public class Main {

    public static void main(String[] args) {
       //Generate "Widgets"
        Widget w1 = new Widget("Box");
        Widget w2 = new Widget("Big Box");
        Widget w3 = new Widget("Bigger Box");
        System.out.println(w1.toString());
        System.out.println(w2.toString());
        System.out.println(w3.toString());

      /* Code for using the ItemType ENUM.
        for (ItemType it : ItemType.values()){
          System.out.println(it+" " +it.code);
        }
       */

    }
}
//A subclass of Product
 class Widget extends Product {
    /* Default Constructor : Widget */
    public Widget(String name){
        super(name);
    }
}
