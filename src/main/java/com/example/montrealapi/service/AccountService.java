package com.example.montrealapi.service;

import com.example.montrealapi.dao.AccountDAO;
import com.example.montrealapi.dto.AccountDTO;
import com.example.montrealapi.entity.Account;
import com.example.montrealapi.mapper.AccountMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AccountService {

    @Autowired
    AccountDAO accountDAO;

    public List<AccountDTO> getAllAccount(){
        return accountDAO.findAll().stream()
                .map(AccountMapper :: accountToAccountDTO).collect(Collectors.toList());
    }

    public Account getAccountById(Integer id){
        return accountDAO.getAccountById(id);
    }

    public Account createAccount(Account account){
        if(account == null){
            return null;
        }

        return accountDAO.save(account);
    }

    public void deleteAccount(Account account){
        accountDAO.delete(account);
    }
}
