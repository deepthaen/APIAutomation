package aPIPractice;

import io.restassured.RestAssured;
import io.restassured.response.Response;


import java.util.HashMap;

public class Practice_1 {

    /**
     * http://10.21.87.30:8070/dashboard/v1/login_api?origin=MS1hamlv
     * Params
     * Headers
     * Request = "{"payload":{"username":"NTk1OA==","password":"NTk1OA=="}}"
     * Response ---> status code - 200, RequestHeader - , Request Message
     */

     public static final String BASEURL = "http://10.21.87.30:8070";
     public static final String endPoint = "/dashboard/v1/login_api";

     public static HashMap<String, String> genarateheader(){
         HashMap<String, String> header = new HashMap<>();
         header.put("content-type","application/json");
         header.put("is_encrypted","true");
         return header;

     }

     public static HashMap<String, String> generateparam(){
         HashMap<String, String> param = new HashMap<>();
         param.put("origin","MS1hamlv");
         return param;
     }

     public static Response call_Post(HashMap<String,String> header,
                                  HashMap<String,String> params, String body,String uri){
         Response response = RestAssured.given().relaxedHTTPSValidation().headers(header).queryParams(params).
                 body(body).post(uri);
         return response;
     }
     public static String  generateUrl(String url){
         String base = url;
         return base;
     }

     public static String requestBody(){
         String body = "{\"payload\":{\"username\":\"NTk1OA==\",\"password\":\"NTk1OA==\"}}";
         return body;

     }
     public static void responseBody(){

     }

     public static void responseHeader(){

     }

     public static void responseCode(){

     }
}
