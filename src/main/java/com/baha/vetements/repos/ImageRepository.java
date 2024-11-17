package com.baha.vetements.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.baha.vetements.entities.Image;

public interface ImageRepository extends JpaRepository<Image , Long>  {

}
