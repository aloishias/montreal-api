package com.example.montrealapi.mapper;

import com.example.montrealapi.dto.AccountDTO;
import com.example.montrealapi.entity.Account;

public class AccountMapper {
    public static AccountDTO accountToAccountDTO(Account account){
        AccountDTO accountDTO = new AccountDTO();
        accountDTO.setAccountId(account.getAccountId());
        accountDTO.setAccountLogin(account.getAccountLogin());
        accountDTO.setAccountPassword(account.getAccountPassword());
        accountDTO.setAccountFirstName(account.getAccountFirstName());
        accountDTO.setAccountLastName(account.getAccountLastName());
        return accountDTO;
    }
}
