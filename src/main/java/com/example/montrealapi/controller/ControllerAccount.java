package com.example.montrealapi.controller;

import com.example.montrealapi.dto.AccountDTO;
import com.example.montrealapi.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/accounts")
public class ControllerAccount {

    @Autowired
    AccountService accountService;

    @GetMapping("/{id}")
    public AccountDTO getAccountById(@PathVariable Integer id){
        return accountService.getAccountById(id);
    }

    @GetMapping("/{login}/{password}")
    public AccountDTO getAccountByLoginPassword(@PathVariable String login, String password){
        return accountService.getAccountByLoginPassword(login, password);
    }

}
