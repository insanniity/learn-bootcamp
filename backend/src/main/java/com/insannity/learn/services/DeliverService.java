package com.insannity.learn.services;

import java.util.LinkedHashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.insannity.learn.dto.DeliverRevisionDTO;
import com.insannity.learn.entities.Deliver;
import com.insannity.learn.observers.DeliverRevisionObserver;
import com.insannity.learn.repositories.DeliverRepository;

@Service
public class DeliverService {
	
	@Autowired
	private DeliverRepository repository;
	
	
	private Set<DeliverRevisionObserver> deliverRevisionObservers = new LinkedHashSet<>();
	
	
	@Transactional
	public void saveRevision(Long id, DeliverRevisionDTO dto) {
		Deliver deliver = repository.getOne(id);
		deliver.setStatus(dto.getStatus());
		deliver.setFeedback(dto.getFeedback());
		deliver.setCorrectCount(dto.getCorrectCount());
		repository.save(deliver);
		
		for(DeliverRevisionObserver observer : deliverRevisionObservers) {
			observer.onSaveRevision(deliver);
		}
	}
	
	public void subscribeDeliverRevisionObserver(DeliverRevisionObserver observer) {
		deliverRevisionObservers.add(observer);
	}
	
	
	
	
}
