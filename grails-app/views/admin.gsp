<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Laundry Man!</title>
</head>
    <body>
        <div class="wrapper">
            <div class="container">
                <h1 style="font-size: 4rem">Admin View:</h1>
                <g:each var="c" in="${grailsApplication.controllerClasses.sort{it.name}}">
                    <li class="controller" style="font-size: 2rem; text-decoration: none; list-style: none">
                        <g:link controller="${c.logicalPropertyName}">${c.name}</g:link>
                    </li>
                </g:each>
                <br>
                <g:submitButton name="create" value="Pencet Kalau Gabut" />
            </div>
        </div>
    </body>
</html>
