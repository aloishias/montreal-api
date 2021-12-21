package com.example.montrealapi.dao;

import com.example.montrealapi.entity.Manga;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface MangaDAO extends JpaRepository<Manga, Integer> {

    List<Manga> findAll();
    //Optional<Manga> findById(Integer id);
    Manga save(Manga manga);
    void delete(Manga manga);
}
