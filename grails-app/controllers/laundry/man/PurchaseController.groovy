package laundry.man

import java.sql.Timestamp

class PurchaseController {

    def purchaseService
//    def item = Items.findAll()
//    def customer = Customer.findAll()
//    def courier = Courier.findAll()
//    def address = Address.findAll()

    def index() {

    }

    def create(){
        render(view: "create", model: [itemList: item, customList: customer, courierList: courier, addressList: address])
    }

    def save() {
        def trans = new Purchase(params)
//        def paket = new PurchaseItems(params)

       def ass = params.item

        trans.totalPrice = purchaseService.total(barang.itemPrice, params.durationHrs)
        trans.purchaseDate = purchaseService.getDate()
        trans.deliveryDate = purchaseService.addDate(trans.purchaseDate, durationHrs)

        if (trans.save()) {
            flash.message = "Barang telah tersimpan."
            redirect(action: "index")
        } else {
            flash.message = "Barang tidak tersimpan. ${params.item}"
            render(view: "create", model: [transaction: trans, itemList: item, customList: customer, courierList: courier, addressList: address])
        }


    }

    def update() {

    }

    def delete() {

    }
}
