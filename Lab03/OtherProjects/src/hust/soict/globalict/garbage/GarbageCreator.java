package hust.soict.globalict.garbage;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

// GarbageCreator class without using StringBuffer
public class GarbageCreator {
    
    public static void main(String[] args) {
        String filename = "D:\\Code\\Java\\OtherProjects\\src\\hust\\soict\\globalict\\garbage\\test.exe";
        
        byte[] inputBytes = { 0 };
        long startTime, endTime;

        try {
            inputBytes = Files.readAllBytes(Paths.get(filename));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        startTime = System.currentTimeMillis();
        String outputString = "";
        for (byte b : inputBytes) {
            outputString += (char)b;
        }
        endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime); // 83
    }
}

