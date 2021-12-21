package com.example.montrealapi.dao;

import com.example.montrealapi.entity.Manga;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MangaDAO extends JpaRepository<Manga, Integer> {

    List<Manga> findAll();
    @Query(value = "select * " +
            "from manga m " +
            "where m.manga_id = ?1 ; ",
            nativeQuery = true)
    Manga getMangaById(Integer id);
    Manga save(Manga manga);
    void delete(Manga manga);
}
