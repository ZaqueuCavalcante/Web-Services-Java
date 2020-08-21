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
}
