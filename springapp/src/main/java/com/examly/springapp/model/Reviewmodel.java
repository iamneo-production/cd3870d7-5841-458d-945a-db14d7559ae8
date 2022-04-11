package com.examly.springapp.model;

import javax.persistence.Column;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="review")
public class Reviewmodel {

	
@Id
@GenericGenerator(name="UUID",strategy="org.hibernate.id.UUIDGenerator")
@GeneratedValue(generator="UUID")
private String ratingId;
	
	@Column(length=50)
	private String ratingDescription;
	
	//private String ratingsValue;
	
	public Reviewmodel(String ratingDescription) {
		
		this.ratingDescription = ratingDescription;
		//this.ratingsValue = ratingsValue;
	}
	public Reviewmodel()
	{
	
		
		
		
		
		
		
		
		
	}
	public Reviewmodel(String ratingId, String ratingDescription) {
		super();
		this.ratingId = ratingId;
		this.ratingDescription = ratingDescription;
		//this.ratingsValue = ratingsValue;
	}
	
	
	
	
	

	public String getRatingId() {
		return ratingId;
	}
	
	
	
	
	
	
	
	
	public void setRatingId(String ratingId) {
		this.ratingId = ratingId;
	}
	
	
	
	
	
	public String getRatingDescription() {
		return ratingDescription;
	}
	
	
	
	
	
	public void setRatingDescription(String ratingDescription) {
		this.ratingDescription = ratingDescription;
	}
	
	
	
	
	
	
	//public String getRatingsValue() {
		//return ratingsValue;
	//}
	//public void setRatingsValue(String ratingsValue) {
		//this.ratingsValue = ratingsValue;
	//}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
