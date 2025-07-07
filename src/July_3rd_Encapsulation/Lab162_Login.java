package July_3rd_Encapsulation;

import javax.xml.transform.Source;

public class Lab162_Login {
    public static void main(String[] args) {
        VWOLogin Login = new VWOLogin("Srilatha", "123456");
        System.out.println(Login.name);
        System.out.println( Login.Password);
        //Login.name = "kore";
       // Login.Password = "ssss";// Its a bad approach
        // here we are able to change the password but password and name cannot be accessed easily
        //for that we encapsulate the login and password

        GoodVWOLogin Login1= new GoodVWOLogin("sri","@123");
        //System.out.println(Login1.password);;//here we are not able to access password bcz its private
        //it will be accessed within the class only
        //But if he is an Admin how can we change the password by using Getter Setter method
        String pass= Login1.getPassword();
        System.out.println(pass);
        //But here do we need to allow users to change pasword so, need authority
Login1.setPassword("245678", true);
        String changepassword= Login1.getPassword();
        System.out.println("changepassword is : " + changepassword);
    }
}

class VWOLogin{
//Here it is public and a bad approach and is not encapsulated
   public  String name;
    public String Password;

    VWOLogin(String User_name,String User_Password){
        this.name = User_name;
        this.Password= User_Password;

    }

}
// we can access username and password only a new behaviour
// By using new function with other class

//Here it is encapsulated and good approach

class GoodVWOLogin {
    //Attributes|Instance variables|Member variables|Properties|Fileds|Data variables
    // Encapsulation says that the above ones always should be in private in nature
    private String name;
    private String password;

    GoodVWOLogin(String User_name, String User_Password) {
        this.name = User_name;
        this.password = User_Password;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password, boolean isAdmin) {
      if(isAdmin){
        this.password = password;
    }else{
          System.out.println("Not an Admin cant acces");
      }
    }
}
