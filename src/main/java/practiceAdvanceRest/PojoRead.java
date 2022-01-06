package practiceAdvanceRest;

import model.optimisedModel.LoginReq;
import practiceAdvanceRest.pojo.LoginPaylad;

public class PojoRead {

    public static void buildRequest(String username, String password){

        LoginReq log = new LoginReq();
        LoginPaylad logP = new LoginPaylad();
        logP.setPassword("");
        logP.setPassword("");
        log.setPayload(logP);

    }
}
