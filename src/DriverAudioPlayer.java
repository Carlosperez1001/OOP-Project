/******************************************************************************
 * Last Edit: 10/28/18
 * File: DriverAudioPlayer.Java
 * Author: Carlos Perez
 * Class: COP 3003 - CRN 80602
 *
 * Unit testing for the AudioPlayer class
 *
 ******************************************************************************/

public class DriverAudioPlayer {

  public static void testAudioPlayer() {

    AudioPlayer audioPlayer1 = new AudioPlayer("iPod Mini", "MP3", ItemType.AUDIO);
    AudioPlayer audioPlayer2 = new AudioPlayer("Walkman", "WAV", ItemType.AUDIO);

    audioPlayer1.play();
    audioPlayer1.stop();
    audioPlayer1.next();
    audioPlayer1.previous();
    System.out.println(audioPlayer1);
    System.out.println(audioPlayer2);

  }
}