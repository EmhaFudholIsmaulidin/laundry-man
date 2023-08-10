package laundry.man

class PurchaseItems {
    Items items
    Purchase purchase
    int quantity

    static belongsTo = [purchase: Purchase, items: Items]

    static constraints = {
        items unique: true
        quantity (blank: false, min: 1, "Laundryan tidak boleh kosong.")
    }
}