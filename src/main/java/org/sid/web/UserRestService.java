package org.sid.web;

import java.util.List;
import java.util.Optional;

import org.sid.dao.UserRepository;
import org.sid.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class UserRestService {

	@Autowired
	private UserRepository userRepo;
	
	// Get ALL USERS
	@RequestMapping(value="/users", method = RequestMethod.GET)
	public List<User> getUsers(){
		return userRepo.findAll();
	}
	
	// GET USER BY ID
	@RequestMapping(value="/users/{id}", method = RequestMethod.GET)
	public Optional<User> getUser(@PathVariable Long id){
		return userRepo.findById(id);
	}
	
	// ADD USER
	@RequestMapping(value="/users", method = RequestMethod.POST)
	public User addUser(@RequestBody User u){
		return userRepo.save(u);
	}
	
	// DELETE USER
	@RequestMapping(value="/users/{id}", method = RequestMethod.DELETE)
	public void deleteUser(@PathVariable Long id){
		userRepo.deleteById(id);
	}
	
	// DELETE ALL USERS
		@RequestMapping(value="/users/deleteAll", method = RequestMethod.DELETE)
		public void deleteAllUser(){
			userRepo.deleteAll();
		}
		
	// UPDATE USER 
	@RequestMapping(value="users/{id}",method = RequestMethod.PUT)
	public User updateUser(@PathVariable Long id, @RequestBody User u ) {
		u.setId(id);
		return userRepo.save(u);
	}
	
	// GET by MotCle
	
/*
	@RequestMapping(value="/searchUser", method = RequestMethod.GET)
	public Page<User> search(@RequestParam(name="motCle",defaultValue="") String motCle, 
								 @RequestParam(name="page",defaultValue="0") int page, 
								 @RequestParam(name="size",defaultValue="5")int size,
								 @RequestParam(name="sort",defaultValue="id") Sort sort){
		return userRepo.search("%" + motCle + "%", new PageRequest(page, size, sort));
	} 
*/
	
}
