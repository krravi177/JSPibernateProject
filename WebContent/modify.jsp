<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<!-- <script type="text/javascript">
 function getShgData()
 {
var shgCode= document.getElementById("shgCode").value;
	 
	alert("k "+shgCode); 
	
	 var h;
		if (window.XMLHttpRequest) {
			// code for IE7+, Firefox, Chrome, Opera, Safari
			h = new XMLHttpRequest();
		} else {// code for IE6, IE5
			h = new ActiveXObject("Microsoft.XMLHTTP");
		}

		h.open("GET", "MS?shgCode=" + shgCode, true);
		h.send();
	 
 }


</script> -->

</head>
<body>
<form action="MS">
<table border="3" bgcolor="yellow" align="center">
<tr><td>SHG CODE</td><td><input type="text" name="shgCode" id="shgCode" onblur="getShgData()"></td></tr>
<tr><td><input type="submit" value="Modify"></td></tr>
</table>

</form>
</body>
</html>