package br.com.zaqueucavalcante.webservicesjava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.zaqueucavalcante.webservicesjava.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
