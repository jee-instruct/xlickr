package com.xlickr.controllers;

import java.security.Principal;

import org.aspectj.lang.annotation.RequiredTypes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.xlickr.beans.User;
import com.xlickr.service.UserService;

@Controller
public class WebController {
	
	@Autowired
	private UserService userService;

	@RequestMapping(value="/",method=RequestMethod.GET)
	public ModelAndView getLandingPage(){
		return new ModelAndView("landingPage");
	}
	
	@RequestMapping(value="/signup",method=RequestMethod.GET)
	public ModelAndView getsignupPage(){
		return new ModelAndView("signupPage").addObject("user", new User());
	}
	
	
	@RequestMapping(value="/signup",method=RequestMethod.POST)
	public ModelAndView postSignupPage(@ModelAttribute("user")User user){
		userService.saveNewUser(user);
		return new ModelAndView("landingPage");
	}
	
	@RequestMapping(value="/signin",method=RequestMethod.GET)
	public ModelAndView getsigninPage(){
		return new ModelAndView("signinPage");
	}
	
	
	@RequestMapping(value="/create",method=RequestMethod.GET)
	public ModelAndView getcreatePage(Principal principal){
		return new ModelAndView("createPage");
	}
	
	
	@RequestMapping(value="/create",method=RequestMethod.POST)
	public ModelAndView postcreatePage(Principal principal,@RequestParam("albumName")String albumName,
			@RequestParam("albumDesc")String albumDesc ,@RequestParam(value="isPrivate",required=false)Boolean isPrivate){
		if(null == isPrivate){
			isPrivate = Boolean.FALSE;
		}
		return new ModelAndView("addImages").addObject("albumname", albumName).
				addObject("albumId", userService.saveNewUserAlbums(principal.getName(), albumName, albumDesc, isPrivate));
	}
	
	
	@RequestMapping(value="/albums",method=RequestMethod.GET)
	public ModelAndView getMyAlbumsPage(Principal principal){
		
		
		return new ModelAndView("albumsPage");
	}
	
	
	
	
	
	
}
