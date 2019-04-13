package com.example.j2eeapp.services;

import javax.faces.event.AjaxBehaviorEvent;

import com.example.j2eeapp.domain.UserEntity;

/**
 * Service providing service methods to work this user data and entity.
 * 
 * @author Svetlana Ogurcova
 *
 */
public interface UserService {
	
	/**
	 * Create user - persist to database
	 * 
	 * @param userEntity
	 * @return true if success
	 */
	boolean createUser(UserEntity userEntity);
	
	/**
	 * Check user name availability. UI ajax use.
	 * 
	 * @param event
	 * @return
	 */
	boolean checkAvailable(AjaxBehaviorEvent event);
	
	/**
	 * Retrieves full user record database by user name
	 * 
	 * @param userName
	 * @return UserEntity
	 */
	UserEntity loadUserEntityByUserName(String userName);

}
