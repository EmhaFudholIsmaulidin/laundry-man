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
            <div class="inputan" >
                <g:form style="display: flex" controller="Purchase" action="save">
                    <div class="label">
                        <ul style="display: flex; flex-direction: column; justify-content: space-between" >
%{--                            <li>Pelanggan : </li>--}%
%{--                            <li>Jenis Jasa : </li>--}%
                        </ul>
                    </div>
                    <div class="inputan">
                        <ul>
                            <li><g:select name="customer" from="${customList}" optionKey="id" optionValue="name" required="true" noSelection="['null': 'Pilih Pelanggan']"/></li>
                            <li><g:select name="item" from="${itemList}" optionKey="id" optionValue="itemName" required="true" noSelection="['null': 'Pilih Jasa']"/></li>
                            <li><g:select name="courier" from="${courierList}" optionKey="id" optionValue="courierName" required="true" noSelection="['null': 'Pilih Kurir']"/></li>
                            <li><g:select name="address" from="${addressList}" optionKey="id" optionValue="fullAddress" required="true" noSelection="['null': 'Pilih Alamat']"/></li>
                            <li><g:textField name="quantity"/></li>
                        </ul>
                    </div>
                    <g:submitButton name="create" value="Gasss">Uyyyyy</g:submitButton>
                </g:form>
                <g:if test="${flash.message}">
                    <div class="message" role="status">${flash.message}</div>
                </g:if>
            </div>
        </div>
    </div>
</body>
</html>