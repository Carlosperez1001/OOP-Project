/******************************************************************************
 * Created: 9/28/2018
 * Last Edit: 9/29/2018
 * File: Product.Java
 * Author: Carlos Perez
 * Class: COP 3003 - CRN 80602
 *
 * Summary:A class based on Interface "Item". With the Constructor "Product", this object will
 * hold fields such as (name, serialNumber and manufacturedOn). There are mutator and accessor to
 * change these fields in the future.
 ******************************************************************************/

import java.util.Date;

public abstract class Product implements Item {

  /*Private/Static Variable Declarations */
  private String name;                          //Name of product
  private int serialNumber;                     //serialNumber of product
  private Date manufacturedOn = new Date();     //Uses today's date
  static int currentProductionNumber;           //Creates a new serialNumber

  /* Default Constructor : Product */
  public Product(String name) {
    this.name = name;
    serialNumber = currentProductionNumber++;
    manufacturedOn.getTime();
  }

  /* Methods */

  /**
  * Formats the object "product" toString and prints statement to console.
   * @return String value "manufacturer,getSerialNumber,getManufactureDate,getName"
  */
  @Override
  public String toString() {
    return ("Manufacturer   : " + manufacturer + "\n" +
        "Serial Number  : " + getSerialNumber() + "\n" +
        "Date           : " + getManufactureDate() + "\n" +
        "Name           : " + getName() + "\n");
  }

  /* Mutator Methods */
  public void setProductionNumber(int currentProductionNumber) {
    serialNumber = currentProductionNumber;
  }

  public void setName(String name) {
    this.name = name;
  }

  /* Accessor Methods */
  public String getName() {
    return name;
  }

  public Date getManufactureDate() {
    return manufacturedOn;
  }

  public int getSerialNumber() {
    return serialNumber;
  }

}
