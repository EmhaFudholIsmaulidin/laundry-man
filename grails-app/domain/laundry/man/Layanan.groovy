package laundry.man

class Layanan {

    String layanan

//    static hasMany = [pesanan: Pesanan]
    static belongsTo = Pesanan

    static constraints = {
        layanan blank: false, unique: true
    }
}