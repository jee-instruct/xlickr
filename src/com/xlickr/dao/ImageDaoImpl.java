package com.xlickr.dao;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xlickr.hibernate.entities.FlickrImage;
@Repository
@Transactional
public class ImageDaoImpl implements ImageDao {
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void persistImage(FlickrImage image) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(image);
	}

}
