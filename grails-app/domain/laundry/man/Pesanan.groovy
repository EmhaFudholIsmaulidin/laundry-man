package laundry.man

class Pesanan {

    String pemesan
    String alamat

    static hasMany = [layanan: Layanan]
//    static belongsTo = Layanan

    static constraints = {
        pemesan blank: false, unique: true
        alamat blank: false, maxSize: 1000
    }
}
