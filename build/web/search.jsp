<%-- 
    Document   : search
    Created on : Apr 26, 2025, 8:59:02 AM
    Author     : Computing Fundamental - HCM Campus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Search Page</title>
    </head>
    <body>
        <!--your code here-->

        <form action="MainController" method="post">
            Search: <input type="text" name="search"/>
            <input type="submit" name="action" value="Search"/>
        </form>

    <c:forEach var="order" items="${requestScope.Orders_List}" varStatus="counter">
        ${counter.count}
        ${order.orderID}
        ${order.orderDate}
        ${order.customer}
        ${order.address}
        ${order.totalAmount}
        ${order.status}

        <a href="MainController?action=Update&OrderId=${order.orderID}">Update</a>
        <br/>
    </c:forEach>
</body>
</html>
