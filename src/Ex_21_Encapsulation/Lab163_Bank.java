package Ex_21_Encapsulation;

public class Lab163_Bank {
    public static void main(String[] args) {
        Bank B1= new Bank("srilatha", 200);
long bal= B1.getBal();
        System.out.println(bal);
         B1.setBal(2000,false);
         long bal2= B1.getBal();
        System.out.println("bal2 is : " + bal2);
    }
}

class Bank{
    private String name;
    private long bal;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBal() {
        return bal;
    }

    public void setBal(long bal, boolean iscashier) {

        if(iscashier){
            this.bal = bal;
        }else {
            System.out.println("No access to set Bal");
        }
    }

    public Bank(String name, long bal) {
        this.name = name;
        this.bal = bal;

    }
}
