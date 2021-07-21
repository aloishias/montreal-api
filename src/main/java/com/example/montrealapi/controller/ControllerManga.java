package com.example.montrealapi.controller;

import com.example.montrealapi.DAO.MangaDAO;
import com.example.montrealapi.DTO.MangaDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ControllerManga {

    @Autowired
    private MangaDAO mangaDAO;

    @GetMapping("/Marco")
    public String getMarco(){
        return "Polo";
    }

    @GetMapping("/mangas")
    public List<MangaDTO> findAll(Model model) {
        List<MangaDTO> listManga = mangaDAO.findAll();
        return listManga;
    }

    @PostMapping("/manga")
    public ResponseEntity createManga(@RequestBody MangaDTO mangaDTO){
        mangaDAO.save(mangaDTO);
        return ResponseEntity.ok(HttpStatus.OK);
    }
}
