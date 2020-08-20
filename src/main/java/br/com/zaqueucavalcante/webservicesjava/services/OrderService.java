package br.com.zaqueucavalcante.webservicesjava.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.zaqueucavalcante.webservicesjava.entities.Order;
import br.com.zaqueucavalcante.webservicesjava.repositories.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository orderRepository;
	
	public List<Order> findAll() {
		return orderRepository.findAll();
	}
	
	public Order findById(Long id) {
		Optional<Order> entity = orderRepository.findById(id);
		return entity.get();
	}
}
