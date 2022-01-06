package model.optimisedModel;

import lombok.Data;
@Data
public class LoginReq {
    private Payload payload;


    @Data
    class Payload{
        private String username;
        private String password;
    }
}

