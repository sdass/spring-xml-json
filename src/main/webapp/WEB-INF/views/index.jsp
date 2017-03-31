<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%String baseUrl = getServletContext().getInitParameter("BaseUrl"); %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Spring json-xml client</title>
<script type="text/javascript" src="<%out.print(baseUrl); %>resources/javascript/jquery.min.js" ></script>

<script type="text/javascript" src="http://cdnjs.cloudflare.com/ajax/libs/x2js/1.2.0/xml2json.js"></script>


<script type="text/javascript" src="<%out.print(baseUrl); %>resources/javascript/index.js" ></script>

<script type="text/javascript">

var urlbase =  "<% out.print(baseUrl); %>";

$(document).ready(function(){
	pageObject.initpage(urlbase);
});
</script>

</head>
<body>


indexed file2

<div>
	<div>
	    <textarea id="txtResult" readonly="readonly"></textarea>
	</div>
	
	<div>
	    <span id="spanMessage" class="msgNormal">
	        Click the buttons to test the rest calls...
	    </span>
	</div>
	
	<div>
	    <input type="button" id="btnGetXML" value="GET XML" />
	    <input type="button" id="btnGetJson" value="GET Json" />
	    <input type="button" id="btnPostJsonAcceptXML" value="POST Json Accept XML" />
	    <input type="button" id="btnPOSTXMLAcceptJson" value="POST XML Accept Json" />
	</div>
</div>

</body>
</html>