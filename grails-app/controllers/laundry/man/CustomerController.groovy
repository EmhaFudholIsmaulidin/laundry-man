package laundry.man

class CustomerController {

    def index() {
        def customer = Customer.list()
        [customer: customer]
    }

    def create() {
    }

    def edit(Long id){
        def customer = Customer.get(id)
        [customer: customer]
    }

    def save() {
        def customer = new Customer(params)
        if (customer.save()) {
            flash.message = "Berhasil disimpan."
            redirect(action: "index", model: [params])
        } else {
            flash.message = "Ada yang salah, coba cek ${customer.name}, ${customer.email}, ${customer.telephone}}"
            render(view: "create", model: [params])
        }
    }

    def update() {
        def customer = Customer.get(params.editId)
        customer.name = params.name as String
        customer.email = params.email as String
        customer.telephone = params.telephone as String
        customer.save()

        flash.message = "${params.name} berhasil diedit."
        redirect(action: "index")
    }

    def delete() {
        def delete = Customer.get(params.id)
        if (delete){
            delete.delete()
            flash.message = "Berhasil dihapus."
            redirect(action: "index")
        }else{
            flash.message = "Gagal dihapus."
            redirect(action: "index")
        }
    }
}
