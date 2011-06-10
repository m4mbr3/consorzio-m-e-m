<!doctype html>
<html>
  <head>
    <meta http-equiv="content-type" content="text/html; charset=UTF-8">
    <title>Consorzio di 3 disperati</title>
    <script type="text/javascript" language="javascript"
      src="main/main.nocache.js"></script>
	<link rel="stylesheet" type="text/css" href="/home.css" />  
  </head>


<body>

<div class="container">
  <div class="header"><a href="#"><img src="/biologo.png" width="90" height="90" id="Insert_logo" style="background: #C6D580; display:block;" /></a> 
    <!-- end .header --></div>
  <div class="sidebar1">
    <ul class="nav">
      <li><a href="/Tweet.jsp">Collegamento uno</a></li>
      <li><a href="#">Collegamento due</a></li>
      <li><a href="#">Collegamento tre</a></li>
      <li><a href="#">Collegamento quattro</a></li>
    </ul>
   <iframe src="javascript:''" id="__gwt_historyFrame" tabIndex='-1' 	style="position:absolute;width:0;height:0;border:0"> <p> I collegamenti qui sopra mostrano una struttura di navigazione di base mediante un elenco non ordinato con stili CSS. Utilizzate questa struttura come punto di partenza e modificate le proprietà per produrre un look personalizzato. Se vi servono dei menu flyout, createli utilizzando un menu Spry, un menu widget di Adobe Exchange o una varietà di altre soluzioni javascript o CSS.</p>    </iframe>
   
    <p>Se volete posizionare l'area di navigazione in alto, dovete semplicemente spostare il ul.nav nella parte superiore della pagina e ricreare gli stili.</p>
    <!-- end .sidebar1 --></div>
  <div class="content">
    <h1>Istruzioni</h1>
    <p>Tenete presente che il codice CSS di questi layout contiene molti commenti. Se solitamente lavorate nella vista Progettazione, visualizzate almeno momentaneamente la vista Codice per consultare i suggerimenti sull'uso del codice CSS nei layout fissi. Potete rimuovere questi commenti prima di lanciare il sito. Per saperne di più sulle tecniche utilizzate in questi layout CSS, leggete questo articolo sul Centro per gli sviluppatori Adobe - <a href="http://www.adobe.com/go/adc_css_layouts">http://www.adobe.com/go/adc_css_layouts</a>.
     <h2>Metodo di clearing</h2>
    <p>Poiché tutte le colonne sono con float, questo layout utilizza una dichiarazione clear:both nella regola .footer. Questa tecnica di clearing obbliga il .container a capire dove terminano le colonne per fare apparire i bordi o i colori di bordo che applicate al .container. Se il vostro design richiede la rimozione di .footer dal .container, dovete utilizzare un metodo di clearing differente. Quello più affidabile prevede l'aggiunta di un &lt;br class=&quot;clearfloat&quot; /&gt; o &lt;div  class=&quot;clearfloat&quot;&gt;&lt;/div&gt; dopo l'ultima colonna con float (ma prima della chiusura del .container). L'effetto di clearing sarà lo stesso.</p>
    <h3>Sostituzione logo</h3>
    <p>In questo layout è stata utilizzata un'immagine segnaposto nell'area .header, nel punto in cui probabilmente inserirete un logo. Si consiglia di rimuovere il segnaposto e sostituirlo con il vostro logo collegato. </p>
    <p> Tenete presente che se utilizzate la finestra di ispezione Proprietà per accedere all'immagine del logo utilizzando il campo Orig. (anziché rimuovere e sostituire il segnaposto), dovrete rimuovere le proprietà di visualizzazione e sfondo in linea. Questi stili in linea vengono utilizzati solo per fare apparire il segnaposto del logo nei browser a scopo di dimostrazione. </p>
    <p>Per rimuovere gli stili, controllate che il pannello Stili CSS sia visualizzato nella versione Corrente. Selezionate l'immagine e, nel riquadro Proprietà del pannello Stili CSS, fate clic con il pulsante destro ed eliminate le proprietà di visualizzazione e sfondo (display e background). (Naturalmente potete sempre accedere direttamente al codice ed eliminare manualmente gli stili in linea dall'immagine o dal segnaposto.)</p>
    <h4>Sfondi</h4>
    <p>Normalmente, il colore di sfondo di un div viene visualizzato solo per tutta la lunghezza del contenuto. Ciò significa che se state utilizzando un colore di sfondo o un bordo per creare l'aspetto di una colonna laterale, questa non si estenderà fino al piè di pagina bensì si fermerà alla fine del contenuto. Se il div .content includerà sempre altro contenuto, potete inserire un bordo nel div .content per dividerlo dalla colonna.</p>
    <!-- end .content --></div>
  <div class="footer">
    <p> Sono le ore <%= new java.util.Date() %> .</p>
    <!-- end .footer --></div>
  <!-- end .container --></div>
</body>
</html>
