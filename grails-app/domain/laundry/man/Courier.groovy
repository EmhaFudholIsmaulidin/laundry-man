package laundry.man

class Courier {
    String courierName
    int priceKm

    static hasMany = [purchase: Purchase]

    static constraints = {
        courierName blank: false, unique: true
        priceKm blank: false
    }
}
