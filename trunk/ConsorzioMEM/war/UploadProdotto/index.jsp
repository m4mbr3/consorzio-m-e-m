<%@page pageEncoding="UTF-8" isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@taglib prefix="f" uri="http://www.slim3.org/functions"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Caricamento Prodotti</title>
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
		      <li><a href="/Occasioni/">Tutti i produttori</a></li>
		      <li><a href="/Regioni/">Regioni</a></li>
		      <li><a href="/ObiettiviProblemi/">Problemi alimentari</a></li>
		    </p>
      	</ul> 	      </li>
      
    
    </ul>



  </div>
  <div class="content">
  				<h2> Carica un Prodotto!!!</h2>
				<form method="post" action="/UploadProdotto/">
				<p><label id="Nome_label">Nome</label> 
								<input type="text" id="Nome" name="Nome"  />		</p>
				<p><label id="Descr_label">Descrizione</label>
								<textarea id="Descr"  rows="15" cols="80" name="Descr" ></textarea></p>
				<p><label id="Prezzo_label">Prezzo</label>
								<input type="text" id="Prezzo" name="Prezzo" /></p>
				<p><label id="Unit_label">Unità di misura </label>
								<select id="Unit"  name="Unit">
								<option>Euro/Kg</option>
				  				<option>Euro/g</option>
			  					<option>Euro/lt</option>
								</select></p>
				<p><label id="Autunno_label">Autunno</label>
								<input type="checkbox" id="Autunno"  name="Autunno"/></p>			
								<p><label id="Inverno_label">Inverno</label>
								<input type="checkbox" id="Inverno"  name="Inverno"/></p>		
								<p><label id="Primavera_label">Primavera</label>
								<input type="checkbox" id="Primavera"  name="Primavera"/></p>		
								<p><label id="Estate_label">Estate</label>
								<input type="checkbox" id="Estate"  name="Estate"/></p>		
								
				<input type="submit" name="Carica" id="Carica" value="Carica">
				</form>
</div>
  <div class="footer">
    <p> Sono le ore <%= new java.util.Date() %> .</p>
    <!-- end .footer -->
   </div>
  <!-- end .container -->
  </div>
</body>
</html>
