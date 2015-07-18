package com.xlickr.service;

import com.xlickr.beans.User;
import com.xlickr.hibernate.entities.FlickrUser;

public interface UserService {
	public void saveNewUser(User user);
	public FlickrUser getFlickrUser(String username);
	public Long saveNewUserAlbums(String userName, String albumName, String albumDescription, Boolean isprivate);
}
