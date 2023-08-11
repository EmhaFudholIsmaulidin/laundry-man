package laundry.man

class Purchase {
    String purchaseDate
    String deliveryDate
    int totalPrice

    static belongsTo = [customer: Customer, courier: Courier, address: Address]
    static hasMany = [purchaseItems: PurchaseItems]

    static constraints = {
        purchaseDate blank: false
        deliveryDate blank: false
        totalPrice (blank: false, min: 0)
    }
}
