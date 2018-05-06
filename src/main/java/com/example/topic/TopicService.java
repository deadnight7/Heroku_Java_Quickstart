package com.example.topic;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	@Autowired
	private TopicRepository topicRepository;
	
	public List<Topic> getAllTopics()
	{
		List<Topic> topics= new ArrayList<>();
		topicRepository.findAll()
		.forEach(topics::add);
		
		return topics;
	}

	public Topic GetTopic(String id)
	{
		List <Topic> topics = topicRepository.findAll();
		for (int i = 0; i < topics.size(); i++) 
		{
			Topic currentTopic = topics.get(i);
			System.out.println("currentTopic.getId(): "+currentTopic.getId());
			if (currentTopic.getId().equals(id))
			{
				System.out.println("Found...");
				return currentTopic;
			}
		}
		return null;
		//return topicRepository.findOne(id);
	}
	

	public Topic GetTopicByDescription (String desc)
	{
		List <Topic> topics = topicRepository.findAll();
		for (int i = 0; i < topics.size(); i++) 
		{
			Topic currentTopic = topics.get(i);
			System.out.println("currentTopic.getDesc(): "+currentTopic.getDescription());
			if (currentTopic.getDescription().equals(desc))
			{
				System.out.println("Found...");
				return currentTopic;
			}
		}
		return null;
		//return topicRepository.findOne(id);
	}
	
	public void addTopic(Topic topic)
	{
		topicRepository.save(topic);
	}
	
	public void updateTopic(Topic topic)
	{
		topicRepository.save(topic);
	}
	
	public void deleteTopic(String id)
	{
		topicRepository.deleteById(id);//(topic);;
	}
	
}
