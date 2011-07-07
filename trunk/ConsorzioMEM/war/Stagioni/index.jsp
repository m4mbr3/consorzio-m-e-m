<%@page pageEncoding="UTF-8" isELIgnored="false" session="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@taglib prefix="f" uri="http://www.slim3.org/functions"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Consorzio di 3 disperati senza GWT versione 0.0.0.1</title>
<link rel="stylesheet" type="text/css" href="/css/home.css" />

<script type="text/javascript">
 
 function nascondi(id){
 	document.getElementById(id).style.display ='none';	
 }
 
 function mostra(id){
 	document.getElementById(id).style.display = 'Block';
 }
 
</script>
<link href="css/home.css" rel="stylesheet" type="text/css">
</head>

<body>

<div class="container">
  <div class="header"><a href="/"><img src="/biologo.png" width="90" height="90" id="Insert_logo" style="background: #C6D580; display:block;" /></a> 
    <!-- end .header --></div>
  
  <div class="sidebar1">
    <ul class="nav">
          <li><a href="/Info/">Bio</a></li>
      <li id="menu1" onMouseOver="mostra('prodotti');" onMouseOut="nascondi('prodotti');"><a>Prodotti</a>
      	
	      	<ul class="nav" id="prodotti" style="display:none;">
			      <p>
			      <li><a href="/TuttiProdotti/">Tutti i prodotti</a></li>
			      <li><a href="/Stagioni/">Stagioni</a></li>
			      <li><a href="/Categorie/">Categorie</a></li>
			      </p>
	      	</ul>
      
      </li>
      <li id="menu2" onMouseOver="mostra('ricette');" onMouseOut="nascondi('ricette');"><a>Ricette</a>
      	<ul class="nav" id="ricette" style="display:none;">
		     <p>
		      <li><a href="/Ricette/">Tutte</a></li>
		      <li><a href="/Occasioni/">Occasioni</a></li>
		      <li><a href="/SpecialNeeds/">Bisogni Specifici</a></li>
		     </p>
      	</ul>
      </li>
      <li><a href="/Mesi/">Offerte</a></li>
      <li><a href="/Consorzio/" >Consorzio</a></li>
      <li id="menu3" onMouseOver="mostra('produttori');" onMouseOut="nascondi('produttori');"><a>Produttori</a>
      	<ul class="nav" id="produttori" style="display:none;">
		      <p>
		      <li><a href="/Produttori/">Tutti i produttori</a></li>
		      <li><a href="/Regioni/">Regioni</a></li>
		      </p>
      	</ul>
      </li>
     <li id="menu3" onMouseOver="mostra('dieta');" onMouseOut="nascondi('dieta');"><a>Dieta</a>
      	<ul class="nav" id="dieta" style="display:none;">
      		<p>
		      <li><a href="/Occasioni/">Tutti i produttori</a></li>
		      <li><a href="/Regioni/">Regioni</a></li>
		      <li><a href="/ObiettiviProblemi/">Problemi alimentari</a></li>
		    </p>
      	</ul>
      </li>
    </ul>
	
  </div>
  <div class="content">
	  <div  class="disp"  id="primavera">
	  	<h3  class="h3left"> Primavera </h3> 
		<div id="icon_primavera"><img src="/primavera.jpg" class="icon icon_right"  /></div>
		<c:if test="${fn:length(list) > 0}">
		 <c:forEach var="e" items="${list}">
	  <li><a href="">${f:h(e.Descr)}</a></li>
		</c:forEach>
	  </div>
	  <div  class="par"  id="estate">
	    <h3 class="h3right"> Estate </h3>
		<div id="icon_estate"><img src="/estate.jpg" class="icon icon_left"  /></div>
	  </div>
	  <div  class="disp"  id="autunno">
	  	<h3 class="h3left"> Autunno </h3>
<div id="icon_autunno"> <img src="/autunno.jpg" class="icon icon_right"  id="icon_autunno" /></div>
	  </div>
	  <div  class="par"  id="inverno">
	  	<h3 class="h3right"> Inverno </h3> 
			<div id="icon_inverno"><img src="/Inverno.jpg" class="icon icon_left"  id="icon_inverno" /></div>
	  </div>
  </div>
  <div class="footer">
    <p> Sono le ore <%= new java.util.Date() %> .</p>
    <!-- end .footer -->
   </div>
  <!-- end .container -->
  
  </div>
</body>
</html>