package com.xlickr.hibernate.entities;

// Generated Jul 17, 2015 9:25:23 PM by Hibernate Tools 4.3.1

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * FlickrImageComments generated by hbm2java
 */
@Entity
@Table(name = "flickr_image_comments", schema = "public")
public class FlickrImageComments implements java.io.Serializable {

	private long imageComentsId;
	private FlickrImage flickrImage;
	private FlickrUser flickrUser;
	private String imageComments;
	private Date imageCommentsCreatedDate;

	public FlickrImageComments() {
	}

	public FlickrImageComments(long imageComentsId, FlickrImage flickrImage,
			FlickrUser flickrUser, String imageComments,
			Date imageCommentsCreatedDate) {
		this.imageComentsId = imageComentsId;
		this.flickrImage = flickrImage;
		this.flickrUser = flickrUser;
		this.imageComments = imageComments;
		this.imageCommentsCreatedDate = imageCommentsCreatedDate;
	}

	@Id
	@Column(name = "image_coments_id", unique = true, nullable = false)
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public long getImageComentsId() {
		return this.imageComentsId;
	}

	public void setImageComentsId(long imageComentsId) {
		this.imageComentsId = imageComentsId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "image_id", nullable = false)
	public FlickrImage getFlickrImage() {
		return this.flickrImage;
	}

	public void setFlickrImage(FlickrImage flickrImage) {
		this.flickrImage = flickrImage;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id", nullable = false)
	public FlickrUser getFlickrUser() {
		return this.flickrUser;
	}

	public void setFlickrUser(FlickrUser flickrUser) {
		this.flickrUser = flickrUser;
	}

	@Column(name = "image_comments", nullable = false, length = 4000)
	public String getImageComments() {
		return this.imageComments;
	}

	public void setImageComments(String imageComments) {
		this.imageComments = imageComments;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "image_comments_created_date", nullable = false, length = 29)
	public Date getImageCommentsCreatedDate() {
		return this.imageCommentsCreatedDate;
	}

	public void setImageCommentsCreatedDate(Date imageCommentsCreatedDate) {
		this.imageCommentsCreatedDate = imageCommentsCreatedDate;
	}

}
