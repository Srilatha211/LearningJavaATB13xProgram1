package Task.July_4th_Task;

public class Task_4_PrivateAccess{
    public static void main(String[] args) {
        Employee E1= new Employee();
        E1.setEmployeeID("13Q91A059");
        System.out.println("EmployeeID : " + E1.getEmployeeID());

    }
}
class Employee{
   private String EmployeeID;

    public String getEmployeeID() {
        return EmployeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.EmployeeID = employeeID;
    }
}