package com.example.montrealapi.dto;

import lombok.Data;

@Data
public class MangaDTO {

    private Integer mangaId;
    private String mangaTitle;
    private String mangaAuthor;
    private String mangaImageLink;
    private Integer mangaNumber;

}
