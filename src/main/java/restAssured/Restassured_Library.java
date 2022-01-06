package restAssured;

import com.sun.org.apache.xml.internal.utils.URI;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.RestAssured.*;

import java.util.HashMap;

public class Restassured_Library {

    private static final String BASE_URL="http://10.21.87.30:8070";
    private static String LOGIN="/dashboard/v1/login_api";


    public static HashMap<String,String> generateHeaders(){
        HashMap<String,String> header = new HashMap<>();
        header.put("content-type","application/json");
        header.put("is_encrypted","true");
        //
        return header;
    }
    public static HashMap<String,String> generateParmas(){
        HashMap<String,String> param = new HashMap<>();
        param.put("origin","MS1hamlv");
        return param;
    }
    public static String requestBody(){
        String body ="{\"payload\":{\"username\":\"NTk1OA==\",\"password\":\"NTk1OA==\"}}";
        return body;
    }
    public static void pojo(){}
    public  static void buildRequest(){}
    public static void sendRequest(){}
    public static Response call_POST(HashMap<String,String> header,
                                 HashMap<String,String> params, String body,String uri){
        Response response = RestAssured.given().relaxedHTTPSValidation().
                headers(header).queryParams(params).body(body).when()
                .post(uri);
    return response;
    }
    public static String generateUrl(String url){
        String base =url;
        return base;
    }
    public static String responseHeader(Response response){
        String token = response.getHeader("x-auth-token");
        System.out.println(token);
        return  token;
    }
    public static int responseCode(Response response){
        int statu = response.statusCode();
        System.out.println(statu);
        return statu;
    }
    public static void responseBody(Response response ){
        String responseBody = response.getBody().asString();
        System.out.println(responseBody);
    }


    public static void main(String[] args) {

        HashMap<String, String> headers = generateHeaders();
        HashMap<String, String> params = generateParmas();
        String url = generateUrl(BASE_URL +""+ LOGIN);
        String requestBody = requestBody();
        Response response = call_POST(headers, params, requestBody, url);
        responseCode(response);
        responseBody(response);
        String token =responseHeader(response);
    }


}
