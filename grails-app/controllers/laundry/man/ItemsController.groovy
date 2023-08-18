package laundry.man

class ItemsController {

    def index() {
        def items = Items.list()
        [items: items]
    }

    def create() {
    }

    def edit(Long id){
        def barang = Items.get(id)
        [barang: barang]
    }

    def save() {
        def barang = new Items(params)
        if (barang.save()) {
            flash.message = "Berhasil disimpan."
            redirect(action: "index", model: [params])
        } else {
            flash.message = "Ada yang salah, coba cek ${barang.itemName}, ${barang.itemPrice}, ${barang.description}, ${barang.durationHrs}"
            render(view: "create", model: [params])
        }
    }

    def delete() {
        def delete = Items.get(params.id)
        if (delete){
            delete.delete()
            flash.message = "Berhasil dihapus."
            redirect(action: "index")
        }else{
            flash.message = "Gagal dihapus."
            redirect(action: "index")
        }
    }

    def update() {
        def barang = Items.get(params.editId)
        barang.itemName = params.itemName as String
        barang.itemPrice = params.itemPrice as Integer
        barang.description = params.description as String
        barang.durationHrs = params.durationHrs as Integer
        barang.save()

        flash.message = "${params.itemName} berhasil diedit."
        redirect(action: "index")
    }
}
