package advanceRest;

import model.LoginPayload;
import model.LoginRequest;
import model.optimisedModel.LoginReq;
import org.json.JSONObject;

import java.util.logging.Logger;

public class PojoReader {

    public LoginRequest loginRequestBuilder(String username,String password){
        LoginRequest login = new LoginRequest();
        LoginPayload payload = new LoginPayload();
        payload.setUsername(username);
        payload.setPassword(password);
        login.setPayload(payload);
        return login;
    }

//    public LoginRequest loginRequestBuilder_optimise(String username,String password){
//        LoginReq login = new LoginReq();
//
//        payload.setPassword(password);
//        login.setPayload(payload);
//        return login;
//    }


    //Convert pojo to String
    public void covertPojo_to_String(LoginRequest req){
        JSONObject jsonObject = new JSONObject(req);
        String json = jsonObject.toString();
        System.out.println(json);
    }

    public static void main(String[] args) {
        PojoReader pojo = new PojoReader();
        pojo.covertPojo_to_String(
                pojo.loginRequestBuilder("Deeptha","12345"));
    }
}
