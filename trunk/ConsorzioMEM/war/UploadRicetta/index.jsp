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
  				<h2> Carica una Ricetta!!!</h2>
				<form method="post" action="/UploadRicetta/">
				<p><label id="Nome_label">Nome</label> 
								<p><input type="text" id="Nome" name="Nome"  />		</p></p>
				<p><label id="Ricetta_label">Ricetta</label>
								<p><textarea id="Ricetta"  rows="15" cols="80" name="Ricetta" ></textarea></p></p>
				<p><label id="Ingredienti_label">Ingredienti</label>
								<p><textarea id="ingredienti"  rows="15" cols="80" name="ingredienti" ></textarea></p></p>
				<p><label id="Pre_label">Preparazione</label>
								<p><textarea id="preparazione"  rows="15" cols="80" name="preparazione" ></textarea></p></p>
				<p><label id="Consigli_label">Consigli</label>
								<p><textarea id="consigli"  rows="15" cols="80" name="consigli" ></textarea></p></p>
				<p><label id="Descr_label">Descrizione</label>
								<p><textarea id="Descr" rows="15" cols="40" name="Descr"></textarea></p></p>
				<p><label id="Categoria_label">Categoria </label>
								<select id="Categoria"  name="Categoria">
								<option>Antipasto</option>
				  				<option>Primo</option>
			  					<option>Secondo</option>
			  					<option>PiattoUnico</option>
			  					<option>Salsa</option>
								</select></p>
				<p><label id="Prodotto_label">Prodotto</label>
								<select id="key"  name="key">
								<c:forEach var="e" items="${listProdotti}">
								<option value="${f:h(e.key)}">${f:h(e.nome)}</option>
								</c:forEach>
				  				</select></p>
				<p><label id="Diff_label">Difficoltà</label>
								<select id="Diff"  name="Diff">
								
								<option>Bassa</option>
								<option>Media</option>
								<option>Alta</option>
								
				  				</select></p>
				<p><label id="min_cot_label">Minuti Di Cottura</label> <input type="text" id="min_cot" name="min_cot"  /></p>
				<p><label id="min_pre_label">Minuti Di Preparazione</label> <input type="text" id="min_pre" name="min_pre"/></p>
				<p><label id="x_num_persone_label">Per Quante persone?</label> <input type="text" id="x_num_persone" name="x_num_persone"/></p>						
				<input type="submit" name="Carica" id="Carica" value="Carica">
				</form>
</div>
 <div class="footer">
  		<div>&nbsp;<b> Ti trovi in -->  Caricamento Ricette</b> </div><div ALIGN=CENTER><p> <b>
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