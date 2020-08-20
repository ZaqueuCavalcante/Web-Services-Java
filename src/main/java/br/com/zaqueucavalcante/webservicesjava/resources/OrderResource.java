package br.com.zaqueucavalcante.webservicesjava.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.zaqueucavalcante.webservicesjava.entities.Order;
import br.com.zaqueucavalcante.webservicesjava.services.OrderService;

@RestController
@RequestMapping(value = "/orders")
public class OrderResource {
	
	@Autowired
	private OrderService OrderService;
	
	// - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - //
	@GetMapping
	public ResponseEntity<List<Order>> findAll() {
		List<Order> ordersList = OrderService.findAll();
		return ResponseEntity.ok().body(ordersList);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Order> findById(@PathVariable Long id) {
		Order order = OrderService.findById(id);
		return ResponseEntity.ok().body(order);
	}

//	// - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - //
//	@PostMapping
//	public ResponseEntity<Order> insert(@RequestBody Order obj) {
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
//	public ResponseEntity<Order> update(@PathVariable Long id, @RequestBody Order obj) {
//		obj = service.update(id, obj);
//		return ResponseEntity.ok().body(obj);
//	}
}
