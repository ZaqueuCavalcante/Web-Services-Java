package br.com.zaqueucavalcante.webservicesjava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.zaqueucavalcante.webservicesjava.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
