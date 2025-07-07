package July_7th_Task;

public class Task_2_Bank_Interest_Rate_Calculation {
    public static void main(String[] args) {
        Bank B1= new SBI();//Dynamic dispatch
        B1.getInterestRate();

        HDFC H1= new HDFC();
        H1.getInterestRate();
    }
}

abstract class Bank{
    abstract void getInterestRate();
}

class SBI extends Bank{
    @Override
    void getInterestRate() {
        System.out.println("SBI InterestRate - 6.5%");
    }
}
class HDFC extends Bank{
    @Override
    void getInterestRate() {
        System.out.println("HDFC InterestRate - 7.0%");
    }
}