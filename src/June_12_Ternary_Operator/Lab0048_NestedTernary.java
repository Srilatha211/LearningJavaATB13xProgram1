package June_12_Ternary_Operator;

import java.sql.SQLOutput;

public class Lab0048_NestedTernary {

    public static void main(String[] args) {
        int age = 75;
        String res = age < 18? "Minor" : age <=65? "Adult": "Senior";
        System.out.println(res);
    }
}
