package com.example.montrealapi.service;

import com.example.montrealapi.dao.MangaDAO;
import com.example.montrealapi.dto.MangaDTO;
import com.example.montrealapi.entity.Manga;
import com.example.montrealapi.mapper.MangaMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MangaService {

    @Autowired
    MangaDAO mangaDAO;

    public List<MangaDTO> getAllManga(){
        return mangaDAO.findAll().stream()
                .map(MangaMapper :: mangaToMangaDTO).collect(Collectors.toList());
    }

    public Manga getMangaById(Integer id){
        return mangaDAO.getMangaById(id);
    }

    public List<MangaDTO> getMangaByAccountId(Integer id){
        return mangaDAO.getMangaByAccountId(id).stream()
                .map(MangaMapper ::mangaToMangaDTO).collect(Collectors.toList());
    }

    public Manga createManga(Manga manga) {
        if (manga == null)
            return null;

        return mangaDAO.save(manga);
    }

    public void deleteMangaById(Integer id){
        mangaDAO.deleteMangaById(id);
    }
}