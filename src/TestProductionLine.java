import java.util.ArrayList;

public class TestProductionLine {
  public static void main(String args[]) {
    EmployeeInfo e1 = new EmployeeInfo();

    ArrayList<Product> products = new ArrayList<>();

    products = testCollection();

    System.out.println(e1.toString());

    ProcessFiles newFile = new ProcessFiles();
    try {
      newFile.writeFile(products);
      newFile.writeFile(e1);
    }catch (Exception ex){
      System.out.println("Error");
    }

  }

  public static ArrayList<Product> testCollection() {
    ArrayList<Product> products = new ArrayList<>();
    //Generate Items to the the list
    AudioPlayer a1 = new AudioPlayer("iPod Mini", "MP3");
    AudioPlayer a2 = new AudioPlayer("Walkman", "WAV ");
    MoviePlayer m1 = new MoviePlayer("DBPOWER MK101",
        new Screen(" 720x480", 40, 22), MonitorType.LCD);
    MoviePlayer m2 = new MoviePlayer("Pyle PDV156BK",
        new Screen("1366x768", 40, 22), MonitorType.LED);

    products.add(a1);
    products.add(a2);
    products.add(m1);
    products.add(m2);

    //Return  ArrayList<Product> products[testCollection] -> ArrayList<Product> products[main]
    return products;
  }
}