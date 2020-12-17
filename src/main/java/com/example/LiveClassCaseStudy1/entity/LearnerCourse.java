package com.example.LiveClassCaseStudy1.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//This class is for giving the mapping between learner and coursePackage
@Entity
@Table(name="learner_courses")
public class LearnerCourse {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="user_id")
	private String userId;
	
	@Column(name="course_package_id")
	private int coursePackageId;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public int getCoursePackageId() {
		return coursePackageId;
	}

	public void setCoursePackageId(int coursePackageId) {
		this.coursePackageId = coursePackageId;
	}
	
	
	

}
