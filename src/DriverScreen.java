/******************************************************************************
 * Last Edit: 10/28/18
 * File: DriverScreen.Java
 * Author: Carlos Perez
 * Class: COP 3003 - CRN 80602
 ******************************************************************************/

public class DriverScreen {

  public static void main(String args[]) {
    Screen screen1 = new Screen("S", 2, 2);
    screen1.resolution = "1920x720";
    screen1.refreshrate = 60;
    screen1.responsetime = 90;
    System.out.println(screen1);
  }
}