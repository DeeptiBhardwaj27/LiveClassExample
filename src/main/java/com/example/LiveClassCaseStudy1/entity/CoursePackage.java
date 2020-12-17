package com.example.LiveClassCaseStudy1.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="course_packages")
public class CoursePackage {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="course_package_id")
	private int coursePackageId;
	
	@Column(name="course_package_name")
	private String coursePackageName;

	public int getCoursePackageId() {
		return coursePackageId;
	}

	public void setCoursePackageId(int coursePackageId) {
		this.coursePackageId = coursePackageId;
	}

	public String getCoursePackageName() {
		return coursePackageName;
	}

	public void setCoursePackageName(String coursePackageName) {
		this.coursePackageName = coursePackageName;
	}
	
	

}
