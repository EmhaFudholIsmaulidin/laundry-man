package laundry.man

class PurchaseItems {
    int quantity

    static belongsTo = [purchase: Purchase, items: Items]

    static constraints = {
//        quantity (blank: false, min: 1, "Laundryan tidak boleh kosong.")
    }
}