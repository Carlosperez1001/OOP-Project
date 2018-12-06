/******************************************************************************
 * Last Edit: 10/28/18
 * File: MoviePlayer.Java
 * Author: Carlos Perez
 * Class: COP 3003 - CRN 80602
 ******************************************************************************/

public class MoviePlayer extends Product implements MultimediaControl {

  Screen screen;
  MonitorType monitorType;

  public MoviePlayer(String name, Screen screen, MonitorType monitorType) {
    super(name);
    this.screen = screen;
    this.monitorType = monitorType;
  }

  public Screen getScreen() {
    return screen;
  }

  public MonitorType getMonitorType() {
    return monitorType;
  }

  public static void play() {
    System.out.println("Playing movie");
  }


  public static void stop() {
    System.out.println("Stopping movie");
  }


  public static void previous() {
    System.out.println("Previous movie");
  }


  public static void next() {
    System.out.println("Next movie");
  }

  @Override
  public String toString() {
    return super.toString() +
        "Screen : " + screen.toString() + System.getProperty("line.separator") +
        "Monitor Type :" + monitorType ;
  }
}
