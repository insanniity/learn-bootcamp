package com.insannity.learn.services;

import com.insannity.learn.entities.User;
import com.insannity.learn.repositories.UserRepository;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserDetailsService{

    private static Logger logger = org.slf4j.LoggerFactory.getLogger(UserService.class);
    
    @Autowired
    private UserRepository repository;

    @Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = repository.findByEmail(username);
		if(user == null) {
			logger.error("Usuário não encontrado " + username);
			throw new UsernameNotFoundException("Email não encontrado");
		}
		
		logger.info("Usuário encontrado: "+ username);
		
		return user;
	}
}
