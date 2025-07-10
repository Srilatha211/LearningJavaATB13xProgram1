package Ex_30_Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab_186_CheckException {
    public static void main(String[] args) {
        //FileInputStream fileInputStream= new FileInputStream("c://a.text");
        // here the file is not found error comes when writting the code
        //by JVM so,its a checked exception


            System.out.println("Starting");

            try {
                FileReader f = new FileReader(new File("C://abc.txt"));
            } catch (FileNotFoundException e) {
                System.out.println(e.getMessage());
            }

            System.out.println("End");
        }
    }


