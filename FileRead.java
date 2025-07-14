import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileRead {
    public static void main(String[] args) {
        Scanner io = new Scanner(System.in);
        System.out.println("Please enter file name to view:");
        String name = io.nextLine();
        try (BufferedReader br = new BufferedReader(new FileReader(name))) {
            String dataline;
            while ((dataline=br.readLine())!=null){
                System.out.print(dataline+"\n");
            }
        } catch (IOException ioe) {
            System.out.println("Error while reading file"+ioe.getMessage());
        }
        io.close();
    }

}
