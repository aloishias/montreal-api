package com.example.montrealapi.DTO;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "manga")
@Getter
@Setter
public class MangaDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String title;
    private String author;
    private String linkImage;
    private Integer number;

}
