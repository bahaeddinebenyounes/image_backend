package com.baha.vetements.dto;

import java.util.Date;

import com.baha.vetements.entities.Type;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class VetementDTO {
	private Long idVetemnt;
	private String nomVetement;
	private Double prixVetement;
	private Date dateVetement; 
	private Type type;

}
