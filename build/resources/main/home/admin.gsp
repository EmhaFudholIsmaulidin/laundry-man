<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Laundry Man!</title>
</head>
    <body>
        <div class="wrapper">
            <div class="container">
                <h2>Admin View:</h2>
                <br>
                <div class="linkwrapper">
                    <g:each var="c" in="${grailsApplication.controllerClasses.sort{it.name}}">
                        <li class="controller" style="font-size: 2rem; text-decoration: none; list-style: none">
                            <g:link controller="${c.logicalPropertyName}">${c.name}</g:link>
                        </li>
                    </g:each>
                </div>
                <br>
            </div>
        </div>
    </body>
</html>
