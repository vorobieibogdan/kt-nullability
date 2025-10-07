package mate.academy

/*
    Calculate the products total price based on the provide price per product and products amount.
    If the price is not provided, use default price per product equal to 29.99
 */
fun calculateTotalPrice(pricePerProduct: Double?, count: Int): Double {
    var price = pricePerProduct
    if (price == null) {
        price = 29.99
    }
    return price * count
}

