package June_12_Ternary_Operator;

public class Lab0049_Nested_GradeCalculation {
    public static void main(String[] args) {

        //Grade Calculation Using Nested Ternary

        //Description: Marks 90 = A+, 75 = A, 60 = B, 40 = C, below 40 Fail.

//
        int a= 100;
        String result=(a>=90)?"A+":(a<90 && a>=75)?"A":(a<75 && a>=60)?"B":(a<60 && a>=40)?"C":"Fail";
        System.out.println(result);


       // int max = (n1>n2)? (n1>n3)? n1 :n3 :(n2>n3)? n2: n3;

    }
}

