import laundry.man.Address
import laundry.man.CompanyBranch
import laundry.man.Courier
import laundry.man.Customer
import laundry.man.Items
import laundry.man.Purchase
import laundry.man.PurchaseItems

import java.sql.Timestamp

class BootStrap {

    def init = { servletContext ->

        //Phase 1 : Define important items : Courier, Items, Branch

        Courier kurir1 = new Courier(courierName: "Ahnaf", priceKm: 1000)
        kurir1.save()
        Courier kurir2 = new Courier(courierName: "Fudhol", priceKm: 2000)
        kurir2.save()
        Courier kurir3 = new Courier(courierName: "Rahma", priceKm: 3000)
        kurir3.save()
        Courier kurir4 = new Courier(courierName: "Widi", priceKm: 4000)
        kurir4.save()
        Courier kurir5 = new Courier(courierName: "Juli", priceKm: 5000)
        kurir5.save()

        println("Kurir Check : kurir1 = ${kurir1.id}, kurir2 = ${kurir2.id}, kurir3 = ${kurir3.id}, kurir4 = ${kurir4.id}, kurir5 = ${kurir5.id}")

        Items paket1 = new Items(itemName: "Cuci Lipat", itemPrice: 3000, description: "Cuci lipat tanpa setrika, harga reguler.", durationHrs: 8)
        paket1.save()
        Items paket2 = new Items(itemName: "Cuci Setrika", itemPrice: 5000, description: "Cuci lipat dengan setrika, harga express.", durationHrs: 5)
        paket2.save()
        Items paket3 = new Items(itemName: "Bantal", itemPrice: 8000, description: "Cuci bantal, harga reguler.", durationHrs: 6)
        paket3.save()
        Items paket4 = new Items(itemName: 'Karpet', itemPrice: 10000, description: 'Cuci karpet, tanpa kecap', durationHrs: 3)
        paket4.save()

        println("Items Check : items1 = ${paket1.id}, items2 = ${paket2.id}, items3 = ${paket3.id}, items4 = ${paket4.id}")

        CompanyBranch cabang1 = new CompanyBranch(address: "Jl. Tamalanrea Raya", branchName: "LaundryMan Tamalanrea")
        cabang1.save()
        CompanyBranch cabang2 = new CompanyBranch(address: "Jl. Sam Ratulangi", branchName: "LaundryMan Ratulangi")
        cabang2.save()
        CompanyBranch cabang3 = new CompanyBranch(address: "Jl. Pegangsaan Timur", branchName: "LaundryMan Jakarta")
        cabang3.save()

        println("Cabang Check : cabang1 = ${cabang1.id}, cabang2 = ${cabang2.id}, cabang3 = ${cabang3.id}")

        //Phase 2 : We have customers now. Mereka pun menginput alamat.

        Customer pelanggan1 = new Customer(name: "Bapak Ahnaf", email: "bapakgaul123@gmail.com", telephone: "082156568484")
        pelanggan1.save()
        Customer pelanggan2 = new Customer(name: "Bapak Fudhol", email: "bapakgaming69@gmail.com", telephone: "089947462547")
        pelanggan2.save()
        Customer pelanggan3 = new Customer(name: "Ibu Rahma", email: "ibuheboh21@gmail.com", telephone: "081257355927")
        pelanggan3.save()
        Customer pelanggan4 = new Customer(name: "Ibu Widi", email: "macegaul999@gmail.com", telephone: "082835467834")
        pelanggan4.save()
        Customer pelanggan5 = new Customer(name: "Ibu Juli", email: "akusukaiqbal@gmail.com", telephone: "082835467834")
        pelanggan5.save()

        //println("Markicek pelanggan : id=${pelanggan5.id}, name=${pelanggan5.name}, email=${pelanggan5.email}, telephone=${pelanggan5.telephone}")
        println("Pelanggan Check : pelanggan1 = ${pelanggan1.id}, pelanggan2 = ${pelanggan2.id}, pelanggan3 = ${pelanggan3.id}, pelanggan4 = ${pelanggan4.id}, pelanggan5 = ${pelanggan5.id}")

        Address alamat1 = new Address(fullAddress: "Jl. Aselole", block: "CH", number: 3, district: "Raha", subDistrict: "Sultra", postcode: 11111, customer: pelanggan1)
        alamat1.save()
        Address alamat2 = new Address(fullAddress: "Jl. Prof. S. R. Nur blok EB no. 25", block: "EB", number: 25, district: "Tamalanrea", subDistrict: "Kapasa Raya", postcode: 23474, customer: pelanggan2)
        alamat2.save()
        Address alamat3 = new Address(fullAddress: "Jl. Malino Poros no. 420", block: "", number: 420, district: "Malino", subDistrict: "Malino Utara", postcode: 23465, customer: pelanggan3)
        alamat3.save()
        Address alamat4 = new Address(fullAddress: "Jl. Paccerakkang no. 421", block: "", number: 421, district: "Daya", subDistrict: "Daya Pusat", postcode: 62447, customer: pelanggan4)
        alamat4.save()
        Address alamat5 = new Address(fullAddress: "BTN Pao Pao Permai blok A3 no. 999", block: "A3", number: 999, district: "Gowa", subDistrict: "Gowa Citraland", postcode: 23789, customer: pelanggan5)
        alamat5.save()
        Address alamat6 = new Address(fullAddress: "Jl. Teratai no. 3", block: "", number: 3, district: "Wamponiki", subDistrict: "Katobu", postcode: 90133, customer: pelanggan1)
        alamat6.save()

        println("Alamat Check : alamat1 = ${alamat1.id}, alamat2 = ${alamat2.id}, alamat3 = ${alamat3.id}, alamat4 = ${alamat4.id}, alamat5 = ${alamat5.id}, alamat6 = ${alamat6.id}")

//        Phase 3. Mereka menginput pesanan.
//
//        Yang mereka input:
//         - Paket apa yang mau dipesan
//         - Berapa dari paket tersebut yang mau dibeli
//        Yang kami proses:
//         - Mencari jarak antara alamat pelanggan dan cabang terdekat (?.distance)
//         - Menghitung total harga dari tarif per paket yang telah dipesan
//         - Menambahkan tarif kurir ke jumlah yang harus dibayar pelanggan
//         - Menghitung waktu proses pesanan pelanggan
//        Yang kami tampilkan:
//         - Waktu pengantaran (Purchase.deliveryDate = Purchase.purchaseDate + Items.duration)
//         - Total harga (Purchase.totalPrice = (?.distance * Courier.priceKm) + (Items.itemPrice * PurchaseItems.quantity))
//        Yang muncul didalam struk:
//        - Nama Pelanggan
//        - Berapa banyak yang dia timbang
//        - Tanggal pemesanan
//        - ID khusus pesanannya (purchase.id)
//        - Tanggal pengiriman
//        - Paket yang dia pesan
//        - Alamatnya
//        - Deskripsi barang

        Timestamp now = new Timestamp(System.currentTimeMillis())
        println("Waktu sekarang adalah ${now}")
        Calendar soon = Calendar.getInstance()
        soon.time = now
        soon.add(Calendar.HOUR_OF_DAY, 3)
        println("Waktu kini adalah ${soon}")
        Timestamp future = new Timestamp(soon.timeInMillis)
        println("Waktu nanti adalah ${future}")

//        trans.totalPrice = purchaseService.total(barang.itemPrice, params.durationHrs)
//        trans.purchaseDate = purchaseService.getDate()
//        trans.deliveryDate = purchaseService.addDate(trans.purchaseDate, durationHrs)

        // Create and save the Purchase object
        Purchase invoice1 = new Purchase(
                purchaseDate: now,
                deliveryDate: future,
                totalPrice: 50000,
                customer: pelanggan5,
                courier: kurir3,
                address: alamat1
        )

        println "Before saving Purchase: purchaseDate=${invoice1.purchaseDate}, deliveryDate=${invoice1.deliveryDate}, totalPrice=${invoice1.totalPrice}, customer=${invoice1.customer}, courier=${invoice1.courier}, address=${invoice1.address}"

//        if (!invoice1.save()) {
//            println "Errors during Purchase save: ${invoice1.errors}"
//        } else {
//            println "Purchase saved successfully!"
//        }


        def purchaseItems = new PurchaseItems(quantity: 50, items: paket4)

        def hargaKurir = (invoice1.courier.priceKm * 5)
        def hargaBarang = (purchaseItems.items.itemPrice * purchaseItems.quantity)

        invoice1.totalPrice = (hargaBarang + hargaKurir)

        invoice1.addToPurchaseItems(purchaseItems)
        invoice1.save()

        println "After saving Purchase: id=${invoice1.id}, purchaseDate=${invoice1.purchaseDate}, deliveryDate=${invoice1.deliveryDate}, totalPrice=${invoice1.totalPrice}, customer=${invoice1.customer}, courier=${invoice1.courier}, address=${invoice1.address}"
//        Purchase invoice2 = new Purchase(purchaseDate: now, deliveryDate: future, totalPrice: 500, customer: pelanggan5, courier: kurir1, address: alamat5).addToPurchaseItems(quantity: 4, items: paket1)
//        invoice2.save()
//        Purchase invoice3 = new Purchase(purchaseDate: now, deliveryDate: future, totalPrice: 1, customer: pelanggan4, courier: kurir2, address: alamat1).addToPurchaseItems(quantity: 4, items: paket2)
//        invoice3.save()
//        Purchase invoice4 = new Purchase(purchaseDate: now, deliveryDate: future, totalPrice: 1000000, customer: pelanggan1, courier: kurir3, address: alamat6).addToPurchaseItems(quantity: 4, items: paket3)
//        invoice4.save()
//        Purchase invoice5 = new Purchase(purchaseDate: now, deliveryDate: future, totalPrice: 6969, customer: pelanggan2, courier: kurir1, address: alamat2).addToPurchaseItems(quantity: 4, items: paket4)
//        invoice5.save()
//        Purchase invoice6 = new Purchase(purchaseDate: now, deliveryDate: future, totalPrice: 4646, customer: pelanggan3, courier: kurir2, address: alamat3).addToPurchaseItems(quantity: 4, items: paket1)
//        invoice6.save()
//        Purchase invoice7 = new Purchase(purchaseDate: now, deliveryDate: future, totalPrice: 42069, customer: pelanggan3, courier: kurir3, address: alamat4).addToPurchaseItems(quantity: 4, items: paket2)
//        invoice7.save()
//        Purchase invoice8 = new Purchase(purchaseDate: now, deliveryDate: future, totalPrice: 44444, customer: pelanggan1, courier: kurir1, address: alamat1).addToPurchaseItems(quantity: 4, items: paket3)
//        invoice8.save()
//        Purchase invoice9 = new Purchase(purchaseDate: now, deliveryDate: future, totalPrice: 10001, customer: pelanggan2, courier: kurir2, address: alamat3).addToPurchaseItems(quantity: 4, items: paket4)
//        invoice9.save()
//        Purchase invoice10 = new Purchase(purchaseDate: now, deliveryDate: future, customer: pelanggan1, courier: kurir3, address: alamat6).addToPurchaseItems(quantity: 4, items: paket1)
//        invoice10.save()


    }
    def destroy = {
    }
}
