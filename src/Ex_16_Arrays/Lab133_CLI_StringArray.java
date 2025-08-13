package Ex_16_Arrays;

public class Lab133_CLI_StringArray {
    public static void main(String[] args) {

        for (int i = 0; i < args.length ; i++) {
            System.out.println(args[i]);

        }

        //for each
        for(String arg : args){
            System.out.println(arg);

        }
    }
}
