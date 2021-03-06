// Return customers who have more undelivered orders than delivered
fun Shop.getCustomersWithMoreUndeliveredOrdersThanDelivered(): Set<Customer> {
    return customers.filter {
    	val (delivered, undelivered) = it.orders.partition { it.isDelivered == true}
    	delivered.size < undelivered.size
    }.toSet()
}
