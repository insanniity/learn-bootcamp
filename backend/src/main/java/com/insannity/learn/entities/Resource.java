package com.insannity.learn.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.insannity.learn.entities.enums.ResourceType;


@Entity
@Table(name = "tbl_resources")
public class Resource implements Serializable{    
    
    private static final long serialVersionUID = 1L;

    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	private String title;
	private String description;
	private Integer position;
	private String imgUri;
	private ResourceType type;

    @ManyToOne
	@JoinColumn(name = "offer_id")
    private Offer offer;


    public Resource() {
    }


    public Resource(Long id, String title, String description, Integer position, String imgUri, ResourceType type, Offer offer) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.position = position;
        this.imgUri = imgUri;
        this.type = type;
        this.offer = offer;
    }


    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getPosition() {
        return this.position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public String getImgUri() {
        return this.imgUri;
    }

    public void setImgUri(String imgUri) {
        this.imgUri = imgUri;
    }

    public ResourceType getType() {
        return this.type;
    }

    public void setType(ResourceType type) {
        this.type = type;
    }

    public Offer getOffer() {
        return this.offer;
    }

    public void setOffer(Offer offer) {
        this.offer = offer;
    }


    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Resource)) {
            return false;
        }
        Resource resource = (Resource) o;
        return Objects.equals(id, resource.id) && Objects.equals(title, resource.title) && Objects.equals(description, resource.description) && Objects.equals(position, resource.position) && Objects.equals(imgUri, resource.imgUri) && Objects.equals(type, resource.type) && Objects.equals(offer, resource.offer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, description, position, imgUri, type, offer);
    }
    


}
