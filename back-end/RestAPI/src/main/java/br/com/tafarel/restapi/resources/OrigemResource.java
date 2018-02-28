package br.com.tafarel.restapi.resources;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.tafarel.restapi.models.Origem;
import br.com.tafarel.restapi.models.dao.OrigemDao;

@RestController
public class OrigemResource {

	@CrossOrigin
	@GetMapping("/origens")
	public List<Origem> findAll() {
		List<Origem> origens = new OrigemDao().findAll();
		return origens;
	}
}
