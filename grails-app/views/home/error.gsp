<!doctype html>
<html>
    <head>
        <meta name="layout" content="main">
        <asset:stylesheet src="error.css"/>
    </head>
    <body>
    <div class="wrapper">
        <div class="container">
            <g:if env="development">
                <g:if test="${Throwable.isInstance(exception)}">
                    <g:renderException exception="${exception}" />
                </g:if>
                <g:elseif test="${request.getAttribute('javax.servlet.error.exception')}">
                    <g:renderException exception="${request.getAttribute('javax.servlet.error.exception')}" />
                </g:elseif>
                <g:else>
                    <ul class="errors">
                        <li>An error has occurred</li>
                        <li>Exception: ${exception}</li>
                        <li>Message: ${message}</li>
                        <li>Path: ${path}</li>
                    </ul>
                </g:else>
            </g:if>
            <g:else>
                <ul class="errors">
                    <li>An error has occurred</li>
                </ul>
            </g:else>
        </div>
    </div>
    </body>
</html>
