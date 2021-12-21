package com.example.montrealapi.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "account")
@Data
public class Account implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer accountId;
    private String accountFirstName;
    private String accountLastName;
    private String accountLogin;
    private String accountPassword;
    @OneToMany(mappedBy="account")
    @JsonIgnore
    private Set<Manga> mangas;

}
