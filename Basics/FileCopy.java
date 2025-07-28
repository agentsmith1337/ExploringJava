import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileCopy {
    public static void main(String[] args) {
        String fileName, destName; 
        try (Scanner io = new Scanner(System.in)) {
            System.out.println("Please enter the file name to be copied:");
            fileName = io.nextLine();
            System.out.println("Please enter the destination file name");
            destName = io.nextLine();
            File filePath = new File(fileName);
            File destPath = new File(destName);
            if (!destPath.exists()) {
                try {
                    destPath.createNewFile();
                } catch (IOException ioe) {
                    System.out.println("Error during file creation:"+ioe.getMessage());
                }
            }
            if (filePath.exists()) {
                try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(filePath)); 
                    BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destPath))) {
                        int a;
                        while ((a=bis.read())!=-1) {
                            bos.write(a);
                        }
                } catch (IOException ioe) {
                    System.out.println("Error during copy:"+ioe.getMessage());
                }
            }
        }
    }
}
