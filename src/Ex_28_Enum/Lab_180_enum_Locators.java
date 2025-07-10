package Ex_28_Enum;

public class Lab_180_enum_Locators {
    public static void main(String[] args) {
        System.out.println(Locators.page_input_email.getLocators());
        System.out.println(Locators.page_input_password.getLocators());
        System.out.println(Locators.page_button.getLocators());

        System.out.println(Colours.RED.getHexCode());
        System.out.println(Colours.BLUE.getHexCode()
        );

        System.out.println(APIURLs.vwo.getUrl());
        System.out.println(APIURLs.google.getUrl());

    }
}
