<!DOCTYPE html>
<html>
    <head>
        <meta name="layout" content="main"/>
    </head>
    <body>
        <div class="wrapper">
            <div class="container">
                <g:if test="${items}">
                    <table class="indextable">
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
                                <td>Rp. ${entry.itemPrice}</td>
                                <td>${entry.description}</td>
                                <td>${entry.durationHrs} jam</td>
                                <td>
                                    <g:link class="edit" action="edit" params="[id: entry.id]">
                                        <div class="button button-s">
                                            Edit
                                        </div>
                                    </g:link>
                                    <g:link class="delete" action="delete" params="[id: entry.id]" >
                                        <div class="button button-s">
                                            Delete
                                        </div>
                                    </g:link>
                                </td>
                            </tr>
                        </g:each>
                    </table>
                </g:if>
                <g:else>
                    <div>
                        <h1>No Data Yet</h1>
                    </div>
                </g:else>
                <g:link class="create" action="create">
                    <div class="button button-l">
                        Add Data
                    </div>
                </g:link>
                <g:if test="${flash.message}">
                    <div class="message" role="status">${flash.message}</div>
                </g:if>
            </div>
        </div>
    </body>
</html>