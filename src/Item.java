/******************************************************************************
 * Last Edit: 10/28/18
 * File: Item.Java
 * Author: Carlos Perez
 * Class: COP 3003 - CRN 80602
 ******************************************************************************/

import java.util.Date;

public interface Item {

  public final String manufacturer = "OracleProduction";

  /* Mutator Methods */
  public void setProductionNumber(int currentProductionNumber);
  public void setName(String name);

  /* Accessor Methods */
  public String getName();
  public Date getManufactureDate();
  public int getSerialNumber();
}
