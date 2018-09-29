/******************************************************************************
 * Created: 9/28/2018
 * Last Edit: 9/29/2018
 * File: ItemType.Java
 * Author: Carlos Perez
 * Class: COP 3003 - CRN 80602
 *
 * Summary: Creates an public enum to defined the Item's Type  with additional referencing code.
 ******************************************************************************/

public enum ItemType {
  //Categorized item's type with and affiliated code.
  Audio("AU"),
  Visual("VI"),
  AudioMobile("AM"),
  VisualMobile("VM");

  public final String code;

  ItemType(String code) {
    this.code = code;
  }

  public String getCode() {
    return code;
  }

}