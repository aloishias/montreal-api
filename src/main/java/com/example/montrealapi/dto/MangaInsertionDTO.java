package com.example.montrealapi.dto;

import lombok.Data;

@Data
public class MangaInsertionDTO {

    private String mangaTitle;
    private String mangaAuthor;
    private String mangaImageLink;
    private Integer mangaNumber;
    private Integer accountId;

}
