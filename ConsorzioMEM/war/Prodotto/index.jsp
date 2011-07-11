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

				immagini = new Array();
				icone = new Array();
				rel = new Array();
				var numeroimg=0;
				var numeropagine=0;
				var stato =0;
function avanti()
	{
	 	if (stato < numeropagine)
		{
			stato++;
			var i,j;
			j=0;
			i =(12*stato);
			//alert(i+","+j+","+stato+","+numeroimg);
			for (; i<(12*(stato	+1)); i++)
			{
					
					if(i < numeroimg)
					{
						document.images[2+j].src = icone[i];
						document.links[8+j].href = immagini[i];
						document.links[8+j].rel = rel[i];
						}
					else
					{ 
					document.images[2+j].src = "/print_x.png";
					document.links[8+j].href = "";
					document.links[8+j].rel = "";
					}
					j++;
					
			}
		}	
		else alert("Non sono disponibili pagine successive");
 		
	}
	function indietro()
	{
		  	if (stato > 0)
		{
			stato --;
			var i,j;
			j=0;
			i =(3*stato);
			//alert(i+","+j+","+stato+","+numeroimg);
			for (; i<(3*(stato	+1)); i++)
			{
					
					if(i < numeroimg)
					{
						document.images[2+j].src = icone[i];
						document.links[15+j].href = immagini[i];
						document.links[15+j].rel = rel[i];
					}
					else
					{ 
						document.images[2+j].src = "/print_x.png";
						document.links[15+j].href = "";
						document.links[15+j].rel = "";

					}
					j++;
					
			}
		}	
		else alert("Non sono disponibili pagine precedenti");
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

  <h3 class="titolo_tutti_prodotti">Prodotto ${f:h(Prodotto.nome)}</h3>
  
		

		
	<p>
		 	<c:forEach var="z" items="${ListaImmagini}">
				<a href="/Upload/image?key=${f:h(z.key)}&v=${f:h(z.version)}" title="${f:h(z.descr)}" rel="lightbox[roadtrip]"><img class="img" src="/Upload/image?key=${f:h(z.key)}&v=${f:h(z.version)}" /></a>
			</c:forEach>
</p>
  		<!--
  			<img src="/arrow_sx.png" onClick="indietro()" style="height:21px; width:15px; left:5px;  top:210px;" id="sinistra" name="sinistra"  />
  			<a href="${f:h(z.nome)}" rel="lightbox"><img src="${f:h(z.nome)}"  style=" height:76px; width:106px; left:53px; top:40px;" id="icon1" name="icon1"  /></a>
			<a href="" rel="lightbox[roadtrip]"><img src=""  style=" height:76px; width:106px; left:197px; top:40px;" id="icon2" name="icon2" /></a>
			<a href="" rel="lightbox[roadtrip]"><img src=""  style=" height:76px; width:106px; left:341px; top:40px;" id="icon3" name="icon3" /></a>
			<img src="/arrow_dx.png" onClick="avanti()" style="height:21px; width:15px; left:480px; top:210px;" id="destra" name="destra" /></a>
			-->
			<h3> Descrizione Prodotto</h3>	
			 <p> ${f:h(Prodotto.descr)}</p>
				<p><h3> Prezzo:  <h5>${f:h(Prodotto.prezzo)}  ${f:h(Prodotto.UMisura)}</h5></h3></p>
		

		
</div>
  <div class="footer">
    <p> Sono le ore <%= new java.util.Date() %> .</p>
    <!-- end .footer -->
   </div>
  <!-- end .container -->
  </div>
</body>
</html>
