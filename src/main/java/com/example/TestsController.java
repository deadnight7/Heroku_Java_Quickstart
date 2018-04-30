package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestsController {

	@Autowired
	TestsRepository testRepository;
	
	List<Test> tests = new ArrayList<Test>(
			Arrays.asList(
					new Test("com.hello","test1", "Y","3", "DataBin"),
					new Test("com.hello","test2", "Y","3", "DataBin"),
					new Test("com.hello","test3", "Y","3", "DataBin"),
					new Test("com.hello","test4", "Y","3", "DataBin"),
					new Test("com.hello","test5", "Y","3", "DataBin")
					));
	
	@RequestMapping ("/tests")
	public List <Test> getAllTests (){
		//return tests;
		List <Test> tests = new ArrayList<Test>();
		Iterable <Test> testIterator = testRepository.findAll();
		for (Test test : testIterator) 
		{
			tests.add(test);
		}
		return tests;
	}
}
