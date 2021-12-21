package com.example.montrealapi.dto;

import lombok.Data;

@Data
public class AccountDTO {

    private Integer accountId;
    private String accountFirstName;
    private String accountLastName;
    private String accountLogin;
    private String accountPassword;

}
