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
    @Query(value = "select * from manga m " +
            "inner join account a on m.account_id = a.account_id " +
            "where a.account_id = ?1 ; ",
            nativeQuery = true)
    List<Manga> getMangaByAccountId(Integer id);
    Manga save(Manga manga);
    void delete(Manga manga);
}
