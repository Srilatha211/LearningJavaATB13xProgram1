package Ex_1_RA_Basics;

import io.restassured.RestAssured;

import java.util.Scanner;

public class APITesting_Lab002_RA {
    public static void main(String[] args) {

        //Gerkin syntax

        //Given()- PreRequiste - url,Headers,cookies,auth etc.,
        //When()- Http Methods - Post,Get,Put,Patch,delete
        //Then()-Validation- 200 ok,firstname==srilatha,..

        //Full Url - https://api.zippopotam.us/IN/560016
        //base uri - https://api.zippopotam.us
        //path uri - /IN/560016

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the Pincode!");
       String pincode = scanner.next();

        RestAssured.given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/560016")
                .when().get()
                .then().log().all().statusCode(200);
    }

    }

