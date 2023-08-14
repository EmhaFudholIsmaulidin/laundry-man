<!DOCTYPE html>
<html>
    <head>
        <meta name="layout"/>
        <g:set var="entityName" value="${message(code: 'items.label', default: 'Items')}" />
        <title><g:message code="default.list.label" args="[entityName]" /></title>
        <style>
            body {
                background-color: #000000;
                transition: .5s ease;
            }
            div {
                color: #ffffff;
                transition: .5s ease;
            }
        </style>

    </head>
    <body id="badan">
    <div id="div">
        ${items.itemName}
        ${a.courierName}
    </div>
    <button onclick="modeGelap()" id="dark">Pencet Aku Cuyyyy</button>

    <script>
        var flagdarkMode = false;

        function modeGelap() {
            if (document.getElementById("badan").style.backgroundColor === "rgb(255, 255, 255)"){
                document.getElementById("badan").style.backgroundColor = "#000000";
                document.getElementById("div").style.color = "#ffffff";
            }else{
                document.getElementById("badan").style.backgroundColor = "#ffffff";
                document.getElementById("div").style.color = "#000000";
            }
        };
    </script>
    </body>
</html>