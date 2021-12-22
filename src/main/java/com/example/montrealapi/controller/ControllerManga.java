package com.example.montrealapi.controller;

import com.example.montrealapi.dto.MangaDTO;
import com.example.montrealapi.dto.MangaInsertionDTO;
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

    @GetMapping("/{id}")
    public MangaDTO getMangaById(@PathVariable Integer id){
        return mangaService.getMangaById(id);
    }

    @PostMapping
    public ResponseEntity createManga(@RequestBody MangaInsertionDTO mangaInsertionDTO){
        mangaService.createManga(mangaInsertionDTO);
        return ResponseEntity.ok(HttpStatus.resolve(201));
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
