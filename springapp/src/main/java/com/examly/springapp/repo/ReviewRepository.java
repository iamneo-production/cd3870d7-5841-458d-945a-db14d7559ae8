package com.examly.springapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.examly.springapp.model.Reviewmodel;

@Repository
public interface ReviewRepository extends JpaRepository<Reviewmodel, String> {

}
