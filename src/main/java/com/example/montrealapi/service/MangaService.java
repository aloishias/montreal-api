package com.example.montrealapi.service;

import com.example.montrealapi.dao.MangaDAO;
import com.example.montrealapi.dto.MangaDTO;
import com.example.montrealapi.dto.MangaInsertionDTO;
import com.example.montrealapi.mapper.MangaMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MangaService {

    @Autowired
    MangaDAO mangaDAO;

    public MangaDTO getMangaById(Integer id){
        return MangaMapper.mangaToMangaDTO(mangaDAO.getMangaById(id));
    }

    public List<MangaDTO> getMangaByAccountId(Integer id){
        return mangaDAO.getMangaByAccountId(id).stream()
                .map(MangaMapper :: mangaToMangaDTO).collect(Collectors.toList());
    }

    public void createManga(MangaInsertionDTO mangaInsertionDTO) {
        if (mangaInsertionDTO != null)
            mangaDAO.insertManga(mangaInsertionDTO.getMangaAuthor(),
                    mangaInsertionDTO.getMangaImageLink(),
                    mangaInsertionDTO.getMangaNumber(),
                    mangaInsertionDTO.getMangaTitle(),
                    mangaInsertionDTO.getAccountId());
    }

    public void deleteMangaById(Integer id){
        mangaDAO.deleteMangaById(id);
    }

}