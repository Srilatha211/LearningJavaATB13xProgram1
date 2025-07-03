package July_3rd_Method_Overloading;

public class Method_Overloading_Printer {
    public static void main(String[] args) {
Printer P= new Printer();
      String s=  P.printData("This is a printer");
        System.out.println(s);
      int result = P.printData(30,40);
        System.out.println(result);
        float result1=P.printData(30.0f,40.0f);
        System.out.println(result1);
    }
}


    class Printer {

        static String printData(String printer) {
            //System.out.println("This is a printer");
            return printer;
        }

        static int printData(int a,int b){
            return a+b;

        }

        static float printData(float a, float b){
            return a+b;
        }
    }

