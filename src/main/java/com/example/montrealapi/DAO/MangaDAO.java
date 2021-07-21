package com.example.montrealapi.DAO;

import com.example.montrealapi.DTO.MangaDTO;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MangaDAO extends JpaRepository<MangaDTO, Integer> {

    /**
     * return list of a manga
     *
     * @return
     */
    List<MangaDTO> findAll();

    MangaDTO save(MangaDTO manga);
}
