package br.com.tafarel.restapi.resources;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.tafarel.restapi.models.Categoria;
import br.com.tafarel.restapi.models.dao.CategoriaDao;

@RestController
public class CategoriaResource {

	@CrossOrigin
	@GetMapping("/categorias")
	public List<Categoria> findAll() {
		List<Categoria> categorias = new CategoriaDao().findAll();
		return categorias;
	}
}
