package model;

import lombok.Data;

@Data
public class LoginPayload {
    /**
     * "payload": {
     *   "username": "NTk1OA==",
     *  "password": "NTk1OA=="
     *   }
     */
    private String username;
    private String password;
}
