<%@ page import="laundry.man.Items" %>
<%@ page import="laundry.man.Courier" %>
<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Laundry Man!</title>
</head>
    <body>
    <div class="wrapper">
        <div class="container">
            <h1 class="hometitle">Laundry<br>Man.</h1>
        </div>
        <div class="laundry">
            <h3>Pesan Laundry</h3>
            <g:form class="formmenu" controller="purchase" action="save">
                <div class="purchasemenu">
                    <ul class="label">
                        <li>Nama</li>
                        <li>Email</li>
                        <li>Nomor Telepon</li>
                        <li>Alamat Lengkap</li>
                        <li>Pilih Jasa</li>
                        <li>Pilih Kurir</li>
                    </ul>
                    <div class="input">
                            <g:textField name="name"/>
                            <g:textField name="email"/>
                            <g:textField name="telephone"/>
                            <g:textField name="address"/>
                            <g:select name="item" from="${Items.list()}" optionKey="id" optionValue="itemName"/>
                            <g:select name="courier" from="${Courier.list()}" optionKey="id" optionValue="courierName"/>
                    </div>
                </div>
                <g:submitButton name="input" value="Pesan!"/>
            </g:form>

            <div>${flash.message}</div>
        </div>
    </div>
    </body>
</html>
