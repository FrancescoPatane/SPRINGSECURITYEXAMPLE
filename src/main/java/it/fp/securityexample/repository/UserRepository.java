package it.fp.securityexample.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import it.fp.securityexample.model.User;



public interface  UserRepository extends JpaRepository<User, Long>{

	 User findByEmail(String email);
}
