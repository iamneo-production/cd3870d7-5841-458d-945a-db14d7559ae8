package com.examly.springapp.controller;

import org.springframework.beans.factory.annotation.Autowired;



import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.examly.springapp.service.ReviewService;
import com.examly.springapp.model.Reviewmodel;

@RestController

public class ReviewController {

	
	
	
	
	@Autowired
	private ReviewService reviewService;
	@CrossOrigin("*")
	@GetMapping("/admin/getAllReviews")
	public ResponseEntity<?> viewReviews(){
		//System.out.println(reviewmodel.getRatingDescription());
		return ResponseEntity.ok(reviewService.viewReviews());
		
	}
	
	
	
	
	
	
	
	
	
	
	@PostMapping("/admin/addReviews")
	public ResponseEntity<?> addReviews(@RequestBody Reviewmodel reviewModel){
		//System.out.println("Added2");
		System.out.println(reviewModel.getRatingDescription());
	
		return ResponseEntity.ok(reviewService.addReviews(reviewModel));
		//System.out.println("Added1");
	}
	
	
	
	
	
	
	@DeleteMapping("/admin/deleteReview/{ratingId}")
	public ResponseEntity<?> deleteReview(@PathVariable String ratingId){
		//System.out.println("Added3");
		return ResponseEntity.ok(reviewService.deleteReview(ratingId));
		//System.out.println("Added2");
	}
	
	
	
	
	
	

	@PutMapping("/admin/updateReview")
	public ResponseEntity<?> updateReview(@RequestBody Reviewmodel reviewModel){
		return ResponseEntity.ok(reviewService.updateReview(reviewModel));
	}
	
	
	
	
	
	
	
}
