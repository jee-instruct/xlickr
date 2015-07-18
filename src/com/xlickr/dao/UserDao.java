package com.xlickr.dao;

import com.xlickr.hibernate.entities.FlickrUser;

public interface UserDao {
	
	public void persistNewUser(FlickrUser user);
	
	public FlickrUser saveOrUpdate(FlickrUser user);
	public FlickrUser getFlickerUsedByUserName(String username);
	
}
