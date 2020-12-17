package com.example.LiveClassCaseStudy1;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.LiveClassCaseStudy1.entity.CoursePackage;
import com.example.LiveClassCaseStudy1.entity.Learner;
import com.example.LiveClassCaseStudy1.entity.LearnerCourse;
import com.example.LiveClassCaseStudy1.entity.LiveClass;
import com.example.LiveClassCaseStudy1.repository.CoursePackageRepository;
import com.example.LiveClassCaseStudy1.repository.LearnerCourseRepository;
import com.example.LiveClassCaseStudy1.repository.LearnerRepository;
import com.example.LiveClassCaseStudy1.repository.LiveClassRepository;

@SpringBootApplication

public class LiveClassCaseStudy1Application implements CommandLineRunner {

	@Autowired
	private LearnerRepository learnerRepository;
	
	@Autowired
	private CoursePackageRepository coursePackageRepository;
	
	@Autowired
	private LearnerCourseRepository learnerCourseRepository;
	
	@Autowired
	private LiveClassRepository liveClassRepository;
	
	
	@Override
	public void run(String... args) throws Exception {
		Learner learner1 =new Learner();
		learner1.setUserId("L101");
		learner1.setFirstName("Raghu");
		
		Learner learner2 =new Learner();
		learner2.setUserId("L102");
		learner2.setFirstName("Sonia");
		
		Learner learner3 =new Learner();
		learner3.setUserId("L103");
		learner3.setFirstName("Aditi");
		
		learnerRepository.saveAll(Arrays.asList(learner1, learner2, learner3));
		
		CoursePackage coursePackage1 = new CoursePackage();
		coursePackage1.setCoursePackageName("Java Full Stack");
		
		CoursePackage coursePackage2 = new CoursePackage();
		coursePackage2.setCoursePackageName("Python Full Stack");
		
		coursePackageRepository.saveAll(Arrays.asList(coursePackage1,coursePackage2));
		
		LearnerCourse learnerCourse1 = new LearnerCourse();
		learnerCourse1.setUserId("L101");
		learnerCourse1.setCoursePackageId(1);
		
		LearnerCourse learnerCourse2 = new LearnerCourse();
		learnerCourse2.setUserId("L101");
		learnerCourse2.setCoursePackageId(2);
		
		LearnerCourse learnerCourse3 = new LearnerCourse();
		learnerCourse3.setUserId("L102");
		learnerCourse3.setCoursePackageId(1);
		
		LearnerCourse learnerCourse4 = new LearnerCourse();
		learnerCourse4.setUserId("L103");
		learnerCourse4.setCoursePackageId(2);
		
		learnerCourseRepository.saveAll(Arrays.asList(learnerCourse1,learnerCourse2,learnerCourse3,learnerCourse4));
		
		System.out.println("done");
		
		//Creating Live classes
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy h:m a");
		LiveClass liveClass1 = new LiveClass();
		liveClass1.setId(1);
		liveClass1.setTopic("one-to-one mapping");
		liveClass1.setDependents("basics of mapping");
		liveClass1.setLiveUrl("url_1");
		liveClass1.setPassword("pass1");
		liveClass1.setDateAndTime(simpleDateFormat.parse("17-12-2020 10:30 am"));
		liveClass1.setCoursePackageId(2);
		
		LiveClass liveClass2 = new LiveClass();
		liveClass2.setId(2);
		liveClass2.setTopic("many-to-many mapping");
		liveClass2.setDependents("basics of one-to-one mapping");
		liveClass2.setLiveUrl("url_2");
		liveClass2.setPassword("pass2");
		liveClass2.setDateAndTime(simpleDateFormat.parse("17-12-2020 4:30 pm"));
		liveClass2.setCoursePackageId(1);
		
		LiveClass liveClass3 = new LiveClass();
		liveClass3.setId(3);
		liveClass3.setTopic("many-to-one mapping");
		liveClass3.setDependents("basics of one-to-one mapping");
		liveClass3.setLiveUrl("url_3");
		liveClass3.setPassword("pass3");
		liveClass3.setDateAndTime(simpleDateFormat.parse("17-12-2020 11:30 am"));
		liveClass3.setCoursePackageId(1);
		
		LiveClass liveClass4 = new LiveClass();
		liveClass4.setId(4);
		liveClass4.setTopic("python loops");
		liveClass4.setDependents("basics of loops");
		liveClass4.setLiveUrl("url_4");
		liveClass4.setPassword("pass4");
		liveClass4.setDateAndTime(simpleDateFormat.parse("17-12-2020 2:30 pm"));
		liveClass4.setCoursePackageId(2);
		
		liveClassRepository.saveAll(Arrays.asList(liveClass1,liveClass2,liveClass3,liveClass4));
		
		
		//Reading and Displaying live classes of today and tomorrow
//		
//		List<LiveClassDTO> allLiveClasses = liveClassRepository.readAllLiveClasses();
//		for(LiveClassDTO liveClass : allLiveClasses) {
//			
//			System.out.println(liveClass.getTopic() + "," +liveClass.getDependents());
//		}
		
	//	Reading and displaying all live classes on today for a particular learner
		
//		List<LiveClassDTO> allLiveClasses = liveClassRepository.readAllLiveClassesForOneLearner("L103");
//		
//		for(LiveClassDTO lc : allLiveClasses) {
//			
//			System.out.println(lc.getTopic() + "," + lc.getCoursePackageId());
//		}
		
	}


	public static void main(String[] args) {
		SpringApplication.run(LiveClassCaseStudy1Application.class, args);
	}

}
