<%--
  Created by IntelliJ IDEA.
  User: emhaismaulidin
  Date: 8/7/23
  Time: 4:29 PM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Laundry Man!</title>

    <style>
    html, body, div, span, applet, object, iframe,
    h1, h2, h3, h4, h5, h6, p, blockquote, pre,
    a, abbr, acronym, address, big, cite, code,
    del, dfn, em, img, ins, kbd, q, s, samp,
    small, strike, strong, sub, sup, tt, var,
    b, u, i, center,
    dl, dt, dd, ol, ul, li,
    fieldset, form, label, legend,
    table, caption, tbody, tfoot, thead, tr, th, td,
    article, aside, canvas, details, embed,
    figure, figcaption, footer, header, hgroup,
    menu, nav, output, ruby, section, summary,
    time, mark, audio, video {
        margin: 0;
        padding: 0;
        border: 0;
        font-size: 100%;
        font: inherit;
        vertical-align: baseline;
    }
    /* HTML5 display-role reset for older browsers */
    article, aside, details, figcaption, figure,
    footer, header, hgroup, menu, nav, section {
        display: block;
    }
    body {
        line-height: 1;
    }
    ol, ul {
        list-style: none;
    }
    blockquote, q {
        quotes: none;
    }
    blockquote:before, blockquote:after,
    q:before, q:after {
        content: '';
        content: none;
    }
    table {
        border-collapse: collapse;
        border-spacing: 0;
    }
        html {
            background-color: #00002b;
        }
        .container {
            max-width: 1100px;
            margin: auto;
        }
        .wrapper{
            position: absolute;
            top: 50%;
            left: 50%;
            transform: translateX(-50%) translateY(-50%);
        }
        p, h2 {
            color: #fff;
        }
    </style>
</head>

<body>
    <div class="container">
        <div class="wrapper">
            <form style="text-align: center">
                <h2>Input nama Anda. <input type="text" size="40" name="orang" value="${orang}" ></h2><br>
                <p>Nomor telepon Anda. <input type="number" size="40" name="telpon" value="${telpon}"></p>
            </form>
        </div>
    </div>
</body>
</html>