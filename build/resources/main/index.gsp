<!doctype html>
<html>
<head>
    <meta name="layout"/>
    <title>Laundry Man!</title>

    <link href="../assets/stylesheets/application.css"/>
</head>
    <body>
    <div class="wrapper">
        <div class="container">
            <h1>Laundry<br>Man</h1>
        </div>
        <p>Press spacebar to skip.</p>
    </div>
        <g:each var="c" in="${grailsApplication.controllerClasses.sort{it.fullName}}">
            <li class="controller">
                <g:link controller="${c.logicalPropertyName}">${c.fullName}</g:link>
            </li>
        </g:each>
    </body>
</html>
