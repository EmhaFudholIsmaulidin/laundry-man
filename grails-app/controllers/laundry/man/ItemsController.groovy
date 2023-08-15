package laundry.man

class ItemsController {

    def index() {
        def items = Items.list()
        [items: items]
    }

    def admin() {

    }

    def create() {
        def items = Items.list()
        [items: items]
    }

    def save() {
        def barang = new Items(params)
        if (barang.save()) {
            flash.message = "Barang telah tersimpan. ${params}"
            redirect(action: "index")
        } else {
            render(view: "create", model: [item: barang])
        }
    }

    def delete() {
    }



    def update() {

    }
}
