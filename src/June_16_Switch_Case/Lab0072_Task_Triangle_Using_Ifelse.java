package June_16_Switch_Case;

public class Lab0072_Task_Triangle_Using_Ifelse {

    public static void main(String[] args) {

        int a=10;
        int b=10;
        int c=30;

        if(a==b && b==c)
        {
            System.out.println("This is a Equilateral Triangle");
        }
                    else if(a==b || b==c)
            {
                System.out.println("This is a Isosceles Triangle");
            }
else{
            System.out.println("This is a Scalene Triangle");

        }
        }

    }




