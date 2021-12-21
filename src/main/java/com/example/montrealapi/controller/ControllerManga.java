package com.example.montrealapi.controller;

import com.example.montrealapi.dto.MangaDTO;
import com.example.montrealapi.entity.Manga;
import com.example.montrealapi.service.MangaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mangas")
public class ControllerManga {

    @Autowired
    MangaService mangaService;

    @GetMapping
    public List<MangaDTO> getAllManga() {
        return mangaService.getAllManga();
    }

    @GetMapping("/{id}")
    public Manga getMangaById(@PathVariable Integer id){
        return mangaService.getMangaById(id);
    }

    @PostMapping
    public ResponseEntity createManga(@RequestBody Manga manga){
        mangaService.createManga(manga);
        return ResponseEntity.ok(HttpStatus.CREATED);
    }

    @GetMapping("/byAccount/{id}")
    public List<MangaDTO> getMangaByAccountId(@PathVariable Integer id){
        return mangaService.getMangaByAccountId(id);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteMangaById(@PathVariable Integer id){
        mangaService.deleteMangaById(id);
        return ResponseEntity.ok(HttpStatus.resolve(204));
    }

}
