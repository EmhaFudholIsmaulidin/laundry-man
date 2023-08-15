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
                <div id="listpelanggan">
                    <table id="tableapelanggan">
                        <tr>
                            <th>No</th>
                            <th>Nama Jasa</th>
                            <th>Tarif</th>
                            <th>Deskripsi</th>
                            <th>Lama Pengerjaan</th>
                        </tr>
                        <g:each var="entry" in="${items}">
                            <tr>
                                <td>${entry.id}</td>
                                <td>${entry.itemName}</td>
                                <td>${entry.itemPrice}</td>
                                <td>${entry.description}</td>
                                <td>${entry.durationHrs}</td>
                                <td>
                                    <button style="padding: 5px; text-align: center; border-radius: 25px; background-color: cadetblue">Edit</button>
                                    <button style="padding: 5px; text-align: center; border-radius: 25px; background-color: darkorange">Delete</button></td>
                            </tr>
                        </g:each>
                    </table>
                </div>
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