package July_3th_Method_Overriding;

public class MethodOverriding_Loginfunctionality {
    public static void main(String[] args) {

        User user= new User();
        Admin_User adminUser= new Admin_User();
        Regular_User regularUser= new Regular_User();
        user.login();
        adminUser.login();
        regularUser.login();
    }
}
class User{
   void login(){
       System.out.println("This is user Login");
   }
   }
class Admin_User extends User{
    @Override
    void login(){
        System.out.println("Admin login: Access to admin panel granted");
    }
}
class Regular_User extends User{
    @Override

    void login(){

        System.out.println("Regular login: Limited access granted");
    }
}
