<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
 <%@ page import="java.util.List" %>
     <%@ page import="max.parents.SHGBean" %>
     <%@ page import="max.parents.MemberBean" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
List<SHGBean> list=(List<SHGBean>)request.getAttribute("lst");
 for(SHGBean p:list)
 {
%>

<table border="3" bgcolor="cyan" align="center">
<tr><td colspan="4" bgcolor="red" align="center">SHG DETAIL FOR MODIFY</td></tr>
<tr><td>SHGCODE</td><td><input type="text" name="shgCode" value="<%=p.getShgCode()%>"></td>
<td>SHG NAME</td><td><input type="text" value="<%=p.getGname()%>"></td>

</tr>

<tr><td>State Name</td><td><input type="text" value="<%=p.getStCode()%>"></td>
<td>IFSC</td><td><input type="text" value="<%=p.getIfsc()%>"></td>
<tr><td>Account</td><td><input type="text" value="<%=p.getAcc()%>"></td>

</tr>

<tr><td colspan="4" bgcolor="yellow" align="center">CHILD DETAIL</td></tr>
<tr><td>MEMCODE</td><td>Name</td><td>AGE</td><td>Adhar</td></tr>

  <%
    List<MemberBean> lst=p.getMlist();
  
	   for(MemberBean q:lst)
	   {
  
  %>
<tr><td><input type="text" value="<%=q.getMemCode()%>"></td>
<td><input type="text" name="cname" value="<%=q.getCname()%>"></td>
<td><input type="text" value="<%=q.getAge()%>"></td>
<td><input type="text" value="<%=q.getCadhar()%>"></td>


</tr>

<%} }%>

<tr><td><input type="submit" value="UPDATE"></td></tr>
</table>

</body>
</html>