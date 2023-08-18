<!DOCTYPE html>
<html>
    <head>
        <meta name="layout" content="main"/>
    </head>
    <body>
        <div class="wrapper">
            <div class="container">
                <g:if test="${purchaseItems}">
                    <table class="indextable">
                        <tr>
                            <th>No. Paket</th>
                            <th>No. Transaksi</th>
                            <th>No. ID Jasa</th>
                        </tr>
                        <g:each var="entry" in="${purchaseItems}">
                            <tr>
                                <td>${entry.id}</td>
                                <td>${entry.purchase.id}</td>
                                <td>${entry.items.id}</td>
                                <td>
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