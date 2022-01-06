package practiceAdvanceRest;

import java.util.HashMap;

public interface RestCOntrollers {

     HashMap<String, String> generateHeaders(String key, String val) ;
     HashMap<String, String> generateParams(String key, String val);
     String requestBody();
     String genearateURL(String baseurl, String endPoint);
     String doPostCall(HashMap<String, String> headers, HashMap<String, String> params,
                       String body, String url);



}
