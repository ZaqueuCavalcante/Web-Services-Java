package br.com.zaqueucavalcante.webservicesjava.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.zaqueucavalcante.webservicesjava.entities.Product;
import br.com.zaqueucavalcante.webservicesjava.repositories.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;
	
	public List<Product> findAll() {
		return productRepository.findAll();
	}
	
	public Product findById(Long id) {
		Optional<Product> entity = productRepository.findById(id);
		return entity.get();
	}
}
