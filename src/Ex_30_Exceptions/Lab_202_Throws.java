package Ex_30_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Lab_202_Throws {
    public static void main(String[] args) {
        //Throws is used to protected the whole method from exception

    }

    static void t() throws FileNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("C://a.txt");
    }
}