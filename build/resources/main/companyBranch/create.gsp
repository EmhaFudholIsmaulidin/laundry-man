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
                <g:form class="form" controller="CompanyBranch" action="save">
                    <div style="display: flex" class="inputform">
                        <ul class="label">
                            <li>Nama Cabang </li>
                            <li>Alamat Cabang </li>
                        </ul>
                        <ul class="input">
                            <li><g:hiddenField name="editId"/></li>
                            <li><g:textField name="branchName"/></li>
                            <li><g:textField name="address"/></li>
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