<%--
  Created by IntelliJ IDEA.
  User: emhaismaulidin
  Date: 8/15/23
  Time: 1:01 PM
--%>

<%@ page import="laundry.man.Customer" contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta name="layout" content="main"/>
    <title></title>
</head>

<body>
<div class="wrapper">
    <div class="container">
        <div class="inputcontainer" >
            <g:form class="form" controller="PurchaseItems" action="update">
                <div style="display: flex" class="inputform">
                    <ul class="label">
                        <li>Nama Pemesan </li>
                        <li>Jenis Pesanan </li>
                        <li>Jumlah Kiloan/Satuan </li>
                    </ul>
                    <ul class="input">
                        <li><g:hiddenField name="editId" value="${purchaseItems.id}"/></li>
                        <li><g:field type="text" name="name" readonly="readonly" value="${purchaseItems.purchase.customer.name}"/></li>
                        <li><g:field type="text" name="itemName" readonly="readonly" value="${purchaseItems.items.itemName}"/></li>
                        <li><g:textField name="quantity" value="${purchaseItems.quantity}"/></li>
                    </ul>
                </div>
                <g:submitButton class="button button-l" name="edit" value="Edit"/>
            </g:form>
            <g:if test="${flash.message}">
                <div class="message" role="status">${flash.message}</div>
            </g:if>
        </div>
    </div>
</div>
</body>
</html>