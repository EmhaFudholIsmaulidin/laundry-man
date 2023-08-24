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
        if(purchase.save()){
            return "Transaksi disimpan."
        }else{
            return "Transaksi gagal, cek lagi data."
        }
    }

    def update(Long editId, String name, String email, String telephone, String address, Long item, Long courier, int quantity) {
        def purchase = Purchase.get(editId)
        def couriernew = Courier.get(courier)
        def itemnew = Items.get(item)
        purchase.purchaseItems.clear()

        purchase.customer.name = name
        purchase.customer.email = email
        purchase.customer.telephone = telephone
        purchase.customer.address = address
        purchase.courier = couriernew

        purchase.addToPurchaseItems(items: itemnew, quantity: quantity)

        if(purchase.save()){
            return "Transaksi disimpan."
        }else{
            return "Transaksi gagal, cek lagi data."
        }
    }
}
