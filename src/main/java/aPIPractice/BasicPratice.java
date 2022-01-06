package aPIPractice;

import io.restassured.RestAssured;

public class BasicPratice {
    public static void main(String[] args) {

        String token = RestAssured.given().
                relaxedHTTPSValidation().
                header("is_encrypted", "true").
                header("content-Type", "application/json").
                queryParam("origin","MS1hamlv").
                body("{\"payload\":{\"username\":\"NTk1OA==\",\"password\":\"NTk1OA==\"}}").
                when().
                post("http://10.21.87.30:8070/dashboard/v1/login_api").
                getHeader("x-auth-token");
        System.out.println(token);
    }
}
