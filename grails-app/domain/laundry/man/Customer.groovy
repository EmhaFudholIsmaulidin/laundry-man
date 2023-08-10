package laundry.man

class Customer {
    String name
    String email
    int telephone

    static hasMany = [address: Address]

    static constraints = {
        email email: true, unique: true
        name blank: false
        telephone blank: false, size: 11..13
    }
}
