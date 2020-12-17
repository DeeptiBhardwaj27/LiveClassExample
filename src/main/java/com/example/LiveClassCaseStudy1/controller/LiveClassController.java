package com.example.LiveClassCaseStudy1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.LiveClassCaseStudy1.LiveClassDTO;
import com.example.LiveClassCaseStudy1.entity.LiveClass;
import com.example.LiveClassCaseStudy1.service.LiveClassService;

@RestController
@CrossOrigin
public class LiveClassController {
	
	@Autowired
	private LiveClassService liveClassService;
	
	@RequestMapping(path="/save", method= RequestMethod.POST)
	public LiveClass save(@RequestBody LiveClass liveClass)
	{
		liveClassService.save(liveClass);
		return liveClass;
	}
	
	@RequestMapping(path="/readAll", method= RequestMethod.GET)
	public List<LiveClassDTO> readAllLiveClasses()
	{
		return liveClassService.readAllLiveClasses();
	}
	
	@RequestMapping(path="/read/{id}", method= RequestMethod.GET)
	public List<LiveClassDTO> readAllLiveClassesForOneLearner(@PathVariable String id)
	{
		return liveClassService.readAllLiveClassesForOneLearner(id);
	}

}
