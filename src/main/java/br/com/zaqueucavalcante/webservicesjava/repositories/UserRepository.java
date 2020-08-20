package br.com.zaqueucavalcante.webservicesjava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.zaqueucavalcante.webservicesjava.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
