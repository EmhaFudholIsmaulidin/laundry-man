package laundry.man

import grails.transaction.Transactional

import java.sql.Timestamp

@Transactional
class PurchaseService {

    def Purchase

    def save(Timestamp beli, Timestamp antar, int harga) {
        def struk = new Purchase(purchaseDate: a, deliveryDate: b, totalPrice: c)
        struk.purchaseDate =
        struk.deliveryDate =
        struk.totalPrice =
        struk.save()
    }

    def viewBranch() {
        return CompanyBranch.list()
    }
}
