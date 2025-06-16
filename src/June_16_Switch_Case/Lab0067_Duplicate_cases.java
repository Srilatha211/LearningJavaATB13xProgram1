package June_16_Switch_Case;

import javax.xml.transform.Source;

public class Lab0067_Duplicate_cases {
    public static void main(String[] args) {
        int a=10;
        switch (a) {
            case 10:
                System.out.println("This is allowed");
                break;
           /* case 10:
                System.out.println("Duplicate case is not allowed");
                break;
*/
        }

    }
}
