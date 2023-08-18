package laundry.man

class PurchaseItemsController {

    def index() {
        def purchaseItems = PurchaseItems.list()
        [purchaseItems: purchaseItems]
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
