package com.example.montrealapi.dao;

import com.example.montrealapi.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AccountDAO extends JpaRepository<Account, Integer> {

    List<Account> findAll();
    @Query(value = "select * " +
            "from account a " +
            "where a.account_id = ?1 ; ",
            nativeQuery = true)
    Account getAccountById(Integer id);
    @Query(value = "select * " +
            "from account a " +
            "where a.account_login = ?1 " +
            "and a.account_password = ?2 ; ",
            nativeQuery = true)
    Account getAccountByLoginPassword(String login, String password);
    Account save(Account account);
    void delete(Account account);

}
