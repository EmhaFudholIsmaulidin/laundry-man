package laundry.man

class CourierController {

    def index() {
        def courier = Courier.list()
        [courier: courier]
    }

    def create() {
    }

    def edit(Long id){
        def courier = Courier.get(id)
        [courier: courier]
    }

    def save() {
        def courier = new Courier(params)
        if (courier.save()) {
            flash.message = "Berhasil disimpan."
            redirect(action: "index", model: [params])
        } else {
            flash.message = "Ada yang salah, coba cek ${courier.courierName}, ${courier.priceKm}}"
            render(view: "create", model: [params])
        }
    }

    def update() {
        def courier = Courier.get(params.editId)

        courier.courierName = params.courierName as String
        courier.priceKm = params.priceKm as Integer
        courier.save()

        flash.message = "${params.courierName} berhasil diedit."
        redirect(action: "index")
    }

    def delete() {
        def delete = Courier.get(params.id)
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
