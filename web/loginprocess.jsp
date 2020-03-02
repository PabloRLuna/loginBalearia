<%--
  Created by IntelliJ IDEA.
  User: todop
  Date: 28/02/2020
  Time: 16:35
  To change this template use File | Settings | File Templates.
--%>
<%@page import="bean.LoginDao"%>

<jsp:useBean id="obj" class="bean.LoginBean"/>

<jsp:setProperty property="*" name="obj"/>
<%
    boolean status= LoginDao.validate(obj);
    if(status){
        out.println("You r successfully logged in");
        session.setAttribute("session","TRUE");
    }
    else
    {
        out.print("Sorry, email or password error");
%>
<jsp:include page="index.jsp"></jsp:include>
<%
    }
%>
