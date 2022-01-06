package advanceRest;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.response.Response;

import java.util.HashMap;

public class RestImplementation implements  RestController{
    @Override
    public String generateUrl(String baseUrl, String endPoint) {
        return baseUrl+endPoint;
    }

    @Override
    public Header generateHeader(String key, String value) {
        return null;
    }

    @Override
    public HashMap<String, String> getHeaders() {
        HashMap<String,String> header = new HashMap<>();
        header.put("content-type","application/json");
        return header;
    }

    @Override
    public Response buildRequest(HashMap<String, String> headers, HashMap<String, String> params, String body, String url) {
        return  RestAssured.given().relaxedHTTPSValidation().
                headers(headers).queryParams(params).body(body).when()
                .post(url);
    }
}
