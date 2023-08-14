package laundry.man

class CompanyBranch {
    String address
    String branchName

    static constraints = {
        branchName blank: false
        address blank: false
    }
}