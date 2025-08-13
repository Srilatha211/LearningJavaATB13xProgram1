package Ex_16_Arrays;

public class Lab122_Fixed_Array_Creations {
    public static void main(String[] args) {

        //Second way --by using a fixed size
        int[] marks= new int[3];//Fixed Size
        // here we need to pass the values
        //Length will be always 1 to 3,
        //Index starts from 0-2

        marks[0]=200;
        marks[1]=10;
        marks[2]=30;
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);

        //second way using Strings,boolean etc..,

        String[] names= new String[2];
        names[0]="sri";
        names[1]="latha";
        System.out.println(names[0]);
        System.out.println(names[1]);
        //System.out.println(names[2]);//.ArrayIndexOutOfBoundsException
// bcz we dont have index '2';

        Boolean[] booleans= new Boolean[1];
        booleans[0]= true;
        System.out.println(booleans[0]);

    }
}
