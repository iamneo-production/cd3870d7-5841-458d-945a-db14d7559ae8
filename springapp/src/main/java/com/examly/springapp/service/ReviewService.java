package com.examly.springapp.service;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.examly.springapp.repo.ReviewRepository;
import com.examly.springapp.model.ResponseModel;
import com.examly.springapp.model.Reviewmodel;

@Service
public class ReviewService {

	@Autowired
	private ReviewRepository reviewRepository;
	
	public List<Reviewmodel> viewReviews(){
		return reviewRepository.findAll();
	}
	
	
	
	
	
	
	
	
	public ResponseModel addReviews( Reviewmodel reviewModel) {
	
		reviewRepository.save(reviewModel);
		return new ResponseModel("new Review"+reviewModel.getRatingDescription()+"Added Successfully");
	}
	
	
	
	
	
	
	
	public ResponseModel deleteReview(String ratingId) {
		reviewRepository.deleteById(ratingId);
		return new ResponseModel("Review Deleted Succesfully");
	}
	
	
	
	
	
	
	public ResponseModel updateReview( Reviewmodel reviewModel) {
		reviewRepository.save(reviewModel);
		return new ResponseModel("Review Edited Succesfully");
	}
	
	
	
	
	
}
