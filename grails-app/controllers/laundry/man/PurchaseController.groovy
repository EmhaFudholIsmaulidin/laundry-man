package laundry.man

class PurchaseController {

    def purchaseService

    def index() {
        def cabanggue = purchaseService.getAllCendol()
        model: [cabang: cabanggue]
    }

    def savePurchaseInvoice(){
        Purchase invoice = new Purchase(purchaseDate: params.date, deliveryDate: params.delivery, totalPrice: params.price)
        invoice.save()
    }

    def updatePurchaseInvoice(){

    }
}
