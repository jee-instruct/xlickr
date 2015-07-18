<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@taglib prefix="security" uri="http://www.springframework.org/security/tags" %>

<nav class="navbar navbar-inverse navbar-fixed-top">
      <div class="container">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="/xlickr">Xlickr</a>
        </div>
        <div id="navbar" class="navbar-collapse collapse">
          <ul class="nav navbar-nav">
        	<li> <a href="/xlickr/signup"> <button type="button" class="btn  btn-primary navbar-btn">Sign Up</button></a></li>
            <li class="dropdown">
              <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Explore <span class="caret"></span></a>
              <ul class="dropdown-menu">
                <li><a href="#">Action</a></li>
                <li><a href="#">Another action</a></li>
                <li><a href="#">Something else here</a></li>
                <li role="separator" class="divider"></li>
                <li class="dropdown-header">Nav header</li>
                <li><a href="#">Separated link</a></li>
                <li><a href="#">One more separated link</a></li>
              </ul>
            </li>
            <li><a href="/xlickr/create">Create</a></li>
            <security:authorize access="!isAnonymous()">
            <li><a href="/xlickr/albums">My Albums</a></li>
            
            </security:authorize>
          </ul>
        
        <form class="navbar-form navbar-right" role="search">
        <div class="form-group">
          <input type="text" class="form-control" placeholder="Search">
        </div>
        <button type="submit" class="btn btn-default">Submit</button>
      </form>
          <ul class="nav navbar-nav navbar-right">
            <security:authorize access="isAnonymous()">
            <li><a href="/xlickr/signin">Signin</a></li>
            </security:authorize>
            <security:authorize access="!isAnonymous()">
           <ul class="nav navbar-nav navbar-right">
           <li><a href="#">Upload</a></li>
            <li><a href="#">Welcome <security:authentication property="principal.username"/></a></li>
            <li><a href="/xlickr/logout">Logout</a></li>
          </ul>
          </security:authorize>
            
          </ul>
        </div><!--/.nav-collapse -->
      </div>
    </nav>