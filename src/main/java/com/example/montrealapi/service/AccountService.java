package com.example.montrealapi.service;

import com.example.montrealapi.dao.AccountDAO;
import com.example.montrealapi.entity.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

    @Autowired
    AccountDAO accountDAO;

    public Account getAccountById(Integer id){
        return accountDAO.getAccountById(id);
    }

    public Account getAccountByLoginPassword(String login, String password){
        return accountDAO.getAccountByLoginPassword(login, password);
    }

}
