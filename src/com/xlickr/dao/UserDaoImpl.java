package com.xlickr.dao;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xlickr.hibernate.entities.FlickrUser;

@Repository
@Transactional
public class UserDaoImpl implements UserDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void persistNewUser(FlickrUser user) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(user);
	}

	@Override
	public FlickrUser getFlickerUsedByUserName(String username) {
		// TODO Auto-generated method stub
		return (FlickrUser) sessionFactory.getCurrentSession().getNamedQuery("getFlickerUserByUserName").setParameter("username", username).list().get(0);
	}

	@Override
	public FlickrUser saveOrUpdate(FlickrUser user) {
		// TODO Auto-generated method stub
		return (FlickrUser) sessionFactory.getCurrentSession().merge(user);
	}

}
