package practice2;

import io.restassured.RestAssured;

public class ApiPractice_3 {

    public static void main(String[] args) {
     String token =    RestAssured.given().relaxedHTTPSValidation().
                header("user_name","").
                header("","").
                header("","").
                queryParam("","").
                body("").
                when().
                post().getHeader("");
        System.out.println("X Auth toekn :: "+ token);
    }


}
