package advanceRest;

import io.restassured.response.Response;

public class RunRestApi {

    public static void main(String[] args) {

        RestController rest = new RestImplementation();
        Response response = rest.buildRequest(rest.getHeaders(),
                null,"",
                rest.generateUrl(Constants.BASEURL,Constants.LOGIN_API));
    }
}
