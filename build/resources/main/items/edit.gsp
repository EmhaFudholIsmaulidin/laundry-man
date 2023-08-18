<%--
  Created by IntelliJ IDEA.
  User: emhaismaulidin
  Date: 8/16/23
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
        <div class="inputan" >
            <g:form style="display: flex" controller="Items" action="update">
                <g:if test="${id}">
                    <g:set var="x" value="true"/>
                </g:if>
                <div class="label">
                    <ul style="display: flex; flex-direction: column; justify-content: space-between" >
                        <li>Nama Jasa : </li>
                        <li>Harga Jasa : </li>
                        <li>Deskripsi : </li>
                        <li>Durasi Jasa : </li>
                    </ul>
                </div>
                <div class="inputan">
                    <ul>
                        <li><g:hiddenField name="editId" value="${x?id:''}"/></li>
                        <li><g:textField name="itemName" value="${x?itemName:''}"/></li>
                        <li><g:textField name="itemPrice" value="${x?itemPrice:''}"/></li>
                        <li><g:textField name="description" value="${x?description:''}"/></li>
                        <li><g:textField name="durationHrs" value="${x?durationHrs:''}"/></li>
                    </ul>
                </div>
                <g:submitButton name="edit" value="Gasss"></g:submitButton>
            </g:form>
        </div>
    </div>
</div>
</body>
</html>