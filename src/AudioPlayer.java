/******************************************************************************
 * Last Edit: 10/28/18
 * File: AudioPlayer.Java
 * Author: Carlos Perez
 * Class: COP 3003 - CRN 80602
 ******************************************************************************/

public class AudioPlayer extends Product implements MultimediaControl {

  String audioSpecification;
  ItemType mediaType;

  // constructors
  public AudioPlayer(String name, String audioSpecification, ItemType mediaType) {
    super(name);
    this.audioSpecification = audioSpecification;
    this.mediaType = mediaType;
  }

  public AudioPlayer(String name, String audioSpecification) {
    super(name);
    this.audioSpecification = audioSpecification;
   mediaType = ItemType.AUDIO;
  }


  public static void play() {
    System.out.println("Playing");
  }


  public static void stop() {
    System.out.println("Stopping");
  }


  public static void previous() {
    System.out.println("Previous");
  }


  public static void next() {
    System.out.println("Next");
  }

  public String getAudioSpecification() {
    return audioSpecification;
  }

  public ItemType getMediaType() {
    return mediaType;
  }

  @Override
  public String toString() {
    return super.toString()
        + "Audio Spec : " + getAudioSpecification()
        + "\nType : " + getMediaType();
  }
}
