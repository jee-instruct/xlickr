package com.xlickr.controllers;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.xlickr.dao.AlbumDao;
import com.xlickr.dao.ImageDao;
import com.xlickr.dao.UserDao;
import com.xlickr.hibernate.entities.FlickrImage;
import com.xlickr.hibernate.entities.FlickrImageData;
import com.xlickr.hibernate.entities.FlickrUser;


@Scope("prototype")
@Component("filehandler")
public class FileHandler implements Runnable{
	
	@Autowired
	private ImageDao imageDao;
	@Autowired
	private UserDao userDao;
	
	@Autowired
	private AlbumDao albumDao;
	
	
	private FlickrImage image;
	

	public void  setImageInfo(String fileName, byte[] filedata,
			String contentType, Long fileSize,String username, Long albumId){
		this.image = new FlickrImage();
		FlickrUser user = userDao.getFlickerUsedByUserName(username);
		image.setFlickrUser(user);
		image.setImageContentType(contentType);
		image.setImageCreatedDate(new Date());
		image.setImageDescription("");
		image.setImageIsPrivate(albumDao.getAlbumById(albumId).isAlbumIsPrivate());
		image.setImageName(fileName);
		image.setImageSize(fileSize);
		image.setImageUpdatedDate(new Date());
		image.setAlbumId(albumId);
		
		FlickrImageData data = new FlickrImageData();
		data.setFlickrImage(image);
		data.setImageBytes(filedata);
		data.setImageDataCreatedDate(new Date());
		image.setFlickrImageData(data);
		
	/*	try{
		ImageMetadata metadata = Imaging.getMetadata(filedata);
		Set<FlickrImageMetadata> flickrImageMetadata = new HashSet<FlickrImageMetadata>();

		List<ImageMetadataItem> items = (List<ImageMetadataItem>) metadata.getItems();
		
		for(ImageMetadataItem item: items){
			
			
			
			
			
		}
		
		
		
		
		}catch(Exception ex){
			ex.printStackTrace();
		}
		*/
		
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		imageDao.persistImage(image);
	}

}
