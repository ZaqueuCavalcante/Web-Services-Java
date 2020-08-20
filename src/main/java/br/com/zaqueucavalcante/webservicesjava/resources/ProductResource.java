package br.com.zaqueucavalcante.webservicesjava.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.zaqueucavalcante.webservicesjava.entities.Product;
import br.com.zaqueucavalcante.webservicesjava.services.ProductService;

@RestController
@RequestMapping(value = "/products")
public class ProductResource {
	
	@Autowired
	private ProductService productService;
	
	// - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - //
	@GetMapping
	public ResponseEntity<List<Product>> findAll() {
		List<Product> productsList = productService.findAll();
		return ResponseEntity.ok().body(productsList);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Product> findById(@PathVariable Long id) {
		Product Product = productService.findById(id);
		return ResponseEntity.ok().body(Product);
	}

//	// - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - //
//	@PostMapping
//	public ResponseEntity<Product> insert(@RequestBody Product obj) {
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
//	public ResponseEntity<Product> update(@PathVariable Long id, @RequestBody Product obj) {
//		obj = service.update(id, obj);
//		return ResponseEntity.ok().body(obj);
//	}
}
