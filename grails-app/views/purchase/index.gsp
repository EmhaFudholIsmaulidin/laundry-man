<!DOCTYPE html>
<html>
    <head>
        <meta name="layout" content="main"/>
    </head>
    <body>
        <div class="wrapper">
            <div class="container">
                <g:if test="${purchase}">
                    <table class="indextable">
                        <tr>
                            <th>No.</th>
                            <th>Nama Pelanggan</th>
                            <th>Nama Kurir</th>
                            <th>Alamat Tujuan</th>
                            <th>Tanggal Pembelian</th>
                            <th>Tanggal Pengantaran</th>
                            <th>Total Harga</th>
                        </tr>
                        <g:each var="entry" in="${purchase}">
                            <tr>
                                <td>${entry.id}</td>
                                <td>${entry.customer.name}</td>
                                <td>${entry.courier.courierName}</td>
                                <td>${entry.address.fullAddress}</td>
                                <td>${entry.purchaseDate}</td>
                                <td>${entry.deliveryDate}</td>
                                <td>Rp. ${entry.totalPrice}</td>
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