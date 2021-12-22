package com.example.montrealapi.dao;

import com.example.montrealapi.entity.Manga;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface MangaDAO extends JpaRepository<Manga, Integer> {

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

    @Transactional
    @Modifying
    @Query(value = "insert into manga (\"manga_author\", \"manga_image_link\", \"manga_number\", \"manga_title\", \"account_id\") " +
            "values (:mangaAuthor , :mangaImageLink , :mangaNumber , :mangaTitle , :accountId) ; ",
            nativeQuery = true)
    void insertManga(@Param("mangaAuthor") String mangaAuthor,
                     @Param("mangaImageLink") String mangaImageLink,
                     @Param("mangaNumber") Integer mangaNumber,
                     @Param("mangaTitle") String mangaTitle,
                     @Param("accountId") Integer accountId);

    @Transactional
    @Modifying
    @Query(value = "delete " +
            "from manga " +
            "where manga_id = ?1 ; ",
            nativeQuery = true)
    void deleteMangaById(Integer id);

}
