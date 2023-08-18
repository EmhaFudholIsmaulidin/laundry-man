package laundry.man

class PurchaseController {

    def index() {
        def purchase = Purchase.list()
        [purchase: purchase]
    }

    def delete() {
        def delete = Purchase.get(params.id)
        if (delete){
            delete.delete()
            flash.message = "Berhasil dihapus."
            redirect(action: "index")
        }else{
            flash.message = "Gagal dihapus."
            redirect(action: "index")
        }
    }
}
