package it.fp.securityexample.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import it.fp.securityexample.model.Role;


public interface RoleRepository extends JpaRepository<Role, Long>{

	Role findByName(String name);

}
