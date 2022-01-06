package practice2;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import java.util.HashMap;

public class ModularAPI {

    public  static final String BASEURL ="";
    public static final String Login = "";

    public static HashMap<String , String> generateheader(){
        HashMap<String, String> header = new HashMap<>();
        header.put("", "");
        header.put("", "");
        return header;

    }

    public static HashMap<String , String> generateparam(){
        HashMap<String, String> param = new HashMap<>();
        param.put("", "");
        param.put("", "");
        return param;

    }

    public static String fetechUrl(String url){
        String baseurl = url;
        return baseurl;
    }

    public static String requestBody(){
        String body = "";
        return body;
    }

    public static Response doPostCall(HashMap<String , String> header, HashMap<String, String> params
                                     String body, String url){
    Response response =    RestAssured.given().relaxedHTTPSValidation().headers(header).queryParams(params).
                                      body(body).post(url);
        return response;
    }

    public static int statusCode(Response response){
        int code = response.statusCode();
        return code;
    }

    public static String responseMessage(Response response){
        String mess = response.getBody().asString();
        return mess;
    }

    public static String responseHeader(Response response){
        String token = response.getHeader("");
        System.out.println(token);
        return token;
    }

    public static void main(String[] args) {
        HashMap<String, String > headers = generateheader();
        HashMap<String , String > params = generateparam();
        String body = requestBody();
        String url = fetechUrl(BASEURL+Login);
        Response response = doPostCall(headers,params,body,url);
        responseMessage(response);
        statusCode(response);
        String token = generateheader(response);
    }
}
