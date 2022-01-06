package com.example.montrealapi;

import com.example.montrealapi.dto.AccountDTO;
import com.example.montrealapi.dto.MangaDTO;
import com.example.montrealapi.service.AccountService;
import com.example.montrealapi.service.MangaService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class MontrealApiApplicationTests {

	@Autowired
	MangaService ms;

	@Autowired
	AccountService as;

	@Test
	void contextLoads() {
	}

	@Test
	public void testGetMangaById(){
		MangaDTO expected = new MangaDTO();
		expected.setMangaId(1);
		expected.setMangaAuthor("Akira Toriyama");
		expected.setMangaImageLink("https://www.glenat.com/sites/default/files/images/livres/couv/9782723434621-001-T.jpeg");
		expected.setMangaNumber(1);
		expected.setMangaTitle("Dragon Ball");

		MangaDTO result = ms.getMangaById(1);

		assertEquals(expected, result);
	}

	@Test
	public void testGetMangaByAccountId(){
		List<MangaDTO> expecteds = new ArrayList<>();
		MangaDTO expected = new MangaDTO();
		expected.setMangaId(3);
		expected.setMangaAuthor("Hirohiko Araki");
		expected.setMangaImageLink("https://images-na.ssl-images-amazon.com/images/I/8118ISrjhxL.jpg");
		expected.setMangaNumber(1);
		expected.setMangaTitle("Jojo's Bizar Adventure");

		expecteds.add(expected);

		List<MangaDTO> results = ms.getMangaByAccountId(2);

		assertEquals(expecteds, results);
	}

	@Test
	public void testGetAccountById(){
		AccountDTO expected = new AccountDTO();
		expected.setAccountLastName("Hias");
		expected.setAccountId(1);
		expected.setAccountFirstName("Aloïs");
		expected.setAccountLogin("root");
		expected.setAccountPassword("root");

		AccountDTO result = as.getAccountById(1);

		assertEquals(expected, result);
	}

	@Test
	public void testGetAccountByLoginPassword(){
		AccountDTO expected = new AccountDTO();
		expected.setAccountLastName("Hias");
		expected.setAccountId(1);
		expected.setAccountFirstName("Aloïs");
		expected.setAccountLogin("root");
		expected.setAccountPassword("root");

		AccountDTO result = as.getAccountByLoginPassword("root", "root");

		assertEquals(expected, result);
	}

}