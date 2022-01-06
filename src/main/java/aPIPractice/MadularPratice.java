package aPIPractice;

import io.restassured.RestAssured;
import io.restassured.response.Response;


import java.util.HashMap;

public class MadularPratice {

    public static final String BASE_URL ="";
    public static final String END_POINT = "";

    public static HashMap<String, String>  genearteheader(){
        HashMap<String, String > header = new HashMap<>();
        header.put("", "");
        header.put("", "");
        return header;

    }

    public static HashMap<String, String> generateparam(){
        HashMap<String, String> params = new HashMap<>();
        params.put("", "");
        return  params;
    }

    public static String requestBody(){
        String body = "{\"payload\":{\"username\":\"NTk1OA==\",\"password\":\"NTk1OA==\"}}";
        return body;
    }

    public static String geturl(String url){
        String base = url;
        return base;
    }

    public static Response postCall(HashMap<String, String> header, HashMap<String,String> params,
                                String body, String url){
        Response response = RestAssured.given().relaxedHTTPSValidation().
                                headers(header).queryParams(params).body(body).
                                   when().get(url);

        return response;
    }

    public static int statusCode(Response response){
        int code = response.getStatusCode();
        System.out.println(code);
        return code;
    }

    public static String responseMessage(Response response){
        String message = response.getBody().asString();
        System.out.println(message);
        return message;
    }
    public static String responseHeader(Response response){
        String token = response.getHeader("x-auth-token");
        System.out.println(token);
        return  token;
    }

    public static void main(String[] args) {
        HashMap<String, String> headers = genearteheader();
        HashMap<String, String> paramss = generateparam();
        String url = (BASE_URL+END_POINT);
        String body = requestBody();
        Response response = postCall(headers,paramss,body,url);
        statusCode(response);
        responseMessage(response);
        String token = responseHeader(response);
        responseMessage(response);
        statusCode(response);

    }
}
