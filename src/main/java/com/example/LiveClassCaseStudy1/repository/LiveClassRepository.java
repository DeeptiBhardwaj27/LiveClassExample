package com.example.LiveClassCaseStudy1.repository;


import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.LiveClassCaseStudy1.LiveClassDTO;
import com.example.LiveClassCaseStudy1.entity.LiveClass;

public interface LiveClassRepository extends CrudRepository<LiveClass, Integer> {
	
	@Query("select new com.example.LiveClassCaseStudy1.LiveClassDTO(liveClass.id, liveClass.dateAndTime, liveClass.coursePackageId, "
			+ "liveClass.liveUrl, liveClass.password, "
			+ "liveClass.topic, liveClass.dependents, liveClass.isPublic) "
			+ "from LiveClass liveClass where liveClass.dateAndTime >=CURRENT_DATE")
	public List<LiveClassDTO> readAllLiveClasses();
	
	@Query("select new com.example.LiveClassCaseStudy1.LiveClassDTO(liveClass.id,liveClass.dateAndTime,liveClass.coursePackageId,liveClass.liveUrl,"
			+ "liveClass.password,liveClass.topic,liveClass.dependents,liveClass.isPublic) "
			+ "from LiveClass liveClass inner join LearnerCourse learnerCourse on (liveClass.coursePackageId=learnerCourse.coursePackageId) "
			+ "inner join Learner learner on (learner.userId=learnerCourse.userId)"
			+"where learner.userId = :userId and liveClass.dateAndTime >=CURRENT_DATE")
	public List<LiveClassDTO> readAllLiveClassesForOneLearner(String userId);
}
