<div class="container">
<div class="jumbotron">
<h1>Create Album</h1>
</div>


<div class="row">
<div class="col-md-8">


</div>
<div class="col-md-4">

<form action="/xlickr/create" method="post" >

<div class="input-group input-group-lg">
  <span class="input-group-addon" id="sizing-addon1">Album Name</span>
  <input type="text" class="form-control" placeholder="Album Name"  name="albumName"  aria-describedby="sizing-addon1">
</div>

<div class="input-group input-group-lg">
  <span class="input-group-addon" id="sizing-addon1">ALbum Description</span>
  <input type="text" class="form-control" placeholder="Album Description"  name="albumDesc" aria-describedby="sizing-addon1">
</div>

<div class="input-group input-group-lg">
      <span class="input-group-addon">Private </span>
        <input type="checkbox" aria-label="..." name="isPrivate">
     
    </div><!-- /input-group -->

<button type="submit">Create ALbum</button>

</form>




</div>



</div>




</div>