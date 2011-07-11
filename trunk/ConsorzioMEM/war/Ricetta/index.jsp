<%@page pageEncoding="UTF-8" isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@taglib prefix="f" uri="http://www.slim3.org/functions"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Prodotti</title>
<link rel="stylesheet" type="text/css" href="/css/home.css" />
<script type="text/javascript" src="/css/Js/prototype.js"></script>
<script type="text/javascript" src="/css/Js/scriptaculous.js?load=effects,builder"></script>
<script type="text/javascript" src="/css/Js/lightbox.js"></script>
<link rel="stylesheet" href="/css/css/lightbox.css" type="text/css" media="screen" />
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
<!-- end .header -->
</div>
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

  <h3 class="titolo_tutti_prodotti">Ricetta <u>${f:h(Ricetta.nome)}</u></h3>
  
		

		
	<p>
		 	<c:forEach var="z" items="${ListaImmagini}">
				<a href="/UploadImmagineRicetta/image?key=${f:h(z.key)}&v=${f:h(z.version)}" title="${f:h(z.descr)}" rel="lightbox[roadtrip]"><img class="img" src="/UploadImmagineRicetta/image?key=${f:h(z.key)}&v=${f:h(z.version)}" /></a>
			</c:forEach>
	</p>
  		
			<h3> Ricetta </h3>	
			 <p> ${f:h(Ricetta.ricetta)}</p>
				<h3>Categoria </h3>
			 <p>${f:h(Ricetta.categoria)}</p>
			 <h3>Difficoltà </h3>
			 <p>${f:h(Ricetta.diff)}</p>
			 <h3>Minuti di Cottura </h3>
			 <p>${f:h(Ricetta.min_cott)}</p>
			 <h3>Minuti Per la Preparazione </h3>
			 <p>${f:h(Ricetta.min_prep)}</p>
			 <h3>Ricetta Per ${f:h(Ricetta.x_num_persone)} Persone </h3>
			 

		
</div>
  <div class="footer">
    <p> Sono le ore <%= new java.util.Date() %> .</p>
    <!-- end .footer -->
   </div>
  <!-- end .container -->
  </div>
</body>
</html>
