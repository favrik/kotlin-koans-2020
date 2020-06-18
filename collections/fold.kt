fun productList(customer: Customer): Set<Product> = customer.orders.flatMap { it.products }.toSet()
// 
// // Return the set of products that were ordered by every customer
fun Shop.getSetOfProductsOrderedByEveryCustomer(): Set<Product> {
    var initialSet = productList(customers.first())
    val restCustomers = customers.drop(1)
    
    return restCustomers.fold(initialSet, {
        pSet, customer ->
        pSet intersect productList(customer)
    })
}
