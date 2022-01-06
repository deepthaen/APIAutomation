package model;

import lombok.Data;

@Data
public class LoginRequest {

    /**
     * {
     *     "payload": {
     *         "username": "NTk1OA==",
     *         "password": "NTk1OA=="
     *     }
     * }
     */

    private LoginPayload payload;


}
