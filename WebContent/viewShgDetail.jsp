<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.List" %>
     <%@ page import="max.parents.SHGBean" %>
     <%@ page import="max.parents.MemberBean" %>
    <jsp:useBean id="pDAO" class="max.parents.ParentsDAO"/>
    <jsp:useBean id="lDAO" class="max.location.LoactionDAO"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="view.jsp"/>

<table border="2" bgcolor="cyan" align="center">

<tr><td>SHGCode</td><td>State Name</td><td>SHG Name</td><td>IFSC</td><td>Account Number</td></tr>

<%
String shgCode=request.getParameter("shgCode");
   List<SHGBean> list=pDAO.viewDetail(Integer.parseInt(shgCode));
     for(SHGBean p:list) 
     {
%>
<tr><td colspan="5" bgcolor="pink" align="center"> SHG CODE  <%=p.getShgCode()%></td></tr>
<tr><td><%=p.getShgCode()%></td>
<td><%=lDAO.getStateNameByCode(Integer.parseInt(p.getStCode()))%></td>
<td><%=p.getGname()%></td>
<td><%=p.getIfsc()%></td>
<td><%=p.getAcc()%></td>

<tr><td colspan="5" bgcolor="red" align="center"> Member Details</td></tr>
<tr align="center"><td >Member Code</td><td>Member Name</td><td>Age</td><td>Adhar</td></tr>
<%
List<MemberBean> mlist= p.getMlist();
   for(MemberBean q:mlist)
   {
	 
	   %>
	   
	<tr><td><%=q.getMemCode() %></td>
	<td><%=q.getCname() %></td>
	<td><%=q.getAge() %></td>
	<td><%=q.getCadhar() %></td>
	
	</tr>   
	   
	   
  <% 
   }
     }

%>


</table>

</body>
</html>