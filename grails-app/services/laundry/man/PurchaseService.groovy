package laundry.man

import grails.transaction.Transactional
import org.apache.catalina.util.CustomObjectInputStream

import java.sql.Timestamp

@Transactional
class PurchaseService {

    def save(String name, String email, String telephone, String address, Long item, Long courier) {
        def couriernew = Courier.get(courier)
        def itemnew = Items.get(item)
        Timestamp now = new Timestamp(System.currentTimeMillis())
        Calendar soon = Calendar.getInstance()
        soon.time = now
        soon.add(Calendar.HOUR_OF_DAY, itemnew.getDurationHrs())
        Timestamp future = new Timestamp(soon.timeInMillis)

        def purchase = new Purchase(
                customer: (new Customer(
                        name: name,
                        email: email,
                        address: address,
                        telephone: telephone)
                        .save()),
                courier: couriernew,
                purchaseDate: now,
                deliveryDate: future)
                .addToPurchaseItems(
                        items: itemnew)
        purchase.save()
    }
}
