package laundry.man

class Customer {
    String name
    String email
    String telephone
    String address

    static hasMany = [purchase: Purchase]

    static constraints = {
        email blank: true, email: true, unique: true
        name blank: true
        telephone blank: true
        address blank: true
    }
}
