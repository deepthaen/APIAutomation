package practiceAdvanceRest;

import java.util.HashMap;

public class RestImplemention implements RestCOntrollers{
    @Override
    public HashMap<String, String> generateHeaders(String key, String val) {
        HashMap<String, String> headers = new HashMap<>();
        headers.put("", "");
        headers.put("", "");
        return headers;
    }

    @Override
    public HashMap<String, String> generateParams(String key, String val) {
        HashMap<String, String> params = new HashMap<>();
        params.put("", "");

        return params;
    }

    @Override
    public String requestBody() {
        return null;
    }

    @Override
    public String genearateURL(String baseurl, String endpoint) {
       String url = Constants.BASE_URL+Constants.ENDPOINT;
        return url;
    }

    @Override
    public String doPostCall(HashMap<String, String> headers, HashMap<String, String> params, String body, String url) {
        return null;
    }
}
