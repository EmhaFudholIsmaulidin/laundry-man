package laundry.man

class CustomerController {

    def index() {
        redirect(action: 'index', controller: 'purchase')
    }

    def save() {
        def userInput = params.productPrice.replaceAll(',', '')
        def sanitizedPrice = userInput.toLong()

        def customer = new Customer(name: params.productName, priceInCents: sanitizedPrice)
        if (customer.validate()) {
            customer.save()
            flash.message = "Product saved successfully."
        } else {
            flash.error = "Invalid product data."
        }

        redirect(action: "index")
    }
}
