package com.example.montrealapi;

import com.example.montrealapi.dto.MangaDTO;
import com.example.montrealapi.entity.Manga;
import com.example.montrealapi.service.MangaService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class MontrealApiApplicationTests {

	@Autowired
	MangaService ms;

	@Test
	void contextLoads() {
	}

	@Test
	public void testGetMangaByIdRoute(){
		MangaDTO expected = new MangaDTO();
		expected.setMangaId(1);
		expected.setMangaAuthor("Akira Toriyama");
		expected.setMangaImageLink("https://www.glenat.com/sites/default/files/images/livres/couv/9782723434621-001-T.jpeg");
		expected.setMangaNumber(1);
		expected.setMangaTitle("Dragon Ball");

		MangaDTO result = ms.getMangaById(1);

		assertEquals(expected, result);
	}

}
