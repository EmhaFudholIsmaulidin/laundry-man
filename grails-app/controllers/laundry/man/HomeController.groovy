package laundry.man

class HomeController {

    def index() {
        def item = Items.list()
        def courier = Courier.list()
        [item: item, courier: courier]
    }

    def admin() {
    }

    def error() {

    }

    def notFound() {

    }
}
