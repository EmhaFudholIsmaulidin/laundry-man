package laundry.man

class PurchaseItemsController {

    def index() {
        def purchaseItems = PurchaseItems.list()
        [purchaseItems: purchaseItems]
    }

    def edit(Long id) {
        def purchaseItems = PurchaseItems.get(id)
        [purchaseItems: purchaseItems]
    }

    def update() {
        def purchaseItems = PurchaseItems.get(params.editId)

        purchaseItems.quantity = params.quantity as Integer
        purchaseItems.save()

        flash.message = "Berhasil ditimbang."
        redirect(action: "index")
    }
}
