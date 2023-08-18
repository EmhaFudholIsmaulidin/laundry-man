<!DOCTYPE html>
<html>
    <head>
        <meta name="layout" content="main"/>
    </head>
    <body>
        <div class="wrapper">
            <div class="container">
                <g:if test="${address}">
                    <table class="indextable">
                        <tr>
                            <th>No. ID</th>
                            <th>Alamat Lengkap </th>
                            <th>Blok </th>
                            <th>Nomor </th>
                            <th>Kecamatan </th>
                            <th>Kelurahan </th>
                            <th>Kode Pos </th>
                        </tr>
                        <g:each var="entry" in="${address}">
                            <tr>
                                <td>${entry.id}</td>
                                <td>${entry.fullAddress}</td>
                                <td>${entry.block}</td>
                                <td>${entry.number}</td>
                                <td>${entry.district}</td>
                                <td>${entry.subDistrict}</td>
                                <td>${entry.postcode}</td>
                                <td class="action">
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
                    <div class="button button-l submitter">
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