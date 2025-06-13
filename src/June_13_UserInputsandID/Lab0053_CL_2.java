package June_13_UserInputsandID;

public class Lab0053_CL_2 {
    public static void main(String[] args) {

        System.out.println(args[1]);
        System.out.println(args[2]);
        System.out.println(args[3]);
      //  System.out.println(args[4]);

        // We will get the o/p based on I/P arguments
        // I/P : 10 20 30 which are passed from CL
        //O/P: 10 20 30


        //This will execute even if we pass 4 arguments from CL
        // even though we did not print arg 4
        // I/p-- from CL -- 10,20,30,40
        //o/p -- 10,20,30

        // ".ArrayIndexOutOfBoundsException"
        // when we did not pass arg 4 args[4] from CL
        // I/P: 10 20 30

    }
}

