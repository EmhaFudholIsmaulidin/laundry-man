package laundry.man

class Items {

    String itemName
    int itemPrice
    String description
    int durationHrs

    static hasMany = [purchaseItems: PurchaseItems]

    static constraints = {
        itemName blank: false
        itemPrice blank: false
        durationHrs blank: false
        description blank: true
    }
}
