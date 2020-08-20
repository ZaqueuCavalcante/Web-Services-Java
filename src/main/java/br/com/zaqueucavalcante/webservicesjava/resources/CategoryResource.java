package br.com.zaqueucavalcante.webservicesjava.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.zaqueucavalcante.webservicesjava.entities.Category;
import br.com.zaqueucavalcante.webservicesjava.services.CategoryService;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {
	
	@Autowired
	private CategoryService categoryService;
	
	// - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - //
	@GetMapping
	public ResponseEntity<List<Category>> findAll() {
		List<Category> categoriesList = categoryService.findAll();
		return ResponseEntity.ok().body(categoriesList);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Category> findById(@PathVariable Long id) {
		Category category = categoryService.findById(id);
		return ResponseEntity.ok().body(category);
	}

//	// - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - //
//	@PostMapping
//	public ResponseEntity<Category> insert(@RequestBody Category obj) {
//		obj = service.insert(obj);
//		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
//				.buildAndExpand(obj.getId()).toUri();
//		return ResponseEntity.created(uri).body(obj);
//	}
//	
//	// - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - //
//	@DeleteMapping(value = "/{id}")
//	public ResponseEntity<Void> delete(@PathVariable Long id) {
//		service.delete(id);
//		return ResponseEntity.noContent().build();
//	}
//	
//	// - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - //
//	@PutMapping(value = "/{id}")
//	public ResponseEntity<Category> update(@PathVariable Long id, @RequestBody Category obj) {
//		obj = service.update(id, obj);
//		return ResponseEntity.ok().body(obj);
//	}
}
