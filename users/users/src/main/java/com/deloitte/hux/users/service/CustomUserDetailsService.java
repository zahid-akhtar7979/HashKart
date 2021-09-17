package com.deloitte.hux.users.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.deloitte.hux.users.config.repository.UserRepository;
import com.deloitte.hux.users.entity.CustomUserDetails;
import com.deloitte.hux.users.entity.User;

@Service
public class CustomUserDetailsService implements UserDetailsService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {

		final User user = this.userRepository.findByUsername(userName);

		if (user == null) {
			throw new UsernameNotFoundException("User not found !!");
		} else {
			return new CustomUserDetails(user);
		}

		// user database `

//	        if (userName.equals("Durgesh")) {
//	            return new User("Durgesh", "Durgesh123", new ArrayList<>());
//	        } else {
//	            throw new UsernameNotFoundException("User not found !!");
//	        }

	}

}
