package Ex_7_Payload_Management_Map;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matchers;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

public class Lab0031_RestAssured_Payload_Map {
    RequestSpecification requestSpecification;
    ValidatableResponse validatableResponse;
    Response response;
    String token;
    Integer bookingId;


    @Test
    public void test_POST() {

//        String name = "Amit";
//
//        String payload_POST = "{\n" +
//                "    \"firstname\" : \"" + name + "\",\n" +
//                "    \"lastname\" : \"Dutta\",\n" +
//                "    \"totalprice\" : 123,\n" +
//                "    \"depositpaid\" : false,\n" +
//                "    \"bookingdates\" : {\n" +
//                "        \"checkin\" : \"2024-01-01\",\n" +
//                "        \"checkout\" : \"2024-01-01\"\n" +
//                "    },\n" +
//                "    \"additionalneeds\" : \"Lunch\"\n" +
//                "}";
        //

        // Hashmap -> key and value pair
        // Parent Hashmap ->  key and value , Child Hashmap
        Map<String,Object> jsonBodyUsingmap = new LinkedHashMap<>();
        jsonBodyUsingmap.put("firstname","Srilatha");
        jsonBodyUsingmap.put("lastname","Kore");
        jsonBodyUsingmap.put("totalprice",123);
        jsonBodyUsingmap.put("depositpaid",false);


        Map<String,Object> bookingDatesMap = new LinkedHashMap<>();
        bookingDatesMap.put("checkin","2025-12-01"); // YYYY-MM-DD
        bookingDatesMap.put("checkout","2025-12-05");

        jsonBodyUsingmap.put("bookingdates",bookingDatesMap);
        jsonBodyUsingmap.put("additionalneeds", "Breakfast");

        System.out.println(jsonBodyUsingmap);

        requestSpecification = RestAssured.given();
        requestSpecification.baseUri("https://restful-booker.herokuapp.com/");
        requestSpecification.basePath("/booking");
        requestSpecification.contentType(ContentType.JSON);
        requestSpecification.body(jsonBodyUsingmap).log().all();

        Response response = requestSpecification.when().post();


        // Get Validatable response to perform validation
        validatableResponse = response.then().log().all();
        validatableResponse.statusCode(200);

        // Rest Assured -> import org.hamcrest.Matchers; %4-%5
        // Matchers.equalto()

        validatableResponse.body("booking.firstname", Matchers.equalTo("Pramod"));
        validatableResponse.body("booking.lastname", Matchers.equalTo("Dutta"));
        validatableResponse.body("booking.depositpaid", Matchers.equalTo(false));
        validatableResponse.body("bookingid", Matchers.notNullValue());







    }


}