<!DOCTYPE html>
<html>
    <head>
        <meta name="layout" content="main"/>
        <style>
            :root {
                --main-color: rgb(255, 255, 255);
                --secondary-color: rgb(0, 0, 0);
            }
            body {

            }
            div {

            }
        </style>

    </head>
    <body>
        <div class="wrapper">
            <div class="container">
                <g:each var="c" in="${items.sort{it.itemName}}">
                    <li class="controller" style="font-size: 2rem; text-decoration: none; list-style: none">
                        ${c.itemName}
                    </li>
                </g:each>
                <div style="padding: 20px; text-align: center; border-radius: 25px; background-color: lightcoral" class="button">
                    <g:link class="create" action="create">Add</g:link>
                </div>
                <div style="padding: 20px; text-align: center; border-radius: 25px; background-color: #5ef065" class="button">
                    <g:link class="delete" action="delete">Hapus</g:link>
                </div>
                <g:if test="${flash.message}">
                    <div class="message" role="status">${flash.message}</div>
                </g:if>
            </div>

        </div>


    <script>

    </script>
    </body>
</html>