package com.example.montrealapi.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "manga")
@Data
public class Manga implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer mangaId;
    private String mangaTitle;
    private String mangaAuthor;
    private String mangaImageLink;
    private Integer mangaNumber;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="accountId", nullable=false)
    @JsonIgnore
    private Account account;

}
