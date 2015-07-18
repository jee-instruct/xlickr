<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

    <div class="container signup">
    
    <div class="row">
    <div class="col-md-6"></div>
    
    <div class="col-md-6">
    
    <form:form action="/xlickr/signup" method="post" enctype="multipart/form-data" modelAttribute="user">
    
    <div class="input-group">
  <span class="input-group-addon" id="basic-addon1">Firstname</span>
  <form:input type="text" class="form-control" placeholder="First Name" path="firstname" aria-describedby="basic-addon1"/>
</div>

<div class="input-group">
  <span class="input-group-addon" id="basic-addon1">Lastname</span>
  <form:input type="text" class="form-control" placeholder="Last Name" path="lastname" aria-describedby="basic-addon1"/>
</div>

<div class="input-group">
  <span class="input-group-addon" id="basic-addon1">Email</span>
  <form:input type="text" class="form-control" placeholder="Email" path="email" aria-describedby="basic-addon1"/>
</div>

<div class="input-group">
  <span class="input-group-addon" id="basic-addon1">Phonenumber</span>
  <form:input type="text" class="form-control" placeholder="Phone Number"  path="phonenumber" aria-describedby="basic-addon1"/>
</div>
<div class="input-group">
  <span class="input-group-addon" id="basic-addon1">Picture</span>
  <form:input type="file" class="form-control" placeholder="upload your picture" path="picture" aria-describedby="basic-addon1"/>
</div>

<div class="input-group">
  <span class="input-group-addon" id="basic-addon1">username</span>
  <form:input type="text" class="form-control" placeholder="Username" path="username" aria-describedby="basic-addon1"/>
</div>
    
    <div class="input-group">
  <span class="input-group-addon" id="basic-addon1">password</span>
  <form:input type="password" class="form-control" placeholder="password" path="password" aria-describedby="basic-addon1"/>
</div>
    
    <button type="submit" class="btn btn-success pull-right">Submit</button>
    
    </form:form>
    
    
    
    
    
    </div>
    </div>
    
    
    
    
    </div>