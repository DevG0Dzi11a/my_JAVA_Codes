package filedemo;

import java.io.File;
import java.io.IOException;

public class FileDemo {

    public static void main(String[] args) {
        try {
            File myObj = new File("test file.txt");
            if(myObj.createNewFile())
            {
                System.out.println("File is created :"+ myObj.getName());
            }
            else
            {
                System.out.println("File already exists!");
            }
        } catch (IOException e) {
        }
    }

}
