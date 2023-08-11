import laundry.man.Address
import laundry.man.CompanyBranch
import laundry.man.Courier
import laundry.man.Customer
import laundry.man.Items
import laundry.man.Purchase
import laundry.man.PurchaseItems

class BootStrap {

    def init = { servletContext ->

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

        Customer pelanggan1 = new Customer(name: "Bapak Ahnaf", email: "bapakgaul123@gmail.com", telephone: "082156568484")
        pelanggan1.save()
        Customer pelanggan2 = new Customer(name: "Bapak Fudhol", email: "bapakgaming69@gmail.com", telephone: "089947462547")
        pelanggan2.save()
        Customer pelanggan3 = new Customer(name: "Ibu Rahma", email: "ibuheboh21@gmail.com", telephone: "081257355927")
        pelanggan3.save()
        Customer pelanggan4 = new Customer(name: "Ibu Widi", email: "macegaul999@gmail.com", telephone: "082835467834")
        pelanggan4.save()
        Customer pelanggan5 = new Customer(name: "Ibu Juli", email: "bundague420@gmail.com", telephone: "082983426823")
        pelanggan5.save()

        CompanyBranch cabang1 = new CompanyBranch(address: "Jl. Tamalanrea Raya", branchName: "LaundryMan Tamalanrea")
        cabang1.save()
        CompanyBranch cabang2 = new CompanyBranch(address: "Jl. Sam Ratulangi", branchName: "LaundryMan Ratulangi")
        cabang2.save()
        CompanyBranch cabang3 = new CompanyBranch(address: "Jl. Pegangsaan Timur", branchName: "LaundryMan Jakarta")
        cabang3.save()

        Items paket1 = new Items(itemName: "Cuci Lipat", itemPrice: 3000, description: "Cuci lipat tanpa setrika, harga reguler.", durationHrs: 8)
        paket1.save()
        Items paket2 = new Items(itemName: "Cuci Setrika", itemPrice: 5000, description: "Cuci lipat dengan setrika, harga express.", durationHrs: 5)
        paket2.save()
        Items paket3 = new Items(itemName: "Bantal", itemPrice: 8000, description: "Cuci bantal, harga reguler.", durationHrs: 6)
        paket3.save()

        Address alamat1 = new Address(fullAddress: "Jl. Lantebung no. 45", block: "", number: 45, district: "Tamalanrea", subDistrict: "Bira", postcode: 35111)
        alamat1.save()
        Address alamat2 = new Address(fullAddress: "Jl. Prof. S. R. Nur blok EB no. 25", block: "EB", number: 25, district: "Tamalanrea", subDistrict: "Kapasa Raya", postcode: 23474)
        alamat2.save()
        Address alamat3 = new Address(fullAddress: "Jl. Malino Poros no. 420", block: "", number: 420, district: "Malino", subDistrict: "Malino Utara", postcode: 23465)
        alamat3.save()
        Address alamat4 = new Address(fullAddress: "Jl. Paccerakkang no. 421", block: "", number: 421, district: "Daya", subDistrict: "Daya Pusat", postcode: 62447)
        alamat4.save()
        Address alamat5 = new Address(fullAddress: "BTN Pao Pao Permai blok A3 no. 999", block: "A3", number: 999, district: "Gowa", subDistrict: "Gowa Citraland", postcode: 23789)
        alamat5.save()

        Purchase invoice1 = new Purchase(purchaseDate: "asu", deliveryDate: "kabeh", totalPrice: 50000, customer: pelanggan5, courier: kurir3, address: alamat5).addToPurchaseItems(new PurchaseItems(quantity: 50, items: paket2))
        invoice1.save(flush: true)
//        Purchase invoice2 = new Purchase(purchaseDate: '', deliveryDate: '', totalPrice: 500, customer: pelanggan5, courier: kurir3, address: alamat5).addToPurchaseItems()
//        invoice2.save()
//        Purchase invoice3 = new Purchase(purchaseDate: '', deliveryDate: '', totalPrice: 1, customer: pelanggan5, courier: kurir3, address: alamat5).addToPurchaseItems()
//        invoice3.save()
//        Purchase invoice4 = new Purchase(purchaseDate: '', deliveryDate: '', totalPrice: 1000000, customer: pelanggan5, courier: kurir3, address: alamat5).addToPurchaseItems()
//        invoice4.save()
//        Purchase invoice5 = new Purchase(purchaseDate: '', deliveryDate: '', totalPrice: 6969, customer: pelanggan5, courier: kurir3, address: alamat5).addToPurchaseItems()
//        invoice5.save()
//        Purchase invoice6 = new Purchase(purchaseDate: '', deliveryDate: '', totalPrice: 4646, customer: pelanggan5, courier: kurir3, address: alamat5).addToPurchaseItems()
//        invoice6.save()
//        Purchase invoice7 = new Purchase(purchaseDate: '', deliveryDate: '', totalPrice: 42069, customer: pelanggan5, courier: kurir3, address: alamat5).addToPurchaseItems()
//        invoice7.save()
//        Purchase invoice8 = new Purchase(purchaseDate: '', deliveryDate: '', totalPrice: 44444, customer: pelanggan5, courier: kurir3, address: alamat5).addToPurchaseItems()
//        invoice8.save()
//        Purchase invoice9 = new Purchase(purchaseDate: '', deliveryDate: '', totalPrice: 10001, customer: pelanggan5, courier: kurir3, address: alamat5).addToPurchaseItems()
//        invoice9.save()
//        Purchase invoice10 = new Purchase(purchaseDate: '', deliveryDate: '', totalPrice: 999999, customer: pelanggan5, courier: kurir3, address: alamat5).addToPurchaseItems()
//        invoice10.save()

//        PurchaseItems pesanan1 = new PurchaseItems(purchase: invoice1, items: paket1, quantity: 10)
//        pesanan1.save()
//        PurchaseItems pesanan2 = new PurchaseItems(purchase: invoice2, items: paket1, quantity: 6)
//        pesanan2.save()
//        PurchaseItems pesanan3 = new PurchaseItems(purchase: invoice3, items: paket2, quantity: 5)
//        pesanan3.save()
//        PurchaseItems pesanan4 = new PurchaseItems(purchase: invoice3, items: paket3, quantity: 2)
//        pesanan4.save()
//        PurchaseItems pesanan5 = new PurchaseItems(purchase: invoice4, items: paket3, quantity: 9)
//        pesanan5.save()
//        PurchaseItems pesanan6 = new PurchaseItems(purchase: invoice5, items: paket2, quantity: 100)
//        pesanan6.save()
//        PurchaseItems pesanan7 = new PurchaseItems(purchase: invoice6, items: paket1, quantity: 1)
//        pesanan7.save()
//        PurchaseItems pesanan8 = new PurchaseItems(purchase: invoice6, items: paket2, quantity: 1)
//        pesanan8.save()
//        PurchaseItems pesanan9 = new PurchaseItems(purchase: invoice6, items: paket3, quantity: 1)
//        pesanan9.save()
//        PurchaseItems pesanan10 = new PurchaseItems(purchase: invoice7, items: paket2, quantity: 1)
//        pesanan10.save()
//        PurchaseItems pesanan11 = new PurchaseItems(purchase: invoice8, items: paket1, quantity: 500000)
//        pesanan11.save()
//        PurchaseItems pesanan12 = new PurchaseItems(purchase: invoice8, items: paket3, quantity: 300000)
//        pesanan12.save()
//        PurchaseItems pesanan13 = new PurchaseItems(purchase: invoice9, items: paket3, quantity: 1)
//        pesanan13.save()
//        PurchaseItems pesanan14 = new PurchaseItems(purchase: invoice10, items: paket1, quantity: 1)
//        pesanan14.save()

    }
    def destroy = {
    }
}
