package com.baha.vetements.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.baha.vetements.entities.Type;

@RepositoryRestResource(path = "type")
@CrossOrigin("http://localhost:4200/") 
public interface TypeRepository extends JpaRepository<Type, Long>{

}
