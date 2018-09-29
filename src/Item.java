/******************************************************************************
 * Created: 9/28/2018
 * Last Edit: 9/29/2018
 * File: Item.Java
 * Author: Carlos Perez
 * Class: COP 3003 - CRN 80602
 *
 * Summary: An interface class that provides basic accessor and mutator methods for objects
 * similar to item.
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
