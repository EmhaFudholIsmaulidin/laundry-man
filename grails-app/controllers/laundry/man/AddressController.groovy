package laundry.man

class AddressController {

    def index() {
        def address = Address.list()
        [address: address]
    }

    def create() {
    }

    def edit(Long id){
        def address = Address.get(id)
        [address: address]
    }

    def save() {
        def address = new Address(params)
        if (address.save()) {
            flash.message = "Berhasil disimpan."
            redirect(action: "index", model: [params])
        } else {
            flash.message = "Ada yang salah, coba cek ${address.fullAddress}, ${address.block}, ${address.number}, ${address.district}, ${address.subDistrict}, ${address.postcode}}"
            render(view: "create", model: [params])
        }
    }

    def update() {
        def address = Address.get(params.editId)
        address.fullAddress = params.fullAddress as String
        address.block = params.block as String
        address.number = params.number as Integer
        address.district = params.district as String
        address.subDistrict = params.subDistrict as String
        address.postcode = params.postcode as String
        address.save()

        flash.message = "${params.fullAddress} berhasil diedit."
        redirect(action: "index")
    }

    def delete() {
        def delete = Address.get(params.id)
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
