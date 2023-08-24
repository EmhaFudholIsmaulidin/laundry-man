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
                            <th></th>
                            <th>No. Transaksi</th>
                            <th>Nama Pelanggan</th>
                            <th>Jenis Jasa</th>
                            <th>Jumlah</th>
                        </tr>
                        <g:each var="entry" in="${purchaseItems}">
                            <tr>
                                <td>${entry.id}</td>
                                <td>${entry.purchase.id}</td>
                                <td>${entry.purchase.customer.name}</td>
                                <td>${entry.items.itemName}</td>
                                <td>${entry.quantity}</td>
                                <td class="buttonlayout">
                                    <g:link class="edit" action="edit" params="[id: entry.id]">
                                        <div class="button button-s">
                                            Edit
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