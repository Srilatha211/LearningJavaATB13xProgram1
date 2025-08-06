package Ex_1_RA_Basics;

import io.restassured.RestAssured;

public class APITesting_Lab001_RA {
        public static void main(String[] args) {

      //this is traditional method BDD
    //https://restful-booker.herokuapp.com/ping

        RestAssured.given()
                .baseUri("https://restful-booker.herokuapp.com")
                .basePath("/ping")
                .when().log().all().get()
                .then().log().all().statusCode(201);
}



        }
