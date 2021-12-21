package com.example.montrealapi.controller;

import com.example.montrealapi.dto.AccountDTO;
import com.example.montrealapi.entity.Account;
import com.example.montrealapi.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/accounts")
public class ControllerAccount {

    @Autowired
    AccountService accountService;

    @GetMapping
    public List<AccountDTO> getAllAccount(){
        return accountService.getAllAccount();
    }

    @GetMapping("/{id}")
    public Account getAccountById(@PathVariable Integer id){
        return accountService.getAccountById(id);
    }

    @PostMapping
    public ResponseEntity createAccount(@RequestBody Account account){
        accountService.createAccount(account);
        return ResponseEntity.ok(HttpStatus.CREATED);
    }
}
