/******************************************************************************
 * Last Edit: 10/28/18
 * File: Screen.Java
 * Author: Carlos Perez
 * Class: COP 3003 - CRN 80602
 ******************************************************************************/

public class Screen implements ScreenSpec {

  public String resolution;
  public int refreshrate;
  public int responsetime;

  public Screen(String resolution, int refreshrate, int responsetime) {
    this.resolution = resolution;
    this.refreshrate = refreshrate;
    this.responsetime = responsetime;
  }

  @Override
  public String getResolution() {
    return this.resolution;
  }

  @Override
  public int getRefreshRate() {
    return this.refreshrate;
  }

  @Override
  public int getResponseTime() {
    return this.responsetime;
  }

  @Override
  public String toString() {
    return
        "Resolution : " + getResolution() + System.getProperty("line.separator") +
            "Refresh Rate : " + getRefreshRate() + System.getProperty("line.separator") +
            "Response Time : " + getResponseTime();
  }
}
