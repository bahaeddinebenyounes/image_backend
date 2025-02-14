package com.baha.vetements.service;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.baha.vetements.entities.Image;
import com.baha.vetements.entities.Vetement;
import com.baha.vetements.repos.ImageRepository;
import com.baha.vetements.repos.VetementRepository;


@Service
public class ImageServiceImpl implements ImageService{
	
	
	@Autowired 
    ImageRepository imageRepository; 
	
	 @Autowired 
	 VetementService vetementService; 
	
	 @Autowired
	 VetementRepository vetementRepository;
	 
	@Override
	public Image uplaodImage(MultipartFile file) throws IOException {
		 return imageRepository.save(Image.builder() 
	                .name(file.getOriginalFilename()) 
	                .type(file.getContentType()) 
	                .image(file.getBytes()).build() );
	}

	@Override
	public Image getImageDetails(Long id) throws IOException {
		 final Optional<Image> dbImage = imageRepository. findById (id); 
		 
	        return Image.builder() 
	                .idImage(dbImage.get().getIdImage()) 
	                .name(dbImage.get().getName()) 
	                .type(dbImage.get().getType()) 
	                .image(dbImage.get().getImage()).build() ; 
	}

	@Override
	public ResponseEntity<byte[]> getImage(Long id) throws IOException {
		  final Optional<Image> dbImage = imageRepository. findById (id); 
		  
	        return ResponseEntity 
	                .ok() 
	                .contentType(MediaType.valueOf(dbImage.get().getType())) 
	                .body(dbImage.get().getImage()); 
	}

	@Override
	public void deleteImage(Long id) {
		imageRepository.deleteById(id); 
		
	}

	@Override
	public Image uploadImageForVetement(MultipartFile file, Long idVetemnt) throws IOException {
		Vetement p = new Vetement(); 
		  p.setIdVetemnt(idVetemnt); 
		  return imageRepository.save(Image.builder() 
		                .name(file.getOriginalFilename()) 
		                .type(file.getContentType()) 
		                .image(file.getBytes()) 
		                .vetement(p).build() ); 
		 }

	@Override
	public List<Image> getImagesParVet(Long vetId) {
		Vetement p = vetementRepository.findById(vetId).get(); 
		  return p.getImages();
	}

	
}
