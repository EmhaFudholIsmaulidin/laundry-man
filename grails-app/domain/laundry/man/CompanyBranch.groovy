package laundry.man

class CompanyBranch {
    Address address
    String branchName

    static hasOne = [address: Address]

    static constraints = {
        branchName blank: false
        address blank: false
    }
}
