/******************************************************************************
 * Last Edit: 10/28/18
 * File: DriverMoviePlayer.Java
 * Author: Carlos Perez
 * Class: COP 3003 - CRN 80602
 ******************************************************************************/

public class DriverMoviePlayer {

  public static void testMoviePlayer() {

    MoviePlayer moviePlayer1 = new MoviePlayer("DBPOWER MK101", new Screen("720x480",
        40, 22), MonitorType.LCD);
    MoviePlayer moviePlayer2 = new MoviePlayer("Pyle PDV156BK", new Screen("1366x768",
        40, 22), MonitorType.LED);
    AudioPlayer.next();
    AudioPlayer.play();
    AudioPlayer.previous();
    AudioPlayer.stop();
    MoviePlayer.next();
    MoviePlayer.play();
    MoviePlayer.previous();
    MoviePlayer.stop();
    System.out.println(moviePlayer1);
    System.out.println(moviePlayer2);
  }
}
