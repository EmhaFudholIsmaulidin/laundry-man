package laundry.man

class AddressController {

    def index() {
        redirect(action: 'index', controller: 'purchase')
    }
}
