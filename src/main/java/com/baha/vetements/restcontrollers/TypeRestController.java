package com.baha.vetements.restcontrollers;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.baha.vetements.entities.Type;
import com.baha.vetements.repos.TypeRepository;


@RestController
@RequestMapping("/api/type")
@CrossOrigin("*")
public class TypeRestController {

	
	@Autowired
	TypeRepository typeRepository;
	@RequestMapping(method=RequestMethod.GET)
	public List<Type> getAllGenres()
	{
	return typeRepository.findAll();
	}
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public Type getTypeeById(@PathVariable("id") Long id) {
	return typeRepository.findById(id).get();
	}
}
