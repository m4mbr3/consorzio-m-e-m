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
  
   <h3>The standard Lorem Ipsum passage, used since the 1500s </h3>
<p>
"Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum."
</p>
<h3>Section 1.10.32 of "de Finibus Bonorum et Malorum", written by Cicero in 45 BC</h3>

<p>"Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo. Nemo enim ipsam voluptatem quia voluptas sit aspernatur aut odit aut fugit, sed quia consequuntur magni dolores eos qui ratione voluptatem sequi nesciunt. Neque porro quisquam est, qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit, sed quia non numquam eius modi tempora incidunt ut labore et dolore magnam aliquam quaerat voluptatem. Ut enim ad minima veniam, quis nostrum exercitationem ullam corporis suscipit laboriosam, nisi ut aliquid ex ea commodi consequatur? Quis autem vel eum iure reprehenderit qui in ea voluptate velit esse quam nihil molestiae consequatur, vel illum qui dolorem eum fugiat quo voluptas nulla pariatur?"
</p>
<h3>1914 translation by H. Rackham</h3>
<p>
"But I must explain to you how all this mistaken idea of denouncing pleasure and praising pain was born and I will give you a complete account of the system, and expound the actual teachings of the great explorer of the truth, the master-builder of human happiness. No one rejects, dislikes, or avoids pleasure itself, because it is pleasure, but because those who do not know how to pursue pleasure rationally encounter consequences that are extremely painful. Nor again is there anyone who loves or pursues or desires to obtain pain of itself, because it is pain, but because occasionally circumstances occur in which toil and pain can procure him some great pleasure. To take a trivial example, which of us ever undertakes laborious physical exercise, except to obtain some advantage from it? But who has any right to find fault with a man who chooses to enjoy a pleasure that has no annoying consequences, or one who avoids a pain that produces no resultant pleasure?"
</p>
<h3>Section 1.10.33 of "de Finibus Bonorum et Malorum", written by Cicero in 45 BC</h3>
<p>
"At vero eos et accusamus et iusto odio dignissimos ducimus qui blanditiis praesentium voluptatum deleniti atque corrupti quos dolores et quas molestias excepturi sint occaecati cupiditate non provident, similique sunt in culpa qui officia deserunt mollitia animi, id est laborum et dolorum fuga. Et harum quidem rerum facilis est et expedita distinctio. Nam libero tempore, cum soluta nobis est eligendi optio cumque nihil impedit quo minus id quod maxime placeat facere possimus, omnis voluptas assumenda est, omnis dolor repellendus. Temporibus autem quibusdam et aut officiis debitis aut rerum necessitatibus saepe eveniet ut et voluptates repudiandae sint et molestiae non recusandae. Itaque earum rerum hic tenetur a sapiente delectus, ut aut reiciendis voluptatibus maiores alias consequatur aut perferendis doloribus asperiores repellat."
</p>
<h3>1914 translation by H. Rackham</h3>
<p>
"On the other hand, we denounce with righteous indignation and dislike men who are so beguiled and demoralized by the charms of pleasure of the moment, so blinded by desire, that they cannot foresee the pain and trouble that are bound to ensue; and equal blame belongs to those who fail in their duty through weakness of will, which is the same as saying through shrinking from toil and pain. These cases are perfectly simple and easy to distinguish. In a free hour, when our power of choice is untrammelled and when nothing prevents our being able to do what we like best, every pleasure is to be welcomed and every pain avoided. But in certain circumstances and owing to the claims of duty or the obligations of business it will frequently occur that pleasures have to be repudiated and annoyances accepted. The wise man therefore always holds in these matters to this principle of selection: he rejects pleasures to secure other greater pleasures, or else he endures pains to avoid worse pains."
</p>
</div>
  <div class="footer">
  		<div>&nbsp;<b> Ti trovi in -->  Le Nostre Offerte</b> </div><div ALIGN=CENTER><p> <b>
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
