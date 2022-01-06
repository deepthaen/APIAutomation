package aPIPractice;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import java.util.HashMap;

public class ModularPractice1 {

    public static final  String BASEURL="";
    public static final String ENDPOINT = "";

public static HashMap<String , String> genearateheader(){
    HashMap<String, String > header = new HashMap<>();
    header.put("", "");
    header.put("", "");
    return  header;
}

    public static HashMap<String , String> genearateparams(){
        HashMap<String, String > params = new HashMap<>();
        params.put("", "");
        params.put("", "");
        return  params;
    }

    public static String requestBody(){
    String body = "" ;
    return body;
    }

    public  static  String generateUrl(String url){
    String base = url;
    return base;
    }
    public static Response doPost(HashMap<String, String> headers, HashMap<String, String> paramss,
                              String body, String url){

      Response response =   RestAssured.given().relaxedHTTPSValidation().headers(headers).queryParams(paramss).
                body(body).post(url);
      return response;

    }

    public static String getHeaders(Response response){
    String token = response.getHeader("");
        System.out.println(token);
    return token;
    }

    public static String responseMessage(Response response){
    String mes = response.getBody().asString();
        System.out.println(mes);
        return  mes;
    }

    public static int responseCode(Response response){
    int code = response.getStatusCode();
        System.out.println(code);
        return code;
    }


    public static void main(String[] args) {
        HashMap<String, String> headers = genearateheader();
        HashMap<String, String> paramss = genearateparams();
        String reqBody = requestBody();
        String url = generateUrl(BASEURL+ENDPOINT);
        doPost(headers,paramss,reqBody, url);
        responseCode(r)
    }
}
