package com.example.montrealapi.service;

import com.example.montrealapi.dao.AccountDAO;
import com.example.montrealapi.dto.AccountDTO;
import com.example.montrealapi.entity.Account;
import com.example.montrealapi.mapper.AccountMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

    @Autowired
    AccountDAO accountDAO;

    public AccountDTO getAccountById(Integer id){
        return AccountMapper.accountToAccountDTO(accountDAO.getAccountById(id));
    }

    public AccountDTO getAccountByLoginPassword(String login, String password){
        return AccountMapper.accountToAccountDTO(accountDAO.getAccountByLoginPassword(login, password));
    }

}
