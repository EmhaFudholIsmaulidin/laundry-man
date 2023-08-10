package laundry.man

import grails.transaction.Transactional

@Transactional
class PurchaseService {

    def serviceMethod() {

    }

    def getAllCendol() {
        return CompanyBranch.list()
    }
}
