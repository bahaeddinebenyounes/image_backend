package com.baha.vetements.service;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baha.vetements.dto.VetementDTO;
import com.baha.vetements.entities.Type;
import com.baha.vetements.entities.Vetement;
import com.baha.vetements.repos.ImageRepository;
import com.baha.vetements.repos.VetementRepository;

@Service
public class VetementServiceImpl implements VetementService {
	
	@Autowired
	VetementRepository vetementRepository;
	
	@Autowired
	ModelMapper modelMapper;
	
	@Autowired
	ImageRepository imageRepository;


	@Override
	public void deleteVetement(Vetement p) {
		vetementRepository.delete(p);
		
	}

	@Override
	public void deleteVetementById(Long id) {
		// TODO Auto-generated method stub
		vetementRepository.deleteById(id);
	}

	


	@Override
	public List<Vetement> findByNomVetement(String nom) {
		// TODO Auto-generated method stub
		return vetementRepository.findByNomVetement(nom);
	}

	@Override
	public List<Vetement> findByNomVetementContains(String nom) {
		// TODO Auto-generated method stub
		return vetementRepository.findByNomVetementContains(nom);
	}

	@Override
	public List<Vetement> findByNomPrix(String nom, Double prix) {
		// TODO Auto-generated method stub
		return vetementRepository.findByNomPrix(nom, prix);
	}

	@Override
	public List<Vetement> findByType(Type type) {
		// TODO Auto-generated method stub
		return vetementRepository.findByType(type);
	}
	
	
	@Override
	public List<Vetement> findByTypeIdType(Long id) {
		return vetementRepository.findByTypeIdType(id);
	}



	@Override
	public List<Vetement> findByOrderByNomVetementAsc() {
		// TODO Auto-generated method stub
		return vetementRepository.findByOrderByNomVetementAsc();
	}

	@Override
	public List<Vetement> trierVetementsNomsPrix() {
		// TODO Auto-generated method stub
		return vetementRepository.trierVetementsNomsPrix();
	}

	@Override
	public Vetement saveVetement(Vetement p) {
		return vetementRepository.save(p);
	}

	@Override
	public Vetement updateVetement(Vetement p) {
	//	Long oldVetImageId = 
		//		this.getVetement(p.getIdVetemnt()).getImage().getIdImage(); 
			//	  Long newProdImageId = p.getImage().getIdImage(); 
				   
				  Vetement vetUpdated = vetementRepository.save(p); 
				   
			//	  if (oldVetImageId != newProdImageId) //si l'image a été modifiée 
		//		   imageRepository.deleteById(oldVetImageId); 
				   
				  return vetUpdated; 
				 }



	@Override
	public Vetement getVetement(Long id) {
		return vetementRepository.findById(id).get();

	}

	@Override
	public List<Vetement> getAllVetements() {
		return vetementRepository.findAll();

	}


	


	
}
