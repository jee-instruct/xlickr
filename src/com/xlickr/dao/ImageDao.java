package com.xlickr.dao;

import com.xlickr.hibernate.entities.FlickrImage;

public interface ImageDao {

	
	public void persistImage(FlickrImage image);
}
