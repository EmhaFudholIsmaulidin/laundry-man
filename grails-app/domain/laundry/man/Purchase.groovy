package laundry.man

import java.sql.Timestamp

class Purchase {
    Timestamp purchaseDate
    Timestamp deliveryDate
    int totalPrice

    static belongsTo = [customer: Customer, courier: Courier]
    static hasMany = [purchaseItems: PurchaseItems]

    static constraints = {
    }
}