<%@page pageEncoding="UTF-8" isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@taglib prefix="f" uri="http://www.slim3.org/functions"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Consorzio MEM</title>
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
    	  <li><a href="/">Home Page </a></li>
      <li id="menu1" onMouseOver="mostra('prodotti');" onMouseOut="nascondi('prodotti');"><a>Prodotti</a>
	      	<ul class="nav" id="prodotti" style="display:none;">
			      <p>
			      <li><a href="/TuttiProdotti/">Tutti i prodotti</a></li>
			      <li><a href="/Stagioni/">Stagioni</a></li>
			      <li><strike><a href="/Categorie/">Categorie</a></strike></li>
			      </p>
	      	</ul>
      </li>
      <li id="menu2" onMouseOver="mostra('ricette');" onMouseOut="nascondi('ricette');"><a>Ricette</a>
      	<ul class="nav" id="ricette" style="display:none;">
		     <p>
		      <li><a href="/Ricette/">Tutte le ricette</a></li>
		      <li><a href="/Tipologia/">Tipologia</a></li>
		      <li><strike><a href="/SpecialNeeds/">Bisogni Specifici</a></strike></li>
		     </p>
      	</ul>
      </li>
      
       <li id="menu3" onMouseOver="mostra('dieta');" onMouseOut="nascondi('dieta');"><strike><a>Dieta</a></strike>
      	<ul class="nav" id="dieta" style="display:none;">
      		<p>
		      <li><strike><a href="/Occasioni/">Tutte le occasioni</a></strike></li>
		      <li><strike><a href="/ObiettiviProblemi/">Obiettivi o Problemi alimentari</a></strike></li>
		    </p>
      	</ul>
      </li>
      <li><strike><a href="/Mesi/">Le Nostre Offerte</a></strike></li>
      
      <li id="menu3" onMouseOver="mostra('produttori');" onMouseOut="nascondi('produttori');"><strike><a>Produttori</a></strike>
      	<ul class="nav" id="produttori" style="display:none;">
		      <p>
		      <li><strike><a href="/Produttori/">Tutti i produttori</a></strike></li>
		      <li><strike><a href="/Regioni/">Regioni</a></strike></li>
		      </p>
      	</ul>
      </li>
    <li><a href="/Info/">Info Generali</a></li>
    <li><strike><a href="/InfoProduzione/">Info Produzione</a></strike></li>
    <li><strike><a href="/Consorzio/">Consorzio</a></strike></li>
    <li><a href="/Contatti/">Contatti</a></li>
    </ul>
    <br />
    <h3>Admin Area</h3>
    <ul class="nav">
    <li><a href="/UploadProdotto/">Aggiungi Prodotto</a></li>
    <li><a href="/Upload/">Aggiungi Immagine Prodotto</a></li>
    <li><a href="/UploadRicetta/">Aggiungi Ricetta</a></li>
    <li><a href="/UploadImmagineRicetta/">Aggiungi Immagine Ricetta</a></li>
    
    </ul>



  </div>
  <div class="content">
  <h3 class="titolo_tutti_prodotti">Tutte le ricette</h3>
	  <ul>
	   <c:forEach var="z" items="${list}">
									<li><h4><a href="/Ricetta/?key=${f:h(z.key)}">${f:h(z.nome)}</a></h4>
										<ul>
										<li> ${f:h(z.descr)}</li>
										</ul>
									</li>
		</c:forEach>
		</ul>
</div>
 <div class="footer">
  		<div>&nbsp;<b> Ti trovi in -->  Ricette --> Tutte le ricette</b> </div><div ALIGN=CENTER><p> <b>
  	<script type="text/javascript">
 <!--
  var data = new Date();
  var Hh, Mm, Ss, giorno,mese, anno;
  giorno = data.getDate()+ "/" ;
  mese = data.getMonth()+1+ "/";
  anno = data.getFullYear();
  Hh = data.getHours() + ":";
  Mm = data.getMinutes() + ":";
  Ss = data.getSeconds() ;
  document.write("Sono le ore " + Hh + Mm + Ss+ " E' il giorno " + giorno + mese + anno);
 //-->
</script></p> </b></div>

    <p> Progetto di Applicazioni Ipermediali 2011 di Andrea Mambretti - Elio Ermini - Luca Muccignato </p>
    <!-- end .footer -->
   </div>
  <!-- end .container -->
  </div>
</body>
</html>