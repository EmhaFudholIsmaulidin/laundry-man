package laundry.man

class PurchaseController {

    def purchaseService

    def index() {
        def cabanggue = purchaseService.viewBranch()
        model: [cabang: cabanggue]
    }

    def savePurchaseInvoice(){
        def title = params.title
        def content = params.content
        purchaseService.save(title, content)
        redirect(action: "list")
    }

    def updatePurchaseInvoice(){

    }
}
