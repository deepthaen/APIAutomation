package practice2;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class PracticeBasic {

    public static  void apiresp(){
        String response = RestAssured.given().relaxedHTTPSValidation().
                  header().
                header().
                queryParam().
                body("").when().
                post("").
                getHeader("");
        System.out.println(""+response);

    }
}
