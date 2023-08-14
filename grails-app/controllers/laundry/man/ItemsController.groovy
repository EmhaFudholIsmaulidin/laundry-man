package laundry.man

class ItemsController {

    def index() {
        def items = Items.list()
        def a = Courier.list()
        [items: items, a: a]
    }

    def create() {
        [items: Items]
    }

    def update() {
        [items: Items]
    }

    def delete() {
        [items: Items]
    }
}
