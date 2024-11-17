package com.baha.vetements.restcontrollers;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.baha.vetements.entities.Vetement;
import com.baha.vetements.service.VetementService;


@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")
public class VetementRESTController {
	
	@Autowired
	VetementService vetementService;
	
	
	@RequestMapping(path="all",method = RequestMethod.GET)
	public List<Vetement> getAllVetements() {
		return vetementService.getAllVetements();
		} 

	@RequestMapping(value="/getbyid/{id}",method = RequestMethod.GET)
	public Vetement geVetementById(@PathVariable("id") Long id) {
	return vetementService.getVetement(id);
	 }
	
	@RequestMapping(path="addvet",method = RequestMethod.POST)
	public Vetement createVetement(@RequestBody Vetement vetement) {
		return vetementService.saveVetement(vetement);
	}
	
	@RequestMapping(path = "/updatevet",method = RequestMethod.PUT)
	public Vetement updateVetement(@RequestBody Vetement vetement) {
	    // Fetch vetement by id, update, and return updated VetementDTO
	    return vetementService.updateVetement(vetement);
	}

	
	@RequestMapping(value="/delvet/{id}",method = RequestMethod.DELETE)
	public void deleteVetement(@PathVariable("id") Long id)
	{
	vetementService.deleteVetementById(id);
	}

	@RequestMapping(value="/vetstype/{idType}",method = RequestMethod.GET)
	public List<Vetement> getVetementsByTypeId(@PathVariable("idType") Long idType) {
	return vetementService.findByTypeIdType(idType);
	}
	
	
	
}
