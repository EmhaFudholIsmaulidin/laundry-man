package laundry.man

import grails.transaction.Transactional

import java.sql.Timestamp

@Transactional
class PurchaseService {

    def getDate(Timestamp purchaseDate) {
        purchaseDate = new Timestamp(System.currentTimeMillis())
        return purchaseDate
    }

    def addDate(Timestamp deliveryDate, int durationHrs) {
        Timestamp now = new Timestamp(System.currentTimeMillis())
        Calendar soon = Calendar.getInstance()
        soon.time = now
        soon.add(Calendar.HOUR_OF_DAY, durationHrs)
        deliveryDate = new Timestamp(soon.timeInMillis)
        return deliveryDate
    }


    def total(int itemPrice, int quantity) {
        def total = itemPrice * quantity
        return total
    }
}
