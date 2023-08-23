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
        def purchaseItems = PurchaseItems.get(2)
    }
}
