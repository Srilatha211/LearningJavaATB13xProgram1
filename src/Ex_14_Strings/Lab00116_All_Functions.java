package Ex_14_Strings;

public class Lab00116_All_Functions {
    public static void main(String[] args) {

        // 1.Length()
        String name="Sri";
        System.out.println(name.length());

        // 2.charAt()-- using index value, strt from 0,1,2,3,..
        System.out.println(name.charAt(0));
        System.out.println(name.charAt(2));
      //  System.out.println(name.charAt(3)); // StringIndexOutOfBoundsException


        // 3. concat() add at the end
        System.out.println(name.concat("latha"));
        // 4.contains()
        System.out.println(name.contains("p"));
        //5.equals()
        System.out.println(name.equals("latha"));
        //6.equalIgnore()
        System.out.println(name.equalsIgnoreCase("sRi"));

        // 7.Index()
        System.out.println(name.indexOf("i"));

        String s1="roar";
        System.out.println(s1.indexOf("r"));
        System.out.println(s1.lastIndexOf("r"));

        // 8.replace()
        System.out.println(name.replace("r","R"));

        //9/split()

        String name4 = "sri@latha";
        String[] split_name4 = name4.split("@");
        System.out.println(split_name4[0]);
        System.out.println(split_name4[1]);

// 10. substring( , )  , sri
        System.out.println(name.substring(1, 2));

        // 11. toLowerCase()
        System.out.println("SRI".toLowerCase());

        // 12. toUpperCase()
        System.out.println("sri".toUpperCase());

        // 14. startsWith()
        System.out.println(name.startsWith("S"));

        // 15. endsWith()
        System.out.println(name.endsWith("a"));

        String anotherPalindrome = "Niagara. O roar again!";
        System.out.println(anotherPalindrome.length());

        String extract = anotherPalindrome.substring(11,15);
        System.out.println(extract);




//        Concatenation (By +)

        String s111 = "Hello";
        String s222 = "World";

        String s333 = "ji";
        String result1 = s111 + s333 + s222;
        System.out.println(result1);



    }
}

