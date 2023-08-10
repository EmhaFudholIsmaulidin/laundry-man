package laundry.man

class Items {

    String itemName
    int itemPrice
    String description
    int durationMin

    static hasMany = [purchaseItems: PurchaseItems]

    static constraints = {
        itemName blank: false, unique: true
        itemPrice blank: false
        durationMin blank: false
        description blank: true, maxSize: 1000
    }
}
