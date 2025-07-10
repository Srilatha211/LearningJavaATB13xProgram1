package Ex_6_UserInputsandID;

public class Lab0051_Commnd_LineUserInput {
    public static void main(String[] args) {
        //int age= 65;
//String Canivote = age > 18? "Yes": "No";
      //  System.out.println(Canivote);

        //Here without harcoding the value we can pass the arguments,
        // by command line option.
        //so, passing the arguments in the array string[].
        // so, here array is the String data type need to convert to sring to int
        //for that we need to "Interger.Parseint()"

        String age_string= args[0];
        int age= Integer.parseInt(age_string);
        String Canivote = age >= 18? "Yes": "No";
        System.out.println(Canivote);


    }
}
