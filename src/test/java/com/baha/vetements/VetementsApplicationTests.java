package com.baha.vetements;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.baha.vetements.entities.Vetement;
import com.baha.vetements.repos.VetementRepository;

@SpringBootTest
class VetementsApplicationTests {
	@Test
	void contextLoads() {
	}
	
	VetementRepository vetementRepository;
	@Test
	public void testfindByNomPrix()
	{
	List<Vetement> prods = vetementRepository.findByNomPrix("gucci",1234.0);
	for (Vetement p : prods)
	{
	System.out.println(p);
	}
	}
	@Test
	 public void testCreateVetement() {
		Vetement prod = new Vetement("PC Dell3",2200.500,new Date());
		vetementRepository.save(prod);
	}	
	

}
