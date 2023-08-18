package laundry.man

class CompanyBranch {
    String branchName
    String address

    static constraints = {
        branchName blank: false
        address blank: false
    }
}