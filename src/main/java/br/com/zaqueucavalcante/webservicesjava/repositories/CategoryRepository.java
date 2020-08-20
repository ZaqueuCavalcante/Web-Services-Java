package br.com.zaqueucavalcante.webservicesjava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.zaqueucavalcante.webservicesjava.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
