<!doctype html>
<html lang="en" class="no-js">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Roboto+Condensed:wght@0,300;0,400;0,700;1,300;1,400;1,700&display=swap" rel="stylesheet">
    <title>
        <g:layoutTitle default="Laundry Man"/>
    </title>
    <meta name="viewport" content="width=device-width, initial-scale=1"/>

    <asset:stylesheet src="layout.css"/>

    <g:layoutHead/>
</head>
<body>

    <div class="header">
        <a href="/">
            <img src="/assets/logolaundry.png">
        </a>
    </div>

    <button style="opacity: 0.001; position: absolute; top: 20px; left: 20px" onclick="location.href='../admin'" type="button" id="dark">Admin</button>
    <g:layoutBody/>

    <asset:javascript src="application.js"/>

</body>
</html>
