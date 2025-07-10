package Ex_10_ForLoop;

public class Lab0085_Loop_Zero_Intialisation {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++){ // here it runs 10 times and prints from 0-9
            System.out.println(i);
    }// this is always recommended, if we use i=0 then dont use = symbol

        for (int i = 1; i <= 10; i++){ // here it runs 10 times and prints from 1-9
            System.out.println(i);
        }// if we use i=1 then use = symbol
    }
}

