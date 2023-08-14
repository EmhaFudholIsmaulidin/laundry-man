package laundry.man

class Address {
    String fullAddress
    String block
    int number
    String district
    String subDistrict
    int postcode

    static belongsTo = [customer: Customer]

    static constraints = {
        fullAddress blank: false
        block nullable: true, maxSize: 4
        number blank: false, maxSize: 4
        district blank: false
        subDistrict blank: false
        postcode blank: false, size: 5
    }
}
