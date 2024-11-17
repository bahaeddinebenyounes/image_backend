package com.baha.vetements.service;

import java.io.IOException;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.baha.vetements.entities.Image;

@Service
public interface ImageService {
	Image uplaodImage(MultipartFile file) throws IOException; 
	Image uploadImageForVetement(MultipartFile file, Long idVetemnt) throws IOException;
    Image getImageDetails(Long id) throws IOException; 
    ResponseEntity<byte[]> getImage(Long id) throws IOException; 
    void deleteImage(Long id) ; 
    List<Image> getImagesParVet(Long prodId); 

    
   
}
