package com.example.LiveClassCaseStudy1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.LiveClassCaseStudy1.LiveClassDTO;
import com.example.LiveClassCaseStudy1.entity.LiveClass;
import com.example.LiveClassCaseStudy1.repository.LiveClassRepository;

@Service
public class LiveClassService {
	
	@Autowired
	private LiveClassRepository liveClassRepository;
	
	
	public LiveClass save( LiveClass liveClass)
	{
		liveClassRepository.save(liveClass);
		return liveClass;
	}
	
	public List<LiveClassDTO> readAllLiveClasses()
	{
		return liveClassRepository.readAllLiveClasses();
	}
	

	public List<LiveClassDTO> readAllLiveClassesForOneLearner(String id)
	{
		return liveClassRepository.readAllLiveClassesForOneLearner(id);
	}

	
	}

	
	


