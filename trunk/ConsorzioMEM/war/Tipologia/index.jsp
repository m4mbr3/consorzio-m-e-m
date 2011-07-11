<%@page pageEncoding="UTF-8" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@taglib prefix="f" uri="http://www.slim3.org/functions"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Stagioni</title>
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
  <div class="header">
    <a href="/"><img src="/nature_banner_8-1.png" width="961" height="188" id="Insert_logo" style="background: #C6D580; display:block;" /></a>
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
		      <li><a href="/Occasioni/">Tutte le occasioni</a></li>
		      <li><a href="/ObiettiviProblemi/">Obiettivi o Problemi alimentari</a></li>
		    </p>
      	</ul>
      </li>
      
    
    </ul>



  </div>
  <div class="content">
	  <div  class="disp"  id="Antipasto" >
	  	<h3  class="h3left"> Antipasto </h3> 
		<div id="icon_antipasto"><img src="/Antipasto.jpg" class="icon icon_right"  id="icon_antipasto" /></div>
		 <ul>
		 <c:forEach var="z" items="${listAntipasto}">
	  				  				<li><h4><a href="/Ricetta/?key=${f:h(z.key)}">${f:h(z.nome)}</a></h4>
										<ul>
										<li> ${f:h(z.descr)}</li>
										</ul>
									</li>
		</c:forEach>
		</ul>
	  </div>
	  <div  class="par"  id="Primo">
	    <h3 class="h3right"> Primo </h3>
		<div id="icon_primo"><img src="/Primo.jpg" class="icon icon_left"  id="icon_primo"/></div>
		<ul style="text-align:right;">
		<c:forEach var="p" items="${listPrimo}">
								<li><h4><a href="/Ricetta/?key=${f:h(p.key)}">${f:h(p.nome)}</a></h4>
										<ul>
										<li> ${f:h(p.descr)}</li>
										</ul>
									</li>		</c:forEach>
		</ul>
	  </div>
	  <div  class="disp"  id="Secondo">
	  	<h3 class="h3left"> Secondo </h3>
<div id="icon_secondo"> <img src="/Secondo.jpg" class="icon icon_right"  id="icon_secondo" /></div>
	<ul>
	<c:forEach var="e" items="${listSecondo}">
	  											<li><h4><a href="/Ricetta/?key=${f:h(e.key)}">${f:h(e.nome)}</a></h4>
										<ul>
										<li> ${f:h(e.descr)}</li>
										</ul>
									</li>
		</c:forEach>
	</ul>
	  </div>
	  <div  class="par"  id="PiattoUnico">
	  	<h3 class="h3right"> Piatto Unico</h3> 
			<div id="icon_PiattoUnico"><img src="/PiattoUnico.jpg" class="icon icon_left"  id="icon_PiattoUnico" /></div>
			<ul>
			<c:forEach var="s" items="${listPiattoUnico}">
	  												<li><h4><a href="/Ricetta/?key=${f:h(s.key)}">${f:h(s.nome)}</a></h4>
										<ul>
										<li> ${f:h(s.descr)}</li>
										</ul>
									</li>
		</c:forEach>
		</ul>
	  </div>
	   <div  class="disp"  id="Salse">
	  	<h3 class="h3left"> Salse </h3>
<div id="icon_salse"> <img src="/Salse.jpg" class="icon icon_right"  id="icon_salse" /></div>
	<ul>
	<c:forEach var="e" items="${listSalse}">
	  											<li><h4><a href="/Ricetta/?key=${f:h(e.key)}">${f:h(e.nome)}</a></h4>
										<ul>
										<li> ${f:h(e.descr)}</li>
										</ul>
									</li>
		</c:forEach>
	</ul>
	  </div>
  </div>
  <div class="footer">
    <p> Progetto di Applicazioni Ipermediali 2011 di Andrea Mambretti - Elio Ermini - Luca Muccignato </p>
    <!-- end .footer -->
   </div>
  <!-- end .container -->
  
  </div>
</body>
</html>
