package br.com.zaqueucavalcante.webservicesjava.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.zaqueucavalcante.webservicesjava.entities.Category;
import br.com.zaqueucavalcante.webservicesjava.repositories.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository categoryRepository;
	
	public List<Category> findAll() {
		return categoryRepository.findAll();
	}
	
	public Category findById(Long id) {
		Optional<Category> entity = categoryRepository.findById(id);
		return entity.get();
	}
}
