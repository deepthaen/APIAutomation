package advanceRest;

import io.restassured.http.Header;
import io.restassured.response.Response;

import java.util.HashMap;

public interface RestController {


    String  generateUrl(String baseUrl,String endPoint);
    Header generateHeader(String key,String value);
    HashMap<String,String> getHeaders();
    Response buildRequest(HashMap<String,String> headers,HashMap<String,String> params,
                          String body,String url);

}
