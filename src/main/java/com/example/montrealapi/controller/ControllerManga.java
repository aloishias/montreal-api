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

    @PostMapping
    public ResponseEntity createManga(@RequestBody Manga manga){
        mangaService.createManga(manga);
        return ResponseEntity.ok(HttpStatus.CREATED);
    }

}
