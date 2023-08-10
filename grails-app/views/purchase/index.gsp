<%--
  Created by IntelliJ IDEA.
  User: emhaismaulidin
  Date: 8/10/23
  Time: 2:49 PM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title></title>
</head>

<body>
    <h1>A Controller Index</h1>

    <!-- Button to fetch and display the list -->
    <button id="load-list">Load List</button>

    <!-- Container for displaying the list -->
    <div id="list-container"></div>

    <g:each in="${cabang}" var="branch">
        <p>Cabang: ${branch.branchName}</p>
%{--        <p>Alamat: ${branch.address}</p>--}%
    </g:each>

    <script>
    </script>
</body>
</html>