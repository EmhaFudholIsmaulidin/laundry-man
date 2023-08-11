package laundry.man

class Items {

    String itemName
    int itemPrice
    String description
    int durationHrs

    static hasMany = [purchaseItems: PurchaseItems]

    static constraints = {
        itemName blank: false, unique: true
        itemPrice blank: false
        durationHrs blank: false
        description blank: true, maxSize: 1000
    }
}
