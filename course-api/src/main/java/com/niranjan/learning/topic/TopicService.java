package com.niranjan.learning.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	private List<Topic> topics = new ArrayList<Topic> (Arrays.asList(new Topic(1, "Java core", "core java descscription"),
			new Topic(2, "Spring", "Spring framework descscription"),
			new Topic(3, "Hibernate", "Hibernate orm descscription")));

	public List<Topic> getAllTopics(){
		return topics;
	}

	public Topic getTopic(int id) {
		return topics.stream().filter(t -> t.getId()==id).findFirst().get();
	}
	
	public void addTopic(Topic topic) {
		topics.add(topic);
	}

	public void updateTopic(Topic topic, int id) {
		System.out.println("id:::"+id);
		for(int i=0;i<topics.size();i++) {
			Topic t = topics.get(i);
			if(t.getId()==id) {
				topics.set(i, topic);
			}
		}
	}

	public void deleteTopic(int id) {
		topics.removeIf(t -> t.getId()==id);
		
	}
	
}
