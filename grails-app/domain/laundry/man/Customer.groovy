package laundry.man

class Customer {
    String name
    String email
    String telephone

    static hasMany = [address: Address]

    static constraints = {
        email blank: true, email: true, unique: true
        name blank: true
        telephone blank: true, size: 11..13
    }
}
