import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Locale;

public class ProcessFiles {
    private Path p1;
    private  Path p2;
    private  Path p3;

    public ProcessFiles() {
        p1 = Paths.get("C:\\LineTests");
        p2 = Paths.get("TestResult.txt");
        p3 = p1.resolve(p2);
        CreateDirectory();
    }

    private void CreateDirectory(){
        try {
            Files.createDirectories(p1);
        }catch (Exception ex){
            System.out.println("Unable to create.");
        }
    }



    public void writeFile(EmployeeInfo emp) throws IOException {

        FileWriter  Writer = new FileWriter(p3.toString(),true);
        PrintWriter printWriter = new PrintWriter(Writer);
        printWriter.println(emp.toString());
        printWriter.close();

    }

    public void writeFile(ArrayList<Product> products) throws IOException{
        FileWriter  Writer = new FileWriter(p3.toString(),true);
        PrintWriter printWriter = new PrintWriter(Writer);

        for(int i=0;i<products.size();i++){
            printWriter.println(products.get(i));
        }
        printWriter.close();

    }

}
