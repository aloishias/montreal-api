package com.example.montrealapi.mapper;

import com.example.montrealapi.dto.MangaDTO;
import com.example.montrealapi.entity.Manga;

public class MangaMapper {
    public static MangaDTO mangaToMangaDTO(Manga manga){
        MangaDTO mangaDTO = new MangaDTO();
        mangaDTO.setMangaId(manga.getMangaId());
        mangaDTO.setMangaAuthor(manga.getMangaAuthor());
        mangaDTO.setMangaNumber(manga.getMangaNumber());
        mangaDTO.setMangaTitle(manga.getMangaTitle());
        mangaDTO.setMangaImageLink(manga.getMangaImageLink());
        return mangaDTO;
    }
}
