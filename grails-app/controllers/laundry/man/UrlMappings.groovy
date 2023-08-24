package laundry.man

class UrlMappings {

    static mappings = {

        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(controller: "home", action:"index")
        "500"(controller: "home", action:'error')
        "404"(controller: "home", action:'notFound')
        "/admin"(controller: "home", action:"admin")
    }
}