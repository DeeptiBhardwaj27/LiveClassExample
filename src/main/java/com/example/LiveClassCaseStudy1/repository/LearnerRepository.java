package com.example.LiveClassCaseStudy1.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.LiveClassCaseStudy1.entity.Learner;

public interface LearnerRepository extends CrudRepository<Learner, String> {

}
