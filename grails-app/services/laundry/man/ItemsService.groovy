package laundry.man

import grails.transaction.Transactional

@Transactional
class ItemsService {

    def updateItem(Long id, String itemName, int itemPrice, String desc, int duration){
        def item = Items.get(id)

        if(item){
            item.itemName = itemName
            item.itemPrice = itemPrice
            item.description = desc
            item.durationHrs = duration
            item.save()
            return "Berhasil diedit."
        }else{
            return "Ga diedit."
        }
    }


}
