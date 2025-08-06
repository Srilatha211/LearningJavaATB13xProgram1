package Ex_2_RA_concepts;

import io.restassured.RestAssured;

public class Lab005_Multipleṭēstcases_RA {
    public static void main(String[] args) {
//This is the direct BDD style of Rest Assured which is not used
        //Having the repetstive code
        //No Scalability

        //For this we can use the classes and objects provided by the RestAssured
        String Pincode = "500092";

        RestAssured.given()
                .baseUri("https://restful-booker.herokuapp.com")
                .basePath("/ping")
                .when().log().all().get()
                .then().log().all().statusCode(201);

        Pincode = "@";

        RestAssured.given()
                .baseUri("https://restful-booker.herokuapp.com")
                .basePath("/ping")
                .when().log().all().get()
                .then().log().all().statusCode(201);

        Pincode = " ";

        RestAssured.given()
                .baseUri("https://restful-booker.herokuapp.com")
                .basePath("/ping")
                .when().log().all().get()
                .then().log().all().statusCode(201);
    }
    }

