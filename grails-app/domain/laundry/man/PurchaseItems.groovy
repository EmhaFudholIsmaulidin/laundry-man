package laundry.man

class PurchaseItems {
    int quantity

    static belongsTo = [purchase: Purchase, items: Items]

    static constraints = {
    }
}