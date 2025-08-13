package Ex_13_Functions;

public class Lab00108_All_functions {
    public static void main(String[] args) {
        //Type -1
        //without Parameter/argument without return type

        without_Param_without_return();
        //Type -2
        //without parameters/argumrnt with return type

        int result = add(10,20);
        int result1 = add(100,20);
        int result2 = add(1,20);
        System.out.println(result);
        System.out.println(result1);

        System.out.println(result2);
        //Type - 3
//with parameter/arguments without return type

        String("sri",20,1500)  ;
        String("latha",22,2000)  ;
//Type - 4
        //with parameter/arguments with return type
        /*int sum = three_numbers(10, 20,123);
        System.out.println(sum);
*/
    }

    //without Parameter/argument without return type
    static void without_Param_without_return(){
        System.out.println("Type 1-->");
        System.out.println("Without_Param_without_return");

    }
    //without parameters/argumrnt with return type
    static int add(int a,int b){
        System.out.println("This is type 2-->");
        System.out.println("Without_Param_with_return");
        return a+b;
    }
    //with parameter/arguments without return type(90%)
    static void String(String name,int age,double salary){
        System.out.println("This is type 3-->");
        System.out.println("Your name--" + name + "\n Your age--" + age + "\nYour salary--" + salary);

        //with parameter/arguments with return type
        /*static int three_numbers(int a, int b,int c){
            System.out.println("This is type 4-->");
            return a+b+c;*/
        }

    }


