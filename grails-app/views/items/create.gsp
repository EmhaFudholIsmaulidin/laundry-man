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
                <g:form style="display: flex" controller="Items" action="save">
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
                            <li><g:textField name="itemName"/></li>
                            <li><g:textField name="itemPrice"/></li>
                            <li><g:textField name="description"/></li>
                            <li><g:textField name="durationHrs"/></li>
                        </ul>
                    </div>
                    <g:submitButton name="create" value="Gasss"></g:submitButton>
                </g:form>
            </div>
        </div>
    </div>
</body>
</html>