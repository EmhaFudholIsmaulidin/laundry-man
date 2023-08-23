<%--
  Created by IntelliJ IDEA.
  User: emhaismaulidin
  Date: 8/15/23
  Time: 1:01 PM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta name="layout" content="main"/>
    <title></title>
</head>

<body>
<div class="wrapper">
    <div class="container">
        <div class="inputcontainer" >
            <g:form class="form" controller="Customer" action="update">
                <div style="display: flex" class="inputform">
                    <ul class="label">
                        <li>Nama Pelanggan </li>
                        <li>E-mail </li>
                        <li>No. Telepon </li>
                    </ul>
                    <ul class="input">
                        <li><g:hiddenField name="editId" value="${customer.id}"/></li>
                        <li><g:textField name="name" value="${customer.name}"/></li>
                        <li><g:textField name="email" value="${customer.email}"/></li>
                        <li><g:textField name="telephone" value="${customer.telephone}"/></li>
                    </ul>
                </div>
                <g:submitButton class="button" name="create" value="Create"></g:submitButton>
            </g:form>
            <g:if test="${flash.message}">
                <div class="message" role="status">${flash.message}</div>
            </g:if>
        </div>
    </div>
</div>
</body>
</html>