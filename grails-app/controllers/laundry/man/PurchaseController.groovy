package laundry.man

class PurchaseController {

    PurchaseService purchaseService

    def index() {
        def purchase = Purchase.list()
        [purchase: purchase]
    }

    def save(String name, String email, String telephone, String address, Long item, Long courier) {
        def message = purchaseService.save(name, email, telephone, address, item, courier)
        flash.message = message
        redirect(action: "index")
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
