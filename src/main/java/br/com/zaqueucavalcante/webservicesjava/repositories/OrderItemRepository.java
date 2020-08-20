package br.com.zaqueucavalcante.webservicesjava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.zaqueucavalcante.webservicesjava.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
