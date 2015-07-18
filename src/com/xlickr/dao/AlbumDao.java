package com.xlickr.dao;

import com.xlickr.hibernate.entities.FlickrAlbum;

public interface AlbumDao {

	public Long persistAlbum(FlickrAlbum album);
	public FlickrAlbum getAlbumById(Long albumId);
}
