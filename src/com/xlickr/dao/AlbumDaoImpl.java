package com.xlickr.dao;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xlickr.hibernate.entities.FlickrAlbum;
@Repository
@Transactional
public class AlbumDaoImpl implements AlbumDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public Long persistAlbum(FlickrAlbum album) {
		// TODO Auto-generated method stub
		FlickrAlbum a = (FlickrAlbum) sessionFactory.getCurrentSession().merge(album);
		return a.getAlbumId();
	}

	@Override
	public FlickrAlbum getAlbumById(Long albumId) {
		// TODO Auto-generated method stub
		return (FlickrAlbum) sessionFactory.getCurrentSession().get(FlickrAlbum.class, albumId);
	}

}
