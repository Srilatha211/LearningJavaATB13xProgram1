package Ex_11_WhileLoop;

public class Lab0091_whileloop_Intialisation {

    public static void main(String[] args) {
        int i=0;
        while(i<10){
            System.out.println(i);
            i++;
        }
      //  int j=0;
        for(int j=0; j<10; j++){
            System.out.println(j);
        }
    }// here both are same but intilaisation is different
    // even for "for loop" we can intialise outside
    //o/p for both is 0-9 runs 10times
}
