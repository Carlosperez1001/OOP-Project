
/******************************************************************************
 * Last Edit: 10/28/18
 * File: Product.Java
 * Author: Carlos Perez
 * Class: COP 3003 - CRN 80602
 ******************************************************************************/
import java.util.Date;

public abstract class Product implements Item, Comparable<Product> {

  /*Private/Static Variable Declarations */
  private String name;                                        //Name of product
  private int serialNumber;                                   //serialNumber of product
  private Date manufacturedOn = new Date();                   //Uses today's date
  private static int currentProductionNumber = 1;

  /* Default Constructor : Product */
  public Product(String name) {
    this.name = name;
    serialNumber = currentProductionNumber++;
    manufacturedOn.getTime();
  }

  /* Methods */

  @Override
  public String toString() {
    return ("Manufacturer : " + manufacturer + "\n" +
        "Serial Number : " + getSerialNumber() + "\n" +
        "Date : " + getManufactureDate() + "\n" +
        "Name : " + getName() + "\n");
  }

  /* Mutator Methods */
  public void setProductionNumber(int currentProductionNumber) {
    serialNumber = currentProductionNumber;
  }

  /* Accessor Methods */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Date getManufactureDate() {
    return manufacturedOn;
  }

  public int getSerialNumber() {
    return serialNumber;
  }

  @Override
  public int compareTo(Product o) {
    return this.name.compareTo(o.name);
  }
}
