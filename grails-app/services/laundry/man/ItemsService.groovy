package laundry.man

import grails.transaction.Transactional

@Transactional
class ItemsService {

//    def hapus(id) {
//        def delete = Items.get(id)
//        if (delete){
//            delete.delete()
//            return "Berhasil."
//        }else{
//            return "Gagal."
//        }
//    }

    def tes() {
        return "hola"
    }
}
