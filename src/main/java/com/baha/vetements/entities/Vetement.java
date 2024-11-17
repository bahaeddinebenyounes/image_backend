package com.baha.vetements.entities;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Vetement {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idVetemnt;
	private String nomVetement;
	private Double prixVetement;
	private Date dateVetement; 
	
	@ManyToOne
	private Type type;
	
	
	/**
	  @OneToOne 
	  @JoinColumn(name = "image_id_image", referencedColumnName = "idImage")
	  private Image image;
	**/
	
	@OneToMany(mappedBy="vetement")
	private List<Image> images;
	  
	  
	
	
	public Vetement() {
	super();
	}
	
	public Vetement(String nomVetement, Double prixVetement, Date dateVetement) {
		super();
		this.nomVetement = nomVetement;
		this.prixVetement = prixVetement;
		this.dateVetement = dateVetement;
		}
	
	
	
	public Long getIdVetemnt() {
		return idVetemnt;
	}

	public Double getPrixVetement() {
		return prixVetement;
	}

	public Long getIdVetement() {
		return idVetemnt;
	}

	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}
	
	public void setIdVetemnt(Long idVetemnt) {
		this.idVetemnt = idVetemnt;
	}
	public String getNomVetement() {
		return nomVetement;
	}
	public void setNomVetement(String nomVetement) {
		this.nomVetement = nomVetement;
	}
	public Double vetement() {
		return prixVetement;
	}
	public void setPrixVetement(Double prixVetement) {
		this.prixVetement = prixVetement;
	}
	public Date getDateVetement() {
		return dateVetement;
	}
	public void setDateVetement(Date dateVetement) {
		this.dateVetement = dateVetement;
	}
	
	
	public List<Image> getImages() {
		return images;
	}

	public void setImages(List<Image> images) {
		this.images = images;
	}

	/**
	  public Image getImage() {
	        return image;
	    }

	    public void setImage(Image image) {
	        this.image = image;
	    }
	    */
	@Override
	public String toString() {
		return "Vetement [idVetemnt=" + idVetemnt + ", nomVetement=" + nomVetement + ", prixVetement=" + prixVetement
				+ ", dateVetement=" + dateVetement + "]";
	}

}
