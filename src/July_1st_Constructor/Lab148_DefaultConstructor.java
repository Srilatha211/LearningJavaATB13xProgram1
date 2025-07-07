package July_1st_Constructor;

public class Lab148_DefaultConstructor {
    public static void main(String[] args) {
        Baby b1=new Baby();
    }
}
//The usage of Construtor is as we creste the object it will call automatically
//where as in methods we need to call using object reference
//WhereConstrutor is used?
//Used to
// Fetch data from Mysql database
//Read from csv file,xlsx...
//Open a file and read the data.(json,textfiles,testdata.xlsx files
class Baby{
    //Attributes|Properties|Instance Variables|Fields|Member Variables|Data Members
    String name;

    // Default Constructor
    Baby(){

        System.out.println("This is a DC");
    }
    //Behaviour|Instance methods|Member methods
    void sleep(){
        System.out.println("sleeping!");
    }
    void cry(){
        System.out.println("crying!");
    }
    void drink(){
        System.out.println("Drinking!");
    }

}