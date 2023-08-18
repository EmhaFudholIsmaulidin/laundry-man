<%--
  Created by IntelliJ IDEA.
  User: emhaismaulidin
  Date: 8/16/23
  Time: 12:50 PM
--%>

<!DOCTYPE html>
<html>
    <head>
        <meta name="layout" content="main"/>
        <style>
        </style>

    </head>
    <body>
        <div class="wrapper">
            <div class="container">
                <div id="listpelanggan">
                    <table id="tablepelanggan">
                        <tr>
                            <th>No.</th>
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
                                    <g:link class="edit" action="edit" params="[id: entry.id, itemName: entry.itemName, itemPrice: entry.itemPrice, description: entry.description, durationHrs: entry.durationHrs]">
                                        <button>Edit</button>
                                    </g:link>
                                    <g:link class="delete" action="delete" params="[id: entry.id]" >
                                        <button>Delete</button>
                                    </g:link>
                                </td>
                            </tr>
                        </g:each>
                    </table>
                </div>
                <g:link class="create" action="create">
                    <div style="padding: 20px; text-align: center; border-radius: 25px; background-color: lightcoral" class="button">
                        Add
                    </div>
                </g:link>
                <g:if test="${flash.message}">
                    <div class="message" role="status">${flash.message}</div>
                </g:if>
            </div>

        </div>


    <script>

    </script>
    </body>
</html>