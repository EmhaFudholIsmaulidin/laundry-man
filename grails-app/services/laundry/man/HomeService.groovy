package laundry.man

import grails.transaction.Transactional

@Transactional
class HomeService {

    def display() {
        def item = Items.list()
        def courier = Courier.list()

        return [item, courier]
    }
}
